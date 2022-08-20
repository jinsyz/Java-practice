public class chapter3to7 {
    public static void main(String[] args) {
        int fahrenhelt = 100;
        float celcius = (int)((5/9f * (fahrenhelt - 32))*100 + 0.5) / 100f;
        System.out.println("Fahrent:" + fahrenhelt);
        System.out.println("Celcius:"+celcius);
    }
}
