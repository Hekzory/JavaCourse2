package one.tsv.task16.controllers;

import lombok.RequiredArgsConstructor;
import one.tsv.task16.dto.BankDto;
import one.tsv.task16.models.Bank;
import one.tsv.task16.services.BankService;
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
    public List<BankDto> getList() {
        return service.getAllBanks().stream().map(Bank::toDto).toList();
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