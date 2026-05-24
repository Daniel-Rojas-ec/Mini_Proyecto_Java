public class Perro extends Animal
{
    public Perro(int id, String nombre, int edad, String estado)
    {
        super(id, nombre, edad, estado);
    }

    @Override
    public String hacerSonido()
    {
        return "Guau guau guau";
    }
}