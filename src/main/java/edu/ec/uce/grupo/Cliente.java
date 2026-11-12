package edu.ec.uce.grupo;

import edu.ec.uce.grupo.extension.DescuentoExtension;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class Cliente {


    private String pedido;
    private String producto;
    private double precio;
    
    
    public Cliente() {
    }

    public Cliente(String pedido, String producto, double precio, DescuentoExtension descuentoExtension) {
        this.pedido = pedido;
        this.producto = producto;
        this.precio = precio;
        
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

  


    
}  
    