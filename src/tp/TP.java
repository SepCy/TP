
package tp;


    

public class TP {
    
    double x;
    double y;

   
    
    
    public double getX(){
       return x;
   }
   public double getY(){
       return y;
   }
   public void setX(double a){
       x=a;
   }
   public void setY(double b){
       x=b;

   }
   
   
   
   
       
    

   

//Affichage de coordonnées 
    public void  afficheCoordonnees(){
        System.out.println("abscisse " + x);
        System.out.println("ordonnee " + y);
       
    }
   
//Calcul de Distance
    public void calculDistance(){
       System.out.println("La distance est " + Math.sqrt(x*x + y*y)); 
    }
    


//Translation
 public void translation(double dx,double dy){
      double  a = x + dx;
      double  b= y + dy;
    
      System.out.println("abscisse " + a);
      System.out.println("abscisse " + b);
      
         
        
}   
    
        


    public static void main(String[] args) {
        
        
     TP p = new TP();
     p.x = 2;
     p.y = 3;
     p.afficheCoordonnees();
     
     TP cal = new TP();
     cal.x=3;
     cal.y=2;
     
     cal.calculDistance();
     
     TP tr = new TP();
     tr.x=3;
     tr.y=4;
     tr.translation(5, 4);
     
     
    }
    
}
