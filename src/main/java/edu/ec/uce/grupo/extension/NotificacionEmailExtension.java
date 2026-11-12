package edu.ec.uce.grupo.extension;

import edu.ec.uce.grupo.Cliente;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped 
public class NotificacionEmailExtension implements NotificacionExtension {

    @Inject 
    private Cliente cliente;

    @Override
    public void enviar(String pedido){
        System.out.println("NOTIFICACION: " + cliente.getPedido());
    }



}
