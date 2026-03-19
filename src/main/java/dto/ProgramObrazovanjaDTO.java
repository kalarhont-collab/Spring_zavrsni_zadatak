package dto;

public class ProgramObrazovanjaDTO {

    private Long id;
    private String naziv;
    private Integer csvet;

    public ProgramObrazovanjaDTO() {}

    public ProgramObrazovanjaDTO(Long id, String naziv, Integer csvet) {
        this.id = id;
        this.naziv = naziv;
        this.csvet = csvet;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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