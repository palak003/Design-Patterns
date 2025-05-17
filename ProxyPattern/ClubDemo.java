package ProxyPattern;

interface Club{
    void enter(Person person);
}

class RealClub implements Club{

    @Override
    public void enter(Person person){
        System.out.println("Welcome to club, you are authorized");
    }
}

class ClubProxy implements  Club{

    private RealClub realClub=new RealClub();

    @Override
    public void enter(Person person){
        if(person.getAge()<18){
            System.out.println("Sorry not allowed");
        }
        else
            realClub.enter(person);
    }
}

class Person{
    int age;
    public Person(int age){
        this.age=age;
    }

    public int getAge(){
        return age;
    }

}
public class ClubDemo {

    public static void main(String[] args) {
        Club club = new ClubProxy();
        Person p1 = new Person(18);
        Person p2 = new Person(10);
        club.enter(p1);
        club.enter(p2);
    }

}
