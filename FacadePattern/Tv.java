package FacadePattern;

public class Tv implements HomeService {
    public void on() {
        System.out.println("TV is ON");
    }

    public void off() {
        System.out.println("TV is OFF");
    }
    
}
