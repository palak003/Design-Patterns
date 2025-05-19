package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(String news);
}

interface Subject{
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyAllObserver();
}

class NewsPublisher implements Subject{
    private List<Observer> observerList=new ArrayList<>();
    private String news;

    @Override
    public void addObserver(Observer observer){
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer){
        observerList.remove(observer);
    }

    public void setNews(String news){
        this.news=news;
        notifyAllObserver();
    }

    @Override
    public void notifyAllObserver(){
        for(Observer observer:observerList)
            observer.update(news);
    }
}

class NewsConsumer implements Observer{

    @Override
    public void update(String news){
        System.out.println("Received news "+news);
    }
}

public class NewsDemo{
    public static void main(String[] args) {
        NewsPublisher subject = new NewsPublisher();
        Observer observer1 = new NewsConsumer();
        Observer observer2 = new NewsConsumer();

        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.setNews("Todays newsletter");

        subject.removeObserver(observer1);
        subject.setNews("Next newsletter");
    }
}
