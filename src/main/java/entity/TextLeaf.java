package entity;

public class TextLeaf implements TextComponent {
    private String leaf;

    public TextLeaf(String textLeaf) {
        this.leaf = textLeaf;
    }

    public String getLeaf() {
        return leaf;
    }

    public void setLeaf(String leaf) {
        this.leaf = leaf;
    }

    @Override
    public String toString() {
        return "TextLeaf{" +
                "leaf='" + leaf + '\'' +
                '}';
    }
}
