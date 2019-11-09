package purple.POJOS;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;
import java.util.List;

@Document(collection = "Teacher")
public class Teacher {
    private String username;
    private String password;
    private String name;
    private List<Class> classList;
    private String type;
    private List<Recipe> draftRecipes;
    private List<Recipe> specialRecipes;

    public Teacher(String username, String password, String name, List<Class> classList, String type, List<Recipe> draftRecipes, List<Recipe> specialRecipes) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.classList = classList;
        this.type = type;
        this.draftRecipes = draftRecipes;
        this.specialRecipes = specialRecipes;
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

    public List<Class> getClassList() {
        return classList;
    }

    public void setClassList(List<Class> classList) {
        this.classList = classList;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Recipe> getDraftRecipes() {
        return draftRecipes;
    }

    public void setDraftRecipes(List<Recipe> draftRecipes) {
        this.draftRecipes = draftRecipes;
    }

    public List<Recipe> getSpecialRecipes() {
        return specialRecipes;
    }

    public void setSpecialRecipes(List<Recipe> specialRecipes) {
        this.specialRecipes = specialRecipes;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", classList=" + classList +
                ", type='" + type + '\'' +
                ", draftRecipes=" + draftRecipes +
                ", specialRecipes=" + specialRecipes +
                '}';
    }
}
