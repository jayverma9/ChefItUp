package purple.POJOS;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "Class")
public class Class {
    private String name;
    private String description;
    private List<Recipe> recipes;
    private List<Student> students;
    private Teacher classOwner;

    public Class(String name, String description, List<Recipe> recipes, List<Student> students, Teacher owner) {
        this.name = name;
        this.description = description;
        this.recipes = recipes;
        this.students = students;
        this.classOwner = owner;
    }

    public Teacher getClassOwner() {
        return classOwner;
    }

    public void setClassOwner(Teacher classOwner) {
        this.classOwner = classOwner;
    }

    public void setRecipes(List<Recipe> recipes) {
        this.recipes = recipes;
    }

    public void setStudents(List<Student> students) {
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

    public void setRecipes(ArrayList<Recipe> recipes) {
        this.recipes = recipes;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }


}
