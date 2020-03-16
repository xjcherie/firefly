package mockito;

import mockito.common.NumberCalculate;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

public class SpyingTest {

//    @Spy
//    private List<String> list = new ArrayList<>();
//
//    @Before
//    public void init() {
//        MockitoAnnotations.initMocks(this);
//    }

    @Test
    public void spyTest() {
        List<String> list = spy(new ArrayList<>());
        list.add("A");
        assertThat(list.get(0), equalTo("A"));
        assertThat(list.size(), equalTo(1));

        when(list.size()).thenReturn(0);
        assertThat(list.get(0), equalTo("A"));
        assertThat(list.size(), equalTo(0));
    }

    @Test
    public void spyAbstractClass() {
        // TODO: 2020-03-15
        NumberCalculate spy = spy(NumberCalculate.class);

        when(spy.getSum(1, 2)).thenReturn(3);

        NumberCalculateA sumA = new NumberCalculateA();
        System.out.println(sumA.getSum(3, 5));

//        NumberCalculate spy = mock(NumberCalculate.class,
//                withSettings().useConstructor().defaultAnswer(CALLS_REAL_METHODS));
//
//        NumberCalculate spy = mock(NumberCalculate.class, withSettings()
//                .useConstructor().outerInstance(outerInstance).defaultAnswer(CALLS_REAL_METHODS));
//
//        NumberCalculate spy = mock(NumberCalculate.class,
//                withSettings().useConstructor("arg1", 123).defaultAnswer(CALLS_REAL_METHODS));

    }

    public class NumberCalculateA implements NumberCalculate {
        @Override
        public int getSum(int a, int b) {
            return 0;
        }
    }
}
