package purple.Configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import purple.POJOS.Ingredient;
import purple.Repositories.IngredientRepository;

//This class handles mongo configurations
@Configuration
@EnableMongoRepositories(basePackageClasses = IngredientRepository.class)
public class IngredientMongoDBConfig {
    @Autowired
    @Bean
    CommandLineRunner commandLineRunner(IngredientRepository ingredientRepository) {
        return strings -> {
            ingredientRepository.save(new Ingredient("parsley", "In my ass", "leafy vegetable", "solid", "smells good"));
        };
    }
}

