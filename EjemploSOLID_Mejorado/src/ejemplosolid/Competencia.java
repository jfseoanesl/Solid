/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosolid;

import java.util.ArrayList;

/**
 *
 * @author jairo
 */
public class Competencia implements ICompetencia {
    private int distancia;
    private IDb bd;

    public Competencia(int distancia) {
        this.distancia = distancia;
        this.bd = new BDArrays();
    }
    
    public void setDB(IDb bd){this.bd=bd;}
        
    @Override
    public void imprimirTiempos(){
        for(Ciclista c : this.bd.consultarBD()){
            
            System.out.println("Tiempo de " + c.getNombre()); 
            System.out.println(this.tiempoConcursante(c)); 
            System.out.println("Dist x Min: " + c.distanciaPorMinuto());
        }
    }
    
    @Override
    public void imprimirGanador(){
        Ciclista ganador = this.bd.consultarBD().get(0);
        for(Ciclista c : this.bd.consultarBD()){
            if(this.tiempoConcursante(c)<this.tiempoConcursante(ganador)){
                ganador = c;
            }
        }
        System.out.println("EL ganador es " + ganador.getNombre());
    }

    @Override
    public double tiempoConcursante(Ciclista c) {
        return (double)this.distancia/c.distanciaPorMinuto();
    }

}
