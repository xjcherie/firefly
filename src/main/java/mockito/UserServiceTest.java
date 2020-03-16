package mockito;

import mockito.common.UserDao;
import mockito.common.UserService;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

    @Mock
    private UserDao userDao;

    @Spy
    @InjectMocks
    private UserService userService;

    @After
    public void after() {
        reset(this.userDao, this.userService);
    }

    @Test
    public void getUserNameTest() {
        when(userDao.getUserNameByUserId(1)).thenReturn("Alice");
        assertThat(userService.getUserName(1), equalTo("Alice"));
        verify(userDao, times(1)).getUserNameByUserId(anyInt());
    }

}
