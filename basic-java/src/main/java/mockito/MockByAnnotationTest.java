package mockito;

import mockito.common.User;
import mockito.common.UserService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Answers;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class MockByAnnotationTest {

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Mock(answer = Answers.RETURNS_SMART_NULLS)
    private UserService userService;

    @Test
    public void testMock() {
        User user = userService.getUser(1);
        System.out.println(user);
    }
}
