package mockito;

import mockito.common.UserService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Answers;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class DeepMockTest {

    @Mock(answer = Answers.RETURNS_DEEP_STUBS)
    private UserService userService;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testDeepMock() {
    }
}
