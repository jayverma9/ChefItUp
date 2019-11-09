package purple.POJOS;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

@Document(collection = "Class")
public class Class {
    private String name;
    private String description;
    private Recipe[] recipes;
    private Student[] students;

    public Class(String name, String description, Recipe[] recipes, Student[] students) {
        this.name = name;
        this.description = description;
        this.recipes = recipes;
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

    public Recipe[] getRecipes() {
        return recipes;
    }

    public void setRecipes(Recipe[] recipes) {
        this.recipes = recipes;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Class{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", recipes=" + Arrays.toString(recipes) +
                ", students=" + Arrays.toString(students) +
                '}';
    }

}
