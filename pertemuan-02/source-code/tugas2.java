import java.util.Scanner;
class formatBiodata{
String nama;
int nim,uts,uas;
}
public class tugas2{
	public static int data;
	public static void ngentriData(formatBiodata biodataMahasiswa[]){
Scanner input = new Scanner (System.in);
		int bacaTombol=0;

		for(int i =0; i<data;i++){
		System.out.println("=====Data ke-" +(i+1)+"=====");
System.out.print("Silahkan masukkan nama anda: ");
biodataMahasiswa[i].nama = input.next();
System.out.print("Silahkan masukkan NIM anda: ");
	biodataMahasiswa[i].nim = input.nextInt();
System.out.print("Silahkan masukkan nilai UTS anda: ");
	biodataMahasiswa[i].uts = input.nextInt();
System.out.print("Silahkan masukkan nilai UAS anda: ");
	biodataMahasiswa[i].uas = input.nextInt();
		System.out.println();
	}
}
public static void tampilkanData(formatBiodata biodataMahasiswa[]){

	System.out.println("==============================");
	System.out.println("\nNAMA \tNIM\t \tUTS \tUAS\n");

	System.out.println("==============================");
for (int i=0; i<data; i++)

		System.out.print(biodataMahasiswa[i].nama+"\t");
		System.out.print(biodataMahasiswa[i].nim+"\t");
		System.out.print(biodataMahasiswa[i].uas+"\t");
		System.out.print(biodataMahasiswa[i].uas+"\t");
		System.out.print(biodataMahasiswa[i].uts+"\t\n");
	}

System.out.println("==============================");
	}
public static void main (String[]args){
	String ulg="y";
	while(ulg.equals("y")){
		Scanner input = new Scanner(System.in);
		System.out.println("menu");
		System.out.print("1. Input");
		System.out.print("2. View");
		System.out.print("3. Exit");
		System.out.print("Masukkan pilihan [1/2/3]: ");
		int pilih=input.nextInt();
	if(pilih==1 || pilih==2){
		System.out.print("Masukkan jumlah data: ");
	data = input.nextInt();
		formatBiodata biodataMahasiswa[] = new formatBiodata[data];
		for(int i=0; i<data; i++)
		biodataMahasiswa[i] = new formatBiodata();
	ngentriData(biodataMahasiswa);
	tampilkanData(biodataMahasiswa);
			System.out.print("Apakah mau diulang? (y/n): ");
			ulg=input.next();
		}else{
			break;

	}
}}
}