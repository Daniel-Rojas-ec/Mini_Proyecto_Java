public class Gato extends Animal
{
    public Gato(int id, String nombre, int edad, String estado)
    {
        super(id, nombre, edad, estado);
    }

    @Override
    public String hacerSonido()
    {
        return "Miau miau miau";
    }
}