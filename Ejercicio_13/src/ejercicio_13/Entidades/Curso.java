/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_13.Entidades;

import java.util.Scanner;

/**
 *
 * @author droa
 */
public class Curso {
    
    // Atributos
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String nombreCUrso;
    private int cantidadHOrasPorDia;
    private int cantidadDiasPorSemana;
    private boolean turno;
    private float precioPorHora;
    private String[] alumnos;
    
    // Contructor

    public Curso() {
    }

    public Curso(String nombreCUrso, int cantidadHOrasPorDia, int cantidadDiasPorSemana, boolean turno, float precioPorHora, String[] alumnos) {
        this.nombreCUrso = nombreCUrso;
        this.cantidadHOrasPorDia = cantidadHOrasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnos = alumnos;
    }
    
    // Métodos

    public String getNombreCUrso() {
        return nombreCUrso;
    }

    public void setNombreCUrso(String nombreCUrso) {
        this.nombreCUrso = nombreCUrso;
    }

    public int getCantidadHOrasPorDia() {
        return cantidadHOrasPorDia;
    }

    public void setCantidadHOrasPorDia(int cantidadHOrasPorDia) {
        this.cantidadHOrasPorDia = cantidadHOrasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public boolean isTurno() {
        return turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }

    public float getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(float precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
    
    
    
}
