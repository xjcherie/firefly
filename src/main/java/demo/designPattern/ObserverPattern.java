package demo.designPattern;

import java.util.ArrayList;
import java.util.List;

class ObserverPattern {
    interface Subject {
        void attach(Observer observer);

        void detach(Observer observer);

        void notifyGraph();

        void numUpdate(int num);
    }

    public static class numSubject implements Subject {
        private List<Observer> observers = new ArrayList<>();
        private int num;

        public void attach(Observer observer) {
            observers.add(observer);
        }

        public void detach(Observer observer) {
            observers.remove(observer);
        }

        public void notifyGraph() {
            observers.forEach(o -> o.updateCir(num));
        }

        public void numUpdate(int num) {
            this.num = num;
            System.out.println("num: " + num);
        }
    }

    abstract static class Observer {
        Subject sub;

        Observer(Subject sub) {
            this.sub = sub;
        }

        public abstract void updateCir(int num);
    }

    static class SquareObserver extends Observer {

        SquareObserver(Subject sub) {
            super(sub);
        }

        @Override
        public void updateCir(int num) {
            System.out.println("square circumference: " + num * 4);
        }
    }

    static class TriangleObserver extends Observer {
        TriangleObserver(Subject sub) {
            super(sub);
        }

        @Override
        public void updateCir(int num) {
            System.out.println("triangle circumference: " + num * 3);
        }
    }

}
