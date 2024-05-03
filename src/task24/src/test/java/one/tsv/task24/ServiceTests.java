package one.tsv.task24;

import one.tsv.task24.models.Bank;
import one.tsv.task24.models.Card;
import one.tsv.task24.repositories.BankRepository;
import one.tsv.task24.repositories.CardRepository;
import one.tsv.task24.services.BankService;
import one.tsv.task24.services.CardService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;


@SpringBootTest
@ActiveProfiles("test")
public class ServiceTests {

    @Autowired
    CardRepository cardRepository;

    @Autowired
    BankRepository bankRepository;
    @Autowired
    CardService cardService;

    @Autowired
    BankService bankService;

    @Test
    void getCards() {
        Card card1 = new Card();
        card1.setCardNumber("123");
        Card card2 = new Card();
        card2.setCardNumber("321");

        cardRepository.save(card1);
        cardRepository.save(card2);

        List<Card> expected = cardService.getAllCards();

        Assertions.assertEquals(2, expected.size());
        Assertions.assertEquals(expected.getFirst().getCardNumber(), "123");
    }

    @Test
    void getBanks() {
        Bank bank = new Bank();
        bank.setAddress("check street");

        bankRepository.save(bank);

        List<Bank> expected = bankService.getAllBanks();

        Assertions.assertEquals(1, expected.size());
        Assertions.assertEquals(expected.getFirst().getAddress(), "check street");
    }

}
