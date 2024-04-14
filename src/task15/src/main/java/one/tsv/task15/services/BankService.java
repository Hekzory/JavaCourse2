package one.tsv.task15.services;

import lombok.RequiredArgsConstructor;
import one.tsv.task15.models.Bank;
import one.tsv.task15.models.Card;
import one.tsv.task15.repositories.BankRepository;
import one.tsv.task15.repositories.CardRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BankService {
    private final BankRepository repository;

    public List<Bank> getAllBanks() {
        return repository.getAllBy().orElseThrow();
    }

    public void addBank(Bank card) {
        repository.save(card);
    }

    public Integer deleteBankById(Long id) {
        return repository.deleteBankById(id).orElseThrow();
    }
}
