package entity;


import java.util.ArrayList;
import java.util.List;

public class TextComposite implements TextComponent {

    private CompositeType type;

    private ArrayList<TextComponent> components;

    public TextComposite() {
        components = new ArrayList<TextComponent>();
    }

    public ArrayList<TextComponent> getComponents() {
        return components;
    }

    public void add(TextComponent component) {
        components.add(component);
    }

    public void remove(TextComponent component) {
        components.remove(component);
    }

    public void setType(CompositeType type){this.type=type;}

    public CompositeType getType(){ return type; }

    @Override
    public String toString() {
        return "TextComposite{" +
                "type=" + type +
                ", components=" + components +
                '}';
    }
//    public ArrayList<TextComponent> find(ArrayList<TextComponent> component, CompositeType type){
//        for(TextComponent c: components){
//
//        }




}
