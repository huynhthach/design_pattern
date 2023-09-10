package thuc_hanh.composite.tree;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Abstract_File{
    List<Abstract_File> children = new ArrayList<>();
    public Folder(String name) {
        super(name);
    }

    @Override
    public void add(Abstract_File file) {
        children.add(file);
    }

    @Override
    public void remove(Abstract_File file) {
        children.remove(file);
    }

    @Override
    public String getTreeFolder() {
        StringBuilder builder = new StringBuilder();
        builder.append(name);
        for(var child:children)
            builder.append("\n")
                    .append(child.getTreeFolder());
        return builder.toString();
    }
}
