import net.dv8tion.jda.api.entities.Message;

import java.util.ArrayList;

public class Drink {
    public String name;
    public String url;
    public String recipe;

    public Drink(String name, String url, String recipe) {
        this.name = name;
        this.url = url;
        this.recipe = recipe;
    }

    public boolean contains(String iMessage) {
        return this.recipe.contains(iMessage);
    }
    }