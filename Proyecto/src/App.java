import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Refugio refugio = new Refugio();
        int opcion;
        do
        {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Registrar perro");
            System.out.println("2. Registrar gato");
            System.out.println("3. Mostrar animales");
            System.out.println("4. Buscar animal por id");
            System.out.println("5. Cambiar estado");
            System.out.println("6. Ejecutar sonido");
            System.out.println("7. Salir");
            opcion = sc.nextInt();
            sc.nextLine();

            try
            {
                switch(opcion)
                {
                    case 1:
                        refugio.registrarAnimal(
                            new Perro(1, "Harry", 10, "ACTIVO")
                        );
                        break;

                    case 2:
                        refugio.registrarAnimal(
                            new Gato(2, "Queso", 5, "ACTIVO")
                        );
                        break;
                    case 3:
                        refugio.mostrarAnimales();
                        break;
                    case 4:
                        Animal animal = refugio.buscarPorId(1);
                        if(animal != null)
                        {
                            animal.mostrarInfo();
                        }
                        else
                        {
                            System.out.println("Animal no encontrado");
                        }
                        break;
                    case 5:
                        refugio.cambiarEstado(1, "ADOPTADO");
                        break;
                    case 6:
                        refugio.ejecutarSonido(2);
                        break;
                    case 7:
                        System.out.println("Saliendo...");
                        break;

                    default:
                        System.out.println("Opcion invalida");
                }
            }
            catch(Exception e)
            {
                System.out.println("Error en el sistema");
            }

        }while(opcion != 7);

        sc.close();
    }
}

