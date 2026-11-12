package edu.ec.uce.grupo;

import edu.ec.uce.grupo.extension.DescuentoExtension;
import edu.ec.uce.grupo.extension.NotificacionExtension;
import edu.ec.uce.grupo.interceptor.MedirTiempo;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@ApplicationScoped
@Named("gestion") 
public class GestionService {


    @MedirTiempo 
    public void pedido(Cliente cliente, NotificacionExtension notificacionExtension){

        System.out.println("INICIO_EVALUACION");
        System.out.printf("PEDIDO: " + cliente.getPedido() + "|" + " TOTAL: " + cliente.getPrecio());
        System.out.println("\nNOTIFICACION: " + cliente.getPedido());
    }
}
