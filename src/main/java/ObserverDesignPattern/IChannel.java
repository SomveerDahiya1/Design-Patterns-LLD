package ObserverDesignPattern;

import java.util.List;

public interface IChannel {
    void subscribe(ISubscriber subscriber);;
    void unsubscribe(ISubscriber subscriber);
    void notifySubscribers();
    void uploadVideo(String video);
    String  getVideo();
}
