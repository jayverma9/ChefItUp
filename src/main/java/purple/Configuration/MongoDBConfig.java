package purple.Configuration;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import purple.POJOS.Student;
import purple.DatabaseService.StudentService;
//This class handles mongo configurations
@Configuration
@EnableMongoRepositories(basePackageClasses = StudentService.class)
public class MongoDBConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentService studentRepository) {
        return strings -> {
            studentRepository.save(new Student());
        };
    }
}
