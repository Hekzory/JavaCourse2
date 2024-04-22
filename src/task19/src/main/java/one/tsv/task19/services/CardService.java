package one.tsv.task19.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import one.tsv.task19.models.Card;
import one.tsv.task19.repositories.CardRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
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