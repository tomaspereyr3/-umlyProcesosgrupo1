

/**
 * Class SistemaVenta
 */
public class SistemaVenta {

  //
  // Fields
  //

  public Cliente clientes;
  public Producto productos;
  public Venta Ventas;
  
  //
  // Constructors
  //
  public SistemaVenta () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of clientes
   * @param newVar the new value of clientes
   */
  public void setClientes (Cliente newVar) {
    clientes = newVar;
  }

  /**
   * Get the value of clientes
   * @return the value of clientes
   */
  public Cliente getClientes () {
    return clientes;
  }

  /**
   * Set the value of productos
   * @param newVar the new value of productos
   */
  public void setProductos (Producto newVar) {
    productos = newVar;
  }

  /**
   * Get the value of productos
   * @return the value of productos
   */
  public Producto getProductos () {
    return productos;
  }

  /**
   * Set the value of Ventas
   * @param newVar the new value of Ventas
   */
  public void setVentas (Venta newVar) {
    Ventas = newVar;
  }

  /**
   * Get the value of Ventas
   * @return the value of Ventas
   */
  public Venta getVentas () {
    return Ventas;
  }

  //
  // Other methods
  //

  /**
   * @return       boolean
   */
  public boolean registrarVenta()
  {
  }


  /**
   * @return       boolean
   */
  public boolean generarReporte()
  {
  }


}
