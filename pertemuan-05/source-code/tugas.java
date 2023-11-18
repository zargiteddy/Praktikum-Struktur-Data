import java.util.Scanner;
class formatBiodata {
	String nama;
	String alamat;
	int umur;
	char jekel;
	String hobi[] = new String[3];
	float ipk;
}
class tugas {
	public static int N = 0;

	public static void ngentriData(formatBiodata biodataMahasiswa[]) {
		Scanner masukan = new Scanner(System.in);
		int bacaTombol = 0;
		System.out.print("Silakan masukkan nama anda : ");
biodataMahasiswa[N].nama = masukan.next();
		System.out.print("Silakan masukkan alamat anda : ");
biodataMahasiswa[N].alamat = masukan.next();
		System.out.print("Silakan masukkan umur anda : ");
biodataMahasiswa[N].umur = masukan.nextInt();
		System.out.print("Silakan masukkan Jenis Kelamin anda : ");
		try {
			bacaTombol = System.in.read();
		} catch (java.io.IOException e) {
		}
biodataMahasiswa[N].jekel = (char) bacaTombol;
		System.out.println("Silakan masukkan hobi (maks 3) : ");
		System.out.print("hobi ke-0 : ");
biodataMahasiswa[N].hobi[0] = masukan.next();
		System.out.print("hobi ke-1 : ");
biodataMahasiswa[N].hobi[1] = masukan.next();
		System.out.print("hobi ke-2 : ");
biodataMahasiswa[N].hobi[2] = masukan.next();
		System.out.print("Silakan masukkan IPK anda : ");
biodataMahasiswa[N].ipk = masukan.nextFloat();
		System.out.println("");
		N++;
	}
//====================UNTUK MENAMPILKAN DATA=======================
	public static void tampilkanData(formatBiodata biodataMahasiswa[]) {
System.out.println("-------------------------------------------------------");
System.out.println("NO  NAMA  ALAMAT UMUR  JEKEL  HOBI[0] HOBI[1] HOBI[2]   IPK");
System.out.println("-------------------------------------------------------");
		for (int i = 0; i <= N - 1; i++) {
			System.out.print(i + ". ");
			System.out.print(biodataMahasiswa[i].nama + "\t");
	System.out.print(biodataMahasiswa[i].alamat + "\t");
	System.out.print(biodataMahasiswa[i].umur + "\t");
			System.out.print(biodataMahasiswa[i].jekel + "\t");
			System.out.print(biodataMahasiswa[i].hobi[0] + "\t");
	System.out.print(biodataMahasiswa[i].hobi[1] + "\t");
	System.out.print(biodataMahasiswa[i].hobi[2] + "\t");
			System.out.println(biodataMahasiswa[i].ipk);
		}
	System.out.println("-------------------------------------------------------");
	}

