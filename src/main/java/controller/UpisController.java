package controller;

import domain.Upis;
import dto.UpisDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.UpisService;

import java.util.List;

@RestController
@RequestMapping("/upisi")
public class UpisController {

    @Autowired
    private UpisService service;


    @GetMapping
    public List<UpisDTO> getAll() {
        return service.getAll();
    }


    @GetMapping("/{id}")
    public UpisDTO getById(@PathVariable Long id) {
        return service.getById(id);
    }


    @PostMapping
    public Upis create(@RequestParam Long polaznikId,
                       @RequestParam Long programObrazovanjaId) {
        return service.save(polaznikId, programObrazovanjaId);
    }
}