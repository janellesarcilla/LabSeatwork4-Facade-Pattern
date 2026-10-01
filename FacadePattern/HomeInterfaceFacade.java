package FacadePattern;

public class HomeInterfaceFacade {
    private Light light;
    private Tv tv;
    private AirConditioning airConditioning;

    public HomeInterfaceFacade(Light light, Tv tv, AirConditioning airConditioning) {
        this.light = new Light();
        this.tv = new Tv();
        this.airConditioning = new AirConditioning();
    }

    public void turnOnAll() {
        System.out.println("Turning on all home services...");
        light.on();
        tv.on();
        airConditioning.on();
    }

    public void turnOffAll() {
        System.out.println("\nTurning off all home services...");
        light.off();
        tv.off();
        airConditioning.off();
    }
    
}