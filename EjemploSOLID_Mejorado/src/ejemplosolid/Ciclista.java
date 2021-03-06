/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosolid;

/**
 *
 * @author jairo
 */
public class Ciclista implements ICiclista {
    private String nombre;
    private int cadencia;
    private Bicicleta bici;

    public Ciclista (){
    }
    public Ciclista(String nombre, int cadencia, Bicicleta bici) {
        this.nombre = nombre;
        this.cadencia = cadencia;
        this.bici = bici;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cadencia
     */
    public int getCadencia() {
        return cadencia;
    }

    /**
     * @param cadencia the cadencia to set
     */
    public void setCadencia(int cadencia) {
        this.cadencia = cadencia;
    }

    /**
     * @return the bici
     */
    public Bicicleta getBici() {
        return bici;
    }

    /**
     * @param bici the bici to set
     */
    public void setBici(Bicicleta bici) {
        this.bici = bici;
    }
    
    @Override
    public double distanciaPorMinuto(){
        return this.cadencia*this.bici.retornarDesarrollo();
    }
    
    
}
