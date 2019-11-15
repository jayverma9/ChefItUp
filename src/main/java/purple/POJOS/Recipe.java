package purple.POJOS;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document(collection = "Recipe")
public class Recipe {
    private String name;
    private String description;
    private ArrayList<Ingredient> ingredients;
    private ArrayList<Utensil> utensils;
    private String[] steps;
    private ArrayList<Student> students;

    public Recipe(String name, String description, ArrayList<Ingredient> ingredients, ArrayList<Utensil> utensils, String[] steps, ArrayList<Student> students) {
        this.name = name;
        this.description = description;
        this.ingredients = ingredients;
        this.utensils = utensils;
        this.steps = steps;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public ArrayList<Utensil> getUtensils() {
        return utensils;
    }

    public void setUtensils(ArrayList<Utensil> utensils) {
        this.utensils = utensils;
    }

    public String[] getSteps() {
        return steps;
    }

    public void setSteps(String[] steps) {
        this.steps = steps;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
