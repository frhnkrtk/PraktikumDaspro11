import java.util.Scanner;
public class StudiKasus211 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama, jenisKegiatan;
        int jumlahDokumen, peringkatJuara, statusPKM;
        
        System.out.print("Masukkan nama mahasiswa: ");
        nama = input.nextLine();
        System.out.print("Masukkan jenis kegiatan (BELMAWA / BAKORMA / MANDIRI / PKM / Lainnya): ");
        jenisKegiatan = input.nextLine();
        System.out.print("Masukkan jumlah dokumen yang diupload (0-4): ");
        jumlahDokumen = input.nextInt();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || 
            jenisKegiatan.equalsIgnoreCase("BAKORMA") || 
            jenisKegiatan.equalsIgnoreCase("Mandiri")) {
                 
            if (jumlahDokumen == 4) {
                System.out.print("Masukkan peringkat juara (1, 2, atau 3, isi 0 jika bukan juara): ");
                peringkatJuara = input.nextInt();
            if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                    System.out.println("\nStatus: Berhak memperoleh dana penghargaan (Juara " + peringkatJuara + ").");
                } else {
                    System.out.println("\nStatus: Tidak memperoleh dana penghargaan (hanya untuk Juara 1, 2, atau 3).");
                }
            } else {
                int kurangDokumen = 4 - jumlahDokumen;
                System.out.println("\nStatus: Dokumen tidak lengkap (kurang " + kurangDokumen + " dokumen). Dana penghargaan tidak diberikan.");
            }
        
            } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            
            if (jumlahDokumen == 4) {
                System.out.print("Masukkan status pendanaan PKM (1 = lolos, 0 = tidak lolos): ");
                statusPKM = input.nextInt();

                if (statusPKM == 1) {
                    System.out.println("\nStatus: Berhak memperoleh dana penghargaan (PKM lolos pendanaan).");
                } else {
                    System.out.println("\nStatus: Tidak memperoleh dana penghargaan (PKM tidak lolos pendanaan).");
                }
            } else {
                int kurangDokumen = 4 - jumlahDokumen;
                System.out.println("\nStatus: Dokumen tidak lengkap (kurang " + kurangDokumen + " dokumen). Dana penghargaan tidak diberikan.");
            }

        } else if (jenisKegiatan.equalsIgnoreCase("Lainnya")) {
            System.out.println("\nStatus: Tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan).");
        } else {
            System.out.println("\nStatus: Jenis kegiatan tidak valid.");
            
            }    
        }
    }
