package purple.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import purple.Repositories.IngredientRepository;

//This class will be responsible for the controller for all the student operations from front end
@RestController
@RequestMapping("/rest/Ingredient")
public class IngredientController {

    private IngredientRepository ingredientRepository;

    public IngredientController(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

}
