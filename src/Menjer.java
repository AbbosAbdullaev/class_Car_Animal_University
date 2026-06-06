public class Menjer extends Xodim{
    int numbers;
    public Menjer(String name, double monthly, int numbers) {
        super(name, monthly);
        this.numbers = numbers;
    }

    public void amount(){
        System.out.println(name + " " + numbers + " sonli jamoa bilan yig'ilish");
    }
}
