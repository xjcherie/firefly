package basic.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Cherie on 2020/11/04
 **/
public class CollectionService {

    public static void main(String[] args) {
        List<User> list = new ArrayList<>();

        list.add(new User(1, "wjn"));
        list.add(new User(2, "cherie"));

        User[] result = list.toArray(new User[0]);
        System.out.println(Arrays.toString(result));
    }
}
