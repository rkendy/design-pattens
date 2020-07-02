package src.proxy;

public class ServiceImplementation implements ServiceInterface {

    @Override
    public String getVideo(String videoId) {
        System.out.println("=====>>> Downloading video... very slow...");
        return "===>>> " + videoId + " <<<===";
    }

}