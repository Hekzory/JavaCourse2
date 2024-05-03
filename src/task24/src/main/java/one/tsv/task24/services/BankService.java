package one.tsv.task24.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import one.tsv.task24.models.Bank;
import one.tsv.task24.repositories.BankRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class BankService {
    private final BankRepository repository;

    @Transactional
    public List<Bank> getAllBanks() {
        return repository.findAll();
    }

    @Transactional
    public void addBank(Bank card) {
        repository.save(card);
    }

    @Transactional
    public Integer deleteBankById(Long id) {
        return repository.deleteBankById(id).orElseThrow();
    }
}
