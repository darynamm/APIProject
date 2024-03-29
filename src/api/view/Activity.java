package api.view;

public class Activity
{
	private String activity;
    private String type;
    private int participants;
    private double accessibility;
    private double price;
    private String imageLink;
    private String link;
    private int key;
    
    public Activity(String name, String type, int participants, double accessibility, double price, String imageLink) {
        this.activity = name;
        this.type = type;
        this.participants = participants;
        this.accessibility = accessibility;
        this.price = price;
        this.imageLink = imageLink;
    }
    
    // getters and setters for all instance variables
    
   public Activity()
   {
	   
   }
public int getKey()
{
	return key;
}
public int setKey(int key)
{
	return this.key = key;
}
public String getLink()
{
	return link;
}

public String setLink(String link)
{
	return this.link = link;
}
	public String getActivity() {
        return activity;
    }
    
    public void setActivity(String name) {
        this.activity = name;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public int getParticipants() {
        return participants;
    }
    
    public void setParticipants(int participants) {
        this.participants = participants;
    }
    
    public double getAccessibility() {
        return accessibility;
    }
    
    public void setAccessibility(double accessibility) {
        this.accessibility = accessibility;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public String getImageLink() {
        return imageLink;
    }
    
    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }
    
    // Override toString() method to display activity information
    
    @Override
    public String toString() {
        return activity + " (" + type + ") - Participants: " + participants + ", Accessibility: " + accessibility + ", Price: " + price;
    }

}
