package purple.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import purple.Repositories.RecipeRepository;
import purple.Repositories.UtensilRepository;

//This class will be responsible for the controller for all the student operations from front end
@RestController
@RequestMapping("/rest/Utensil")
public class UtensilController {

    private UtensilRepository utensilRepository;

    public UtensilController(UtensilRepository utensilRepository) {
        this.utensilRepository = utensilRepository;
    }

}
