package edu.ec.uce.grupo.extension;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@ApplicationScoped 
@Named("vip")
public class DescuentoVIP implements DescuentoExtension{



    @Override
    public void calcular(double precio) {
       System.out.println("TOTAL: " + precio*0.10);
    }

}
