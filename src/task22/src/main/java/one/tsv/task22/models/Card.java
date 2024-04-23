package one.tsv.task22.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import one.tsv.task22.dto.CardDto;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cards")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="code")
    private String code;
    @Column(name="cardNumber")
    private String cardNumber;
    @ManyToOne
    @JoinColumn(name = "bank_id")
    private Bank bank;

    @Override
    public String toString() {
        return "Card{" +
                "code='" + code + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                '}';
    }

    public CardDto toDto() {
        if (bank == null) {
            return new CardDto(id, code, cardNumber, null);
        }
        return new CardDto(id, code, cardNumber, bank.toDto());
    }
}