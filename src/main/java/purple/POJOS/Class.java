package purple.POJOS;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;
import java.util.List;

@Document(collection = "Class")
public class Class {
    private String name;
    private String description;
    private List<Recipe> recipes;
    private List<Student> students;

    public Class(String name, String description, List<Recipe> recipes, List<Student> students) {
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

    public List<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(List<Recipe> recipes) {
        this.recipes = recipes;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Class{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", recipes=" + recipes +
                ", students=" + students +
                '}';
    }
}
