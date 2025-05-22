import java.io.File;
import java.util.*;

public class J07036 {
    public static void main(String[] args) throws Exception{
        Scanner inSV = new Scanner(new File("SINHVIEN.in"));
        Scanner inMH = new Scanner(new File("MONHOC.in"));
        Scanner inBD = new Scanner(new File("BANGDIEM.in"));
        int t1 = Integer.parseInt(inSV.nextLine());
        Map<String, SinhVien> m1 = new HashMap<>();
        for(int i = 1; i <= t1; i++){
            String ma = inSV.nextLine();
            SinhVien sv = new SinhVien(ma, inSV.nextLine(), inSV.nextLine(), inSV.nextLine());
            m1.put(ma, sv);
        }
        int t2 = Integer.parseInt(inMH.nextLine());
        Map<String, MonHoc> m2 = new HashMap<>();
        for(int i = 1; i <= t2; i++){
            String ma = inMH.nextLine();
            MonHoc mh = new MonHoc(ma, inMH.nextLine(), Integer.parseInt(inMH.nextLine()));
            m2.put(ma, mh);
        }
        ArrayList<BangDiem> arr = new ArrayList<>();
        int t3 = Integer.parseInt(inBD.nextLine());
        for(int i = 1; i <= t3; i++){
            String maSV = inBD.next();
            String maMH = inBD.next();
            String diem = inBD.next();
            inBD.nextLine();
            BangDiem n = new BangDiem(m1.get(maSV), m2.get(maMH), diem);
            arr.add(n);
        }
        Collections.sort(arr);
        int q = Integer.parseInt(inBD.nextLine());
        while(q-- >0){
            String s = inBD.nextLine();
            System.out.printf("BANG DIEM lop %s:\n", s);
            for(BangDiem b : arr){
                if(s.equals(b.getSv().getLop())){
                    System.out.println(b);
                }
            }
        }
        inSV.close();
        inMH.close();
        inBD.close();
    }
}