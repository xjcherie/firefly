package mockito.common;

public class UserClient {

    public String getUser(int userId) {
        throw new RuntimeException();
    }
}
