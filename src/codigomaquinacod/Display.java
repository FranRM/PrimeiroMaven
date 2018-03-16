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
public class Display {
    /**
     * Método que mostra o credito actual que se posue.
     * @param d É obxeto de tipo diñeiro co que se opera.
     */
    public void mostrarcredito(Dinero d){
        System.out.println("Actualmente tiene un crédito de "+d.getCrédito()+" €.");
    }
    /**
     * Método que mostra a cantidade de azucar actual.
     * @param c É o obxeto de clase Cafetera co que se traballa.
     */
    public void mostraraz(Cafetera c){
        System.out.println("Cantidad seleccionada de azucar: "+c.getCantazucar());
    }
/**
 * Método que permite consultar o prezo dun producto.
 * @param prod Lista de productos na que consultar.
 * @param e Cadea de caracteres coa que consultar.
 * @return Devolvese o prezo.
 */
    public float mostrarprecio(Productos[] prod,String e){
        float aux=0;
        for(Productos p1:prod){
            if(p1.getProducto().equalsIgnoreCase(e)){
                System.out.println("Precio: "+p1.getPrecio()+" €");
                aux= p1.getPrecio();
            }
        }
        return aux;
        }
    /**
     * Método que devolve o cambio actual.
     * @param c Obxeto de clase Dinero co que se traballa.
     */
    public void mostrarcambio(Dinero c){
        System.out.println("El cambio a devolver es de "+c.getCambio()+" €.");
    }
}
