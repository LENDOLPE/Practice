import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class hell {

	public static void main(String[] args) {
		
		String id = "JVA APT 303";
				
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		Security mysSecurity = new Security(id);
		mysSecurity.off();
		
		Lighting hallLamp = new Lighting(id+ " - Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id+" / Hall Lamp");
		floorLamp.on();
		
		
	}

}
