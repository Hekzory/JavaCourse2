package one.tsv.task20.repositories;

import one.tsv.task20.models.Card;

import java.util.List;

public interface CustomCardRepository {
    List<Card> getCardsByCriteria(String code, String cardNumber);
}
