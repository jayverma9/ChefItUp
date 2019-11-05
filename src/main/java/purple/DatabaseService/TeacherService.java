package purple.DatabaseService;

import org.springframework.data.mongodb.repository.MongoRepository;
import purple.POJOS.Teacher;

//This class will be responsible for the database operations for the student
public interface TeacherService extends MongoRepository<Teacher, Integer> {

}
