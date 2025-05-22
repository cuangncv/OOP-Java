public class BangDiem implements Comparable<BangDiem> {
    private SinhVien sv;
    private MonHoc mh;
    private String diem;
    private String maSV, maMH;

    public BangDiem(SinhVien sv, MonHoc mh, String diem) {
        this.sv = sv;
        this.mh = mh;
        this.maSV = sv.getMa();
        this.maMH = mh.getMa();
        this.diem = diem;
    }
    public SinhVien getSv(){
        return sv;
    }

    public int compareTo(BangDiem other){
       if(this.maMH.equals(other.maMH)) return this.maSV.compareTo(other.maSV);
       return this.maMH.compareTo(other.maMH);
    }
    @Override
    public String toString(){
        return sv + maMH + " " + mh.getTen()+ " " + diem;
    }
}
