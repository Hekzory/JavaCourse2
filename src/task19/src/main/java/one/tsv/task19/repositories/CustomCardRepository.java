package one.tsv.task19.repositories;

import one.tsv.task19.models.Card;

import java.util.List;

public interface CustomCardRepository {
    List<Card> getCardsByCriteria(String code, String cardNumber);
}
