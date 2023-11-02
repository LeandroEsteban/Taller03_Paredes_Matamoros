import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Mostrar sucursales");
            System.out.println("2. Mostrar camiones de las sucursales");
            System.out.println("3. Agregar camión");
            System.out.println("4. Eliminar camión");
            System.out.println("5. Salir");

            String opcionStr = scanner.nextLine();
            int opcion = 0;

            try {
                opcion = Integer.parseInt(opcionStr);
            } catch (NumberFormatException e) {
                System.out.println("Opción no válida. Intente de nuevo.");
                continue;
            }
            switch (opcion) {
                case 1:
                    empresa.mostrarSucursales();
                    break;
                case 2:
                    for (Sucursal sucursal : empresa.getSucursales()) {
                        System.out.println("Camiones en la sucursal " + sucursal.getCodigo() + ":");
                        for (Camion camion : sucursal.getCamiones()) {
                            System.out.println("Codigo camion: " + camion.getCodigoCamion());
                        }
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el código de la sucursal:");
                    String codigoSucursal = scanner.next();
                    scanner.nextLine();  // consume newline
                    System.out.println("Ingrese el código del camión:");
                    String codigoCamion = scanner.next();
                    scanner.nextLine();  // consume newline
                    System.out.println("Ingrese la patente del camión:");
                    String patente = scanner.next();
                    scanner.nextLine();  // consume newline
                    System.out.println("Ingrese la descripción del camión:");
                    String descripcion = scanner.nextLine();
                    for (Sucursal sucursal : empresa.getSucursales()) {
                        if (sucursal.getCodigo().equals(codigoSucursal)) {
                            sucursal.agregarCamion(codigoCamion, patente, descripcion);
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Ingrese el código de la sucursal:");
                    codigoSucursal = scanner.next();
                    System.out.println("Ingrese el código del camión a eliminar:");
                    codigoCamion = scanner.next();
                    for (Sucursal sucursal : empresa.getSucursales()) {
                        if (sucursal.getCodigo().equals(codigoSucursal)) {
                            sucursal.eliminarCamion(codigoCamion);
                            break;
                        }
                    }
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}
