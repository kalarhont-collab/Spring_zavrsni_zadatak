package service;

import domain.Polaznik;
import dto.PolaznikDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.PolaznikRepository;

import java.util.List;

@Service
public class PolaznikService {

    @Autowired
    private PolaznikRepository repository;

    public List<PolaznikDTO> getAll() {
        return repository.findAll().stream().map(this::toDTO).toList();
    }

    public PolaznikDTO getById(Long id) {
        Polaznik p = repository.findById(id).orElseThrow();
        return toDTO(p);
    }

    public Polaznik save(PolaznikDTO dto) {
        Polaznik p = new Polaznik();
        p.setIme(dto.getIme());
        p.setPrezime(dto.getPrezime());
        return repository.save(p);
    }

    private PolaznikDTO toDTO(Polaznik p) {
        return new PolaznikDTO(
                p.getPolaznikID(),
                p.getIme(),
                p.getPrezime()
        );
    }
}