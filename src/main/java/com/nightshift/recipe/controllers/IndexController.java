package com.nightshift.recipe.controllers;

import com.nightshift.recipe.domain.Category;
import com.nightshift.recipe.domain.UnitOfMeasure;
import com.nightshift.recipe.repositories.CategoryRepository;
import com.nightshift.recipe.repositories.UnitOfMeasureRepository;
import com.nightshift.recipe.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
