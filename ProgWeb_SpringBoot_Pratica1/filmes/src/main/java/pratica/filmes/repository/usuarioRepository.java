package pratica.filmes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pratica.filmes.domain.Usuario;

public interface usuarioRepository extends JpaRepository<Usuario, Long>{
    
}
