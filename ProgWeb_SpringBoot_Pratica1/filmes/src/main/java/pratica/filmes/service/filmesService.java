package pratica.filmes.service;

import org.springframework.stereotype.Service;

import java.util.List;
import pratica.filmes.domain.Filmes;
import pratica.filmes.repository.filmesRepository;

@Service
public class filmesService {
    
    private filmesRepository repository; 

    public filmesService(filmesRepository repository) {
        this.repository = repository;
    }

    public Filmes insert(Filmes a){
        return repository.save(a);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

    public Filmes update (Filmes a){
        return repository.saveAndFlush(a);
    }

    public List<Filmes> listAll(){
        return repository.findAll();
    }
}
