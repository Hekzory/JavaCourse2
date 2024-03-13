package prac8.iterator;

public class ConcreteIterator implements Iterator{

    private ConcreteCollection concreteCollection;
    private int counter;
    @Override
    public Object next() {
        counter++;
        return null;
    }

    @Override
    public boolean hasMore() {
        return counter < concreteCollection.size();
    }

    public ConcreteIterator(ConcreteCollection concreteCollection) {
        this.concreteCollection = concreteCollection;
        counter = 0;
    }
}
