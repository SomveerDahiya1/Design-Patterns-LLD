package ObserverDesignPattern;

public class Subscriber implements ISubscriber{
    private String name;
    private IChannel channel;

    Subscriber(String name,IChannel channel)
    {   this.name=name;
        this.channel=channel;
    }
    @Override
    public void update() {
        System.out.println("\nHey "+name+","+channel.getVideo());
    }
}
