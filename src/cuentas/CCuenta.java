package cuentas;

public class CCuenta {

    /**
     * nombre Nombre del propietario de la cuenta
     */
    private String nombre;
    /**
     * cuenta Número de la cuenta
     */
    private String cuenta;
    /**
     * saldo Saldo actual de la cuenta
     */
    private double saldo;
    /**
     * tipoInteres tipo de interés de la cuenta
     */
    private double tipoInteres;

    /**
     * Constructor por defecto
     */
    public CCuenta()
    {
    }

    
    /**
     * Constructor principal
     * 
     * @param nom usuario de la cuenta
     * @param cue número de cuenta
     * @param sal saldo de la cuenta
     * @param tipo tipo de interes de la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * 
     * @return Saldo actual de la cuenta
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * 
     * @param cantidad Cantidad a intresar en la cuenta
     * @throws Exception Excepción al intentar ingresar saldo negativo
     */
    public void ingresar(double cantidad) throws Exception
    {
        //No lo voy a modificar, pero para mi ingresar 0 no tiene sentido. Quizás
        //lo tenga a nivel bancario
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * 
     * @param cantidad Cantidad a retirar de la cuenta
     * @throws Exception Excepción al intentar retirar 0 o menos saldo, o al
     * intentar retirar una cantidad mayor al saldo disponible
     * 
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

    /**
     * @return Devuelve el usuario de la cuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * @param nombre Nuevo nombre del usuario de la cuenta
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * 
     * @return Devuelve el número de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * 
     * @param cuenta Nuevo número de cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * 
     * @return Devuelve el saldo actual de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * 
     * @param saldo Nuevo saldo para la cuenta. Reemplaza el saldo actual
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * 
     * @return Devuelve el tipo de interés
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * 
     * @param tipoInteres Nuevo tipo de interés para la cuenta
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
     
}
