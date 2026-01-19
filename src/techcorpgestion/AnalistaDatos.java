/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techcorpgestion;

/**
 *
 * @author Admin
 */
public class AnalistaDatos extends Empleado {
    private String herramientaAnalisis;

    public AnalistaDatos(String nombre, String idEmpleado, double salario, String herramientaAnalisis, String cargo) {
        super(nombre, idEmpleado, salario,cargo);
        this.herramientaAnalisis = herramientaAnalisis;
    }
    public String getHerramientaAnalisis() {
        return herramientaAnalisis;
    }
    public void setHerramientaAnalisis(String herramientaAnalisis) {
        this.herramientaAnalisis = herramientaAnalisis;
    }
    @Override
    public void trabajar() {
        System.out.println("Gerente " + nombre + " está supervisando el departamento de " + herramientaAnalisis + ".");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("  Rol: Gerente | Depto: " + herramientaAnalisis  );
    }
    @Override
     public  String obtenerDetallesRol(){
         return " Especializados en analisis con : "+ herramientaAnalisis;
     }
}