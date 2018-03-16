/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigomaquinacod;

import javax.swing.JOptionPane;

/**
 *
 * @author femio23
 */
public class Botonera {
/**
 * Método que permite aumentar a cantidade de azucar actual.
 * @param c Obxeto de clase Cafetera que se esta a usar.
 */
    public void azplus(Cafetera c){
        c.setCantazucar(c.getCantazucar()+1);
    }
    /**
     * Método que permite reducir a cantidade de azucar actual.
     * @param c Obxeto de clase Cafetera que se esta a usar.
     */
    public void azless(Cafetera c){
        c.setCantazucar(c.getCantazucar()-1);
    }
    /**
     * Método que comproba se a cantidade de azucar actual é valida.
     * @param c Obxeto de clase Cafetera que se esta a usar.
     * @return Devolve true se a cantidade e valida, e false se non o é.
     */
    public boolean comprobar(Cafetera c){
        if(c.getCantazucar()>10||c.getCantazucar()<0){
            c.setCantazucar(5);
            return false;
        }
        return true;
    }
    /**
     * Método que permite elixir a bebida.
     * @param menu Obxeto de clase Producto coa que se está a traballar.
     * @return Devlove un string co nome do producto elixido.
     */
    public String elegirbebida(Productos[]menu){
        String elexido=JOptionPane.showInputDialog(null, "Opciones:"+"\n"+menu[0].getProducto()+
        "\n"+menu[1].getProducto()+"\n"+menu[2].getProducto()+"\nIntroduzca el nome de la bebida deseada.");
        return elexido;
    }
}
