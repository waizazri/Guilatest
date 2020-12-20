
package Assignment1;

public class TypeofAerobic {
    
    
    //Jump rope
    String TypeAerobic1,TypeAerobic2, equipment1,equipment2, benefits1,benefits2; 
    int duration1,duration2, frequency1,frequency2;
    
    TypeofAerobic(){
  
        
 this.TypeAerobic1=" Jump rope, Aerobic strength circuit & many more";
 this.TypeAerobic2="You will learn about Swimming, Stationary bike & many more";
 this.equipment1=" gym shoes(sneakers), jump rope";
 this.equipment1=" sturdy chair or couch and more";
 this.duration1=25;
 this.duration2=30;
 this.frequency1=3;
 this.frequency2=5;
    }
    
    public void AtHomeAerobic(){
       System.out.println("You will learn about "+TypeAerobic1);
       System.out.println("Equipment you need to have "+equipment1);
       System.out.println("Duration you must follow "+duration1);
}
    public void AtGymAerobic(){
       System.out.println("You will learn about "+TypeAerobic2);
       System.out.println("Equipment you need to have "+equipment2);
       System.out.println("Duration you must follow "+duration2);
    }
}
    
  
 