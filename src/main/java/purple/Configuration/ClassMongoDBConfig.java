package purple.Configuration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import purple.POJOS.*;
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

            classRepository.deleteAll();
//            ingredientRepository.deleteAll();
            recipeRepository.deleteAll();
//            studentRepository.deleteAll();
//            teacherRepository.deleteAll();
//            utensilRepository.deleteAll();

//            classRepository.save(new Class("Greek Food", "Chicken Gyro",  new Recipe[0], new Student[0]));
            ingredientRepository.save(new Ingredient("parsley", "Empty", "leafy vegetable", "solid", "smells good"));
            ingredientRepository.save(new Ingredient("Curry leaves", "Empty", "leafy vegetable", "solid", "smells good"));
            ingredientRepository.save(new Ingredient("Cardamom", "Empty", "leafy vegetable", "solid", "smells good"));
            ingredientRepository.save(new Ingredient("Saffron", "Empty", "leafy vegetable", "solid", "smells good"));
            ingredientRepository.save(new Ingredient("Tumeric", "Empty", "leafy vegetable", "solid", "smells good"));
            ingredientRepository.save(new Ingredient("Garam Masala", "Empty", "leafy vegetable", "solid", "smells good"));
            ingredientRepository.save(new Ingredient("clove", "Empty", "leafy vegetable", "solid", "smells good"));
            ingredientRepository.save(new Ingredient("Mustard seeds", "Empty", "leafy vegetable", "solid", "smells good"));
            ingredientRepository.save(new Ingredient("Rice Flour", "Empty", "leafy vegetable", "solid", "smells good"));
            ingredientRepository.save(new Ingredient("Coconut Milk", "Empty", "leafy vegetable", "solid", "smells good"));
            ingredientRepository.save(new Ingredient("Chick Pea", "Empty", "leafy vegetable", "solid", "smells good"));
            ingredientRepository.save(new Ingredient("Coriander", "Empty", "leafy vegetable", "solid", "smells good"));
            ingredientRepository.save(new Ingredient("Cumin", "Empty", "leafy vegetable", "solid", "smells good"));
            ingredientRepository.save(new Ingredient("Fenugreek", "Empty", "leafy vegetable", "solid", "smells good"));
            ingredientRepository.save(new Ingredient("Dal", "Empty", "leafy vegetable", "solid", "smells good"));
            ingredientRepository.save(new Ingredient("Paprika", "Empty", "leafy vegetable", "solid", "smells good"));
            ingredientRepository.save(new Ingredient("Mustard Oil", "Empty", "leafy vegetable", "solid", "smells good"));

            recipeRepository.save(new Recipe("Paneer Tadka", "description", ingredientRepository.findAll(), utensilRepository.findAll(), new String[0], studentRepository.findAll()));
            recipeRepository.save(new Recipe("Spaghetti", "description", ingredientRepository.findAll(), utensilRepository.findAll(), new String[0], studentRepository.findAll()));
            recipeRepository.save(new Recipe("Chicken masala", "description", ingredientRepository.findAll(), utensilRepository.findAll(), new String[0], studentRepository.findAll()));
            recipeRepository.save(new Recipe("Goat Masala", "description", ingredientRepository.findAll(), utensilRepository.findAll(), new String[0], studentRepository.findAll()));

//            studentRepository.save(new Student("jack", "123", "Percy Jackson", classRepository.findAll(), "looking for Water recipes", recipeRepository.findAll()));
//            studentRepository.save(new Student("john", "123", "John Wick", classRepository.findAll(), "looking for Blood recipes", recipeRepository.findAll()));
//            studentRepository.save(new Student("stup", "123", "Stupinder", classRepository.findAll(), "looking for idiot recipes", recipeRepository.findAll()));
//            studentRepository.save(new Student("devil", "123", "Devil ka bacha", classRepository.findAll(), "looking for firey recipes", recipeRepository.findAll()));

//            teacherRepository.save(new Teacher("ROHIT", "abc", "ROHIT SINGH THARDAK", new Class[0], "", new Recipe[0], new Recipe[0]));
//            teacherRepository.save(new Teacher("Rluthra", "123", "Rohit Luthra", new Class[0], "", new Recipe[0], new Recipe[0]));

            utensilRepository.save(new Utensil("Knife", "Empty", "1 no.", new String[0], "Intended for cutting vegetables and fruits with."));
            utensilRepository.save(new Utensil("Cutting Board", "Empty", "1 no.", new String[0], "Intended for cutting vegetables and fruits on."));
            utensilRepository.save(new Utensil("Mixing Bowl", "Empty", "1 quart", new String[0], "Intended for mixing ingredients together in."));
            utensilRepository.save(new Utensil("Measuring Cups", "Empty", "1/4, 1/2, 3/4, 1 cups", new String[0], "Intended for precise measuring of flour and syrups."));
            utensilRepository.save(new Utensil("Can Opener", "Empty", "0", new String[0], "Intended for opening cans."));
            utensilRepository.save(new Utensil("Colander", "Empty", "3 ltr", new String[0], "Intended for draining residual liquid."));
            utensilRepository.save(new Utensil("Strainer", "Empty", "0", new String[0], "Intended for straining residual liquid."));
            utensilRepository.save(new Utensil("Vegetable Peeler", "Empty", "0", new String[0], "Intended for peeling vegetables and fruits."));
            utensilRepository.save(new Utensil("Spoons", "Empty", "1 Tbsp", new String[0], "Intended for mixing, stirring, finely measuring."));
            utensilRepository.save(new Utensil("Whisks", "Empty", "0", new String[0], "Intended for whisking and mixing."));
            utensilRepository.save(new Utensil("Tongs", "Empty", "0", new String[0], "Intended for picking up individual ingredients."));


//            System.out.println(classRepository.findAll());

//            teacherRepository.save(
//                    new Teacher(
//                            "Hridaya",
//                            "123",
//                            "Hridaya alaya",
//                            classRepository.findAll(),
//                            "Indian chef",
//                            recipeRepository.findAll(),
//                            recipeRepository.findAll()
//                    )
//            );
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

