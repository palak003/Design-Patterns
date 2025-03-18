package AbstractFactoryPattern;

 class ModernChair implements Chair {
     @Override
     public void sitOn() {
         System.out.println("Sitting on modern chair");
     }
 }

 class ModernTable implements Table{

     @Override
     public void placeItems() {
         System.out.println("Placing items on modern table");
     }
 }
