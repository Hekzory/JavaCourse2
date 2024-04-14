package one.tsv.task16.controllers;

import lombok.RequiredArgsConstructor;
import one.tsv.task16.dto.CardDto;
import one.tsv.task16.models.Bank;
import one.tsv.task16.models.Card;
import one.tsv.task16.services.CardService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping(value = "/cards")
public class CardController {
    private final CardService service;

    @GetMapping
    @ResponseBody
    public List<CardDto> getList() {
        return service.getAllCards().stream().map(Card::toDto).toList();
    }

    @PostMapping(consumes="application/json")
    @ResponseBody
    public Card add(@RequestBody Card card) {
        service.addCard(card);
        return card;
    }

    @DeleteMapping(path="/{id}")
    @ResponseBody
    public String delete(@PathVariable Long id) {
        return "Count: " + service.deleteCardById(id);
    }
}