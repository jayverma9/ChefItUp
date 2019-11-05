package purple.POJOS;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Recipe {
    private String name;
    private String description;
    private Ingredient[] ingredients;
    private Utensil[] utensils;
    private String[] steps;
    private Student[] students;

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

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredient[] ingredients) {
        this.ingredients = ingredients;
    }

    public Utensil[] getUtensils() {
        return utensils;
    }

    public void setUtensils(Utensil[] utensils) {
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
}
