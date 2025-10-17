package ObserverDesignPattern;

public class main {
    public static void main(String[] args) {
        IChannel channel= new Channel("SD-E");
        ISubscriber sub1 = new Subscriber("Rock",channel);
        ISubscriber sub2 = new Subscriber("Somveer",channel);
        ISubscriber sub3 = new Subscriber("James",channel);
        channel.subscribe(sub1);
        channel.subscribe(sub2);
        channel.subscribe(sub3);
        channel.uploadVideo("New Tesla-Y review");
        channel.unsubscribe(sub1);
        channel.uploadVideo("New Range-Velar review");

    }
}
