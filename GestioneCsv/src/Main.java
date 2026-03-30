
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author nardom
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String ch = ",";
        String line;
        ArrayList<Dipendente> d = new ArrayList<>();
        try ( BufferedReader br = new BufferedReader(new FileReader("dipendenti.csv"))) {
            br.readLine(); // remove labels
            while ((line = br.readLine()) != null) {
                String[] data = line.split(ch);
                int id = Integer.parseInt(data[0]);
                String nome = data[1];
                String cognome = data[2];
                String ruolo = data[3];
                String specializzazione = data[4];
                double stipendio = Double.parseDouble(data[5]);
                String assunzione = data[6];

                if (ruolo.equals("Sviluppatore")) {
                    d.add(new Sviluppatore(id, nome, cognome, ruolo, specializzazione, stipendio, assunzione));
                    System.out.println("Stipendio " + stipendio);
                }
                if (ruolo.equals("Contabile")) {
                    d.add(new Contabile(id, nome, cognome, ruolo, specializzazione, stipendio, assunzione));
                    System.out.println("Stipendio " + stipendio);
                }
                if (ruolo.equals("Project Manager")) {
                    d.add(new ProjectManager(id, nome, cognome, ruolo, specializzazione, stipendio, assunzione));
                    System.out.println("Stipendio " + stipendio);
                }
            }

        } catch (IOException e) {
            System.out.println("errore nella letura");
        }

        Sviluppatore s1 = new Sviluppatore(4, "paolo", "ruffini", "sviluppatore", "IT", 67000.00, "2018-05-12");

        try ( BufferedWriter writer = new BufferedWriter(new FileWriter("dipendenti.csv",true))) {
            writer.write(s1.toString());

            writer.newLine();

        } catch (IOException e) {
            System.out.println("errore nella scrittura");
        }
    }

}
