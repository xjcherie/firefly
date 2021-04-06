package mockito.common;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    private UserDao userDao;

    public String getUserName(int userId) {
        String userName = userDao.getUserNameByUserId(userId);
        if (StringUtils.isEmpty(userName)) {
            throw new RuntimeException();
        }
        return userName;
    }

    public User getUser(int userId) {
        return new User(1, "Alex");
    }

    public int getUserBookNum(int userId, String bookType) {
        throw new RuntimeException();
    }

    public boolean saveUser(User user) {
        if (StringUtils.isEmpty(user.getName())) {
            user.setName("Alex");
        }
        return this.userDao.saveUser(user);
    }

}
