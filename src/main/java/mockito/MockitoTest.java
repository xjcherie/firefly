package mockito;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

@SuppressWarnings("unchecked")
public class MockitoTest {

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void mockTest() {
        List<String> list = mock(ArrayList.class);
        list.add("one");
        list.clear();

        verify(list).add("one");
        verify(list).clear();
    }
}
