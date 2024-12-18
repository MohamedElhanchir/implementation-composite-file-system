package elhanchir.mohamed;

import elhanchir.mohamed.composite.File;
import elhanchir.mohamed.composite.Folder;

public class Main {
    public static void main(String[] args) {
        Folder root = new Folder("root");
        Folder folder1 = new Folder("folder1");
        Folder folder2 = new Folder("folder2");
        File file1 = new File("file1");
        File file2 = new File("file2");
        File file3 = new File("file3");
        File file4 = new File("file4");
        root.add(folder1);
        root.add(folder2);
        folder1.add(file1);
        folder1.add(file2);
        folder2.add(file3);
        folder2.add(file4);
        root.afficher();
    }
}