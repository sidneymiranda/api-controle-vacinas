package talents.orange.selecao.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import talents.orange.selecao.api.entities.VaccineRegistration;

public interface VaccineRepository extends JpaRepository<VaccineRegistration, Long> {
}
