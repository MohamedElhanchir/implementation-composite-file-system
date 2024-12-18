package elhanchir.mohamed.composite;

public abstract class Component {
    protected String name;
    protected int level=0;

    public Component(String name) {
        this.name = name;
    }

    public abstract void afficher();

    public String getTab(){
        return "\t".repeat(Math.max(0, level));
    }


}
