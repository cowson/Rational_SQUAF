public class Stats{
    private static int GCF;
    private static int GCFR;
    public static int GCD(int a, int b){ //base case will be when GCF 1 b/c everyt int is divisible by 1 
	if (GCF == 0){
	    if (a >= b)
		GCF = b;
	    else
		GCF = a;
	}else if (((a % GCF) == 0) && ((b % GCF) == 0)){
	    GCFR = GCF;
	    GCF = 0;
	    return GCFR;
	}else
	    GCF -= 1; return GCD(a, b);
    }
    public static void  main(String[] args){
	System.out.println(GCD(42, 84));
	System.out.println(GCD(10, 10));
    }
}
	   
