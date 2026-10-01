package FacadePattern;

public class HomeApp { 
    public static void main(String[] args) {
    
            Light kitchenLight = new Light();
            Tv samsung = new Tv();
            AirConditioning panasonic = new AirConditioning();
    
            HomeInterfaceFacade facade = new HomeInterfaceFacade (kitchenLight, samsung, panasonic);
    
            facade.turnOnAll();
            facade.turnOffAll();
}
    
}
