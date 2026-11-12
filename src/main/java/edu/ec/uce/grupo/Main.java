package edu.ec.uce.grupo;

import edu.ec.uce.grupo.extension.NotificacionEmailExtension;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@QuarkusMain 
public class Main implements QuarkusApplication {

    @Inject 
    @Named("gestion")
    private GestionService gestionService;

    @Inject 
    private NotificacionEmailExtension notificacionEmailExtension;

    public static void main(String[] arg){
        Quarkus.run(Main.class,arg);
    }

    @Override
    public int run(String... args) throws Exception {
        Cliente cliente = new Cliente("P001", "Laptop", 1000.00, null);
        gestionService.pedido(cliente, notificacionEmailExtension);
        System.out.println("172219-gp");
        return 0;

        
    }

    

}
