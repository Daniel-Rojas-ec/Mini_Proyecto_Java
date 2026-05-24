import java.util.ArrayList;

public class Refugio
{
    private ArrayList<Animal> animales;

    public Refugio()
    {
        animales = new ArrayList<>();
    }

    public void registrarAnimal(Animal animal)
    {
        animales.add(animal);
        System.out.println("Animal registrado");
    }

    public void mostrarAnimales()
    {
        for(Animal animal : animales)
        {
            animal.mostrarInfo();
            System.out.println("Tipo: " + animal.getClass().getSimpleName());
            System.out.println("Sonido: " + animal.hacerSonido());
            System.out.println("----------------");
        }
    }

    public Animal buscarPorId(int id)
    {
        for(Animal animal : animales)
        {
            if(animal.getId() == id)
            {
                return animal;
            }
        }

        return null;
    }

    public void cambiarEstado(int id, String nuevoEstado)
    {
        Animal animal = buscarPorId(id);

        if(animal != null)
        {
            animal.setEstado(nuevoEstado);
            System.out.println("Estado actualizado");
        }
        else
        {
            System.out.println("Animal no encontrado");
        }
    }

    public void ejecutarSonido(int id)
    {
        Animal animal = buscarPorId(id);

        if(animal != null)
        {
            System.out.println(animal.hacerSonido());
        }
        else
        {
            System.out.println("Animal no encontrado");
        }
    }
}

