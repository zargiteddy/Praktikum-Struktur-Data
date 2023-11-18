import java.util.LinkedList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class JavaLinkedList {

	private static LinkedList<String> dataStorage = new LinkedList<String>();

	private static Scanner extracted() {
		return new Scanner(System.in);
	}

	private static void displayData(){
		System.out.println("\nData dalam List: " + dataStorage);
		System.out.println("Total Data     : " + dataStorage.size());
	}

	private static void addDataToFirst() {
		System.out.print("Masukkan Data: ");
		String tempData = extracted().nextLine();
		dataStorage.addFirst(tempData);
		displayData();
	}

	private static void addDataToLast() {
		System.out.print("Masukkan Data: ");
		String tempData = extracted().nextLine();
		dataStorage.addLast(tempData);
		displayData();
	}

	private static void addDataAtLocation() {
		boolean status = true;
		int indexData = 0;
		displayData();
		while(status) {
System.out.print("Pilih Index Data yang ingin disisipi data: [0-" +
			(dataStorage.size() - 1) + "]: ");
			try {
				status = false;
				indexData = extracted().nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("Data harus berupa Angka!");
				status = true;
			}
		}
System.out.print("Data yang ingin disisipkan pada index data ke- "
		+ indexData + ": ");
		String tempData = extracted().nextLine();
		dataStorage.add(indexData, tempData);
		displayData();
	}

	private static boolean searchData(String data) {
		return dataStorage.contains(data);
	}

	private static void removeData() {
		boolean status = true;
		int indexData = 0;
		displayData();
		while(status) {
System.out.print("Pilih Index Data yang ingin dihapus: [0-" +
			(dataStorage.size() - 1) + "]: ");
			try {
				status = false;
				indexData = extracted().nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("Data harus berupa Angka!");
				status = true;
			}
		}
		dataStorage.remove(indexData);
		displayData();
	}

	private static void programExit() {
		System.exit(0);
	}

	private static void programTitle() {
		System.out.println("\nProgram Single Linked List"
				         + "\nDitulis dalam bahasa pemrograman Java"
				         + "\n==============Oleh:=============="
				         + "\nNama: Raden Isnawan Argi Aryasatya"
				         + "\nNIM: 195410257"
				         + "\n==========selamat datang==========");
	}

	private static void programSwitcher() {
		boolean status = true;
		int indexMenu = 0;
		while(status) {
			try {
				status = false;
				System.out.print("Pilih Menu [1-6]: ");
				indexMenu = extracted().nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("Masukan harus berupa Angka!");
				status = true;
			}
		}

		switch(indexMenu) {
			case 1: addDataToFirst(); break;
			case 2: addDataToLast(); break;
			case 3: addDataAtLocation(); break;
			case 4: removeData(); break;
			case 5: programTitle(); break;
			case 6: programExit(); break;
		}
		programMenu();
	}

	private static void programMenu() {
		System.out.println("\n.: PROGRAM MENYIMPAN DATA MATA KULIAH :."
				         + "\n 1. Tambah Data di Awal"
				         + "\n 2. Tambah Data di Akhir"
				         + "\n 3. Tambah Data di N Index"
				         + "\n 4. Hapus Data di N Index"
				         + "\n 5. Tentang Program"
				         + "\n 6. Program Exit");
		programSwitcher();
	}

	public static void main(String[] args) {
		programTitle();
		programMenu();
	}
}