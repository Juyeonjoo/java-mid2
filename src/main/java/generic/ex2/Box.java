package generic.ex2;

public class Box <T> { // 객체를 보관할 수 있는 제네릭 클래스

    private T value;

    public T get () {
        return value;
    }

    public void set(T value) {
        this.value = value;
    }
}
