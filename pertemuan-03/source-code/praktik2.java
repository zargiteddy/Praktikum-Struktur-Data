import java.util.Scanner;
class formatBiodata { // bagian deklarasi struktur record ---------------------------------
			String nama;
		String alamat;
		int umur;
	char jekel;
	String hobi[] = new String[3];
float ipk;
}
class praktik2 {
public static int N = 10;
// --------------------------------------------------
// --- Fungsi untuk Menambah Data Di Depan ---
// --------------------------------------------------
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
System.out.println("Silakan masukkan hobi (maks 3) : ");
System.out.print("hobi ke-0 : ");
biodataMahasiswaBaru.hobi[0] = masukan.next();
	System.out.print("hobi ke-1 : ");
		biodataMahasiswaBaru.hobi[1] = masukan.next();
		System.out.print("hobi ke-2 : ");
			biodataMahasiswaBaru.hobi[2] = masukan.next();
			System.out.print("Silakan masukkan IPK anda : ");
			biodataMahasiswaBaru.ipk = masukan.nextFloat();
// bagian menggeser isi larik mulai dari Belakang s/d 0 selangkah ke bawah
		for (int i = N - 1; i >= 0; i--) {
			biodataMahasiswa[i + 1] = biodataMahasiswa[i];
			}
// bagian memindahkan data baru ke larik ke-0-----------------------
			biodataMahasiswa[0] = biodataMahasiswaBaru;
// memperbaharui banyaknya data (N), banyaknya data bertambah satu------
			N++;
}
//--------------------------------------------------
//--- Fungsi untuk Menambah Data Di Tengah ---
//--------------------------------------------------
public static void tambahDataDiTengah(formatBiodata biodataMahasiswa[]) {
//bagian membuat record sementara untuk menampung data baru-----------
formatBiodata biodataMahasiswaBaru = new formatBiodata();
//bagian entri data baru ke penyimpan sementara-----------------------
	Scanner masukan = new Scanner(System.in);
		int bacaTombol=0;
		System.out.print("Silakan masukkan nama anda : ");
		biodataMahasiswaBaru.nama = masukan.next();
		System.out.print("Silakan masukkan alamat anda : ");
	biodataMahasiswaBaru.alamat = masukan.next();
System.out.print("Silakan masukkan umur anda : ");
	biodataMahasiswaBaru.umur = masukan.nextInt();
		System.out.print("Silakan masukkan Jenis Kelamin anda : ");
		try
{ bacaTombol = System.in.read();
}
catch(java.io.IOException e)
{
}
	biodataMahasiswaBaru.jekel = (char)bacaTombol;
		System.out.println("Silakan masukkan hobi (maks 3) : ");
		System.out.print("hobi ke-0 : ");
		biodataMahasiswaBaru.hobi[0] = masukan.next();
	System.out.print("hobi ke-1 : ");
		biodataMahasiswaBaru.hobi[1] = masukan.next();
			System.out.print("hobi ke-2 : ");
			biodataMahasiswaBaru.hobi[2] = masukan.next();
	System.out.print("Silakan masukkan IPK anda : ");
		biodataMahasiswaBaru.ipk = masukan.nextFloat();
//bagian menentukan posisi target T ----------------------------------
	int T;
	System.out.print("Pada posisi ke berapa data akan dimasukkan ? : ");
	T = masukan.nextInt();
//bagian menggeser isi larik mulai dari Belakang s/d T selangkah ke belakang
for (int i=N-1; i>= T; i--)
{
biodataMahasiswa[i+1] = biodataMahasiswa[i];
}
//bagian memindahkan data baru ke larik ke-T----------------------
biodataMahasiswa[T] = biodataMahasiswaBaru;
//memperbaharui banyaknya data (N), banyaknya data bertambah satu-------
N++;
}
// --------------------------------------------------
// --- Fungsi untuk mengentri data ke dalam Larik ---
// --------------------------------------------------
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
	System.out.println("Silakan masukkan hobi (maks 3) : ");
		System.out.print("hobi ke-0 : ");
		biodataMahasiswa[i].hobi[0] = masukan.next();
		System.out.print("hobi ke-1 : ");
		biodataMahasiswa[i].hobi[1] = masukan.next();
	System.out.print("hobi ke-2 : ");
	biodataMahasiswa[i].hobi[2] = masukan.next();
System.out.print("Silakan masukkan IPK anda : ");
		biodataMahasiswa[i].ipk = masukan.nextFloat();
}
}
// --------------------------------------------------
// --- Fungsi untuk menampilkan data ---
// --------------------------------------------------
public static void tampilkanData(formatBiodata biodataMahasiswa[]) {
// bagian menampilkan isi struktur Larik --------------------------
System.out.println("---------------------------------------------");
System.out.println("NAMA ALAMAT UMUR JEKEL HOBI1 HOBI2 HOBI3 IPK");
System.out.println("---------------------------------------------");
for (int i = 0; i <= N - 1; i++) {
	System.out.print(biodataMahasiswa[i].nama + " ");
	System.out.print(biodataMahasiswa[i].alamat + " ");
	System.out.print(biodataMahasiswa[i].umur + " ");
	System.out.print(biodataMahasiswa[i].jekel + " ");
	System.out.print(biodataMahasiswa[i].hobi[0] + " ");
	System.out.print(biodataMahasiswa[i].hobi[1] + " ");
	System.out.print(biodataMahasiswa[i].hobi[2] + " ");
	System.out.println(biodataMahasiswa[i].ipk);
}
System.out.println("---------------------------------------------");
}
// --------------------------------------------------
// --- Program Utama ---
// --------------------------------------------------
public static void main(String[] args) { // bagian deklarasi record berbasis LARIK -----------------------
formatBiodata biodataMahasiswa[] = new formatBiodata[12];
	biodataMahasiswa[0] = new formatBiodata();
	biodataMahasiswa[1] = new formatBiodata();
	biodataMahasiswa[2] = new formatBiodata();
	biodataMahasiswa[3] = new formatBiodata();
	biodataMahasiswa[4] = new formatBiodata();
	biodataMahasiswa[5] = new formatBiodata();
	biodataMahasiswa[6] = new formatBiodata();
	biodataMahasiswa[7] = new formatBiodata();
	biodataMahasiswa[8] = new formatBiodata();
	biodataMahasiswa[9] = new formatBiodata();
	biodataMahasiswa[10] = new formatBiodata();
	biodataMahasiswa[11] = new formatBiodata();
	ngentriData(biodataMahasiswa);
tampilkanData(biodataMahasiswa);
// potongan progran 3.1
tambahDataDiDepan(biodataMahasiswa);
tampilkanData(biodataMahasiswa);
// potongan progran 3.2
tambahDataDiTengah(biodataMahasiswa);
tampilkanData(biodataMahasiswa);
}
}