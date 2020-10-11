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
    private ArrayList<Ciclista> concursantesDB = new ArrayList();

    public Competencia(int distancia) {
        this.distancia = distancia;
        // viola principio responsabilidad simple
        // Deberia haber una clase que gestionara la BD de concursantes
        this.concursantesDB.add(new Ciclista("Jairo", 50, new Bicicleta()));
        this.concursantesDB.add(new Ciclista("Braulio", 60, new Bicicleta()));
        this.concursantesDB.add(new Ciclista("Alvaro", 30, new Bicicleta()));
    }
    
    @Override
    public void imprimirTiempos(){
        for(Ciclista c : concursantesDB){
            
            // viola el principio de abierto/cerrado
            // si se requiere un nuevo concursante, hay que adicionar
            // la condicion para ese nuevo concursante
            if(c.getNombre().equals("Jairo")){
                System.out.println("Tiempo Jairo: " + this.tiempoConcursante(c));
            }
            if(c.getNombre().equals("Braulio")){
                System.out.println("Tiempo braulio: " + this.tiempoConcursante(c));
            }
            if(c.getNombre().equals("Alvaro")){
                System.out.println("Tiempo Alvaro: " + this.tiempoConcursante(c));
            }
        }
    }
    
    @Override
    public void imprimirGanador(){
        double t1=0, t2=0, t3=0;
        String ganador;
        for(Ciclista c : concursantesDB){
            // viola el principio de abierto/cerrado
            // si se requiere un nuevo concursante, hay que adicionar
            // la condicion para ese nuevo concursante
            if(c.getNombre().equals("Jairo")){
                t1 = this.tiempoConcursante(c);
            }
            if(c.getNombre().equals("Braulio")){
                t2 = this.tiempoConcursante(c);
            }
            if(c.getNombre().equals("Alvaro")){
                t3 = this.tiempoConcursante(c);
            }
        }
        
        // viola el principio de abierto/cerrado
        // si se requiere un nuevo concursante, se debe modificar
        // la forma en que se calcula el ganador
        if(t1>t2){
            if(t2<t3) ganador = "Braulio";
            else ganador ="Alvaro";
        }
        else{ 
            if(t1<t3) ganador ="Jairo";            
            else ganador = "Alvaro";
        }
        System.out.println("Ganador " + ganador);
    }

    @Override
    public double tiempoConcursante(Ciclista c) {
        return (double)this.distancia/c.distanciaPorMinuto();
    }

    // viola el principio de segregacion de interfaces
    // metodo que se adquiere gracias a la interface ICompetencia,
    // pero en realidad la clase no lo requiere, por eso no lo implementa
    @Override
    public double distanciaPorMinuto() {
        return 0;
    }
}
