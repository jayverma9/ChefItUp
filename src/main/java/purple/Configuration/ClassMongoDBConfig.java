package purple.Configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import purple.POJOS.Class;
import purple.POJOS.Recipe;
import purple.POJOS.Student;
import purple.Repositories.ClassRepository;

//This class handles mongo configurations
@Configuration
@EnableMongoRepositories(basePackageClasses = ClassRepository.class)
public class ClassMongoDBConfig {
    @Autowired
    @Bean
    CommandLineRunner commandLineRunner(ClassRepository classRepository) {
        return strings -> {
            classRepository.save(new Class("Greek Food", "blah blah chutiya",  new Recipe[0], new Student[0]));
        };
    }
}

