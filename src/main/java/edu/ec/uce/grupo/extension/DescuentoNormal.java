package edu.ec.uce.grupo.extension;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@ApplicationScoped 
@Named("normal")
public class DescuentoNormal implements DescuentoExtension {

    @Override
    public void calcular(double precio) {
      System.out.println("TOTAL: " + precio);
    }


}
