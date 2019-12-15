package purple.POJOS;

import java.io.File;

public class Step {
    private Ingredient ingredient;
    private String action;
    private String description;
    private String outcome;
    private File imageFile;

    public Step(Ingredient ingredient, String action, String description, String outcome, File imageFile) {
        this.ingredient = ingredient;
        this.action = action;
        this.description = description;
        this.outcome = outcome;
        this.imageFile = imageFile;
    }

    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }

    public File getImageFile() {
        return imageFile;
    }

    public void setImageFile(File imageFile) {
        this.imageFile = imageFile;
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
