package common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Cherie on 2020/11/04
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private long userId;

    private String name;

    private int age;

}
