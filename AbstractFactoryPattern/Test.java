package AbstractFactoryPattern;
import java.util.Scanner;

public class Test {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String furnitureFactoryType= sc.nextLine();

        String furnitureType=sc.nextLine();

        //fixing the factory type( old/modern)
        FurnitureFactory furnitureFactory=null;
        if(furnitureFactoryType.equalsIgnoreCase("Modern"))
            furnitureFactory=new ModernFurnitureFactory();
        else if(furnitureFactoryType.equalsIgnoreCase("Old"))
            furnitureFactory=new OldFurnitureFactory();

        //generating chair/table from chosen factory type
        if(furnitureType.equalsIgnoreCase("Chair")){
            Chair chair=furnitureFactory.createChair();
            chair.sitOn();
        }
        else if(furnitureType.equalsIgnoreCase("Table")){
            Table table=furnitureFactory.createTable();
            table.placeItems();
        }

        sc.close();
    }
}
