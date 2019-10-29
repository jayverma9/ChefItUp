package purple.Controllers.config;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import purple.Controllers.document.Student;
import purple.Controllers.repository.StudentRepository;

@Configuration
@EnableMongoRepositories(basePackageClasses = StudentRepository.class)
public class MongoDBConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return strings -> {
            studentRepository.save(new Student("kishore", "papa", "kika"));
        };
    }
}
