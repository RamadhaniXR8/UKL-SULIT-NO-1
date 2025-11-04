import java.util.Scanner;

public class SoalUklSulitNo1 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan jumlah siswa :");
    int jmlSiswa = input.nextInt();
    int awal = 1;
    int nilaiSiswa,temp;
    do {System.out.print("Masukkan nilai siswa");
        nilaiSiswa = input.nextInt();
        System.out.println("Nilai Siswa"+awal+":"+nilaiSiswa);
        awal++;}
    while (jmlSiswa >= awal);{
    temp = nilaiSiswa;
    
    Double rataRata =(double) (temp/jmlSiswa);
    System.out.println("Rata-rata nilai siswa adalah :"+rataRata);
    }}
}