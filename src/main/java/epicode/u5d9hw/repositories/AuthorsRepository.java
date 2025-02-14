package epicode.u5d9hw.repositories;

import epicode.u5d9hw.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthorsRepository extends JpaRepository<Author, Integer> {
	Optional<Author> findByEmail(String email);
}
