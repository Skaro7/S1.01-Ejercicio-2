public class Car {

    public static final String brand = "Peugot";
    public static String model = "Desconocido";
    public final int power;

    public Car(int power) {
        this.power = power;
        System.out.println("Car power: " + this.power);
    }

    public static void brake(){
        System.out.println("El vehicle està frenant");
    }

    public void accelerate(){
        System.out.println("El vehicle està accelerant");
    }

}
