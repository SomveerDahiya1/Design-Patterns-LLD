package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Channel implements IChannel{
    String newVideo;
    String channelName;
    List<ISubscriber> subscribers = new ArrayList<>();
    public Channel(String newVideo,String channelName){
        this.newVideo = newVideo;
    }
    Channel(String channelName){

    }
    @Override
    public void subscribe(ISubscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(ISubscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for(ISubscriber subscriber : subscribers){
            subscriber.update();
        }
    }

    @Override
    public void uploadVideo(String video) {
        newVideo = video;
        System.out.println("\n[ New video uploaded: " + newVideo+" ]");
        notifySubscribers();

    }
    @Override
    public String getVideo() {
        return "Checkout our new video: "+ newVideo;
    }

}
