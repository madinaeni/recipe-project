package com.nightshift.recipe.services;

import com.nightshift.recipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
