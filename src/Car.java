public class Car extends Transport{
//    2.1
    public String vinNumber;
    public String stateNumber;
//   2.2
    public String getVinNumber(){
        return vinNumber;
    }
    public String getStateNumber(){
        return stateNumber;
    }
    public void setVinNumber(String vinNumber){
        this.vinNumber = vinNumber;
    }

    public void setStateNumber (String stateNumber){
        this.stateNumber = stateNumber;
    }
//    2.3
    @Override
    public void move() {
        System.out.println("Car is moving");
    }

}
