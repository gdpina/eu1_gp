package edu.ec.uce.grupo.interceptor;

import edu.ec.uce.grupo.Cliente;
import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Interceptor 
@MedirTiempo 
@Priority(Interceptor.Priority.APPLICATION +10)
public class MedirTiempoInterceptor {

    @AroundInvoke 
    public Object Interceptor(InvocationContext context) throws Exception{

        Cliente cliente = (Cliente) context.getParameters()[0];

        long init = System.currentTimeMillis();
        Object resultado = context.proceed();
        long fin = System.currentTimeMillis();
        System.out.println("[DURACION]: " + cliente.getPedido() + "|" + "MS:" +(fin - init));
        return resultado;
    }

}
