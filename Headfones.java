
public class Headfones {
	
	String charge = "MICRO USB";
	String[] controls = {"power", "volume", "skip", "play/pause"};
	String color = "RED/BLACK";
	
	boolean power = false;
	int volume = 0;
	boolean charging = false;
	
	public void powerOn() {
		power = true;
	}
	public void off() {
		power = false;
	}
	public void volUp() {
		volume++;
	}
	public void volDown() {
		volume--;
	}
	public void charge() {
		charging = true;
	}
	public void uncharge() {
		charging = false;
	}
}