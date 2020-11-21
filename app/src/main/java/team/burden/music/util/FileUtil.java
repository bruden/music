package team.burden.music.util;

import android.content.Context;
import android.util.Log;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by burden on 2020/11/8.
 */
public class FileUtil {

    private static final int BUFFER_SIZE = 1024;
    private static final String LOG_TAG = "FileUtil";

    public static void writeFile(Context context, String dir, String name, byte[] data) {
        File file = new File(context.getExternalFilesDir(dir), name);
        File fileParent = file.getParentFile();
        if (!fileParent.exists()) {
            fileParent.mkdirs();
        }
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (Exception e) {
                Log.d(LOG_TAG, String.format("Create file error: %s", e));
                return;
            }
        }
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file, false);
            fos.write(data, 0, data.length);
            fos.flush();
        } catch (Exception e) {
            Log.e(LOG_TAG, String.format("Write file error: %s", e));
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (Exception e) {
                    Log.e(LOG_TAG, String.format("Close file stream error: %s", e));
                }
            }
        }
    }

    public static byte[] readFile(Context context, String dir, String name) {
        File file = new File(context.getExternalFilesDir(dir), name);
        if (!file.exists()) {
            Log.e(LOG_TAG, String.format("File doesn't exists: %s/%s", dir, name));
            return null;
        }
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            ByteArrayOutputStream os = new ByteArrayOutputStream(BUFFER_SIZE);
            byte[] temp = new byte[BUFFER_SIZE];
            int size = 0;
            while ((size = fis.read(temp)) != -1) {
                os.write(temp, 0, size);
            }
            return os.toByteArray();
        } catch (Exception e) {
            Log.e(LOG_TAG, String.format("Write file error: %s", e));
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (Exception e) {
                    Log.e(LOG_TAG, String.format("Close file stream error: %s", e));
                }
            }
        }
        return null;
    }

    public static List<String> readAllFileNames(Context context, String dir) {
        List<String> result = new ArrayList<>();
        File file = context.getExternalFilesDir(dir);
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile()) {
                result.add(f.getName());
            }
        }
        return result;
    }

}
