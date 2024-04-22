package one.tsv.task20.controllers;

import lombok.RequiredArgsConstructor;
import one.tsv.task20.dto.BankDto;
import one.tsv.task20.models.Bank;
import one.tsv.task20.services.BankService;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
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

    @Transactional
    @DeleteMapping(path="/{id}")
    @ResponseBody
    public String delete(@PathVariable Long id) {
        return "Count: " + service.deleteBankById(id);
    }
}