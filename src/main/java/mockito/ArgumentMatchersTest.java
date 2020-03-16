package mockito;

import mockito.common.UserService;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ArgumentMatchersTest {

    @Mock
    private UserService userService;

    @After
    public void destroy() {
        reset(userService);
    }

    @Test
    public void simpleTest() {
        List<String> list = mock(ArrayList.class);

        when(list.get(eq(0))).thenReturn("A");
        assertThat(list.get(0), equalTo("A"));
        assertThat(list.get(1), nullValue());

        when(list.get(anyInt())).thenReturn("B");
        assertThat(list.get(0), equalTo("B"));
        assertThat(list.get(100), equalTo("B"));
    }

    @Test
    public void invalidTest() {
        when(userService.getUserBookNum(1, anyString())).thenReturn(1);
        when(userService.getUserBookNum(2, anyString())).thenReturn(10);

        assertThat(userService.getUserBookNum(1, anyString()), equalTo(1));
        assertThat(userService.getUserBookNum(2, anyString()), equalTo(10));
    }

    @Test
    public void wildcardArgumentMatchersTest() {
        when(userService.getUserBookNum(anyInt(), anyString())).thenReturn(5);
        when(userService.getUserBookNum(eq(1), anyString())).thenReturn(1);
        when(userService.getUserBookNum(eq(2), anyString())).thenReturn(10);

        assertThat(userService.getUserBookNum(1, "java"), equalTo(1));
        assertThat(userService.getUserBookNum(2, "java"), equalTo(10));
        assertThat(userService.getUserBookNum(1, "java"), equalTo(1));
        assertThat(userService.getUserBookNum(5, "java"), equalTo(5));

        verify(userService, times(2)).getUserBookNum(1, "java");
        verify(userService, times(4)).getUserBookNum(anyInt(), anyString());
    }
}
