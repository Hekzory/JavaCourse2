package one.tsv.task16.repositories;

import one.tsv.task16.models.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BankRepository extends JpaRepository<Bank, Long> {
    Optional<List<Bank>> getAllBy();
    Optional<Integer> deleteBankById(Long id);
}