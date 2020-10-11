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
public class Ppal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IDb bd = new BDArrays();
        //IDb bd = new BDArchivo(); 
        bd.adicionar(new Ciclista("Jairo", 50, new Bmc()));
        bd.adicionar(new Ciclista("Braulio", 60, new Trek()));
        bd.adicionar(new Ciclista("Alvaro", 30, new Generica()));
        //jairo ->6,66
        //Braulio->16,66
        //Alvaro->66,66
        
        Competencia competencia = new Competencia(100000);
        competencia.setDB(bd);
        
        competencia.imprimirTiempos();
        competencia.imprimirGanador();
        
    }
    
}
