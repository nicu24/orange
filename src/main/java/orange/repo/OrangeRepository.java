package orange.repo;

import orange.domain.Orange;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrangeRepository  extends ReactiveCrudRepository<Orange, Long> {
}
