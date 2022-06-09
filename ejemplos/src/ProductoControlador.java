public class ProductoControlador {

    private Producto producto[];


    int contador;

    public ProductoControlador(int size) {
        this.producto = new Producto[size];

        this.contador = 0;
    }

    public void agregar(String nombre, String codigo, int precio) {
        this.producto[this.contador] = new Producto(codigo, nombre, precio);

        this.contador++;
    }

    public Producto buscar(String codigo) {
        int i;

        for (i = 0; i < this.contador; i++) {
            if (this.producto[i].getCodigo() == (codigo)) {
                break;
            }
        }

        if (i == this.contador) {
            return null;

        } else {

            return this.producto[i];
        }
    }
    public void listar2() {

        for (int i = 0; i < this.contador; i++) {
            System.out.println(this.producto[i].getCodigo());

            this.producto[i].listarProducto();
        }

    }

    public void crear(String nombre, String codigo, int precio)
    {
        this.producto[this.contador] = new Producto(codigo, nombre, precio);

        this.contador++;

    }

}


