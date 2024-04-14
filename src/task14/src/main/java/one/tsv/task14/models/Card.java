package one.tsv.task14.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter
public class Card {
    private String code;
    private String cardNumber;

    @Override
    public String toString() {
        return "Card{" +
                "code='" + code + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                '}';
    }
}
