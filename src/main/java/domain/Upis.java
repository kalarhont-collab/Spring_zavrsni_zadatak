package domain;

import jakarta.persistence.*;

@Entity
public class Upis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long upisID;

    @ManyToOne
    @JoinColumn(name = "IDPolaznik")
    private Polaznik polaznik;

    @ManyToOne
    @JoinColumn(name = "ProgramObrazovanjaID")
    private ProgramObrazovanja programObrazovanja;

    public Upis() {
    }

    public Upis(Long upisID, Polaznik polaznik, ProgramObrazovanja programObrazovanja) {
        this.upisID = upisID;
        this.polaznik = polaznik;
        this.programObrazovanja = programObrazovanja;
    }

    public Long getUpisID() {
        return upisID;
    }

    public void setUpisID(Long upisID) {
        this.upisID = upisID;
    }

    public Polaznik getPolaznik() {
        return polaznik;
    }

    public void setPolaznik(Polaznik polaznik) {
        this.polaznik = polaznik;
    }

    public ProgramObrazovanja getProgramObrazovanja() {
        return programObrazovanja;
    }

    public void setProgramObrazovanja(ProgramObrazovanja programObrazovanja) {
        this.programObrazovanja = programObrazovanja;
    }
}
