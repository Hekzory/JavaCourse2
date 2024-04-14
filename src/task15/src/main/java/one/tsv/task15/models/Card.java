package one.tsv.task15.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cards")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name="code")
    private String code;
    @Column(name="cardNumber")
    private String cardNumber;

    @Override
    public String toString() {
        return "Card{" +
                "code='" + code + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                '}';
    }
}
