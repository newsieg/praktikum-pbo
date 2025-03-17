/************************************/
/* Program   : Pegawai.java */
/* Deskripsi : Class Pegawai*/
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 13 Maret 2025*/
/***********************************/

public class Pegawai {
    String NIP;
    String nama;
    String tanggalLahir;
    String TMT;
    double gajiPokok;

    Pegawai(String NIP, String nama, String tanggalLahir, String TMT, double gajiPokok){
        this.NIP = NIP;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.TMT = TMT;
        this.gajiPokok = gajiPokok;
    }

    int[] hitungMasaKerja(){
        String[] tmtParts = TMT.split(" ");
        int tmtHari = Integer.parseInt(tmtParts[0]);
        int tmtBulan = bulanKeAngka(tmtParts[1]);
        int tmtTahun = Integer.parseInt(tmtParts[2]);
        String[] sekarang = "10 Maret 2025".split(" "); 
        int sekarangHari = Integer.parseInt(sekarang[0]);
        int sekarangBulan = bulanKeAngka(sekarang[1]);
        int sekarangTahun = Integer.parseInt(sekarang[2]);
        int tahun = sekarangTahun - tmtTahun;
        int bulan = sekarangBulan - tmtBulan;
        if (bulan < 0){
            tahun--;
            bulan += 12;
        }
        int hari = sekarangHari - tmtHari;
        if (hari < 0){
            bulan--;
        }
        return new int[]{tahun, bulan};
    }

    String formatTanggal(String tanggal){
        return tanggal; 
    }

    int bulanKeAngka(String bulan){
        switch (bulan){
            case "Januari": return 1;
            case "Februari": return 2;
            case "Maret": return 3;
            case "April": return 4;
            case "Mei": return 5;
            case "Juni": return 6;
            case "Juli": return 7;
            case "Agustus": return 8;
            case "September": return 9;
            case "Oktober": return 10;
            case "November": return 11;
            case "Desember": return 12;
            default: return 0;
        }
    }

    String angkaKeBulan(int bulan){
        switch (bulan){
            case 1: return "Januari";
            case 2: return "Februari";
            case 3: return "Maret";
            case 4: return "April";
            case 5: return "Mei";
            case 6: return "Juni";
            case 7: return "Juli";
            case 8: return "Agustus";
            case 9: return "September";
            case 10: return "Oktober";
            case 11: return "November";
            case 12: return "Desember";
            default: return "";
        }
    }

    String hitungBUP(String tanggalLahir, int usiaPensiun){
        String[] lahirParts = tanggalLahir.split(" ");
        int lahirHari = Integer.parseInt(lahirParts[0]);
        int lahirBulan = bulanKeAngka(lahirParts[1]);
        int lahirTahun = Integer.parseInt(lahirParts[2]);
        int bupTahun = lahirTahun + usiaPensiun;
        int bupBulan = lahirBulan + 1;
        if (bupBulan > 12){
            bupTahun++;
            bupBulan -= 12;
        }
        return "1 " + angkaKeBulan(bupBulan) + " " + bupTahun;
    }

    void printInfo(){
        System.out.println("NIP : " + NIP);
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir : " + formatTanggal(tanggalLahir));
        System.out.println("TMT : " + formatTanggal(TMT));
    }
}
