package mockito;

import mockito.common.User;
import mockito.common.UserService;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class MockByRuleTest {

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Mock
    private UserService userService;

    @Test
    public void testMock() {
        User user = userService.getUser(1);
        System.out.println(user);
    }
}
