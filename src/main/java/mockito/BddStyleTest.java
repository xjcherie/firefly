package mockito;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.BDDMockito.given;

@RunWith(MockitoJUnitRunner.class)
public class BddStyleTest {

    @Mock
    private List<String> list;

    @Test
    public void bddTest() {
        given(list.get(anyInt())).willReturn("A");
//        when(list.get(anyInt())).thenReturn("A");

        assertThat(list.get(10), equalTo("A"));
    }
}
