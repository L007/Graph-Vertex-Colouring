package nurul.id.graphvertexcolouring;

/**
 * Created by Brian R on 25/02/2018.
 */

public class Model {
    private int id;
    private String button, level;

    public Model(int id, String button, String level) {
        this.id = id;
        this.button = button;
        this.level = level;
    }

    public Model(int id, int rectangle_grey, String level) {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getButton() {
        return button;
    }

    public void setButton(String button) {
        this.button = button;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
