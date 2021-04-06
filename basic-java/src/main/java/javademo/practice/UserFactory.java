package javademo.practice;

/**
 * Created by Cherie on 2021/01/22
 **/
public interface UserFactory {
    static UserBuilder createUserBuilder() {
        return new UserBuilder();
    }

    class UserBuilder {

    }
}
