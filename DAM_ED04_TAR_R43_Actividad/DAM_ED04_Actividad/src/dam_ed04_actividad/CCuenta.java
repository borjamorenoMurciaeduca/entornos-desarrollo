/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dam_ed04_actividad;

/**
 * 
 * @author Borja Moreno
 */


public class CCuenta {

    /**
     * Nombre de la cuenta
     */
    private String nombre;
    
    /**
     * Número de cuenta
     */
    private String cuenta;
    
    /**
     * Saldo disponible en cuenta
     */
    private double saldo;
    
    /**
     * Tipo de interés de la cuenta
     */
    private double tipoInterés;

    /**
     *
     */
    public CCuenta()
    {
    }

    /**
     * 
     * @param cuenta 
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * 
     * @param saldo 
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    /**
     * 
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * 
     * @param tipoInterés 
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * 
     * @return cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * 
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }
    
    /**
     * 
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * @return tipo de interés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * 
     * @param nom
     * @param cue
     * @param sal
     * @param tipo 
     */
    
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * 
     * @param nom
     * @deprecated En deuso, se usa el setter 
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }

    /**
     * 
     * @return nombre
     * @deprecated En desuso, se usa el getter
     */
    public String obtenerNombre()
    {
        return getNombre();
    }

    /**
     * 
     * @return estado
     * @deprecated En desuso, se usa el getter
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * 
     * @param cantidad
     * @throws Exception 
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    /**
     * 
     * @param cantidad
     * @throws Exception 
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
     * 
     * @return 
     * @deprecated En desuso, se usa el getter
     */
    public String obtenerCuenta()
    {
        return cuenta;
    }
    
}
