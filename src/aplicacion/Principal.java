package dominio;
 public static void main(String[] args) {
        VehiculoTurismo vehiculo1 = new VehiculoTurismo("Marca1", "Modelo1", 10000, 5);
        System.out.println("Precio final del vehículo 1: " + vehiculo1.calcularPrecioFinal() + " euros");

        VehiculoTurismo vehiculo2 = new VehiculoTurismo("Marca2", "Modelo2", 10000, 7);
        System.out.println("Precio final del vehículo 2: " + vehiculo2.calcularPrecioFinal() + " euros");
    }
}
