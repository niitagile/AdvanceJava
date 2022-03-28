package Design_pattern.behaviourial;

interface ISocialMediaStrategy 
{
    public void connectTo(String friendName);
}
class SocialMediaContext 
{
    ISocialMediaStrategy smStrategy;
 
    public void setSocialmediaStrategy(ISocialMediaStrategy smStrategy) 
    {
        this.smStrategy = smStrategy;
    }
 
    public void connect(String name) 
    {
        smStrategy.connectTo(name);
    }
}
class FacebookStrategy implements ISocialMediaStrategy {
	 
    public void connectTo(String friendName) 
    {
        System.out.println("Connecting with " + friendName + " through Facebook");
    }
}

class TwitterStrategy implements ISocialMediaStrategy {
	 
    public void connectTo(String friendName) 
    {
        System.out.println("Connecting with " + friendName + " through Twitter");
    }
}
public class StrategyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SocialMediaContext context = new SocialMediaContext();
		context.setSocialmediaStrategy(new FacebookStrategy());
        context.connect("Lokesh");
        context.setSocialmediaStrategy(new TwitterStrategy());
        context.connect("Manish");
        
	}

}
