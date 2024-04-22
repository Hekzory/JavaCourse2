package one.tsv.task19.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import lombok.AllArgsConstructor;
import one.tsv.task19.models.Card;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Repository
public class CustomCardRepositoryImpl implements CustomCardRepository {

    private EntityManager entityManager;

    @Override
    public List<Card> getCardsByCriteria(String code, String cardNumber) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Card> cq = cb.createQuery(Card.class);

        Root<Card> card = cq.from(Card.class);
        List<Predicate> predicates = new ArrayList<>();

        if (code != null) {
            predicates.add(cb.equal(card.get("code"), code));
        }
        if (cardNumber != null) {
            predicates.add(cb.equal(card.get("cardNumber"), cardNumber));
        }
        cq.where(predicates.toArray(new Predicate[0]));

        return entityManager.createQuery(cq).getResultList();
    }
}
