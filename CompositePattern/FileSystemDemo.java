package CompositePattern;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

interface FileSystem{
    void delete();
}

class FileLeaf implements FileSystem{

    @Override
    public void delete(){
        System.out.println("Deleting file");
    }
}

class FolderStructure implements FileSystem{
    private List<FileSystem> fileSystemList=new ArrayList<>();

    public void addFileOrFolder(FileSystem fileSystem){
        fileSystemList.add(fileSystem);
    }

    public void removeFile(FileSystem fileSystem){
        fileSystemList.remove(fileSystem);
    }

    @Override
    public void delete(){
        System.out.println("deleting folder");
        for(FileSystem fileSystem: fileSystemList){
            fileSystem.delete();
        }
    }
}

public class FileSystemDemo{
    public static void main(String[] args){
        FolderStructure folder1=new FolderStructure();
        FileLeaf file1=new FileLeaf();
        FolderStructure subfolder1=new FolderStructure();
        FileLeaf subFile1=new FileLeaf();

        folder1.addFileOrFolder(file1);
        subfolder1.addFileOrFolder(subFile1);
        folder1.addFileOrFolder(subfolder1);

//        folder1
//                -file1
//                -subfolder1
//                   -subfile1

        folder1.delete();
    }
}
