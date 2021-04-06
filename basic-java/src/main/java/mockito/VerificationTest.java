package mockito;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class VerificationTest {

    @Mock
    private List<String> list;

    @Test
    public void verifyInvocationNumberTest() {
        list.add("once");

        verify(list).add("once");
        verify(list, times(1)).add("once");
        verify(list, atMost(1)).add("once");
        verify(list, never()).clear();

        list.add("once");
        list.add("once");
        verify(list, atLeastOnce()).add("once");
        verify(list, atLeast(2)).add("once");
        verify(list, atMost(3)).add("once");
    }

    @Test
    public void onlyTest() {
        list.add("once");
//        list.clear();
        verify(list, only()).add("once");
    }

    @Test
    public void verifyInteractionTest() {
        list.add("once");
        verify(list).add("once");

        list.clear();
        verify(list).clear();
        verifyNoMoreInteractions(list);
    }

    @Test
    public void verifyInOrderTest() {
        List<String> list = mock(List.class);

        list.add("was added first");
        list.add("was added second");

        InOrder inOrder = inOrder(list);

        inOrder.verify(list).add("was added first");
        inOrder.verify(list).add("was added second");

        List<String> firstMock = mock(List.class);
        List<String> secondMock = mock(List.class);

        firstMock.add("was called first");
        secondMock.add("was called second");

        //create inOrder object passing any mocks that need to be verified in order
        InOrder inOrder2 = inOrder(firstMock, secondMock);

        //following will make sure that firstMock was called before secondMock
        inOrder2.verify(firstMock).add("was called first");
        inOrder2.verify(secondMock).add("was called second");
    }
}
