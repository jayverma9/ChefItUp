package purple.POJOS;

public class Step {
    private Ingredient ingredient;
    private String action;
    private String description;


    public Step(Ingredient ingredient, String action, String description) {
        this.ingredient = ingredient;
        this.action = action;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
