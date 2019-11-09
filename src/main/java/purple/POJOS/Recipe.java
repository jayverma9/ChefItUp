package purple.POJOS;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;
import java.util.List;

@Document(collection = "Recipe")
public class Recipe {
    private String name;
    private String description;
    private List<Ingredient> ingredients;
    private List<Utensil> utensils;
    private String[] steps;
    private Student[] students;

    public Recipe(String name, String description, List<Ingredient> ingredients, List<Utensil> utensils, String[] steps, Student[] students) {
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

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public List<Utensil> getUtensils() {
        return utensils;
    }

    public void setUtensils(List<Utensil> utensils) {
        this.utensils = utensils;
    }

    public String[] getSteps() {
        return steps;
    }

    public void setSteps(String[] steps) {
        this.steps = steps;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", ingredients=" + ingredients +
                ", utensils=" + utensils +
                ", steps=" + Arrays.toString(steps) +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}
