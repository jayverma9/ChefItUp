package purple.Configuration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import purple.POJOS.*;
import purple.POJOS.Class;
import purple.Repositories.*;

//This class handles mongo configurations
@Configuration
@EnableMongoRepositories(basePackageClasses = ClassRepository.class)
public class ClassMongoDBConfig {

    @Bean
    CommandLineRunner commandLineRunner(ClassRepository classRepository, IngredientRepository ingredientRepository,
                                        RecipeRepository recipeRepository, StudentRepository studentRepository,
                                        TeacherRepository teacherRepository, UtensilRepository utensilRepository) {
        return strings -> {

//            classRepository.deleteAll();
//            ingredientRepository.deleteAll();
//            recipeRepository.deleteAll();
//            studentRepository.deleteAll();
//            teacherRepository.deleteAll();
//            utensilRepository.deleteAll();

//            classRepository.save(new Class("Greek Food", "Chicken Gyro",  new Recipe[0], new Student[0]));
//            ingredientRepository.save(new Ingredient("parsley", "Empty", "leafy vegetable", "solid", "smells good"));
//            recipeRepository.save(new Recipe("Paneer Tadka", "abhi toh bola paneer tadka", new Ingredient[0], new Utensil[0], new String[0], new Student[0]));
//            studentRepository.save(new Student("KISH", "123", "Kishore Thamilvanan"));
//            teacherRepository.save(new Teacher("ROHIT", "abc", "ROHIT SINGH THARDAK", new Class[0], "", new Recipe[0], new Recipe[0]));
//            teacherRepository.save(new Teacher("Rluthra", "123", "Rohit Luthra", new Class[0], "", new Recipe[0], new Recipe[0]));
//            utensilRepository.save(new Utensil("pan", "Empty", "3/4 quarts", new String[0], "Cast Iron Pan"));

            System.out.println(classRepository.findAll());

            teacherRepository.save(
                    new Teacher(
                            "Hridaya",
                            "123",
                            "Hridaya alaya",
                            classRepository.findAll(),
                            "Indian chef",
                            recipeRepository.findAll(),
                            recipeRepository.findAll()
                    )
            );
        };
    }
}

