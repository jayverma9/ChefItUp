package purple.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import purple.POJOS.Student;
import purple.DatabaseService.StudentService;

import java.util.List;

//This class will be responsible for the controller for all the student operations from front end

public class StudentController {

    @RestController
    @RequestMapping("/rest/Student")
    public class UsersResource {

        private StudentService studentRepository;

        public void StudentResource(StudentService studentRepository) {
            this.studentRepository = studentRepository;
        }

        @GetMapping("/all")
        public List<Student> getAll() {
            return studentRepository.findAll();
        }
    }

}
