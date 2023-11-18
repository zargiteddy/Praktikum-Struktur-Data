import java.util.Scanner;
class formatBiodata {
	String nama;
	String alamat;
	int umur;
	char jekel;
	float ipk;
	}
	class latihan {
		public static int N = 5;
//Fungsi untuk menambah data di depan
public static void tambahDataDiDepan(formatBiodata biodataMahasiswa[]) {
// bagian membuat record sementara untuk menampung data baru-------------
formatBiodata biodataMahasiswaBaru = new formatBiodata();
// bagian entri data baru ke penyimpan sementara-----------------------
Scanner masukan = new Scanner(System.in);
	int bacaTombol = 0;
	System.out.print("Silakan masukkan nama anda : ");
	biodataMahasiswaBaru.nama = masukan.next();
	System.out.print("Silakan masukkan alamat anda : ");
	biodataMahasiswaBaru.alamat = masukan.next();
	System.out.print("Silakan masukkan umur anda : ");
	biodataMahasiswaBaru.umur = masukan.nextInt();
	System.out.print("Silakan masukkan Jenis Kelamin anda : ");
	try {
		bacaTombol = System.in.read();
	    } catch (java.io.IOException e) {
	    }
	    biodataMahasiswaBaru.jekel = (char) bacaTombol;
	System.out.println("Silakan masukkan IPK anda ");
biodataMahasiswaBaru.ipk = masukan.nextFloat();

// bagian menggeser isi larik
for (int i = N - 1; i >= 0; i--) {
	biodataMahasiswa[i + 1] = biodataMahasiswa[i];
	}
// bagian memindahkan data baru ke larik ke-0
	biodataMahasiswa[0] = biodataMahasiswaBaru;
	// memperbarui banyaknya data (N)
	N++;
	}
// --- Fungsi untuk mengentri data ke dalam Larik ---
public static void ngentriData(formatBiodata biodataMahasiswa[]) {
// bagian entri data ke dalam struktur larik ----------------
	Scanner masukan = new Scanner(System.in);
		int bacaTombol = 0;
			for (int i = 0; i <= N - 1; i++) {
			System.out.print("Silakan masukkan nama anda : ");
			biodataMahasiswa[i].nama = masukan.next();
			System.out.print("Silakan masukkan alamat anda : ");
			biodataMahasiswa[i].alamat = masukan.next();
			System.out.print("Silakan masukkan umur anda : ");
		biodataMahasiswa[i].umur = masukan.nextInt();
	System.out.print("Silakan masukkan Jenis Kelamin anda : ");
try {
bacaTombol = System.in.read();
} catch (java.io.IOException e) {
}
	biodataMahasiswa[i].jekel = (char) bacaTombol;
System.out.print("Silakan masukkan IPK anda : ");
biodataMahasiswa[i].ipk = masukan.nextFloat();
	System.out.print("");
	}
}
// --- Fungsi untuk menampilkan data ---
public static void tampilkanData(formatBiodata biodataMahasiswa[]) {

// bagian menampilkan isi struktur Larik --------------------------
	System.out.println("---------------------------------------------");
	System.out.println("\tNAMA\t\tALAMAT\t\tUMUR\tJEKEL\tIPK");
System.out.println("---------------------------------------------");
for (int i = 0; i <= N - 1; i++) {
		System.out.print(i +".\t;");
		System.out.print(biodataMahasiswa[i].nama + " ");
		System.out.print(biodataMahasiswa[i].alamat + " ");
		System.out.print(biodataMahasiswa[i].umur + " ");
		System.out.print(biodataMahasiswa[i].jekel + " ");
		System.out.println(biodataMahasiswa[i].ipk);
}
System.out.println("---------------------------------------------");
}

//fungsi mencari data dengan Binary Search
public static void tampilkanDataLaki(formatBiodata biodataMahasiswa[]) {
	formatBiodata newbiodataMahasiswa[] = new formatBiodata [N];
	int last = 0;
	for (int i = 0; i <= N - 1; i++) {
		if(biodataMahasiswa[i].jekel == 'L') {
		newbiodataMahasiswa[last] = biodataMahasiswa[i];
		last++;
		}
	}
	N = last;
	System.out.print("==========MENAMPILKAN DATA LAKI-LAKI==========");
	tampilkanData(newbiodataMahasiswa);
}
// --- Program Utama ---
public static void main(String[] args) { // bagian deklarasi record berbasis LARIK -----------------------
formatBiodata biodataMahasiswa[] = new formatBiodata[11];
	biodataMahasiswa[0] = new formatBiodata();
		biodataMahasiswa[1] = new formatBiodata();
		biodataMahasiswa[2] = new formatBiodata();
		biodataMahasiswa[3] = new formatBiodata();
		biodataMahasiswa[4] = new formatBiodata();
ngentriData(biodataMahasiswa);
tampilkanData(biodataMahasiswa);
tampilkanDataLaki (biodataMahasiswa);
}
}