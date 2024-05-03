package one.tsv.task24.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CardDto {
    private Long id;
    private String code;
    private String cardNumber;
    private BankDto bank;
}
