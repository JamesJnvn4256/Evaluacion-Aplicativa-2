package com.example.EA2_Velezmoro_Navarro_James.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombreCliente;
    private String dni;
    private LocalDate fechaReserva;
    private int nroPersonas;
    private String sede;

    public Reserva() {
    }

    public Reserva(Long id, String nombreCliente, String dni, LocalDate fechaReserva, int nroPersonas, String sede) {
        this.id = id;
        this.nombreCliente = nombreCliente;
        this.dni = dni;
        this.fechaReserva = fechaReserva;
        this.nroPersonas = nroPersonas;
        this.sede = sede;
    }
    
    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDate fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public int getNroPersonas() {
        return nroPersonas;
    }

    public void setNroPersonas(int nroPersonas) {
        this.nroPersonas = nroPersonas;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }
}
