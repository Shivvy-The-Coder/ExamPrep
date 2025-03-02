package TCS_IPA;
import java.util.*;

class Antenna{
    private int antId;
    private String antName;
    private String proLead;
    private double antVSWR;

    public Antenna(int antId, String antName, String proLead, double antVSWR){
        this.antId = antId;
        this.antName = antName;
        this.proLead = proLead;
        this.antVSWR = antVSWR;
    }
    public int getAntId(){
        return antId;
    }
    public String getAntName(){
        return antName;
    }
    public String getProLead(){
        return proLead;
    }
    public double getAntVSWR(){
        return antVSWR;
    }
}
public class AntennaIPA {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Antenna[] arr = new Antenna[4];
        for(int i = 0; i < arr.length; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble(); sc.nextLine();

            arr[i] = new Antenna(a,b,c,d);
        }
        String antName = sc.nextLine();
        double antVSWR = sc.nextDouble();

        int result1 = searchAntennaByName(arr,antName);
        if(result1 > 0){
            System.out.println(result1);
        }else{
            System.out.println("There is no antenna with the given parameter");
        }

        Antenna[] result2 = sortAntennaByVSWR(arr,antVSWR);
        if(result2 != null){
            for(int i = 0; i < result2.length; i++){
                System.out.println(result2[i].getProLead());
            }
        }
        else{
            System.out.println("No Antenna found");
        }

    }
    public static int searchAntennaByName(Antenna[] arr, String antName){
        for(int i = 0; i < arr.length; i++){
            if(arr[i].getAntName().equalsIgnoreCase(antName)){
                return arr[i].getAntId();
            }
        }
        return 0;
    }

    public static Antenna[] sortAntennaByVSWR(Antenna[] arr, double antVSWR){
        Antenna[] arr2 = new Antenna[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i].getAntVSWR() < antVSWR){
                arr2 = Arrays.copyOf(arr2, arr2.length+1);
                arr2[arr2.length-1] = arr[i];
            }
        }
        for(int i = 0; i < arr2.length; i++){
            for(int j = i+1; j < arr2.length; j++){
                if(arr[i].getAntVSWR() > arr[j].getAntVSWR()){
                    Antenna temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }
        if(arr2.length > 0){
            return arr2;
        }
        else{
            return null;
        }
    }
}

// Input:
//        111
//        Reconfigurable
//        Hema
//        0.4
//        222
//        Wearable
//        Kavya
//        0.9
//        333
//        Microstrip
//        Teju
//        0.3
//        444
//        Dielectric
//        Sai
//        0.65
//        Microstrip
//        0.5

// Output:
//        333
//        Teju
//        Hema