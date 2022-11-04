import java.util.Scanner;
import java.io.*;

class Login {
    private String username, password, nama;

    public Login() {
        username = "ardiyan";
        password = "2100018434";
        nama = "Ardiyan Rasendriya";
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public String getNama() {
        return nama;
    }
}

class penggajian_karyawan {
    public static void main(String[] args) throws Exception {
        String usr, psw, lg, my_user, my_password;
        String nama, barang, tanggal;
        int gajipokok = 0;
        int totalgaji = 0;
        int tunjangan_istri_dan_anak = 0;
        int potongan = 0;
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Login user1 = new Login();
        System.out.println("\n============ LOGIN ==============");
        System.out.print("   Masukkan username : ");
        my_user = br.readLine();
        System.out.print("   Masukkan password : ");
        my_password = br.readLine();
        System.out.println("=================================");

        if (my_user.equals(user1.getUsername()) && my_password.equals(user1.getPassword())) {
            System.out.println("=================================");
            System.out.println("          Login Sukses    ");
            System.out.println(" Selamat Datang " + user1.getNama());
            System.out.println("=================================");
        } else {
            System.out.println("=================================");
            System.out.println("           Login Gagal   ");
            System.out.println("=================================");
            do {
                System.out.println("=============LOGIN===============");
                System.out.print("   Masukkan username : ");
                my_user = br.readLine();
                System.out.print("   Masukkan password : ");
                my_password = br.readLine();
                System.out.println("=================================");
            } while (my_user.equals(user1.getUsername()) && my_password.equals(user1.getPassword()));
        }

        System.out.println("\n=================================");
        System.out.print("\tSistem Penggajian Karyawan");
        System.out.println("\n=================================");
        System.out.print("\nMasukkan Tanggal     : ");
        tanggal = sc.nextLine();
        System.out.print("Masukkan Nama        : ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIK         : ");
        int NIK = sc.nextInt();
        System.out.println("1. golongan 1A");
        System.out.println("2. golongan 1B");
        System.out.println("3. golongan 2A");
        System.out.println("4. golongan 2B");
        System.out.println("5. golongan 3A");
        System.out.println("6. golongan 3B");
        System.out.print("");
        System.out.print("Masukkan pilihan golongan : ");
        int pilih = sc.nextInt();
        if (pilih == 1) {
            gajipokok = 1000000;
            tunjangan_istri_dan_anak = 100000;
        } else if (pilih == 2) {
            gajipokok = 1500000;
            tunjangan_istri_dan_anak = 200000;
        } else if (pilih == 3) {
            gajipokok = 2000000;
            tunjangan_istri_dan_anak = 300000;
        } else if (pilih == 4) {
            gajipokok = 2500000;
            tunjangan_istri_dan_anak = 400000;
        } else if (pilih == 5) {
            gajipokok = 3000000;
            tunjangan_istri_dan_anak = 500000;
        } else if (pilih == 6) {
            gajipokok = 3500000;
            tunjangan_istri_dan_anak = 600000;
        }
        potongan = ((5 / 2) * (gajipokok + tunjangan_istri_dan_anak)) / 100;
        totalgaji = ((gajipokok + tunjangan_istri_dan_anak) - potongan);
        System.out.print("============================================");
        System.out.println("\nTanggal                  : " + tanggal);
        System.out.println("Nama Karyawan            : " + nama);
        System.out.println("NIK Karyawan             : " + NIK);
        System.out.println("Gaji Pokok               : " + gajipokok);
        System.out.println("Tunjangan Istri dan Anak : " + tunjangan_istri_dan_anak);
        System.out.println("Potongan                 : " + potongan);
        System.out.println("Total Gaji yang Diterima : " + totalgaji);
        System.out.print("============================================");
    }
}
