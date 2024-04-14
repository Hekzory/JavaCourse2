package one.tsv.task15.controllers;

import lombok.RequiredArgsConstructor;
import one.tsv.task15.models.Card;
import one.tsv.task15.services.CardService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping(value = "/cards")
public class CardController {
    private final CardService service;

    @GetMapping
    @ResponseBody
    public List<Card> getList() {
        return service.getAllCards();
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
