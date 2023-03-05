public class Transport {
//1.1
  private String name;
  private int seatingCapacity;
//1.2.1

    public void move(){
        System.out.println("Transport is moving");
        
    }
// 1.2.2
    public void options(){
        System.out.println("I can move back and forward");
    }

//    1.3
    public Transport(){
        System.out.println("A new transport is being created");
    }

//    1.4
    public String getName(){
        return name;
    }

    public int getSeatingCapacity(){
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity){
        System.out.println("You are going to set Transport seating capacity. It must be positive");
        System.out.println("Capacity is provided" + seatingCapacity);

        if (seatingCapacity >= 1) {
            this.seatingCapacity = seatingCapacity;
        } else {
            System.out.println("Capacity must be positive");
        }

    }
    public void setName(String name){
         this.name = name;
    }




}
