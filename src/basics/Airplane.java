package basics;

public class Airplane {
    //fields (State)
    //int id;
    private int id;
    boolean hasLanded;

    //Constructors
    public Airplane(int planeid){
        id = planeid;
    }

    //Methods (Behaviors)

    void Land() {
        System.out.println("Plane: "+ id +" is landing");
        hasLanded = true;
    }

    void takeoff() {
        System.out.println("Plane: "+ id +" is taking off");
        hasLanded = false;
    }

    void printDetails(){
        System.out.println("plane: " + id + " has landed "+ hasLanded);
    }
}
