package ejemplo2;

public class DriverVehiculo {
    public static void main(String[] args) {
        Camion camion = new Camion("Diesel",3);
        
        System.out.println(camion);
        
        System.out.println(camion.encender());
        camion.avanzar();
        camion.frenar();
        System.out.println(camion.apagar());
        System.out.println("----Motocicleta----");
        Motocicleta moto = new Motocicleta(150,"Yamaha");
        System.out.println(moto);
        System.out.println(moto.encender());
        System.out.println(moto.avanzar());
        System.out.println(moto.frenar());
        System.out.println(moto.apagar());
        
    }
}
