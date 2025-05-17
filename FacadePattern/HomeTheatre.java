package FacadePattern;

 class DvdPlayer {

     public void on(){
         System.out.println("dvd on");
     }
     public void off(){
         System.out.println("dvd off");
     }
}

class Amplifier{

     public void on(){
         System.out.println("Amplifier on");
     }
     public void off(){
         System.out.println("Amplifier off");
     }

}

class Projector{
     public void on(){
         System.out.println("Projector on");
     }
     public void off(){
         System.out.println("Projector off");
     }
}

class HomeTheatreFacade{

     private DvdPlayer dvdPlayer;
     private Amplifier amplifier;
     private Projector projector;

     public HomeTheatreFacade(DvdPlayer dvdPlayer, Amplifier  amplifier, Projector projector){
         this.amplifier=amplifier;
         this.projector=projector;
         this.dvdPlayer=dvdPlayer;
     }

     public void watchMovie(){
         dvdPlayer.on();
         amplifier.on();
         projector.on();
     }

     public void endMovie(){
         dvdPlayer.off();
         amplifier.off();
         projector.off();
     }
}

public class HomeTheatre{

     public static void main(String[] args){
         DvdPlayer dvdPlayer=new DvdPlayer();
         Amplifier amplifier=new Amplifier();
         Projector projector=new Projector();
         HomeTheatreFacade homeTheatreFacade=new HomeTheatreFacade(dvdPlayer,amplifier,projector);
         homeTheatreFacade.watchMovie();
         homeTheatreFacade.endMovie();
     }

}
