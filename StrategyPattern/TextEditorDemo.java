package StrategyPattern;

import org.w3c.dom.Text;

interface SaveStrategy{
    void save(String filename);
}

class CsvSaveStrategy implements SaveStrategy{

    @Override
    public void save(String filename){
        System.out.println("Saving as "+filename+" .csv");
    }
}

class XmlSaveStrategy implements SaveStrategy{

    @Override
    public void save(String filename){
        System.out.println("Saving as "+filename+" .xml");
    }
}

class TextSaveStrategy implements SaveStrategy{

    @Override
    public void save(String filename){
        System.out.println("Saving as "+filename+" .txt");
    }
}

class TextEditor{

    private SaveStrategy saveStrategy;

    public void setSaveStrategy(SaveStrategy saveStrategy){
        this.saveStrategy=saveStrategy;
    }

    public void saveDocument(String filename){
        saveStrategy.save(filename);
    }
}


public class TextEditorDemo {
    public static void main(String[] args){
        TextEditor editor=new TextEditor();
        editor.setSaveStrategy(new CsvSaveStrategy());
        editor.saveDocument("file1");

        editor.setSaveStrategy(new XmlSaveStrategy());
        editor.saveDocument("file2");

        editor.setSaveStrategy(new TextSaveStrategy());
        editor.saveDocument("file3");
    }
}
