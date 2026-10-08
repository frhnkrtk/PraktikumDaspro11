import java.util.Scanner;
public class StudiKasus111 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaPerCup = 1800;
        int jumlahCup, uangBayar;
        int totalHarga, diskon = 0, totalBayar;
        int kembalian, kurang;

        System.out.println("Masukkan jumlah cup yang dibeli :");
        jumlahCup = sc.nextInt();
        System.out.println("Jumlah uang yang harus dibayarkan : ");
        uangBayar = sc.nextInt();
        totalHarga = jumlahCup * hargaPerCup;

        if (totalHarga >= 100000) {
            diskon = totalHarga * 10/100;
            totalBayar = totalHarga- diskon;
        } else {
            totalBayar = totalHarga;
        }
        System.out.println("Total Harga : Rp " + totalHarga);
        System.out.println("Diskon      : Rp " + diskon);
        System.out.println("Total Bayar : Rp " + totalBayar);
            
        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian = Rp" + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang anda kurang sebesar = Rp" + kurang);
        }
    }
}
