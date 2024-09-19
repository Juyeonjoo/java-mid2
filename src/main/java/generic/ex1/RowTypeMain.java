package generic.ex1;

public class RowTypeMain {
    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox();
//        GenericBox<Object> integerBox = new GenericBox<>();//권장
        integerBox.set(10);
//        integerBox.set("set"); 위험 가능성
        Integer result = (Integer) integerBox.get();
        System.out.println("result = " + result);
    }
}
