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
public interface IDb {
    
    public void adicionar(Ciclista c);
    public ArrayList<Ciclista> consultarBD();
    
}
