package generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10); // 오토 박싱에 의해 int 가 Integer 로 자동 변환됨
        System.out.println("integer = " + integerBox.get());

        ObjectBox sb = new ObjectBox();
        sb.set("Hello, World!");
        System.out.println("str = "+sb.get());

//        set(Object ..) 메서드는 모든 타입의 부모인 Object 를 매개변수로 받기 때문에 세상의 어떤 데이터도
//        입력받음
        integerBox.set("문자100");
        Integer result = (Integer) integerBox.get(); // String -> Integer 캐스팅 예

        System.out.println("result = " + result);
    }
}
