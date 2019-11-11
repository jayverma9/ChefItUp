package purple.Configuration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import purple.POJOS.Ingredient;
import purple.POJOS.Recipe;
import purple.POJOS.Student;
import purple.POJOS.Utensil;
import purple.Repositories.RecipeRepository;

import java.util.ArrayList;

//This class handles mongo configurations
@Configuration
@EnableMongoRepositories(basePackageClasses = RecipeRepository.class)
public class RecipeMongoDBConfig {

    @Bean
    CommandLineRunner commandLineRunner(RecipeRepository recipeRepository) {
        return strings -> {
            recipeRepository.save(new Recipe("Paneer Tadka", "abhi toh bola paneer tadka", new ArrayList<>(), new ArrayList<>(), new String[0], new ArrayList<>()));
        };
    }
}

