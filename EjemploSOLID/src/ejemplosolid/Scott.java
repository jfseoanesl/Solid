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
public class Scott extends Bicicleta {

    public Scott() {
       
    }
    
    // viola el principio de sustitucion de liskov
    // La clase hereda se la superclase Bicicleta, pero esta redefiniendo
    // el comportamiento heredado
    @Override
    public double retornarDesarrollo(){
        return 600;
    }
}
