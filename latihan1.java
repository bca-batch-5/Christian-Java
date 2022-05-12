package src;
import java.time.LocalDateTime;

public class latihan1 {
    

    public static void main(String[] args) {
        System.out.println(angkaNama(288));
    }

    public static String angkaNama(int Hari){
        LocalDateTime now = LocalDateTime.now();
        String nowDate = now.toString();
        String tanggalNow = nowDate.substring(8,10);
        int tanggalAngka = Integer.parseInt(tanggalNow);
        if(Hari %tanggalAngka == 0){
            return "Christian";
        }
        return "bukan kelipatan dari tanggal hari ini";
    }
}
