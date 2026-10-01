package FacadePattern;

public class AirConditioning implements HomeService {
    public void on() {
        System.out.println("Air Conditioning is ON");
    }

    public void off() {
        System.out.println("Air Conditioning is OFF");
    }
    
}
