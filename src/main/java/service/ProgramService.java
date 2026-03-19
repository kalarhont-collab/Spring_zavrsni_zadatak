package service;

import domain.ProgramObrazovanja;
import dto.ProgramObrazovanjaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ProgramObrazovanjaRepository;

import java.util.List;

@Service
public class ProgramService {

    @Autowired
    private ProgramObrazovanjaRepository repository;

    public List<ProgramObrazovanjaDTO> getAll() {
        return repository.findAll().stream().map(this::toDTO).toList();
    }

    public ProgramObrazovanjaDTO getById(Long id) {
        ProgramObrazovanja p = repository.findById(id).orElseThrow();
        return toDTO(p);
    }

    public ProgramObrazovanja save(ProgramObrazovanjaDTO dto) {
        ProgramObrazovanja p = new ProgramObrazovanja();
        p.setNaziv(dto.getNaziv());
        p.setCsvet(dto.getCsvet());
        return repository.save(p);
    }

    private ProgramObrazovanjaDTO toDTO(ProgramObrazovanja p) {
        return new ProgramObrazovanjaDTO(
                p.getProgramObrazovanjaID(),
                p.getNaziv(),
                p.getCsvet()
        );
    }
}