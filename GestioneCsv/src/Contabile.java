/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nardom
 */
public class Contabile extends Dipendente{
    
    public Contabile(int id, String nome, String cognome, String ruolo, String specializzazione, double stipendio, String assunzione) {
        super(id, nome, cognome, ruolo, specializzazione, assunzione, stipendio);
    }

    @Override
    public Double getStipendio() {
        return this.stipendio;
    }
    
}
