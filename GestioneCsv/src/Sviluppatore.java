/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nardom
 */
public class Sviluppatore extends Dipendente{
    
    public Sviluppatore(int id, String nome, String cognome, String ruolo, String specializzazione, double stipendio, String assunzione) {
        super(id, nome, cognome, ruolo, specializzazione, assunzione, stipendio);
    }

    @Override
    public Double getStipendio() {
        return this.stipendio  + 5000;
    }

    @Override
    public String toString() {
        return this.id+","+this.nome+","+this.cognome+","+this.ruolo+","+this.specializzazione+","+this.stipendio+","+this.assunzione;
    }
    
}
