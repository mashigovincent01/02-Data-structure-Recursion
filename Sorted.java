public class Sorted{
    int[] A;
    public Sorted(int[] A){
        this.A = A;
    }

    public boolean sorted(int i){
        if(i == A.length-1){
            return true;
        }
        else{
            if(A[i] > A[i+1]) return false;
            else{
                return sorted(i+1);
            }
        }
    }

    public static void main(String[] args){
        int[] B = {10, 15, 30, 10};
        Sorted arr = new Sorted(B);
        System.out.println(arr.sorted(0));
    }
}