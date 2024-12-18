package elhanchir.mohamed.composite;

public class File extends Component {

    public File(String name) {
        super(name);
    }
    public  void afficher(){
        System.out.println(getTab() + "File: " + name);
    }
}
