/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author USER
 */
public class Personas {
    //atributos
    private String nombres;
    private String apellidos;
    private String direccion;
    private String fechanacimiento;
    public Personas(){
        
    }
    //constructor por parametros
    public Personas(String nombres,String apellidos, String direccion, String fechanacimiento ){
        this.nombres=nombres;
        this.apellidos=apellidos;
        this.direccion=direccion;
        this.fechanacimiento=fechanacimiento;
    }
//cosntructor por parametros
//metodo sett
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }
    //metodo get
    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDireccion() {
        return direccion;
    }
    public String getFechanacimiento(){
        return fechanacimiento;
    }

}
