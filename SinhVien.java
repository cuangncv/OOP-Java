public class SinhVien {
    private String ma, ten, lop, email;

    public SinhVien(String ma, String ten, String lop, String email) {
        this.ma = ma;
        setTen(ten);
        this.lop = lop;
        this.email = email;
    }

    public String getMa() {
        return ma;
    }

    public String getLop() {
        return lop;
    }

    private void setTen(String ten){
        StringBuilder sb = new StringBuilder();
        String [] a = ten.trim().split("\\s+");
        for(int i = 0; i < a.length; i++){
            sb.append(a[i].substring(0,1).toUpperCase() + a[i].substring(1).toLowerCase() + " ");
        }
        this.ten = sb.toString();
    }

    public String toString() {
        return ma + " " + ten ;
    }
}