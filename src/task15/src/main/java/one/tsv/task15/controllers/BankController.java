package one.tsv.task15.controllers;

import lombok.RequiredArgsConstructor;
import one.tsv.task15.models.Bank;
import one.tsv.task15.services.BankService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping(value = "/banks")
public class BankController {
    private final BankService service;

    @GetMapping
    @ResponseBody
    public List<Bank> getList() {
        return service.getAllBanks();
    }

    @PostMapping(consumes="application/json")
    @ResponseBody
    public Bank add(@RequestBody Bank bank) {
        service.addBank(bank);
        return bank;
    }

    @DeleteMapping(path="/{id}")
    @ResponseBody
    public String delete(@PathVariable Long id) {
        return "Count: " + service.deleteBankById(id);
    }
}
