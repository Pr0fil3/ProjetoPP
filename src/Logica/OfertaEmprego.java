package Logica;

import java.io.Serializable;

/**
 * Created by Leandro on 11/04/2014.
 */
public class OfertaEmprego extends Oferta implements Serializable {

    private int id;
    private String titulo;
    private String detalhesOferta;
    private String perfilCandidato;
    private int nrCandidatosNecessarios;

    // ANEXOS - TEMOS DE RESOLVER ISTO

    public OfertaEmprego(int id, String titulo, String detalhesOferta, String perfilCandidato, int nrCandidatosNecessarios) {
        this.id = id;
        this.titulo = titulo;
        this.detalhesOferta = detalhesOferta;
        this.perfilCandidato = perfilCandidato;
        this.nrCandidatosNecessarios = nrCandidatosNecessarios;
    }

    public OfertaEmprego(String titulo, String detalhesOferta, String perfilCandidato, int nrCandidatosNecessarios) {
        this.titulo = titulo;
        this.detalhesOferta = detalhesOferta;
        this.perfilCandidato = perfilCandidato;
        this.nrCandidatosNecessarios = nrCandidatosNecessarios;
    }

    public int getId() {
        return id;
    }

    public String getDetalhesOferta() {
        return detalhesOferta;
    }

    public String getPerfilCandidato() {
        return perfilCandidato;
    }

    public int getNrCandidatosNecessarios() {
        return nrCandidatosNecessarios;
    }
}
