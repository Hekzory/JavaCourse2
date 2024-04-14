package one.tsv.task14.controllers;

import one.tsv.task14.models.Bank;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/banks")
public class BankController {
    private ArrayList<Bank> banks = new ArrayList<>();

    @GetMapping
    @ResponseBody
    public List<Bank> getList() {
        return banks.stream().toList();
    }

    @PostMapping(consumes="application/json")
    @ResponseBody
    public Bank add(@RequestBody Bank card) {
        int lenBefore = banks.size();
        banks.add(card);
        if (banks.size() != lenBefore)
            return card;
        else
            return null;
    }

    @DeleteMapping(consumes="application/json")
    @ResponseBody
    public Bank delete(@RequestBody Bank bank) {
        int lenBefore = banks.size();
        banks = new ArrayList<>(
                banks.stream()
                        .filter((authorListItem -> !authorListItem.equals(bank)))
                        .toList()
        );
        if (banks.size() != lenBefore)
            return bank;
        else
            return null;
    }
}
