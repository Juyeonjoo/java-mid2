package generic.ex1;

public class GenericBox<T> { // T: 타입 매개변수

    private T value;

    public T get() {
        return value;
    }

    public void set(T value) {
        this.value = value;
    }
}