	// ------------------------------------------------------
	// --- Fungsi untuk Mengurutkan Data (Insertion) ---
	// ------------------------------------------------------
public static void mengurutkanDataInsertion(formatBiodata biodataMahasiswa[]) {
formatBiodata biodataSementara = new formatBiodata();
// untuk menentukan awal dari data sisi kanan (sisi yg masih berantakan)
		int awal;
// untuk mencari posisi yg tepat pada sisi kiri (sisi yg sudah berurutan)
		int cari;
		awal = 1;
		while (awal <= N - 1) {
			biodataSementara = biodataMahasiswa[awal];
			cari = awal - 1;
			// cari akan bergerak dari kanan (awal-1) ke kiri
			while (cari >= 0) {
// ( biodataMahasiswa[cari].nama > biodataSementara.nama )
if (biodataMahasiswa[cari].nama.compareTo(biodataSementara.nama) > 0) {
	biodataMahasiswa[cari + 1] = biodataMahasiswa[cari];
		biodataMahasiswa[cari] = biodataSementara;
			cari--; // cari digeser kekiri 1 langkah
			} else {
			biodataMahasiswa[cari + 1] = biodataSementara;
			// perintah ini untuk keluar dari loop while
			cari = -1;
			}
		}
			awal++;
	}
}
//------------------------------------------------------
//--- Fungsi untuk Mengurutkan Data (BubbleSort) ---
//------------------------------------------------------
public static void mengurutkanDataBubble(formatBiodata
biodataMahasiswa[])
{
formatBiodata biodataSementara = new formatBiodata();
int indeksTerakhir = N-1;
for (int j=0;j<=indeksTerakhir - 1; j++)
{
	for (int i=0; i<=indeksTerakhir -1 -j; i++)
	{
	// perintah dibawah ini identik dengan if (nama[i]>nama[i+1])
	if (biodataMahasiswa[i].nama.compareTo
	(biodataMahasiswa[i+1].nama) > 0)
	{ biodataSementara = biodataMahasiswa[i];
	biodataMahasiswa[i] = biodataMahasiswa[i+1];
	biodataMahasiswa[i+1] = biodataSementara;
	}}}}
//------------------------------------------------------
//--- Fungsi untuk Mengurutkan Data (Selection) ---
//------------------------------------------------------
public static void mengurutkanDataSelection(formatBiodata
biodataMahasiswa[])
{
		formatBiodata biodataSementara = new formatBiodata();
	String teksTerkecil = "";
int lokasi=0;
//bagian mengurutkan dengan teknik selection
for (int i=0; i<=N-2; i++)
{
//data pertama yang dibaca dianggap data terkecil
teksTerkecil = "zzzzzzz";
//menentukan bilangan terkecil mulai larik ke i+1 sampai N-1
for (int S=i+1; S<=N-1; S++)
{
if (biodataMahasiswa[S].nama.compareTo(teksTerkecil)<0)
{ //jika data[S] adlh bilangan terkecil, simpan di
			teksTerkecil = biodataMahasiswa[S].nama;
//mencatat posisi dimana data terkecil ada
			lokasi = S;
}
}
//membandingkan data[lokasi] yang adalah data terkecil,
// versus data[i] yang adalah ‘diagonal ke-i'
		if (biodataMahasiswa[i].nama.compareTo
(		biodataMahasiswa[lokasi].nama)>0)
{
//tukar posisi
{ 	biodataSementara = biodataMahasiswa[i];
	biodataMahasiswa[i] = biodataMahasiswa[lokasi];
	biodataMahasiswa[lokasi] = biodataSementara;
}}}}
public static void main(String[] args) {
		formatBiodata biodataMahasiswa[] = new formatBiodata[10];
for (int i = 0; i < 10; i++) {
			biodataMahasiswa[i] = new formatBiodata();
		}
Scanner masukan = new Scanner(System.in);
		String p;
char t;
		t = 't';
		int z;
while ((t != 'y') && (N < 10)) {
	System.out.println("== MENU == ");
	System.out.println("1. Insert");
			System.out.println("2. View");
			System.out.println("== PILIH MENU SORTING ==");
	System.out.println("3. Insertion Sort ");
			System.out.println("4. Bubble Sort ");
			System.out.println("5. Selection Sort ");
	System.out.println("6. Exit");
	System.out.print("Pilih : ");
			z = masukan.nextInt();
			if (z == 1) {
				ngentriData(biodataMahasiswa);
	} else if (z == 2) {
		tampilkanData(biodataMahasiswa);
	} else if (z == 3) {
		mengurutkanDataInsertion(biodataMahasiswa);
		tampilkanData(biodataMahasiswa);
	} else if (z ==4) {
		mengurutkanDataBubble(biodataMahasiswa);
		tampilkanData(biodataMahasiswa);
	} else if (z ==5) {
		mengurutkanDataSelection(biodataMahasiswa);
		tampilkanData(biodataMahasiswa);
	}else if (z == 6) {
		System.out.print("Apakah Anda Ingin Keluar ? (y/t) : ");
		p = masukan.next();
		t = p.charAt(0);
}}}}
