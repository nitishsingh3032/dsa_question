// Find the number that appears once , other number twice.
public class q1 {
    public static int find_once(int a[]){
        int n = a.length;
        int XOR = 0;
        for(int i = 0;i<n;i++){
            XOR = XOR ^ a[i];
        }
        return XOR;
    }
public static void main(String[] args) {
    int a[] = {1,1,2,3,3,4,4};
    System.out.println(find_once(a));
}
    
}
