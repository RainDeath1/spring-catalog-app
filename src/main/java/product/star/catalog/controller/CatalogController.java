package product.star.catalog.controller;


import org.springframework.boot.Banner;
import product.star.catalog.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class CatalogController {

    @GetMapping("/")
    public String shoCatalog(Model model){

        List<Book> books = List.of(
                new Book(1L, "Java. Полное руководство", "Герберт Шилдт", 2021),
                new Book(2L, "Effective Java", "Joshua Bloch", 2018),
                new Book(3L, "Spring in Action", "Craig Walls", 2022)
        );

        model.addAttribute("books",books);

        return "catalog";
    }
}
