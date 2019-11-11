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
//            recipeRepository.save(new Recipe("Paneer Tadka", "description", ingredientRepository.findAll(), utensilRepository.findAll(), new String[0], studentRepository.findAll()));
//            recipeRepository.save(new Recipe("Spaghetti", "description", ingredientRepository.findAll(), utensilRepository.findAll(), new String[0], studentRepository.findAll()));
//            recipeRepository.save(new Recipe("Chicken masala", "description", ingredientRepository.findAll(), utensilRepository.findAll(), new String[0], studentRepository.findAll()));
//            recipeRepository.save(new Recipe("Goat Masala", "description", ingredientRepository.findAll(), utensilRepository.findAll(), new String[0], studentRepository.findAll()));
//
//            studentRepository.save(new Student("jack", "123", "Percy Jackson", classRepository.findAll(), "looking for Water recipes", recipeRepository.findAll()));
//            studentRepository.save(new Student("john", "123", "John Wick", classRepository.findAll(), "looking for Blood recipes", recipeRepository.findAll()));
//            studentRepository.save(new Student("stup", "123", "Stupinder", classRepository.findAll(), "looking for idiot recipes", recipeRepository.findAll()));
//            studentRepository.save(new Student("devil", "123", "Devil ka bacha", classRepository.findAll(), "looking for firey recipes", recipeRepository.findAll()));

//            teacherRepository.save(new Teacher("ROHIT", "abc", "ROHIT SINGH THARDAK", new Class[0], "", new Recipe[0], new Recipe[0]));
//            teacherRepository.save(new Teacher("Rluthra", "123", "Rohit Luthra", new Class[0], "", new Recipe[0], new Recipe[0]));
//            utensilRepository.save(new Utensil("pan", "Empty", "3/4 quarts", new String[0], "Cast Iron Pan"));

//            System.out.println(classRepository.findAll());

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


//            classRepository.save(
//
//                    new Class("Indian Food",
//                            "Spicy and burst of flavours",
//                            recipeRepository.findAll(),
//                            studentRepository.findAll()
//                    )
//                );
//            classRepository.save(
//
//                    new Class("Italian Food",
//                            "Spicy and burst of flavours",
//                            recipeRepository.findAll(),
//                            studentRepository.findAll()
//                    )
//            ); classRepository.save(
//
//                    new Class("Jamaican Food",
//                            "Spicy and burst of flavours",
//                            recipeRepository.findAll(),
//                            studentRepository.findAll()
//                    )
//            );
        };
    }
}

