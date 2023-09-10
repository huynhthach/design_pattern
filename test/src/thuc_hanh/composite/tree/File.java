package thuc_hanh.composite.tree;

public class File extends Abstract_File{
    public File(String name) {
        super(name);
    }

    @Override
    public void add(Abstract_File file) {

    }

    @Override
    public void remove(Abstract_File file) {

    }

    @Override
    public String getTreeFolder() {
        return name.toString();
    }
}
