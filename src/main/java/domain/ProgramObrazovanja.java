package domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class ProgramObrazovanja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long programObrazovanjaID;

    @NotBlank
    private String naziv;

    @NotBlank
    private Integer csvet;

    public ProgramObrazovanja() {
    }

    public ProgramObrazovanja(Long programObrazovanjaID, String naziv, Integer csvet) {
        this.programObrazovanjaID = programObrazovanjaID;
        this.naziv = naziv;
        this.csvet = csvet;
    }

    public Long getProgramObrazovanjaID() {
        return programObrazovanjaID;
    }

    public void setProgramObrazovanjaID(Long programObrazovanjaID) {
        this.programObrazovanjaID = programObrazovanjaID;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Integer getCsvet() {
        return csvet;
    }

    public void setCsvet(Integer csvet) {
        this.csvet = csvet;
    }
}
