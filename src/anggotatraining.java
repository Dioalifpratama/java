import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class anggotatraining {

    static ArrayList listTraining = new ArrayList();
    static boolean isRunning = true;
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);

    static void showMenu() throws IOException{

        System.out.println("**** Data Keluarga ****");
        System.out.println("#1 Daftar Anggota Training");
        System.out.println("#2 Tambah data Training");
        System.out.println("#3 Ubah data Training");
        System.out.println("#4 hapus data Training");
        System.out.println("#5 keluar");
        System.out.print("PILIH MENU> ");

        int selectedMenu = Integer.valueOf(input.readLine());

        switch(selectedMenu){
            case 1:
                showAllTraining();
                break;
            case 2:
                insertTraining();
                break;
            case 3:
                editTraining();
                break;
            case 4:
                deleteTraining();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan salah!");

        }


    }

    static void showAllTraining(){
        if(listTraining.isEmpty()){
            System.out.println("Belum ada data");
        } else {
            // tampilkan semua Training
            for(int i = 0; i < listTraining.size(); i++){
                System.out.println(String.format("[%d] %s",i, listTraining.get(i)));
            }
        }
    }

    static void insertTraining() throws IOException{
        System.out.print("Nama Training: ");
        String namaTraining = input.readLine();
        listTraining.add(namaTraining);
    }

    static void editTraining() throws IOException{
        showAllTraining();
        System.out.print("Pilih nomer Training: ");
        int indexTraining = Integer.valueOf(input.readLine());

        System.out.print("Nama Baru: ");
        String namaBaru = input.readLine();

        // ubah nama Training
        listTraining.set(indexTraining, namaBaru);
    }

    static void deleteTraining() throws IOException{
        showAllTraining();
        System.out.print("Pilih nomer Training: ");
        int indexTraining = Integer.valueOf(input.readLine());
        // hapus Keluarga
        listTraining.remove(indexTraining);
    }

    public static void main(String[] args) throws IOException {

        do {
            showMenu();
        } while (isRunning);

    }
}
