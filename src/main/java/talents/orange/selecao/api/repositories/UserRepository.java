package talents.orange.selecao.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import talents.orange.selecao.api.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
