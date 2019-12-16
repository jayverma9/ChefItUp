package purple.Configuration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
   import purple.POJOS.Class;
import purple.POJOS.Recipe;
import purple.POJOS.Student;
import purple.POJOS.Utensil;
import purple.Repositories.*;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//This class handles mongo configurations
@Configuration
@EnableMongoRepositories(basePackageClasses = ClassRepository.class)
public class ClassMongoDBConfig {

    @Bean
    CommandLineRunner commandLineRunner(ClassRepository classRepository, IngredientRepository ingredientRepository,
                                        RecipeRepository recipeRepository, StudentRepository studentRepository,
                                        TeacherRepository teacherRepository, UtensilRepository utensilRepository) {
        return strings -> {

            List<Utensil> u = utensilRepository.findAll();
            Utensil ut = null;

            ListIterator<Utensil> l = u.listIterator();

            while(l.hasNext()){
                ut = l.next();
                if(ut.getName() == "pan"){
                    utensilRepository.delete(ut);
                    System.out.print("ut deleted");
                }
            }

        };
    }
}

