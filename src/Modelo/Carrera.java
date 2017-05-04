package Modelo;

import java.sql.*;

public class Carrera {

    private int CodigoCarrera;
    private String Nombre;
    private String Localidad;
    private String Provincia;
    private Date Fecha;
    private Time Hora;

    public int getCodigoCarrera() {
        return CodigoCarrera;
    }

    public void setCodigoCarrera(int CodigoCarrera) {
        this.CodigoCarrera = CodigoCarrera;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getLocalidad() {
        return Localidad;
    }

    public void setLocalidad(String Localidad) {
        this.Localidad = Localidad;
    }

    public String getProvincia() {
        return Provincia;
    }

    public void setProvincia(String Provincia) {
        this.Provincia = Provincia;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public Time getHora() {
        return Hora;
    }

    public void setHora(Time Hora) {
        this.Hora = Hora;
    }

    public void mostrarInforCarrera() {
        // TODO - implement Carrera.mostrarInforCarrera
        throw new UnsupportedOperationException();
    }

    public void anyadirDatosCarrera() {
        // TODO - implement Carrera.anyadirDatosCarrera
        throw new UnsupportedOperationException();
    }

    public void eliminalDatosCarrera() {
        // TODO - implement Carrera.eliminalDatosCarrera
        throw new UnsupportedOperationException();
    }

}
