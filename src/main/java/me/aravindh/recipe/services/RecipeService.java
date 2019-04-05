package me.aravindh.recipe.services;

import me.aravindh.recipe.commands.RecipeCommand;
import me.aravindh.recipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
