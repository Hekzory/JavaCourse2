package one.tsv.task24.controllers;

import lombok.RequiredArgsConstructor;
import one.tsv.task24.dto.CardDto;
import one.tsv.task24.models.Card;
import one.tsv.task24.services.CardService;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
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

    @Transactional
    @DeleteMapping(path="/{id}")
    @ResponseBody
    public String delete(@PathVariable Long id) {
        return "Count: " + service.deleteCardById(id);
    }
}
