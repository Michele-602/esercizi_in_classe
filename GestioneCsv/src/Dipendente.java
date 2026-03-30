/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nardom
 */
public abstract class Dipendente {
    protected int id;
    protected String nome,cognome,ruolo,specializzazione,assunzione;
    protected Double stipendio;

    public Dipendente(int id, String nome, String cognome, String ruolo, String specializzazione, String assunzione, Double stipendio) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.ruolo = ruolo;
        this.specializzazione = specializzazione;
        this.assunzione = assunzione;
        this.stipendio = stipendio;
    }

    public abstract Double getStipendio();
    
    @Override
    public String toString() {
        return "Dipendente{" + "id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", ruolo=" + ruolo + ", specializzazione=" + specializzazione + ", assunzione=" + assunzione + ", stipendio=" + stipendio + '}';
    }
    
    
}
