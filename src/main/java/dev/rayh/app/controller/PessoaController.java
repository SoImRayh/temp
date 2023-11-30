package dev.rayh.app.controller;


import dev.rayh.app.domain.Pessoa;
import dev.rayh.app.service.PessoaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/pessoa")
@RequiredArgsConstructor
public class PessoaController {

    private final PessoaService service;
    @GetMapping("all")
    public ResponseEntity<?> handleGetAllRecords(){
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> handleGetOneRecord(@PathVariable("id") Integer id){
        return ResponseEntity.ok(service.getOne(id));
    }

    @PostMapping("new")
    public ResponseEntity<?> handleCreateNewRecord(@RequestBody Pessoa pessoa){
        return ResponseEntity.ok(service.create(pessoa));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> handleUpdateRecord(
            @PathVariable("id") Integer id, @RequestBody Pessoa pessoa
    ){
        return ResponseEntity.ok(service.update(pessoa));
    }
    @DeleteMapping("{id}")
    public ResponseEntity<?> handleDeleteRecord( @PathVariable("id") Integer id){
        service.delete(id);
        return ResponseEntity.ok("ok");
    }
}
