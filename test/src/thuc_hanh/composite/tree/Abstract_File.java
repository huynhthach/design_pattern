package thuc_hanh.composite.tree;

public abstract class Abstract_File {
    String name;
    public abstract void add(Abstract_File file);
    public abstract void remove(Abstract_File file);
    public abstract String getTreeFolder();

    public Abstract_File(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Abstract_File{" +
                "name='" + name + '\'' +
                '}';
    }
}
