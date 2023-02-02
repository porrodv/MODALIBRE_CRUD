package Modelo;

public class Datos {
    
    // CUENTA
    private static String usuario;
    private static String correo;
    private static int idCuentaCliente;

    // DATOS PERSONALES
    private static String nombre;
    private static String apellido;
    private static String distrito;
    private static String direccion;
    private static String documento;
    private static int telefono;
    
    // COMPRA
    private static String tipo;
    private static String marca;
    private static String talla;
    private static double precio;
    private static int cantidad;
    private static double totalPagar;
    
    ///////////////////////////////////////////////////////////////////////////////////////////
    
    public static int getIdCuentaCliente() {
        return idCuentaCliente;
    }

    public static void setIdCuentaCliente(int idCuentaCliente) {
        Datos.idCuentaCliente = idCuentaCliente;
    }
    
    public static String getUsuario() {
        return usuario;
    }

    public static void setUsuario(String usuario) {
        Datos.usuario = usuario;
    }

    public static String getCorreo() {
        return correo;
    }

    public static void setCorreo(String correo) {
        Datos.correo = correo;
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Datos.nombre = nombre;
    }

    public static String getDocumento() {
        return documento;
    }

    public static void setDocumento(String documento) {
        Datos.documento = documento;
    }

    public static String getApellido() {
        return apellido;
    }

    public static void setApellido(String apellido) {
        Datos.apellido = apellido;
    }

    public static String getDistrito() {
        return distrito;
    }

    public static void setDistrito(String distrito) {
        Datos.distrito = distrito;
    }

    public static String getDireccion() {
        return direccion;
    }

    public static void setDireccion(String direccion) {
        Datos.direccion = direccion;
    }

    public static int getTelefono() {
        return telefono;
    }

    public static void setTelefono(int telefono) {
        Datos.telefono = telefono;
    }

    public static String getTipo() {
        return tipo;
    }

    public static void setTipo(String tipo) {
        Datos.tipo = tipo;
    }

    public static String getMarca() {
        return marca;
    }

    public static void setMarca(String marca) {
        Datos.marca = marca;
    }

    public static String getTalla() {
        return talla;
    }

    public static void setTalla(String talla) {
        Datos.talla = talla;
    }

    public static double getPrecio() {
        return precio;
    }

    public static void setPrecio(double precio) {
        Datos.precio = precio;
    }

    public static int getCantidad() {
        return cantidad;
    }

    public static void setCantidad(int cantidad) {
        Datos.cantidad = cantidad;
    }

    public static double getTotalPagar() {
        return totalPagar;
    }

    public static void setTotalPagar(double totalPagar) {
        Datos.totalPagar = totalPagar;
    }
    
}
