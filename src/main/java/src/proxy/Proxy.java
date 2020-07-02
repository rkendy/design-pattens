package src.proxy;

import java.util.HashMap;
import java.util.Map;

public class Proxy implements ServiceInterface {

    private ServiceImplementation serviceImpl;
    private Map<String, String> cache;

    public Proxy() {
        serviceImpl = new ServiceImplementation();
        cache = new HashMap<>();
    }

    @Override
    public String getVideo(String videoId) {
        if (cache.containsKey(videoId)) {
            System.out.println("Returning from cache. Very fast!");
            return cache.get(videoId);
        }

        String video = serviceImpl.getVideo(videoId);
        cache.put(videoId, video);

        return video;
    }

}