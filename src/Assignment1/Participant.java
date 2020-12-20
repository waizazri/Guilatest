
package Assignment1;

public class Participant {
    
    
    //Jump rope
    String equipment1,equipment2, firstname, lastname; 
    int duration1,duration2, frequency1,frequency2;
    
    Participant(){
  
        

 this.equipment1=" gym shoes(sneakers), jump rope";
 this.equipment1=" sturdy chair or couch and more";
 this.duration1=25;
 this.duration2=30;
 this.frequency1=3;
 this.frequency2=5;
    }
    
    public void Participant1(){

       System.out.println("Equipment you need to have "+equipment1);
       System.out.println("Duration you must follow "+duration1);
}
    public void Participant2(){
      
       System.out.println("Equipment you need to have "+equipment2);
       System.out.println("Duration you must follow "+duration2);
    }
    
     public void setFirstname(String newFirstname){
        firstname = newFirstname;
    }
    
     public void setLastname(String newLastname){
        lastname = newLastname;
    }
    public String getFirstname(){
        return firstname;
    }
    
    public String getLastname(){
        return lastname;
    }
}
    
  
 