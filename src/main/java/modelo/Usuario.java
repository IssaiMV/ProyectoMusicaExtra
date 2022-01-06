/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;
import java.util.Stack;

/**
 *
 * @author issai
 */
public class Usuario {

    private String Nombre;
    private Stack<Genero> Generos;
    private Date fecha;

    public Usuario(String Nombre, Stack<Genero> Generos, Date fecha) {
        this.Nombre = Nombre;
        this.Generos = Generos;
        this.fecha = fecha;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Stack<Genero> getGeneros() {
        return Generos;
    }

    public void setGeneros(Stack<Genero> Generos) {
        this.Generos = Generos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

   

}
