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
public class Dinero {
    private float crédito=0,cambio=0;
/**
 * Método que devolve o credito actual.
 * @return  Devolve o valor da variable.
 */
    public float getCrédito() {
        return crédito;
    }
/**
 * Metodo que permite editar o valor da variable credito.
 * @param crédito Valor a introducir na variable.
 */
    public void setCrédito(float crédito) {
        this.crédito = crédito;
    }
/**
 * Getter da variable cambio.
 * @return Devolve o valor da variable.
 */
    public float getCambio() {
        return cambio;
    }
/**
 * Setter da variable cambio.
 * @param cambio Valor a introducir na variable.
 */
    public void setCambio(float cambio) {
        this.cambio = cambio;
    }
    /**
     * Método que pide crédito.
     * @param p Cantidade a mostrar na mensaxe.
     * @return Devolve a cantidade introducida  no JOptionPane.
     */
    public float introducirmonedas(float p){
        float aux=0;
        aux=Float.parseFloat(JOptionPane.showInputDialog("Precio: "+p+"\nIntroduzca crédito:"));
        return aux;
    }
    /**
     * Método que permite calcular e mostrar o cambio.
     * @param p Obxeto de clase Producto co que se está a traballar.
     * @param d Obxeto de clase Dinero co que se está a traballar.
     * @return  Devlove o cambio calculado.
     */
    public float calcularcambio(Productos p, Dinero d){
        float aux=0;
        aux=d.getCrédito()-p.getPrelegido();
        d.setCambio(aux);
        return aux;
    }
    /**
     * Método que permite comprobar se o crédito posuido é suficiente.
     * @param d Obxeto de clase Dinero co que se está a traballar.
     * @param p Obxeto de clase Dinero co que se está a traballar.
     * @return Devolve true se o crédito é suficiente , e false se non o é.
     */
    public boolean comprobarcredito(Dinero d,Productos p){
        boolean aux=false;
        if(d.crédito>=p.getPrelegido()){
        aux=true;
        }
       return aux; 
    }
    /**
     * Método que calcula as moedas que a maquina debe soltar en función do cambio existente.
     * @param d Obxeto de clase Dinero co que se está a traballar.
     */
    public void devolvercambio(Dinero d){
        float aux=d.getCambio()+0.01f;
        int u=(int)aux/1;
        aux=aux%1;
        int c=(int)(aux/0.5f);
        aux=aux%0.5f;
        int v=(int)(aux/0.2f);
        aux=aux%0.2f;
        int di=(int)(aux/0.1f);
        System.out.println("Se devuelve:\n"+
                        u+" Monedas de 1€,\n"+
                        c+" Moneda de 0.5€,\n"+
                        v+" Monedas de 0.2€,\n"+
                        di+" Monedas de 0.1€.\n");
    }
}
