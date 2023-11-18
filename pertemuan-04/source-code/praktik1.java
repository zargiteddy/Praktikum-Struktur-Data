import java.util.Scanner;
class formatBiodata1 {
// bagian deklarasi struktur record
	String nama;
	String alamat;
	int umur;
	char jekel;
	String hobi[] = new String[3];
	float ipk;
}

class praktik1 {
	public static int N =5;
public static void isiData (formatBiodata1 biodataMahasiswa[]){
		float nilai = 0;
		for(int i = 0; i < N; i++){
		nilai = i / 10f;
		biodataMahasiswa[i].nama = "nama" + i;
		biodataMahasiswa[i].alamat = "alamat" + i;
		biodataMahasiswa[i].umur = 19 + i;
		if ((i%2) !=0){
			biodataMahasiswa[i].jekel = 'L';
		}else{
			biodataMahasiswa[i].jekel = 'P';
		}
		for(int j = 0; j < 3; j++){
			biodataMahasiswa[i].hobi[j] = "hobi" + j;
		}
		biodataMahasiswa[i].ipk = 3f + nilai;
	}
}
// fungsi untuk mengentri data ke dalam larik
public static void ngentriData(formatBiodata1 biodataMahasiswa[]){
// bagian entri data ke dalam struktur larik
Scanner masukan = new Scanner(System.in);
int bacaTombol = 0;
for (int i = 0; i <= N - 1; i++) {
	System.out.print("Silakan masukkan nama anda : ");
	biodataMahasiswa[i].nama = masukan.next();
	System.out.print("Silakan masukkan alamat anda : ");
	biodataMahasiswa[i].alamat = masukan.next();
	System.out.print("Silakan masukkan umur anda : ");
	biodataMahasiswa[i].umur = masukan.nextInt();
	System.out.print("Silakan masukkan jenis kelamin anda : ");
	try{
	   bacaTombol = System.in.read();
	}catch(java.io.IOException e) {
	}
	biodataMahasiswa[i].jekel = (char) bacaTombol;
	System.out.print("Silakan masukkan hobi (maks 3) : ");
	System.out.print("hobi ke-0 : ");
	biodataMahasiswa[i].hobi[0] = masukan.next();
	System.out.print("hobi ke-1 : ");
	biodataMahasiswa[i].hobi[1] = masukan.next();
	System.out.print("hobi ke-2 : ");
	biodataMahasiswa[i].hobi[2] = masukan.next();
	System.out.print("Silakan masukkan IPK anda : ");
	biodataMahasiswa[i].ipk = masukan.nextFloat();
	System.out.println();
	}
}
// fungsi untuk menambah data di depan
public static void tambahDataDiDepan(formatBiodata1 biodataMahasiswa[]) {
// bagian membuat record sementara untuk menampung data baru
formatBiodata1 biodataMahasiswaBaru = new formatBiodata1 ();
// bagian entri data baru ke penyimpan sementara
Scanner masukan = new Scanner(System.in);
int bacaTombol = 0;
	System.out.print("Silakan masukkan nama anda : ");
	biodataMahasiswaBaru.nama = masukan.next();
	System.out.print("Silakan masukkan alamat anda : ");
	biodataMahasiswaBaru.alamat = masukan.next();
	System.out.print("Silakan masukkan umur anda : ");
	biodataMahasiswaBaru.umur = masukan.nextInt();
	System.out.print("Silakan masukkan jenis kelamin anda : ");
	try {
	    bacaTombol = System.in.read();
	} catch (java.io.IOException e) {
	}
	biodataMahasiswaBaru.jekel = (char) bacaTombol;
	System.out.println("Silakan masukkan hobi (max 3) : ");
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
	// bagian memindahkan data baru ke larik ke 0
	biodataMahasiswa[0] = biodataMahasiswaBaru;
//memperbarui banyaknya data (N)
N++;
}
//fungsi untuk menambah data di tengah
public static void tambahDataDiTengah(formatBiodata1 biodataMahasiswa[]){
	// bagian membuat record sementara untuk menampung data baru
	formatBiodata1 biodataMahasiswaBaru = new formatBiodata1();
	//bagian entri data baru ke penyimpan sementara
	Scanner masukan = new Scanner(System.in);
	int bacaTombol = 0;
	System.out.print("Silakan masukkan nama anda : ");
	biodataMahasiswaBaru.nama = masukan.next();
	System.out.print("Silakan masukkan alamat anda : ");
	biodataMahasiswaBaru.alamat = masukan.next();
	System.out.print("Silakan masukkan umur anda : ");
	biodataMahasiswaBaru.umur = masukan.nextInt();
	System.out.print("Silakan masukkan jenis kelamin anda : ");
	try{
	   bacaTombol = System.in.read();
	} catch (java.io.IOException e) {

	}
	biodataMahasiswaBaru.jekel = (char) bacaTombol;
	System.out.println("Silakan masukkan hobi (max 3) : ");
	System.out.print("hobi ke-0 : ");
	biodataMahasiswaBaru.hobi[0] = masukan.next();
	System.out.print("hobi ke-1 : ");
	biodataMahasiswaBaru.hobi[1] = masukan.next();
	System.out.print("hobi ke-2 : ");
	biodataMahasiswaBaru.hobi[2] = masukan.next();
	System.out.print("Silakan masukkan IPK anda : ");
	biodataMahasiswaBaru.ipk = masukan.nextFloat();
	// bagian menentukan posisi target T
	int T;
	System.out.print("Pada posisi ke berapa data akan dimasukkan? ");
	T = masukan.nextInt();
	T--;
// bagian menggeser isi larik
	for (int i = N - 1; i >= T; i--) {
		biodataMahasiswa[i + 1] = biodataMahasiswa[i];
		}
		// memindahkan data baru ke larik ke-T
		biodataMahasiswa[T] = biodataMahasiswaBaru;
		//memperbarui banyaknya data (N)
		N++;
	}
	// fungsi untuk menambah data di belakang
	public static void tambahDataDiBelakang(formatBiodata1 biodataMahasiswa[]) {
	// fungsi membuat record sementara
	formatBiodata1 biodataMahasiswaBaru = new formatBiodata1();
	// bagian entri data baru ke penyimpan sementara
	Scanner masukan = new Scanner(System.in);
		int bacaTombol = 0;
		System.out.print("Silakan masukkan nama anda : ");
		biodataMahasiswaBaru.nama = masukan.next();
		System.out.print("Silakan masukkan alamat anda : ");
		biodataMahasiswaBaru.alamat = masukan.next();
		System.out.print("Silakan masukkan umur anda : ");
		biodataMahasiswaBaru.umur = masukan.nextInt();
		System.out.print("Silakan masukkan jenis kelamin anda : ");
		try {
		    bacaTombol = System.in.read();
		} catch (java.io.IOException e) {
		}
		biodataMahasiswaBaru.jekel = (char) bacaTombol;
	System.out.println("Silakan masukkan hobi (max 3) : ");
		System.out.print("hobi ke-0 : ");
		biodataMahasiswaBaru.hobi[0] = masukan.next();
		System.out.print("hobi ke-1 : ");
		biodataMahasiswaBaru.hobi[1] = masukan.next();
		System.out.print("hobi ke-2 : ");
		biodataMahasiswaBaru.hobi[2] = masukan.next();
		System.out.print("Silakan masukkan IPK anda : ");
	biodataMahasiswaBaru.ipk = masukan.nextFloat();
	// bagian memindahkan data baru ke larik ke-N
	biodataMahasiswa [N] = biodataMahasiswaBaru;
	// memperbarui banyaknya (N)
	N++;
	}
	// fungsi untuk menghapus data di depan
public static void hapusDataDiDepan(formatBiodata1 biodataMahasiswa[]) {
// bagian menggeser isi larik
for (int i = 0; i <= N - 2; i++) {
	biodataMahasiswa[i] = biodataMahasiswa [ i + 1 ];
}
System.out.println("Proses menghapus data ke-0 selesai");
//memperbarui banyaknya data (N)
N--;
}

//---------------
//-- Fungsi untuk menghapus data di tengah
public static void hapusDataDiTengah(formatBiodata1 biodataMahasiswa[]){
//bagian menentukan posisi target T
	Scanner masukan = new Scanner (System.in);
	int T;
	System.out.print("Tuliskan posisi data yang akan dihapus : ");
	T = masukan.nextInt();
	T--;
	// bagian menggeser isi larik mulai dari T
	for (int i = T; i <= N - 2; i++) {
		biodataMahasiswa[i] = biodataMahasiswa[i + 1];
	}
System.out.println("Proses menghapus data ke-" + T + " selesai ");
// memperbarui banyaknya data (N)
N--;
}
// fungsi untuk menghapus data di belakang ---
public static void hapusDataDiBelakang(formatBiodata1 biodataMahasiswa[]) {
	System.out.println("Proses menghapus data terakhir selesai");
//memperbarui banyaknya data (N)
N--;
}
// fungsi untuk menukar data
public static void tukarData (formatBiodata1 biodataMahasiswa[])  {
	Scanner masukan = new Scanner (System.in);
	formatBiodata1 tmpBiodata = new formatBiodata1 ();
	System.out.print("Tukar baris ini: ");
	int T = masukan.nextInt();
	System.out.print("Dengan baris ini: ");
	int T2 = masukan.nextInt();
	T--;
	T2--;
	tmpBiodata = biodataMahasiswa[T];
	biodataMahasiswa[T] = biodataMahasiswa [T2];
	biodataMahasiswa[T2] = tmpBiodata;
}
//fungsi untuk mengedit data
public static void editData(formatBiodata1 biodataMahasiswa[]) {
	Scanner masukan = new Scanner(System.in);
	formatBiodata1 tmpBiodata = new formatBiodata1();
	System.out.print("Baris data yang dirubah: ");
	int T = masukan.nextInt();
	T--;
	int bacaTombol = 0;
System.out.print("Silakan masukkan nama anda : ");
	tmpBiodata.nama = masukan.next();
	System.out.print("Silakan masukkan alamat anda : ");
	tmpBiodata.alamat = masukan.next();
	System.out.print("Silakan masukkan umur anda : ");
	tmpBiodata.umur = masukan.nextInt();
	System.out.print("Silakan masukkan jenis kelamin anda : ");
	try {
	    bacaTombol = System.in.read();
	} catch (java.io.IOException e) {
	}
tmpBiodata.jekel = (char) bacaTombol;
System.out.println("Silakan masukkan hobi (max 3) : ");
	System.out.print("hobi ke-0 : ");
		tmpBiodata.hobi[0] = masukan.next();
		System.out.print("hobi ke-1 : ");
		tmpBiodata.hobi[1] = masukan.next();
		System.out.print("hobi ke-2 : ");
		tmpBiodata.hobi[2] = masukan.next();
		System.out.print("Silakan masukkan IPK anda : ");
	tmpBiodata.ipk = masukan.nextFloat();
	biodataMahasiswa[T]=tmpBiodata;
	}
//--- Fungsi untuk Mencari Data Secara Linear Search (Loop: While)---
//--------------------------------------------------------------------
public static void cariDataLinear (formatBiodata1 biodataMahasiswa[])
{
	Scanner masukan = new Scanner(System.in);
	//bagian memasukkan kata kunci ------------------------------------------
	System.out.print("Silakan masukkan kataKunci data yang anda cari :");
	String kataKunci = masukan.next();
	boolean statusKetemu = false;
	int lokasiKetemu = -1;
	//bagian mencari data satu persatu urut dari larik terdepan
int i = 0;
while ((i<=N-1) && (statusKetemu==false))
{
//mencocokkan biodataMahasiswa[i].nama == kataKunci
if (kataKunci.equals(biodataMahasiswa[i].nama))
	{
	statusKetemu = true;
	lokasiKetemu = i;
	}
	i++;
	}
	System.out.println("Status Ketemu: "+statusKetemu+" di posisi ke " + lokasiKetemu);
}

//------------------------------------------------------------------
//--- Fungsi untuk Mencari Data Secara Linear Search (Loop: For) ---
//------------------------------------------------------------------
public static void mencariDataLinear(formatBiodata1 biodataMahasiswa[])
{ String kataKunci;
	int lokasi=-1;
	boolean statusKetemu=false;
	//bagian memasukkan kata kunci ------------------------------------------
Scanner masukan = new Scanner(System.in);
System.out.print("Masukkan kata kunci pencarian : ");
kataKunci = masukan.next();
//bagian mencari data satu persatu urut dari larik terdepan
for (int i=0; i<= N-1; i++)
{
	//mencocokkan biodataMahasiswa[i].nama == kataKunci
	if (biodataMahasiswa[i].nama.equals(kataKunci))
	{ statusKetemu = true;
	lokasi = i;
break;
}
}
if (statusKetemu == true)
{ System.out.println("Data yang anda cari KETEMU di larik ke :"+ lokasi);
}
	else
	{ System.out.println("maap, nama yang anda cari tidak ditemukan");
	}
	}
// --------------------------------------------------
// --- Fungsi untuk menampilkan data ---
// --------------------------------------------------
public static void tampilkanData(formatBiodata1 biodataMahasiswa[]) {
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
public static void main(String[] args) {
// bagian deklarasi record berbasis LARIK -----------------------
Scanner in = new Scanner (System.in);
formatBiodata1 biodataMahasiswa[] = new formatBiodata1 [10];
	biodataMahasiswa[0] = new formatBiodata1();
		biodataMahasiswa[1] = new formatBiodata1();
		biodataMahasiswa[2] = new formatBiodata1();
		biodataMahasiswa[3] = new formatBiodata1();
		biodataMahasiswa[4] = new formatBiodata1();
isiData(biodataMahasiswa);
tampilkanData(biodataMahasiswa);
int jawab = 0;
do {
	System.out.println ("Menu: ");
	System.out.printf("1.Input\n 2.View\n 3.Delete\n 4.Swap\n 5.Edit\n 6.Search\n 7.Exit\n");
	System.out.print("(1/2/3/4/5/6/7): ");
	jawab = in.nextInt();
	switch (jawab) {
		case 1:
		System.out.println("Menu:");
		System.out.printf("1.Depan\n 2.Tengah\n 3.Belakang\n");
		System.out.print("(1/2/3): ");
		int jawab2 = in.nextInt();
		switch (jawab2) {
			case 1:
				tambahDataDiDepan(biodataMahasiswa);
				break;
			case 2:
				tambahDataDiTengah(biodataMahasiswa);
				break;
			case 3: tambahDataDiBelakang(biodataMahasiswa);
			break;
		}
		break;

		case 2:
		tampilkanData(biodataMahasiswa);
			break;

		case 3:
		System.out.println("Menu:");
			System.out.printf("1.Depan\n 2.Tengah\n 3.Belakang\n");
			System.out.print("(1/2/3): ");
			jawab = in.nextInt();
			switch (jawab) {
			case 1:
				hapusDataDiDepan(biodataMahasiswa);
				break;
			case 2:
				hapusDataDiTengah(biodataMahasiswa);
				break;
			case 3:
				hapusDataDiBelakang(biodataMahasiswa);
				break;
			}
			break;

		case 4:
			tukarData(biodataMahasiswa);
			break;

		case 5:
			editData(biodataMahasiswa);
			break;

		case 6:
			System.out.println("Menu:");
			System.out.printf("1.Cari menggunakan while\n 2. cari menggunakan for\n");
			System.out.print("(1/2): ");
			jawab = in.nextInt();
			switch(jawab) {
			 	case 1:
			 		cariDataLinear(biodataMahasiswa);
			 		break;
			 	case 2:
			 		mencariDataLinear(biodataMahasiswa);
			 		break;
			 	}
			 	break;

			 default:
			 	break;
			 }
		} while (jawab != 7);
	}
}

