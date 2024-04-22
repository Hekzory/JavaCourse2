package one.tsv.task17.repositories;

import one.tsv.task17.models.Card;

import java.util.List;

public interface CustomCardRepository {
    List<Card> getCardsByCriteria(String code, String cardNumber);
}
