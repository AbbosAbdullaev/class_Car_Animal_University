public class Main {
    public static void main(String[] args) {

    Car MyCar = new Car("Cobalt", "300",15000f,"Shevrolet");
    System.out.println("Avtomabil modeli ------> " + MyCar.getModel());
    System.out.println("Avtomabil tezligi ------> " + MyCar.getSpeed());
    System.out.println("Avtomabil narxi ------> " + MyCar.getPrice());
    System.out.println("Avtomabil turi ------> " + MyCar.getType());

    }
}