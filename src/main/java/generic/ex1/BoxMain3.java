package generic.ex1;

public class BoxMain3 {

    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<>(); // 생성 시점에 T 타입 결정
        integerBox.set(10);//Integer 타입만 허용용
        Integer integer = integerBox.get(); // Integer 타입 반환 (캐스팅 불필요)
        System.out.println("integer = " + integer);

        GenericBox<String> sb = new GenericBox<>();
        sb.set("Hello, World!"); //String 타입만 허용
        String str = sb.get();
        System.out.println("str = "+str);

        //원하는 모든 타입 사용 가능
        GenericBox<Double> doubleBox = new GenericBox<>();
        doubleBox.set(3.14);
        Double d = doubleBox.get();
        System.out.println("double = " + d);

        //타입 추론: 생성하는 제네릭 타입 생략 가능
        GenericBox<Integer> integerBox2 = new GenericBox<>();


    }

}

