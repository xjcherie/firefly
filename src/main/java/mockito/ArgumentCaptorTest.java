package mockito;

import mockito.common.User;
import mockito.common.UserDao;
import mockito.common.UserService;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ArgumentCaptorTest {

    @Mock
    private UserDao userDao;

    @InjectMocks
    private UserService userService;


    @After
    public void destroy() {
        reset(userDao, userService);
    }

    @Test
    public void argumentCaptorTest() {
        ArgumentCaptor<User> captor = ArgumentCaptor.forClass(User.class);
        User user = new User(1);

        when(userDao.saveUser(user)).thenReturn(true);
        assertThat(userService.saveUser(user), equalTo(true));
        verify(userDao).saveUser(captor.capture());

        assertThat(captor.getValue().getName(), equalTo("Alex"));
        assertThat(user.getName(), equalTo("Alex"));
    }

}
