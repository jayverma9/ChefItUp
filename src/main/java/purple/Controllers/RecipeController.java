package purple.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import purple.Repositories.RecipeRepository;

//This class will be responsible for the controller for all the student operations from front end
@RestController
@RequestMapping("/rest/Recipe")
public class RecipeController {

    private RecipeRepository recipeRepository;

    public RecipeController(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

}
