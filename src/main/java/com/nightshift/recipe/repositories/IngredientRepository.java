package com.nightshift.recipe.repositories;

import com.nightshift.recipe.domain.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, Long> {
}
