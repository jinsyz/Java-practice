package chapter3;

public class chapter3to8 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        byte c = (byte) (a + b); // byte형 연산에서는 자동으로 int 로 바꾸어 연산을 하기 때문에 byte 로 형 변환 후 계산

        char ch = 'A';
        ch += 2;

        float f = 3 /2f; // int 연산하면 결과 값이 int 이기 때문에 하나를 float로 바꾸어 준다.
        long l = 3000*3000*3000L; //오버 플로우 발생하므로 L을 써서 long 형으로 바꾸어 준다.

        float f2 = 0.1f;
        double d = 0.1;

        boolean result = (float)d == f2;

        System.out.println("c=" +c);
        System.out.println("ch="+ch);
        System.out.println("f="+f);
        System.out.println("l:"+l);

    }
}
