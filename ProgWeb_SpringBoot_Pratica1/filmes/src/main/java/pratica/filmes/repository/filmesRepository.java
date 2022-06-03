package pratica.filmes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pratica.filmes.domain.Filmes;

public interface filmesRepository extends JpaRepository<Filmes, Long>{
    
}
