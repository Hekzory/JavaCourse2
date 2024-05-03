package one.tsv.task24.repositories;

import one.tsv.task24.models.Card;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CardRepository extends JpaRepository<Card, Long> {
    Optional<List<Card>> getAllBy();
    Optional<Integer> deleteCardById(Long id);
}
