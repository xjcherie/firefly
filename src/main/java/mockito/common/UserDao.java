package mockito.common;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class UserDao {

    @Resource
    private UserClient userClient;

    public String getUserNameByUserId(int userId) {
        return userClient.getUser(userId);
//        throw new RuntimeException();
    }

    public boolean saveUser(User user) {
        return user != null;
    }

}
