import java.time.LocalDate;
import java.util.*;

public class quanlidulieu {
    class person{
        private String  ten, gioitinh;
        private LocalDate date;

        public person(String ten, String gioitinh, LocalDate bod) {
            this.ten = ten;
            this.gioitinh = gioitinh;
            this.date = bod;
        }

        public String getTen() {
            return ten;
        }

        public void setTen(String ten) {
            this.ten = ten;
        }

        public String getGioitinh() {
            return gioitinh;
        }

        public void setGioitinh(String gioitinh) {
            this.gioitinh = gioitinh;
        }

        public LocalDate getDate() {
            return date;
        }

        public void setDate(LocalDate date) {
            this.date = date;
        }

        @Override
        public String toString() {
            return "person{" +
                    "ten='" + ten + '\'' +
                    ", gioitinh='" + gioitinh + '\'' +
                    ", date=" + date +
                    '}';
        }
        public int compareTo(person o){
            return this.date.compareTo(o.date);
        }
    }

    public  void main(String[] args) {
        List<person> a=new ArrayList<>();
        List<person> kq=new ArrayList<>();
        a.add(new person("A","Female",LocalDate.parse("2002-12-1")));
        a.add(new person("B","Male",LocalDate.parse("2003-30-1")));
        a.add(new person("C","Female",LocalDate.parse("2001-2-12")));
        a.add(new person("D","Male",LocalDate.parse("2004-12-1")));
        Queue<person> male=new LinkedList<>();
        Queue<person>feMale=new LinkedList<>();

    }
}
