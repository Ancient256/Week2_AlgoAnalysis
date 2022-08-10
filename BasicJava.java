package BasicJava;



/**

 * BasicJava

 */

public class BasicJava {



  public static void main(String[] args) {

    int num[]= {145,64,34,234,32,89,12,45,123,17,900};

      BasicJava j=new BasicJava();

      System.out.println(j.isFound(num, 17));

    

  }

  

  public boolean isFound(int num[],int value){

    long start=System.nanoTime();

    boolean found=false;

    for (byte i = 0; i <num.length;){



      if(value==num[i])

      found = true;

      break;

    }

    

    long end=System.nanoTime();

    System.out.println("Processing Time\t: "+(end-start) +"units");
    System.out.println("Made By: Janmark Laurence D. Perucho");
    return found;

  }

    public int max(int num[]){

      long start=System.nanoTime();

      int high=num[0];

      

      BasicJava j=new BasicJava();

      System.out.println(j.max(num, i));

      for (int i=1; i<num.length;){

        if(max(num)==num[i])

        break;

      }

      long end=System.nanoTime();

      System.out.println("Processing Time\t: "+(end-start) +"units");
      System.out.println("Made By: Janmark Laurence D. Perucho");
      return high;

      
      // Coded by: Janmark Laurence D. Perucho
      //I don't know if this code is correct
    }

  }



