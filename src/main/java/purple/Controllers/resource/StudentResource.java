package purple.Controllers.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import purple.Controllers.document.Student;
import purple.Controllers.repository.StudentRepository;

import java.util.List;

public class StudentResource {

    @RestController
    @RequestMapping("/rest/student")
    public class UsersResource {

        private StudentRepository studentRepository;

        public void StudentResource(StudentRepository studentRepository) {
            this.studentRepository = studentRepository;
        }

        @GetMapping("/all")
        public List<Student> getAll() {
            return studentRepository.findAll();
        }
    }

}
