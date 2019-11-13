package purple.Configuration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import purple.POJOS.Class;
import purple.POJOS.Recipe;
import purple.POJOS.Student;
import purple.Repositories.ClassRepository;

import java.util.ArrayList;

//This class handles mongo configurations
@Configuration
@EnableMongoRepositories(basePackageClasses = ClassRepository.class)
public class ClassMongoDBConfig {

    @Bean
    CommandLineRunner commandLineRunner(ClassRepository classRepository) {
        return strings -> {
            classRepository.save(new Class("Greek Food", "blah blah chutiya"));
        };
    }
}

