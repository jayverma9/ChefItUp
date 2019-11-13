package purple.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import purple.POJOS.Class;
import purple.Repositories.ClassRepository;

import java.util.ArrayList;
import java.util.List;

//This class will be responsible for the controller for all the student operations from front end
@RestController
@RequestMapping("/rest/Class")
public class ClassController {

    private ClassRepository classRepository;

    public ClassController(ClassRepository classRepository) {
        this.classRepository = classRepository;
    }

    @CrossOrigin
    @RequestMapping(value = "getClasses", method = RequestMethod.GET)
    public ResponseEntity<List<Class>> loginAttempt(@RequestParam(name = "classList") List<Class> classes) {
        List<Class> all_classes = classRepository.findAll();
        List<Class> classe = new ArrayList<>();
        for (Class cls : all_classes) {
            if(classes.contains(cls)) {
                classe.add(cls);
            }
        }
        return new ResponseEntity<List<Class>>(classe, HttpStatus.OK);
    }
}
