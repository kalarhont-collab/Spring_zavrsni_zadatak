package service;

import domain.Upis;
import dto.UpisDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.PolaznikRepository;
import repository.ProgramObrazovanjaRepository;
import repository.UpisRepository;

import java.util.List;

@Service
public class UpisService {

    @Autowired
    private UpisRepository repository;

    @Autowired
    private PolaznikRepository polaznikRepository;

    @Autowired
    private ProgramObrazovanjaRepository programRepo;


    public List<UpisDTO> getAll() {
        return repository.findAll().stream().map(this::toDTO).toList();
    }


    public UpisDTO getById(Long id) {
        Upis u = repository.findById(id).orElseThrow(() -> new RuntimeException("Upis not found"));
        return toDTO(u);
    }


    public Upis save(Long polaznikId, Long programId) {
        Upis u = new Upis();
        u.setPolaznik(polaznikRepository.findById(polaznikId).orElseThrow(() -> new RuntimeException("Polaznik not found")));
        u.setProgramObrazovanja(programRepo.findById(programId).orElseThrow(() -> new RuntimeException("Program not found")));
        return repository.save(u);
    }


    private UpisDTO toDTO(Upis u) {
        return new UpisDTO(
                u.getUpisID(),
                u.getPolaznik().getPolaznikID(),
                u.getProgramObrazovanja().getProgramObrazovanjaID(),
                u.getPolaznik().getIme(),
                u.getProgramObrazovanja().getNaziv()
        );
    }
}