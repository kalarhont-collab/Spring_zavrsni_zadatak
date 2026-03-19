package controller;

import domain.ProgramObrazovanja;
import dto.ProgramObrazovanjaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.ProgramService;

import java.util.List;

@RestController
@RequestMapping("/programi")
public class ProgramObrazovanjaController {

    @Autowired
    private ProgramService service;

    @GetMapping
    public List<ProgramObrazovanjaDTO> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ProgramObrazovanjaDTO getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public ProgramObrazovanja create(@RequestBody ProgramObrazovanjaDTO dto) {
        return service.save(dto);
    }
}