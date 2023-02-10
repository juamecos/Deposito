package Cuentas;

/** Esta clase es usada para la cuarta tarea de Entornos de Desarrollo
 * @author juanjo
 * @version 0.1 
 */
/**
 * @author juanjo
 *
 */
public class CCuenta {
	 /**
	  * nombre String
	  */
	private String nombre;
	/**
	 * cuenta String
	 */
	    private String cuenta;
	    /**
	     * saldo deuble
	     */
	    private double saldo;
	    /**
	     * tipoInteres double
	     */
	    private double tipoInteres;

	    /**
	     * Constructor vacio 
	     */
	    public CCuenta()
	    {
	    }
	    /**
	     * Constructor con parametros
	     * @param nom String nombre del titular de la cuenta
	     * @param cue String cuenta corriente
	     * @param sal double saldo de la cuenta corriente
	     * @param tipo double tipo de interes
	     */

	    public CCuenta(String nom, String cue, double sal, double tipo)
	    {
	        nombre =nom;
	        cuenta=cue;
	        saldo=sal;
	    }
	    /**
	     * Metodo para obtener el saldo de la cuenta
	     * @return double saldo
	     */

	    public double estado()
	    {
	        return saldo;
	    }
	    /**
	     * Método ingresar una cierta cantidad en la cuenta
	     * @param cantidad double cantidad a ingresar en la cuenta
	     * @throws Exception Excepción para capturar excepcion de cantidad negativa
	     */

	    public void ingresar(double cantidad) throws Exception
	    {
	        if (cantidad<0)
	            throw new Exception("No se puede ingresar una cantidad negativa");
	        saldo = saldo + cantidad;
	    }
	    /**
	     * Método para retirar una cierta cantidad de la cuenta
	     * @param cantidad double cantidad a retirar
	     * @throws Exception Excepción para capturar excepcion de cantidad negativa o no hay saldo suficiente
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
	     * Getter para atributo
	     * @return String
	     */
	    public String getNombre() {
	        return nombre;
	    }
	    /**
	     * Setter para atributo nombre
	     * @param nombre String Nombre de titular
	     */

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
	    /**
	     * Getter para atributo cuenta
	     * @return String
	     */

		public String getCuenta() {
			return cuenta;
		}
		/**
		 * Setter para atributo cuenta
		 * @param cuenta String
		 */

		public void setCuenta(String cuenta) {
			this.cuenta = cuenta;
		}
		/**
	     * Setter para atributo saldo
	     * @return double
	     */

		public double getSaldo() {
			return saldo;
		}
		/**
	     * Getter para atributo saldo
	     * @param saldo  double
	     */

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		/**
	     * Setter para atributo tipoInteres
	     * @return void
	     */

		public double getTipoInteres() {
			return tipoInteres;
		}
		/**
	     * Getter para atributo tipoInteres
	     * @param tipoInteres double
	     */

		public void setTipoInteres(double tipoInteres) {
			this.tipoInteres = tipoInteres;
		}
		

	    
}
