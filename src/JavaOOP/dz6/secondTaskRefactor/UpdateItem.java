package JavaOOP.dz6.secondTaskRefactor;

public interface UpdateItem<T> extends Storage<T> {
    public void update(T item);
}
