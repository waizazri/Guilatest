
package Assignment1;

public class main {
    public static void main(String[] args){
        
        
        //Choose Type of aerobic
        AtHomeAerobic1 H = new AtHomeAerobic1();
        AtGymAerobic1 G = new AtGymAerobic1();
        
        Participant a = new Participant();
        //Set name for the Participant
        a.setFirstname("Abu");
        a.setLastname("Labu");
        System.out.println("Participant 1 name: "+a.getFirstname()+" "+a.getLastname());
        System.out.println("You want to learn about: ");
        H.AtHomeAerobic();
        
        System.out.println("\n");
        
     
        //Set name for the Participant
        a.setFirstname("Ain");
        a.setLastname("Elisha");
        System.out.println("Participant 2 name: "+a.getFirstname()+" "+a.getLastname());
        System.out.println("You want to learn about: ");
        G.AtGymAerobic();
    }
}
