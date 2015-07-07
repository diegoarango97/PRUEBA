/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadoble;

/**dsdsadsadadsadasdsadadasdasda
 *
 * @author ACER
 */
public class ListaDoble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         LDoble listaDoble = new LDoble();

        listaDoble.insertarAlFinal(5); 
        listaDoble.insertarAlFinal(10);
        listaDoble.insertarAlFinal(15);
        listaDoble.insertarAlFinal(20);
         listaDoble.insertarAlFinal(10);
        listaDoble.insertarAlFinal(15);
        listaDoble.insertarAlFinal(20);
        
      
       
        listaDoble.borrar();


        System.out.println("La lista sin posiciones pares es: ");
        listaDoble.imprimirDeIzqAder();
    }
    
}
