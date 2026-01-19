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


public class Desarrollador extends Empleado {
    private String lenguajePrincipal;
    
    public Desarrollador(){
    super();
    this.lenguajePrincipal = "";
}

    public Desarrollador(String nombre, String idEmpleado, double salario, String lenguajePrincipal,String cargo) {
        super(nombre, idEmpleado, salario,cargo);
        this.lenguajePrincipal = lenguajePrincipal;
    }
    public String getLenguajePrincipal() {
        return lenguajePrincipal;
    }
    public void setLenguajePrincipal(String lenguajePrincipal) {
        this.lenguajePrincipal = lenguajePrincipal;
    }
    //@Override
    public void trabajar() {
        System.out.println("Desarrollador " + nombre + " está programando en " + lenguajePrincipal + ".");
    }
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("  Rol: Desarrollador | Lenguaje: " + lenguajePrincipal);
    }
    @Override
     public  String obtenerDetallesRol(){
         return "Desarrolla software en : "+ lenguajePrincipal;
     }
}
