public class Main {
    public static void main(String[] args) {

    Car MyCar = new Car("Cobalt", "300",15000f,"Shevrolet");
    System.out.println("Avtomabil modeli ------> " + MyCar.getModel());
    System.out.println("Avtomabil tezligi ------> " + MyCar.getSpeed());
    System.out.println("Avtomabil narxi ------> " + MyCar.getPrice());
    System.out.println("Avtomabil turi ------> " + MyCar.getType());

        System.out.println("===================================");

    Animals myAnimals = new Animals("Mushuk", "Uy hayvoni", 2);
    System.out.println("Hayvon nomi ----> " + myAnimals.getName());
    System.out.println("Hayvon turi ----> " + myAnimals.getType());
    System.out.println("Hayvon yoshi ----> " + myAnimals.getAge());

    }
}