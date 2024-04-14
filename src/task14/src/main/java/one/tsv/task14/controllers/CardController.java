package one.tsv.task14.controllers;

import one.tsv.task14.models.Card;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/cards")
public class CardController {
    private ArrayList<Card> cards = new ArrayList<>();

    @GetMapping
    @ResponseBody
    public List<Card> getList() {
        return cards.stream().toList();
    }

    @PostMapping(consumes="application/json")
    @ResponseBody
    public Card add(@RequestBody Card card) {
        int lenBefore = cards.size();
        cards.add(card);
        if (cards.size() != lenBefore)
            return card;
        else
            return null;
    }

    @DeleteMapping(consumes="application/json")
    @ResponseBody
    public Card delete(@RequestBody Card card) {
        int lenBefore = cards.size();
        cards = new ArrayList<>(
                cards.stream()
                        .filter((authorListItem -> !authorListItem.equals(card)))
                        .toList()
        );
        if (cards.size() != lenBefore)
            return card;
        else
            return null;
    }
}
