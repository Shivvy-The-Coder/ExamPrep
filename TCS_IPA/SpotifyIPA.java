package TCS_IPA;
import java.util.*;

class Spotify{
    private int sId;
    private String pName;
    private String sType;
    private double sPrice;
    private String gsAvail;

    public Spotify(int sId, String pName, String sType, double sPrice, String gsAvail) {
        this.sId = sId;
        this.pName = pName;
        this.sType = sType;
        this.sPrice = sPrice;
        this.gsAvail = gsAvail;
    }

    public int getsId() {
        return sId;
    }

    public String getpName() {
        return pName;
    }

    public String getsType() {
        return sType;
    }

    public double getsPrice() {
        return sPrice;
    }

    public String getGsAvail() {
        return gsAvail;
    }
}


public class SpotifyIPA {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Spotify[] arr = new Spotify[4];
        for(int i = 0; i < arr.length; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble(); sc.nextLine();
            String e = sc.nextLine();

            arr[i] = new Spotify(a,b,c,d,e);
        }
        String sType = sc.nextLine();
        String gs = sc.nextLine();

        double result = findAvgPriceBySubsType(arr,sType,gs);
        if(result > 0){
            System.out.println(result);
        }
        else{
            System.out.println("Nothing matches");
        }
    }

    public static double findAvgPriceBySubsType(Spotify[] arr, String sType, String gs){
        double sum = 0, count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i].getsType().equalsIgnoreCase(sType) && arr[i].getGsAvail().equalsIgnoreCase(gs)){
                sum += arr[i].getsPrice();
                count++;
            }
        }
        if(count > 0){
            double avg = sum/count;
            return avg;
        } else{
            return 0.0;
        }
    }
}
