package purple.POJOS;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Teacher")
public class Teacher {
    private String username;
    private String password;
    private String name;
    private Class[] classList;
    private String type;
    private Recipe[] draftRecipes;
    private Recipe[] specialRecipes;

    public Teacher(String username, String password, String name) {
        this.username = username;
        this.password = password;
        this.name = name;
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

    public Class[] getClassList() {
        return classList;
    }

    public void setClassList(Class[] classList) {
        this.classList = classList;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Recipe[] getDraftRecipes() {
        return draftRecipes;
    }

    public void setDraftRecipes(Recipe[] draftRecipes) {
        this.draftRecipes = draftRecipes;
    }

    public Recipe[] getSpecialRecipes() {
        return specialRecipes;
    }

    public void setSpecialRecipes(Recipe[] specialRecipes) {
        this.specialRecipes = specialRecipes;
    }
}
