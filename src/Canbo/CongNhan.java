package Canbo;

import com.sun.javafx.scene.control.skin.SpinnerSkin;

import java.util.Date;

public class CongNhan extends Canbo{
    private  double rank;
    public CongNhan() {
    }

    public CongNhan(String name, String date, String gender, String address, double rank) {
        super(name, date, gender, address);
        this.rank = rank;
    }

    public double getRank() {
        return rank;
    }

    public void setRank(double rank) {
        this.rank = rank;
    }

    @Override
    public void nameJobManager() {
//        System.out.println("");
    }

    @Override
    public String toString() {
        return "NhanVien{ " +
                super.toString()+
                " rank=" + this.getRank()+
                '}';
    }
}
