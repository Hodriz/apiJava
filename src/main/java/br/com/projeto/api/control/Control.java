package br.com.projeto.api.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.api.model.Cliente;
import br.com.projeto.api.repository.Repository;

@RestController
@CrossOrigin(origins = "*")
public class Control {

    @Autowired
    private Repository repo;

    @PostMapping("/")
    public Cliente cadastrar(@RequestBody Cliente cl) {

        return repo.save(cl);
    }

    @GetMapping("/")
    public Iterable<Cliente> listar() {
        return repo.findAll();
    }

    @PutMapping("/")
    public Cliente update(@RequestBody Cliente cl) {
        return repo.save(cl);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        repo.deleteById(id);
    }

}
