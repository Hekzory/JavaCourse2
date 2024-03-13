package prac8.mediator;

public class ConcreteColleague implements Colleague {
    Mediator mediator;

    @Override
    public void doOperation() {
        mediator.doNotify(this);
    }

}
