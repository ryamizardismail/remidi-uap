import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner masukan = new Scanner(System.in);

        String jurusan = null, choice = null;
        do{
        System.out.println("Masukkan nama");
        String nama = masukan.nextLine();

        System.out.println();

        System.out.print("Masukan nim : ");
        String nim = masukan.nextLine();

        System.out.println();

        String[] codes = nim.split("\\.");

        int tahun = Integer.parseInt(codes[0]);
        String tahunAjaran = "20" + tahun + " - 20" + (tahun + 1);

        System.out.println("Tahun Ajaran : " + tahunAjaran);

        if (codes[1].equals("31")) {
            jurusan = "D3 - Sistem Informasi";
        } else if (codes[1].equals("51")) {
            jurusan = "S1 - Sistem Informasi";
        } else if (codes[1].equals("52")){
            jurusan = "S1 - Teknologi Informasi";
        } else {
            throw new Exception("Error input");
        }

        System.out.println("Jurusan : " + jurusan);
        System.out.println("No urut masuk : " + Integer.valueOf(codes[2]));
        System.out.print("Ingin input biodata lagi?[y/n]");
        choice = masukan.nextLine();
    }while(choice.equals("y"));

    }

    
}
