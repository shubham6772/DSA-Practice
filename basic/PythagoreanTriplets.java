import java.util.*;

public class PythagoreanTriplets{
    
    public static void triplets(int x, int y, int z){
        int temp = x*x + y*y;
        if(z == Math.sqrt(temp)){
            System.out.println("Yes " + x + " " +  y + " " +  z + " are PGT Triplet");
        }
        else{
            System.out.println("No "  + x + " " +  y + " " +  z + " are not PGT Triplet");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base Value");
        int x = sc.nextInt();
        System.out.println("Enter the height Value");
        int y = sc.nextInt();
        System.out.println("Enter the Hypotaneous Value");
        int z = sc.nextInt();

        triplets(x,y,z);
        sc.close();

    }
}
