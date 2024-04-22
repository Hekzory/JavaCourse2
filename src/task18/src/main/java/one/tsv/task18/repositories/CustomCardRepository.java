package one.tsv.task18.repositories;

import one.tsv.task18.models.Card;

import java.util.List;

public interface CustomCardRepository {
    List<Card> getCardsByCriteria(String code, String cardNumber);
}
