package team.burden.music.model;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by burden on 2020/11/1.
 */
@Data
//@NoArgsConstructor
@AllArgsConstructor
public class Song {

    private String title;
    private String creator;
    private int duration;
    private List<Tone> tones;

    public Song() {
        List<Integer> t;
        tones = new ArrayList<>();
        t = new ArrayList<>();
        t.add(0);
        t.add(5);
        t.add(7);
        t.add(9);
        t.add(12);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(7);
        t.add(12);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(7);
        t.add(9);
        t.add(14);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(1);
        t.add(6);
        t.add(8);
        t.add(13);
        tones.add(new Tone(t, 400));
        t = new ArrayList<>();
        t.add(1);
        t.add(4);
        t.add(6);
        t.add(8);
        t.add(11);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(6);
        t.add(11);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(5);
        t.add(7);
        t.add(9);
        t.add(12);
        tones.add(new Tone(t, 400));
        t = new ArrayList<>();
        t.add(2);
        t.add(5);
        t.add(7);
        t.add(12);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(7);
        t.add(9);
        t.add(14);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(1);
        t.add(6);
        t.add(8);
        t.add(13);
        tones.add(new Tone(t, 400));
        t = new ArrayList<>();
        t.add(1);
        t.add(4);
        t.add(6);
        t.add(8);
        t.add(11);
        tones.add(new Tone(t, 600));
        t = new ArrayList<>();
        t.add(0);
        t.add(5);
        t.add(9);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        t.add(7);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(8);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(6);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(7);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(5);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(6);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(4);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        t.add(5);
        t.add(9);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(3);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        t.add(7);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(3);
        t.add(8);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(3);
        t.add(6);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(3);
        t.add(7);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(1);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(4);
        t.add(6);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(1);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(4);
        t.add(5);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(1);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(4);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(1);
        tones.add(new Tone(t, 400));
        t = new ArrayList<>();
        t.add(0);
        t.add(5);
        t.add(9);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        t.add(5);
        t.add(7);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(6);
        t.add(8);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(4);
        t.add(6);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(5);
        t.add(7);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(5);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(4);
        t.add(6);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(4);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        t.add(5);
        t.add(9);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(3);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        t.add(5);
        t.add(7);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(3);
        t.add(6);
        t.add(8);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(3);
        t.add(4);
        t.add(6);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(3);
        t.add(5);
        t.add(7);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(1);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(4);
        t.add(6);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(1);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(4);
        t.add(5);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(1);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(4);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(1);
        tones.add(new Tone(t, 400));
        t = new ArrayList<>();
        t.add(0);
        t.add(3);
        t.add(5);
        tones.add(new Tone(t, 400));
        t = new ArrayList<>();
        t.add(0);
        t.add(3);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(5);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        t.add(3);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(5);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        t.add(3);
        t.add(6);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(7);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(1);
        t.add(4);
        t.add(6);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(5);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(1);
        t.add(4);
        tones.add(new Tone(t, 400));
        t = new ArrayList<>();
        t.add(1);
        tones.add(new Tone(t, 400));
        t = new ArrayList<>();
        t.add(2);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(4);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        t.add(2);
        t.add(5);
        tones.add(new Tone(t, 400));
        t = new ArrayList<>();
        t.add(2);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(5);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(1);
        t.add(4);
        t.add(6);
        tones.add(new Tone(t, 400));
        t = new ArrayList<>();
        t.add(4);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(6);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(5);
        t.add(7);
        tones.add(new Tone(t, 400));
        t = new ArrayList<>();
        t.add(4);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(7);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(5);
        t.add(7);
        tones.add(new Tone(t, 600));
        t = new ArrayList<>();
        t.add(1);
        t.add(3);
        t.add(5);
        t.add(8);
        tones.add(new Tone(t, 400));
        t = new ArrayList<>();
        t.add(8);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(1);
        t.add(3);
        t.add(8);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(8);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(1);
        t.add(3);
        t.add(5);
        tones.add(new Tone(t, 400));
        t = new ArrayList<>();
        t.add(1);
        t.add(3);
        t.add(8);
        tones.add(new Tone(t, 400));
        t = new ArrayList<>();
        t.add(0);
        t.add(2);
        t.add(4);
        t.add(7);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(7);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        t.add(2);
        t.add(7);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(4);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        t.add(2);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(7);
        tones.add(new Tone(t, 400));
        t = new ArrayList<>();
        t.add(1);
        t.add(3);
        t.add(5);
        t.add(8);
        tones.add(new Tone(t, 400));
        t = new ArrayList<>();
        t.add(8);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(1);
        t.add(3);
        t.add(8);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(8);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(1);
        t.add(3);
        t.add(5);
        tones.add(new Tone(t, 400));
        t = new ArrayList<>();
        t.add(1);
        t.add(3);
        t.add(8);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(8);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(1);
        t.add(4);
        t.add(5);
        t.add(8);
        tones.add(new Tone(t, 400));
        t = new ArrayList<>();
        t.add(1);
        t.add(3);
        tones.add(new Tone(t, 400));
        t = new ArrayList<>();
        t.add(1);
        t.add(2);
        t.add(4);
        t.add(7);
        tones.add(new Tone(t, 400));
        t = new ArrayList<>();
        t.add(1);
        t.add(2);
        tones.add(new Tone(t, 400));
        t = new ArrayList<>();
        t.add(0);
        t.add(7);
        t.add(9);
        t.add(12);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(5);
        t.add(7);
        t.add(12);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        t.add(9);
        t.add(14);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(5);
        t.add(8);
        t.add(13);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(5);
        t.add(7);
        t.add(9);
        t.add(12);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(5);
        t.add(7);
        t.add(12);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        t.add(9);
        t.add(14);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(5);
        t.add(8);
        t.add(13);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(5);
        t.add(6);
        t.add(8);
        t.add(11);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(5);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        t.add(7);
        t.add(12);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(3);
        t.add(5);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        t.add(9);
        t.add(14);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(3);
        t.add(5);
        t.add(8);
        t.add(13);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(3);
        t.add(5);
        t.add(7);
        t.add(12);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(3);
        t.add(5);
        t.add(7);
        t.add(12);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(3);
        t.add(5);
        t.add(7);
        t.add(12);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(1);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(4);
        t.add(6);
        t.add(8);
        t.add(7);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(1);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(4);
        t.add(6);
        t.add(9);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(1);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(4);
        t.add(7);
        t.add(8);
        t.add(11);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(1);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(4);
        t.add(6);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        t.add(7);
        t.add(9);
        t.add(12);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(5);
        t.add(7);
        t.add(12);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        t.add(9);
        t.add(14);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(5);
        t.add(8);
        t.add(13);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(4);
        t.add(5);
        t.add(6);
        t.add(11);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(5);
        t.add(7);
        t.add(9);
        t.add(12);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(5);
        t.add(7);
        t.add(12);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        t.add(9);
        t.add(14);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(5);
        t.add(8);
        t.add(13);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(5);
        t.add(6);
        t.add(8);
        t.add(11);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(5);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        t.add(7);
        t.add(12);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(3);
        t.add(5);
        t.add(7);
        t.add(12);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(3);
        t.add(5);
        t.add(7);
        t.add(12);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        t.add(9);
        t.add(14);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(3);
        t.add(5);
        t.add(8);
        t.add(13);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(3);
        t.add(5);
        t.add(9);
        t.add(14);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        t.add(8);
        t.add(13);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(3);
        t.add(5);
        t.add(6);
        t.add(11);
        tones.add(new Tone(t, 400));
        t = new ArrayList<>();
        t.add(2);
        t.add(4);
        t.add(7);
        t.add(9);
        tones.add(new Tone(t, 600));
        t = new ArrayList<>();
        t.add(1);
        t.add(4);
        t.add(6);
        t.add(8);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(1);
        tones.add(new Tone(t, 100));
        t = new ArrayList<>();
        t.add(4);
        tones.add(new Tone(t, 100));
        t = new ArrayList<>();
        t.add(6);
        tones.add(new Tone(t, 100));
        t = new ArrayList<>();
        t.add(8);
        tones.add(new Tone(t, 100));
        t = new ArrayList<>();
        t.add(11);
        tones.add(new Tone(t, 100));
        t = new ArrayList<>();
        t.add(13);
        tones.add(new Tone(t, 100));
        t = new ArrayList<>();
        t.add(0);
        t.add(7);
        t.add(9);
        t.add(12);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(5);
        t.add(7);
        t.add(12);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        t.add(9);
        t.add(14);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(5);
        t.add(8);
        t.add(13);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(5);
        t.add(6);
        t.add(8);
        t.add(11);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(5);
        t.add(7);
        t.add(9);
        t.add(12);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(5);
        t.add(7);
        t.add(12);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        t.add(9);
        t.add(14);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(5);
        t.add(8);
        t.add(13);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(5);
        t.add(6);
        t.add(8);
        t.add(11);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(5);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        t.add(7);
        t.add(12);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(3);
        t.add(5);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        t.add(9);
        t.add(14);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(3);
        t.add(5);
        t.add(8);
        t.add(13);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(3);
        t.add(5);
        t.add(7);
        t.add(12);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(3);
        t.add(5);
        t.add(7);
        t.add(12);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(1);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(4);
        t.add(6);
        t.add(9);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(1);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(4);
        t.add(7);
        t.add(8);
        t.add(11);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(1);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(4);
        t.add(6);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        t.add(7);
        t.add(9);
        t.add(12);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(5);
        t.add(7);
        t.add(12);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        t.add(9);
        t.add(14);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(5);
        t.add(8);
        t.add(13);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(4);
        t.add(5);
        t.add(6);
        t.add(11);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(5);
        t.add(7);
        t.add(12);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(5);
        t.add(7);
        t.add(12);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        t.add(9);
        t.add(14);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(5);
        t.add(8);
        t.add(13);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(5);
        t.add(6);
        t.add(8);
        t.add(11);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(5);
        t.add(7);
        t.add(12);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        t.add(10);
        t.add(7);
        t.add(12);
        tones.add(new Tone(t, 400));
        t = new ArrayList<>();
        t.add(7);
        t.add(12);
        t.add(14);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(6);
        t.add(11);
        t.add(13);
        tones.add(new Tone(t, 400));
        t = new ArrayList<>();
        t.add(2);
        t.add(5);
        t.add(7);
        t.add(9);
        t.add(12);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(1);
        t.add(6);
        t.add(8);
        t.add(11);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        t.add(5);
        t.add(7);
        t.add(9);
        t.add(12);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        t.add(5);
        t.add(9);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        t.add(7);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(8);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(6);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(7);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(5);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(6);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(4);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        t.add(5);
        t.add(9);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(3);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        t.add(7);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(3);
        t.add(8);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(3);
        t.add(6);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(3);
        t.add(7);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(1);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(4);
        t.add(5);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(1);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(4);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(1);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        t.add(5);
        t.add(9);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        t.add(5);
        t.add(7);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(6);
        t.add(8);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(4);
        t.add(6);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(5);
        t.add(7);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(5);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(4);
        t.add(6);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        t.add(4);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(2);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        t.add(5);
        t.add(9);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(3);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        t.add(5);
        t.add(7);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(3);
        t.add(6);
        t.add(8);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(3);
        t.add(4);
        t.add(6);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(3);
        t.add(5);
        t.add(7);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(1);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(4);
        t.add(6);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(1);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(4);
        t.add(5);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(1);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(4);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(1);
        tones.add(new Tone(t, 400));
        t = new ArrayList<>();
        t.add(0);
        t.add(3);
        t.add(7);
        t.add(12);
        tones.add(new Tone(t, 400));
        t = new ArrayList<>();
        t.add(7);
        t.add(12);
        t.add(14);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(6);
        t.add(11);
        t.add(13);
        tones.add(new Tone(t, 400));
        t = new ArrayList<>();
        t.add(2);
        t.add(5);
        t.add(7);
        t.add(9);
        t.add(12);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(1);
        t.add(4);
        t.add(6);
        t.add(8);
        t.add(11);
        tones.add(new Tone(t, 200));
        t = new ArrayList<>();
        t.add(0);
        t.add(2);
        t.add(7);
        t.add(9);
        t.add(12);
        tones.add(new Tone(t, 100));

        duration = 66300;
    }

}
