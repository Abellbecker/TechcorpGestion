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
public class Disenador extends Empleado {
    private String herramientaFavorita;

    public Disenador(String nombre, String idEmpleado, double salario, String herramientaFavorita, String cargo) {
        super(nombre, idEmpleado, salario,cargo);
        this.herramientaFavorita = herramientaFavorita;
    }

    public String getHerramientaFavorita() {
        return herramientaFavorita;
    }

    public void setHerramientaFavorita(String herramientaFavorita) {
        this.herramientaFavorita = herramientaFavorita;
    }

    @Override
    public void trabajar() {
        System.out.println("Diseñador " + nombre + " está trabajando en " + herramientaFavorita + ".");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("  Rol: Diseñador | Herramienta: " + herramientaFavorita);
    }
    @Override
     public String obtenerDetallesRol(){
         return "crea interfaz usando: "+ herramientaFavorita;
     }
}
