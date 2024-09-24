import java.io.FileWriter;
import java.io.IOException;

import java.util.Scanner;

public class N22DCCN162 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ChieuDai = in.nextInt();
        int ChieuRong = in.nextInt();
        int ChuVi = (ChieuDai+ChieuRong)*2;
        int DienTich = ChieuDai*ChieuRong;
        String filename = "N22DCCN162.txt";
        try (FileWriter writer = new FileWriter(filename)){
            writer.write("Chieu dai " + ChieuDai +"\n");
            writer.write("Chieu rong " + ChieuRong +"\n");
            writer.write("Chu vi " + ChuVi +"\n");
            writer.write("Dien tich " + DienTich +"\n");
            writer.close();
        }catch(IOException e){
            System.out.println("Co loi xay ra.");
            e.printStackTrace();
        }
        } 
} 
