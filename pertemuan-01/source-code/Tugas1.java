import java.util.Scanner;
public class Tugas1{
	public static void main (String [] args){
	Scanner input = new Scanner (System.in);
		String b;
		String nama [] = new String [5];
		String alamat [] = new String [5];
		String umur [] = new String [5];
		String jk [] = new String [5];
		String hobi [] = new String [3];
		float ipk [] = new float [5];
	int a;
	System.out.print ("Masukkan banyak data= ");
	a = input.nextInt();
	b = input.nextLine();
	for (int i=0; i<a; i++){
	System.out.println("Masukkan data ke "+(i+1)+":");
	System.out.print ("Masukkan nama = ");
		nama[i]=input.next();
			System.out.print ("Masukkan alamat = ");
				alamat[i]=input.next();
				System.out.print ("Masukkan umur = ");
					umur[i]=input.next();
					System.out.print ("Masukkan jenis kelamin = ");
					jk[i]=input.next();
				System.out.print ("Masukkan hobi ke-1 = ");
			hobi[0]=input.next();
		System.out.print ("Masukkan hobi ke-2 = ");
		hobi[1]=input.next();
		System.out.print ("Masukkan hobi ke-3 = ");
	hobi[2]=input.next();
	System.out.print ("Masukkan IPK = ");
	ipk[i] = input.nextFloat();
	System.out.print(" ");
}
System.out.println("-------------------------------");
for (int i=0; i<a; i++){
	System.out.println("Data ke = "+(i+1));
	System.out.println("nama = "+nama[i]);
	System.out.println("alamat = "+alamat[i]);
	System.out.println("umur = "+umur[i]);
	System.out.println("jenis kelamin = "+jk[i]);
	System.out.println("hobi ke-1 = "+hobi[0]);
	System.out.println("hobi ke-2 = "+hobi[1]);
	System.out.println("hobi ke-3 = "+hobi[2]);
	System.out.println("IPK = "+ipk[i]);
	System.out.println(" ");
}}}