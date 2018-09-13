package Job07;
import java.util.Scanner;
import java.math.BigInteger;
public class jobskeet07 {
    private static void tampilJudul(String identitas)
    {
        System.out.println("Identitias : " + identitas);
        
        System.out.println("\nHitung Fibonacci");
        System.out.println("1, 1, 2, 3, 5, 8, 13, 21,...dat.\n");
    }
    private static int tampilInput() {
        Scanner baca = new Scanner(System.in);
        
        System.out.println("bilangan ke- : ");
        int n = baca.nextInt();
        
        return n;
    }
    private static BigInteger fibo(int n )
    {
        BigInteger[] hasil = new BigInteger[n];
        
        hasil[0] = BigInteger.ONE;
        hasil[1] = BigInteger.ONE;
        
        for (int i = 2; i < n; i++)
        {
            hasil[i]= hasil[i-1].add(hasil[i-2]);
        }
        return hasil[n-1];
    }
    private static void tampilHasil(int n, BigInteger hasil)
    {
        System.out.println("Bilangan Fibonacci ke-" + n + " : " + hasil );
    }
     public static void main(String[] args)
    {    
        String identitas = "MUHAMMAD FACHRI AFIF/X RPL 2 / 22";
        tampilJudul(identitas);
        int n = tampilInput();
        BigInteger hasil = fibo(n);
        tampilHasil(n, hasil);
    }
}
