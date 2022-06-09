public class Main {

    public static void main(String args[])
    {
        ProductoControlador productoControlador = new ProductoControlador(8);

        productoControlador.agregar("Licuadora","256481",120);
        productoControlador.agregar("Batidora","568423",250);
        productoControlador.agregar("Lavadora","231548",600);

        productoControlador.listar2();

        System.out.println("------------- Crear Producto -------------");

        productoControlador.crear("Computadora","8945621",1250);

        System.out.println("Producto creado");


        System.out.println("------------- Buscar Producto -------------");

        String producto= "8945621";

        Producto encontrado;

        encontrado = productoControlador.buscar(producto);

        if(encontrado != null)
        {
            System.out.println("Producto encontrado: "+encontrado.getNombre());

        } else{

            System.out.println("No se encontro: "+producto);
        }


    }
}