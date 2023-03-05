public class Main {
    public static void main(String[] args) {
//1.5
        Transport bus = new Transport();
        bus.setName("New bus Ecolines");
        bus.setSeatingCapacity(36);

        String busName = bus.getName();
        System.out.println(busName);

        int busSeatingCapacity = bus.getSeatingCapacity();
        System.out.println(busSeatingCapacity);

//        2.4
        Car mercedes = new Car();
        mercedes.move();
//        2.5

        Car lexus = new Car();
        lexus.options();
        };


        
    }
