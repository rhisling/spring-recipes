package me.aravindh.recipe.domain;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class CategoryTest {
    Category category;

    @Before
    public void setUp() {
        category = new Category();
    }

    @Test
    public void getId() {
        Long idValue = 4l;
        category.setId(4l);
        assertEquals(idValue, category.getId());
    }

    @Test
    public void getDescription() {
    }

    @Test
    public void getRecipes() {
    }
}