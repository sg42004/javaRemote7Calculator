package carpet;

public class Calculator {

    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet){
        this.carpet = carpet;
        this.floor = floor;
    }

    public double getTotalCost (){//method without any parameters
        return (floor.getArea() * carpet.getCost());
    }


}
