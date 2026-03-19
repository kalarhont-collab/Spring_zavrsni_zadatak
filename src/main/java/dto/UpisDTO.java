package dto;

public class UpisDTO {

    private Long id;
    private Long polaznikId;
    private Long programId;

    private String polaznikIme;
    private String programNaziv;

    public UpisDTO() {}

    public UpisDTO(Long id, Long polaznikId, Long programId,
                   String polaznikIme, String programNaziv) {
        this.id = id;
        this.polaznikId = polaznikId;
        this.programId = programId;
        this.polaznikIme = polaznikIme;
        this.programNaziv = programNaziv;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPolaznikId() {
        return polaznikId;
    }

    public void setPolaznikId(Long polaznikId) {
        this.polaznikId = polaznikId;
    }

    public Long getProgramId() {
        return programId;
    }

    public void setProgramId(Long programId) {
        this.programId = programId;
    }

    public String getPolaznikIme() {
        return polaznikIme;
    }

    public void setPolaznikIme(String polaznikIme) {
        this.polaznikIme = polaznikIme;
    }

    public String getProgramNaziv() {
        return programNaziv;
    }

    public void setProgramNaziv(String programNaziv) {
        this.programNaziv = programNaziv;
    }
}