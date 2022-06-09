
public class Producto {


    private String codigo;
    private String nombre;
    private int precio;


public Producto(String codigo, String nombre, int precio)
{
    this.codigo=codigo;
    this.nombre=nombre;
    this.precio=precio;

}

    public Producto(String codigo)
    {
        this.codigo=codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo)

    {
        this.codigo = codigo;
    }

    public String getNombre()

    {
        return nombre;
    }

    public int getPrecio()

    {
        return precio;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setPrecio(int precio)
    {
        this.precio = precio;
    }

    public void listarProducto()
    {
        System.out.println("Nombres: "+ this.getNombre());
        System.out.println("codigo: "+ this.getCodigo());
        System.out.println("precio: "+ this.getPrecio());
    }




}


