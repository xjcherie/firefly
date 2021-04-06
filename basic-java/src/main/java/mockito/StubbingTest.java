package mockito;

import mockito.common.Hello;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class StubbingTest {

    private List<String> list;

    @Before
    public void init() {
        this.list = mock(ArrayList.class);
    }

    @Test
    public void simpleStubbing() {
        when(list.get(0)).thenReturn("A");
        doReturn("B").when(list).get(1);
        assertThat(list.get(0), equalTo("A"));
        assertThat(list.get(1), equalTo("B"));
    }

    @Test
    public void stubbingVoidMethod() {
        doNothing().when(list).clear();
        list.clear();
        verify(list, times(1)).clear();
    }

    @Test
    public void stubbingVoidMethodWithException() {
        doThrow(RuntimeException.class).when(list).clear();
        try {
            list.clear();
            fail();
        } catch (Exception e) {
            assertThat(e, instanceOf(RuntimeException.class));
        }
    }

    @Test
    public void subbingWithConsecutiveCall() {
        when(list.size()).thenReturn(1, 2, 3);

        assertThat(list.size(), equalTo(1));
        assertThat(list.size(), equalTo(2));
        assertThat(list.size(), equalTo(3));
        assertThat(list.size(), equalTo(3));
    }

    @Test
    public void stubbingWithCallbacks() {
        when(list.get(anyInt())).thenAnswer(invocationOnMock -> {
            Integer index = invocationOnMock.getArgument(0, Integer.class);
            return String.valueOf(index * 10);
        });
        assertThat(list.get(0), equalTo("0"));
        assertThat(list.get(10), equalTo("100"));
    }

    @Test
    public void stubbingWithPartialMock() {
        Hello hello = mock(Hello.class);
        when(hello.sayHi()).thenReturn("Hi");
        assertThat(hello.sayHi(), equalTo("Hi"));

        when(hello.sayHello()).thenCallRealMethod();
        assertThat(hello.sayHello(), equalTo("Hello"));
    }

    @After
    public void destroy() {
        reset(this.list);
    }

}
