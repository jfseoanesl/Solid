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
public class BDArrays implements IDb {
    private ArrayList<Ciclista> bd = new ArrayList();
    
    public BDArrays(){
    }
    
    public ArrayList<Ciclista> getDB(){return this.bd;}
    public void setDB(ArrayList<Ciclista> db){this.bd=db;}
    
    
    @Override
    public void adicionar(Ciclista c) {
        this.bd.add(c);
    }

    @Override
    public ArrayList<Ciclista> consultarBD() {
        return this.bd;
    }
    
}
