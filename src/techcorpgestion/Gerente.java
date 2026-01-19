/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package techcorpgestion;

/**
 *
 * @author Informatica
 */
public class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, String idEmpleado, double salario, String departamento, String cargo) {
        super(nombre, idEmpleado, salario,cargo);
        this.departamento = departamento;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    @Override
    public void trabajar() {
        System.out.println("Gerente " + nombre + " está supervisando el departamento de " + departamento + ".");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("  Rol: Gerente | Depto: " + departamento);
    }
    @Override
     public  String obtenerDetallesRol(){
         return "Lidera el equipo de: " + departamento;
     }
}
