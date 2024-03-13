package prac8.iterator;

public class ConcreteCollection implements IterableCollection {
    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public int size() {
        return 0;
    }
}
