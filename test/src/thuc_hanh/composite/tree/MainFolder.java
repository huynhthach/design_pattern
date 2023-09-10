package thuc_hanh.composite.tree;

public class MainFolder {
    public static void main(String[] args) {
        Abstract_File file = new File("giai thich");
        Abstract_File file1 = new File("mau thiet ke");
        Abstract_File file2 = new File("tieng anh b1.2");
        Folder folder = new Folder("hoc");
        Folder folder1 = new Folder("choi");
        folder1.add(file);
        folder1.add(file1);
        folder1.add(file2);
        folder.add(folder1);
        System.out.println(folder.getTreeFolder());
    }
}
