package one.tsv.task24.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import one.tsv.task24.models.Card;
import one.tsv.task24.repositories.CardRepository;
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
        return repository.findAll();
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
