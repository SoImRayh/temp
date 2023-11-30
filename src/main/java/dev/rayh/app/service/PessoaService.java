package dev.rayh.app.service;

import dev.rayh.app.domain.Pessoa;
import dev.rayh.app.repository.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PessoaService {

    private final PessoaRepository repository;

    public Pessoa create(Pessoa pessoa){
        return repository.save(pessoa);
    }

    public Pessoa update(Pessoa pessoa){
        return repository.save(pessoa);
    }

    public void delete(Integer id){
        Optional<Pessoa> p = repository.findById(id);

        p.ifPresent(repository::delete);
    }

    public Pessoa getOne(Integer id){
        return repository.findById(id).orElseThrow(
                () -> new RuntimeException("user nao encontrado!")
        );
    }

    public List<Pessoa> getAll(){
        return repository.findAll();
    }

}
