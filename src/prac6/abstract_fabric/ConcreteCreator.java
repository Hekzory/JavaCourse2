package prac6.abstract_fabric;

public class ConcreteCreator implements Creator {

    @Override
    public Product factoryMethod() {
        return new ConcreteProduct();
    }
}
