package team.burden.music.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by burden on 2020/11/7.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tone {

    private List<Integer> tone;
    private int duration;

}
