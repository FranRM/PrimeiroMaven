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
public class Productos {
    private String pelegido,producto;
    private float precio,prelegido;
/**
 * Constructor con parámetros da clase Productos.
 * @param producto introduce ol nome do producto.
 * @param precio introduce o precio deste producto.
 */
    public Productos(String producto, float precio) {
        this.producto = producto;
        this.precio = precio;
    }

    public Productos() {
    }
/**
 * Getter da variable producto elixido.
 * @return Devolve o valor da variable producto elixido.
 */
    public String getPelegido() {
        return pelegido;
    }
/**
 * Getter da variable producto elegido.
 * @return Devolve o valor da variable producto.
 */
    public String getProducto() {
        return producto;
    }
/**
 * Getter da variable precio.
 * @return Devolve o precio.
 */
    public float getPrecio() {
        return precio;
    }
/**
 * Setter da variable producto elixido.
 * @param pelegido Valor a introducir na variable.
 */
    public void setPelegido(String pelegido) {
        this.pelegido = pelegido;
    }
/**
 * Getter da variable precio elixido.
 * @return Devolve o valor da variable.
 */
    public float getPrelegido() {
        return prelegido;
    }
/**
 * Setter da variable precio elixido.
 * @param prelegido Valor a introducir na variable.
 */
    public void setPrelegido(float prelegido) {
        this.prelegido = prelegido;
    }
    
}
