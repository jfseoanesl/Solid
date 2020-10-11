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

// viola el principio de segregacion de interfaces
// la clase agrupa muchos metodos, al ser implementada por las clases 
// Competencia y Ciclista, éstas deben proporcionar implementacion a todos
// estos metodos aunque no los necesite todos, solo algunos.
public interface ICompetencia {
    public void imprimirTiempos();
    public void imprimirGanador();
    public double tiempoConcursante(Ciclista c);
    public double distanciaPorMinuto();
}
