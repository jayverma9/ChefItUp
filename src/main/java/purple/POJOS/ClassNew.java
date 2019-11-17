package purple.POJOS;

public class ClassNew {
    private String name;
    private String description;

    private ClassNew(String name, String description) {
        this.name = name;
        this.description = name;
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
}
