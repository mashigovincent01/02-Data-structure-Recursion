public class TowersOfHanoi{
    public static void main(String[] args){

    }
}

public static void towersOfHanoi(int n, char frompeg, char topeg, char auxpeg){
    //If only 1 disk, make
    if(n == 1){
        System.out.println("Move disk 1 from peg " + frompeg + " to peg " + topeg);
        return;
    }

    //Move top n-1 disks from A to B, using C as auxilary
    towersOfHanoi(n-1, frompeg, auxpeg, topeg);

    //MOve remaining disks from A to C
    System.out.println("Move  disk from peg " + frompeg + "to peg " + topeg);

    //Move n-1 disks from B to C using A as auxilary
    towersOfHanoi(n-1, auxpeg, topeg, frompeg);
}