package purple.POJOS;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document(collection = "Student")
public class Student {
    private String username;
    private String password;
    private String name;
    private ArrayList<Class> classList;
    private String type;
    private ArrayList<Recipe> cookedRecipes;

    public Student(String username, String password, String name) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.classList = new ArrayList<>();
        this.type = "";
        this.cookedRecipes = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Class> getClassList() {
        return classList;
    }

    public void setClassList(ArrayList<Class> classList) {
        this.classList = classList;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<Recipe> getCookedRecipes() {
        return cookedRecipes;
    }

    public void setCookedRecipes(ArrayList<Recipe> cookedRecipes) {
        this.cookedRecipes = cookedRecipes;
    }
}
