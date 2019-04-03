package me.aravindh.recipe.services;

import lombok.extern.slf4j.Slf4j;
import me.aravindh.recipe.domain.Recipe;
import me.aravindh.recipe.repositories.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        log.debug("I'm in the service");
        Set<Recipe> recipeSet = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
        return recipeSet;
    }

    @Override
    public Recipe findById(Long l) {
        Optional<Recipe> recipeOpt = recipeRepository.findById(l);
        if (!recipeOpt.isPresent())
            throw new RuntimeException("Recipe not found");
        return recipeOpt.get();

    }
}
