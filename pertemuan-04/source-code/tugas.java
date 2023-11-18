import java.util.Scanner;
	//bagian deklarasi struktur record
class formatBiodata {
	String nama;
	String alamat;
	int umur;
	char jekel;
	float ipk;
	}
	class tugas {
		public static int N = 5;
//bagian entri data ke dalam struktur larik
static void ngentriData (formatBiodata biodataMahasiswa[]) {
	Scanner masukan = new Scanner (System.in);
	int bacaTombol = 0;
for (int i=0; i<=N-1; i++){
	System.out.print("Silakan masukkan nama anda : ");
	biodataMahasiswa[i].nama = masukan.next();
	System.out.print("Silakan masukkan alamat anda : ");
	biodataMahasiswa[i].alamat = masukan.next();
	System.out.print("Silakan masukkan umur anda : ");
	biodataMahasiswa[i].umur = masukan.nextInt();
	System.out.print("Silakan masukkan Jenis Kelamin anda : ");
	try {
		bacaTombol = System.in.read();
	    }
	    catch (java.io.IOException e)
	    {
	    }
	    biodataMahasiswa[i].jekel = (char) bacaTombol;
	System.out.print("Silakan masukkan IPK anda : ");
biodataMahasiswa[i].ipk = masukan.nextFloat();
	System.out.println("");
	}
}
//--- Fungsi untuk Mencari Data Secara Linear Search (Loop: For) ---
public static void mencariDanHapusDataLinear(formatBiodata biodataMahasiswa[]){
String kataKunci;
	int lokasi=-1;
	boolean statusKetemu=false;
	//bagian memasukkan kata kunci ------------------------------------------
Scanner masukan = new Scanner(System.in);
System.out.print("Masukkan kata kunci pencarian : ");
kataKunci = masukan.next();
//bagian mencari data satu persatu urut dari larik terdepan
for (int i=0; i<= N-1; i++){
//mencocokkan biodataMahasiswa[i].nama == kataKunci
	if (biodataMahasiswa[i].nama.equals(kataKunci)){
	statusKetemu = true;
	lokasi = i;
	break;
	}
}
if (statusKetemu == true)
{ System.out.println("Data yang anda cari KETEMU di larik ke :"+ lokasi);}
// menghapus data yang ketemu
for (int i = lokasi; i <= N - 2; i++) {
  biodataMahasiswa[i] = biodataMahasiswa[i + 1];
}
System.out.println("Proses menghapus data ke-" + lokasi + "selesai");
if (statusKetemu == true)
{ System.out.println("Data yang anda cari KETEMU di larik ke :"+ lokasi);
// memperbarui banyaknya data(N)
N--;
	}else{
	System.out.println("maap, nama yang anda cari tidak ditemukan");
	}
}
//--- Fungsi untuk Mencari Data Secara Binary Search dan Hapus ---
	public static void mencariDanHapusDataBiner(formatBiodata biodataMahasiswa[])
	{ String kataKunci;
	int lokasi=-1;
	boolean statusKetemu=false;
	//bagian memasukkan kata kunci ------------------------------------------
	Scanner masukan = new Scanner(System.in);
	System.out.print("Masukkan kata kunci pencarian : ");
kataKunci = masukan.next();
//bagian mencari data satu persatu urut dari larik terdepan
int atas,bawah,tengah;
atas = 0;
bawah = N-1;
tengah = (atas + bawah) / 2;
while ((statusKetemu == false) && (bawah-atas!=1)){
	System.out.println(biodataMahasiswa[tengah].nama+" <---> "+kataKunci );
	//jika kataKunci < biodataMahasiswa[tengah].nama)
if (kataKunci.compareTo(biodataMahasiswa[tengah].nama) < 0)
{ bawah = tengah;
tengah = (atas + bawah) / 2;
}
	//jika kataKunci > biodataMahasiswa[tengah].nama)
else if (kataKunci.compareTo(biodataMahasiswa[tengah].nama) > 0)
{ atas = tengah;
tengah = (atas + bawah) / 2;
} else{
	statusKetemu = true;
	lokasi = tengah;
}
}
	if (statusKetemu == true)
{ System.out.println("Data yang anda cari KETEMU di larik ke :"+ lokasi);
	//menghapus data yang ketemmu
	for (int i = lokasi; i <= N - 2; i++) {
	biodataMahasiswa[i] = biodataMahasiswa [i + 1];
	}
	System.out.println("Proses menghapus data ke-" + lokasi + "selesai");

	// memperbarui banyaknya data(N)
	N--;
} else {
System.out.println("maap, nama yang anda cari tidak ditemukan ");
	}
}
// --- Fungsi untuk menampilkan data ---
public static void tampilkanData(formatBiodata biodataMahasiswa[]) {
	System.out.println("---------------------------------------------");
	System.out.println("\tNAMA\t\tALAMAT\t\tUMUR\tJEKEL\tIPK");
System.out.println("---------------------------------------------");
for (int i = 0; i <= N - 1; i++) {
	System.out.print(i + ".\t");
		System.out.print(biodataMahasiswa[i].nama + " ");
		System.out.print(biodataMahasiswa[i].alamat + " ");
		System.out.print(biodataMahasiswa[i].umur + " ");
		System.out.print(biodataMahasiswa[i].jekel + " ");
		System.out.println(biodataMahasiswa[i].ipk);
}
System.out.println("---------------------------------------------");
}
// --- Program Utama ---
public static void main(String[] args) {
formatBiodata biodataMahasiswa[] = new formatBiodata [5];
		biodataMahasiswa[0] = new formatBiodata();
		biodataMahasiswa[1] = new formatBiodata();
		biodataMahasiswa[2] = new formatBiodata();
		biodataMahasiswa[3] = new formatBiodata();
		biodataMahasiswa[4] = new formatBiodata();
ngentriData(biodataMahasiswa);
tampilkanData(biodataMahasiswa);
//mencari data secara linear
mencariDanHapusDataLinear (biodataMahasiswa);
tampilkanData(biodataMahasiswa);
//mencari data secara biner
mencariDanHapusDataBiner (biodataMahasiswa);
tampilkanData(biodataMahasiswa);
}
}