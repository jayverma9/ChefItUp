package purple.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import purple.Repositories.TeacherRepository;
import purple.POJOS.Teacher;

import java.util.List;

//This class will be responsible for the controller for all the student operations from front end

@RestController
@RequestMapping("/rest/Teacher")
public class TeacherController {

    private TeacherRepository teacherRepository;

    public TeacherController(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @CrossOrigin
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public ResponseEntity<String> loginAttempt(@RequestParam(name = "username") String username, @RequestParam(name = "password") String password) {
        List<Teacher> all_users = teacherRepository.findAll();
        String hi = "";
        for (Teacher teacher : all_users) {
            if (teacher.getPassword().equals(password) && teacher.getUsername().equals(username)) {
                hi = "true";
                return new ResponseEntity<String>(hi, HttpStatus.OK);
            } else {
                hi = "false";
            }
        }
        return new ResponseEntity<String>(hi, HttpStatus.OK);
    }

    @CrossOrigin
    @RequestMapping(value = "signUp", method = RequestMethod.POST)
    public ResponseEntity<String> signUpAttempt(@RequestParam(name = "fullname") String fullname, @RequestParam(name = "email") String email, @RequestParam(name = "password") String password) {
        System.out.println(fullname);
        System.out.println(email);
        System.out.println(password);
        System.out.println("SUCCESS");
        teacherRepository.save(new Teacher(email, fullname, password));
//        List<Users> all_users = usersRepository.findAll();
        String hi = "true";
//        for (Users user:all_users) {
//            if(user.getPassword().equals(password) && user.getEmail().equals(email)) {
//                hi = "true";
//            }
//            else {
//                hi = "false";
//            }
//        }
        return new ResponseEntity<String>(hi, HttpStatus.OK);
    }
}
