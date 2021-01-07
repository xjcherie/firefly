package basic.designpattern;

import org.junit.Test;

public class PatternTest {

    @Test
    public void observerTest() {
        ObserverPattern.numSubject numSubject = new ObserverPattern.numSubject();

        ObserverPattern.SquareObserver squareObserver = new ObserverPattern.SquareObserver(numSubject);
        ObserverPattern.TriangleObserver triangleObserver = new ObserverPattern.TriangleObserver(numSubject);

        numSubject.attach(squareObserver);
        numSubject.attach(triangleObserver);

        numSubject.numUpdate(3);
        numSubject.notifyGraph();
    }



}
