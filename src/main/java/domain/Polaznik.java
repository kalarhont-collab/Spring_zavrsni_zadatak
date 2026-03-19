package domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;


@Entity
public class Polaznik {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long polaznikID;

    @NotBlank
    private String ime;

    @NotBlank
    private String prezime;

    public Polaznik() {
    }

    public Polaznik(Long polaznikID, String ime, String prezime) {
        this.polaznikID = polaznikID;
        this.ime = ime;
        this.prezime = prezime;
    }

    public Long getPolaznikID() {
        return polaznikID;
    }

    public void setPolaznikID(Long polaznikID) {
        this.polaznikID = polaznikID;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
}