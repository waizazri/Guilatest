
package Assignment1;

public class main {
    public static void main(String[] args){
        
        
        //Type of aerobic
        AtHomeAerobic H = new AtHomeAerobic();
        AtGymAerobic G = new AtGymAerobic();
        
        Participant a = new Participant();
        a.setFirstname("Abu");
        a.setLastname("Labu");
        System.out.println("Participant 1 name: "+a.getFirstname()+" "+a.getLastname());
        System.out.println("You want to learn about: ");
        H.AtHomeAerobic1();
        
        
    }
}
