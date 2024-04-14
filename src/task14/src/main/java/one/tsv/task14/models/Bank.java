package one.tsv.task14.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Bank {
    private String name;
    private String address;

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
