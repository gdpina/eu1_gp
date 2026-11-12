package edu.ec.uce.grupo.extension;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@ApplicationScoped 
@Named("mes")
public class DescuentoMes implements DescuentoExtension{

    @Override
    public void calcular(double precio) {
       System.out.println("TOTAL: " + precio*0.20);
    }
}
