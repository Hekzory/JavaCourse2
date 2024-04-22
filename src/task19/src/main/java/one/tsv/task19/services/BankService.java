package one.tsv.task19.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import one.tsv.task19.models.Bank;
import one.tsv.task19.repositories.BankRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
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