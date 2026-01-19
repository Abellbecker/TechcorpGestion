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
public abstract class Empleado {
    
    protected String nombre;
    protected String idEmpleado;
    protected double salario;
    protected String cargo;
    private static int totalEmpleado = 0; 
    // Constructor
    
    public Empleado (){
        this.nombre = "";
        this.idEmpleado = "";
        this.salario = 0.0;
        this.cargo = "";
        this.totalEmpleado ++;
    }
    
    public Empleado(String nombre, String idEmpleado, double salario, String cargo) {
        this.nombre = nombre;
        this.idEmpleado = idEmpleado;
        this.salario = salario;
        this.cargo =cargo;
        this.totalEmpleado ++;
    }
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getIdEmpleado() {
        return idEmpleado;
    }
    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
        public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo= cargo;
    }
    
    public double calcularBono (double porcentaje){
        double bono =0.0;
        bono = salario*porcentaje/100;
        return bono;
    }
    public static int getTotalEmpleado(){ //get devuelve el total de los empleados, llama al metodo y devuelve
        return  totalEmpleado;
    }
    
    
    // Método abstracto (polimorfismo)
    public abstract void trabajar();
    public abstract String obtenerDetallesRol();
    // Método común
    public void mostrarInformacion() {
        System.out.println("ID: " + idEmpleado + " | Nombre: " + nombre + " | Salario: $" + salario+" | Cargo: "+cargo);
    }
    
    public void aumentarSalario(double porcentaje) {
        if (porcentaje >0){
            salario += salario * porcentaje /100;
            System.out.println("Salario aumento. Nuevo salario: $" + salario);
        }else{
            System.out.println("Porcentaje inválido.");
        }
    }
}

