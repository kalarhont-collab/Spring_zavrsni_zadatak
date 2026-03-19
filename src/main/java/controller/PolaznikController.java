package controller;

import domain.Polaznik;
import dto.PolaznikDTO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.PolaznikService;

import java.util.List;

@RestController
@RequestMapping("/polaznici")
public class PolaznikController {

    @Autowired
    private PolaznikService service;

    @GetMapping
    public List<PolaznikDTO> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public PolaznikDTO getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public Polaznik create(@RequestBody PolaznikDTO dto) {
        return service.save(dto);
    }
}