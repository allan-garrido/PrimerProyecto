package org.umg.curso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by alumno on 26/06/2017.
 */
public class Banco {
    public static void main(String[] args) throws IOException {
        Cliente miCliente = new Cliente();

        miCliente.setNombre("ALLAN");
        miCliente.setEdad(30);
        miCliente.setSalario((float) 2893.20);

        System.out.println("Bienvenido al Banco UMG\\n\\n");
        System.out.println("Estimado Cliente: " + miCliente.getNombre());
        System.out.println("Su salario sera de: Q."+ miCliente.getSalario());

        BufferedReader lector = new BufferedReader( new InputStreamReader(System.in));

        System.out.println("Ingrese su nombre: ");
        miCliente.setNombre(lector.readLine());

        System.out.println("Ingrese su edad: ");
        miCliente.setEdad(Integer.parseInt(lector.readLine()));

        System.out.println("Ingrese su salario Q. ");
        miCliente.setSalario(Float.parseFloat(lector.readLine()));

        System.out.println("Bienvenido al Banco UMG\\n\\n");
        System.out.println("Estimado Cliente: " + miCliente.getNombre());
        System.out.println("Su salario sera de: Q."+ miCliente.getSalario());

    }
}
