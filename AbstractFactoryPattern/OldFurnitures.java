package AbstractFactoryPattern;

 class OldChair implements Chair {
     @Override
     public void sitOn() {
         System.out.println("Sitting on old chair");
     }
 }

 class OldTable implements Table{

     @Override
     public void placeItems() {
         System.out.println("Placing items on old table");
     }
 }
