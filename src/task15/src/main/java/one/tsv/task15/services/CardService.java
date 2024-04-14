package one.tsv.task15.services;

import lombok.RequiredArgsConstructor;
import one.tsv.task15.models.Card;
import one.tsv.task15.repositories.CardRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CardService {
    private final CardRepository repository;

    public List<Card> getAllCards() {
        return repository.getAllBy().orElseThrow();
    }

    public void addCard(Card card) {
        repository.save(card);
    }

    public Integer deleteCardById(Long id) {
        return repository.deleteCardById(id).orElseThrow();
    }
}
