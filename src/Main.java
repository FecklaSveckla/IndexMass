public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float mass = 50;
        float height = (float) 1.7F;
        float index = service.calculate(mass, height);
        System.out.println(index);

    }
}