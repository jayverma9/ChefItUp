package purple.DatabaseService;

import purple.POJOS.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
//This class will be responsible for the database operations for the student
public interface StudentService extends MongoRepository<Student, Integer> {

}
