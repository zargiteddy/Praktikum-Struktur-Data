import java.util.Scanner;
public class Latihan1{
	public static void main (String [] args){
		Scanner masuk = new Scanner (System.in);
		String password;
		System.out.print ("Masukkan Password : ");
			password = masuk. next ();
			if (password.equals ("AKAKOM")){
				System.out.println("Password Anda Benar");
			}else{
				System.out.println("Password Anda Salah");
			}
		}
	}