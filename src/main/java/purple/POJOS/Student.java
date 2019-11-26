package purple.POJOS;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Document(collection = "Student")
public class Student {
    private String username;
    private String password;
    private String name;
//    private ArrayList<Class> classList;
    private String type;
    private ArrayList<Recipe> cookedRecipes;

    public Student(){
        this.username = "";
        this.password = "";
        this.name = "";
//        this.classList = null;
        this.type = "";
        this.cookedRecipes = null;
    };

    public Student(String username, String password, String name, /*ArrayList<Class> classList,*/ String type, ArrayList<Recipe> cookedRecipes) {
        this.username = username;
        this.password = password;
        this.name = name;
//        this.classList = classList;
        this.type = type;
        this.cookedRecipes = cookedRecipes;
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

//    public List<Class> getClassList() {
//        return classList;
//    }
//
//    public void setClassList(ArrayList<Class> classList) {
//        this.classList = classList;
//    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Recipe> getCookedRecipes() {
        return cookedRecipes;
    }

    public void setCookedRecipes(ArrayList<Recipe> cookedRecipes) {
        this.cookedRecipes = cookedRecipes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
//                ", classList=" + classList +
                ", type='" + type + '\'' +
                ", cookedRecipes=" + cookedRecipes +
                '}';
    }
}
