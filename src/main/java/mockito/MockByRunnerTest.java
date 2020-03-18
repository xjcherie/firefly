package mockito;

import mockito.common.User;
import mockito.common.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class MockByRunnerTest {

    @Test
    public void testMock() {
        UserService userService = mock(UserService.class, Mockito.RETURNS_SMART_NULLS);
        User user = userService.getUser(1);
        System.out.println(user);
    }
}
