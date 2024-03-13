package prac8.mediator;

public class ConcreteMediator implements Mediator {
    private ConcreteColleague concreteColleague;

    @Override
    public void doNotify(Object sender) {
        System.out.println(sender);
    }
}
