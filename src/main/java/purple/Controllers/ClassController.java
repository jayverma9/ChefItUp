package purple.Controllers;

import org.springframework.web.bind.annotation.*;
import purple.Repositories.ClassRepository;

//This class will be responsible for the controller for all the student operations from front end
@RestController
@RequestMapping("/rest/Class")
public class ClassController {

    private ClassRepository classRepository;

    public ClassController(ClassRepository classRepository) {
        this.classRepository = classRepository;
    }

}
