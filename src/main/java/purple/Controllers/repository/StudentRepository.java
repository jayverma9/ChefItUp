package purple.Controllers.repository;

import purple.Controllers.document.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, Integer> {

}
