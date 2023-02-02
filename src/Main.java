public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightInKg=60;
        double heightInMeters = 1.62;
        double Bmiservice = service.calculate(weightInKg,heightInMeters);
        System.out.println(Bmiservice);
    }
}
