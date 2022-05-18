package Canbo;

import java.util.Date;

public class NhanVien extends Canbo{
    private String inforJob;

    public NhanVien() {
    }

    public NhanVien(String inforJob) {
        this.inforJob = inforJob;
    }

    public NhanVien(String name, String date, String gender, String address, String inforJob) {
        super(name, date, gender, address);
        this.inforJob = inforJob;
    }

    public String getInforJob() {
        return inforJob;
    }

    public void setInforJob(String inforJob) {
        this.inforJob = inforJob;
    }

    @Override
    public void nameJobManager() {

    }

    @Override
    public String toString() {
        return "NhanVien{" +
                super.toString()+
                "inforJob='" + inforJob + '\'' +
                '}';
    }
}
