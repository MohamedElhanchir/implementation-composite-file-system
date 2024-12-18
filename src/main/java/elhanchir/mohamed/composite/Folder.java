package elhanchir.mohamed.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component {
    private List<Component> children = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    public  void afficher(){
        System.out.println(getTab() + "Folder: " + name);
        for (Component child : children) {
            child.afficher();
        }
    }

    public Component add(Component component){
        children.add(component);
        component.level = this.level + 1;
        return component;
    }

    public void remove(Component component){
        children.remove(component);
    }
}
