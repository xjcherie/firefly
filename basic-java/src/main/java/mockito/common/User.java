package mockito.common;

import lombok.Data;

@Data
public class User {

    private int userId;
    private String name;

    public User(int userId) {
        this.userId = userId;
    }

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

}
