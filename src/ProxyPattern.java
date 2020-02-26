
public class ProxyPattern {
	
   public static void main(String[] args) {
      Image image = new ProxyImage("test_15mb.jpg");

      image.display(); 
      System.out.println("");
      
      image.display(); 	
   }
}