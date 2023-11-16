package Dtos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Acceso {
    @JsonProperty("idAcceso")
    private long idAccesoDto;
    @JsonProperty("codigoAcceso")
    private String codigoAccesoDto;
    @JsonProperty("descripcionAcceso")
    private String descripcionAccesoDto;
    @JsonProperty("listaUsuariosConAccesoo")
    private List<Usuario> listaUsuariosConAccesoDto;

    public Acceso() {
        super();
    }

    public Acceso(String codigoAcceso, String descripcionAcceso) {
        super();
        this.codigoAccesoDto = codigoAcceso;
        this.descripcionAccesoDto = descripcionAcceso;
    }

    public long getIdAcceso() {
        return idAccesoDto;
    }

    public void setIdAcceso(long idAcceso) {
        this.idAccesoDto = idAcceso;
    }

    public String getCodigoAcceso() {
        return codigoAccesoDto;
    }

    public void setCodigoAcceso(String codigoAcceso) {
        this.codigoAccesoDto = codigoAcceso;
    }

    public String getDescripcionAcceso() {
        return descripcionAccesoDto;
    }

    public void setDescripcionAcceso(String descripcionAcceso) {
        this.descripcionAccesoDto = descripcionAcceso;
    }

    public List<Usuario> getListaUsuariosConAccesoo() {
        return listaUsuariosConAccesoDto;
    }

    public void setListaUsuariosConAccesoo(List<Usuario> listaUsuariosConAccesoo) {
        this.listaUsuariosConAccesoDto = listaUsuariosConAccesoo;
    }

    @Override
    public String toString() {
        return "--- Datos Acceso ---\nidAcceso: " + idAccesoDto + "\nCodigoAcceso: " + codigoAccesoDto + "\nDescripcionAcceso: "
                + descripcionAccesoDto + "\nLista Usuarios con Acceso: " + listaUsuariosConAccesoDto.toString();
    }
}
