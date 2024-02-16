
/**
 * La classe CCuenta representa un compte bancari
 * Permet realitzar operacions com ingressar diners, retirar diners i consultar el saldo
 * @author jehela
 * @version 1.0
 * @since 2024-02-15
 */

public class CCuenta {

    /**
     * En esta classe asignem els atributs private de la classe CCuenta
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }

    /**
     * Constructor amb els paràmetres de la classe CCuenta
     * @param nom Nom del titular del compte.
     * @param cue Número de compte.
     * @param sal Saldo.
     * @param tipo Tipus d’Interés aplicat al compte.
     */

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * Aquest mètode retornarà el saldo actual del compte
     * @return Saldo actual del compte
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Ingressa una certa quantitat de diners al compte.
     * @param cantidad La quantitat de diners a ingressar.
     * @throws Exception Si la quantitat és negativa.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /**
     * Retira una certa quantitat de diners del compte.
     * @param cantidad La quantitat de diners a retirar.
     * @throws Exception Si la quantitat és negativa o si no hi ha suficient saldo.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Aquest mètode és un getter para que ens retorni el nom del compte.
     * @return ens retornarà el nom del titular
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Aquest mètode és un setter que ens permet establir el nom del compte.
     * @param nombre El nou nom del titular del compte
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Aquest mètode és un getter para que ens retorni el número del compte.
     * @return ens retornarà el noúmero de compte.
     */
    public String getCuenta() {
        return cuenta;
    }
    /**
     * Aquest mètode és un setter que ens permet establir el número de compte.
     * @param cuenta El nou número de compte.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    /**
     * Aquest mètode és un getter que ens permet obtenir el saldo del compte.
     * @return retorna el saldo del compte.
     */
    public double getSaldo() {
        return saldo;
    }
    /**
     * Aquest mètode és un setter que ens permet canviar o establir el nou saldo del compte.
     * @param saldo El nou saldo del compte.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    /**
     * Aquest és un mètode getter que mostra el tipus d'interès aplicat al compte a un valor nou.
     * @return mostra el tipus d'interès aplicat al compte.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }
    /**
     * Estableix el tipus d'interès aplicat al compte.
     * @param tipoInterés El nou tipus d'interès aplicat al compte.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
