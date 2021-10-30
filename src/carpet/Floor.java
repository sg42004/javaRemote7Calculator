package carpet;

public class Floor {


    private double width; //field
    private double length; // field

    //constructor
    public Floor(double width, double length) {
 /*       if(width < 0) this.width = 0; //ja viens nosacījums, tad šādi var rakstīt.
        else this.width = width;
        if(length < 0) this.length = 0;
        else this.length = length;
    }*/

        this.length = (length < 0) ? 0 : length;
        this.width = (width >= 0) ? width : 0;
    }

    //method
    public double getArea(){
        return (width * length);
    }

}
