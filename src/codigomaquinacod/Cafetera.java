/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigomaquinacod;

/**
 *
 * @author femio23
 */
public class Cafetera {
    private int cantazucar=5;
    /**
     * Método que permite sacar o vaso que conterá a bebida.
     */
    public void soltarvaso(){
        System.out.println("Plock, cae el vaso");
    }
    /**
     * Permite verter a bebida no vaso.
     * @param p Obxeto de tipo Producto co que se traballa.
     */
    public void elaborarbebida(Productos p){
        System.out.println("Bssss, sale "+p.getPelegido()+" con "+cantazucar+"/10 azucar.");
    }
    /**
     * Método que permite sacar el palo para remexer a bebida.
     */
    public void soltarpalo(){
        System.out.println("Click, cae el palo.");
    }
/**
 * Método que devolve a cantidade de azucar actual.
 * @return Devolve a cantidade de azucar actual.
 */
    public int getCantazucar() {
        return cantazucar;
    }
/**
 * Setter da variable cantidade de azucar.
 * @param cantazucar Cantidade a inserir na variable.
 */
    public void setCantazucar(int cantazucar) {
        this.cantazucar = cantazucar;
    }
    
}
