package talents.orange.selecao.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import talents.orange.selecao.api.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
