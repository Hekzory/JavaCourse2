package one.tsv.task23.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import one.tsv.task23.models.Card;
import one.tsv.task23.repositories.CardRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class CardService {
    private final CardRepository repository;

    @Transactional
    public List<Card> getAllCards() {
        return repository.getAllBy().orElseThrow();
    }

    @Transactional
    public void addCard(Card card) {
        repository.save(card);
    }

    @Transactional
    public Integer deleteCardById(Long id) {
        return repository.deleteCardById(id).orElseThrow();
    }
}
