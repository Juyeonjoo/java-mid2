package generic.ex1;

public class BoxMain1 {

    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox();
        integerBox.set(10); // 오토 박싱에 의해 int 가 Integer 로 자동 변환됨
        System.out.println("integer = " + integerBox.get());

        StringBox sb = new StringBox();
        sb.set("Hello, World!");
        System.out.println("str = "+sb.get());
    }
}
