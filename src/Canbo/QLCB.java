package Canbo;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class QLCB {
    Scanner sc = new Scanner(System.in);
    Canbo canbos[] = new Canbo[0];
    Canbo searchCanBo[] = new Canbo[0];
    public void menu() {
        System.out.println("____MENU____");
        System.out.println("1.Nhập thông tin cán bộ:");
        System.out.println("2.Tìm kiếm tên cán bộ .");
        System.out.println("3.Hiện thị thông tin cán bộ bạn tìm.");
        System.out.println("4.Hiện thị thông tin cán bộ");
        System.out.println("5.Exit");
        System.out.println("Nhap lua chon:");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                System.out.println("1.Cong nhan.");
                System.out.println("2.kỹ sư");
                System.out.println("3.Nhan vien");
                System.out.println("Nhap lua chon:");
                int choice1 = Integer.parseInt(sc.nextLine());
                switch (choice1) {
                    case 1:
                        addCanbos(Creat(1));
                        break;
                    case 2:
                        addCanbos(Creat(2));
                        break;
                    case 3:
                        addCanbos(Creat(3));
                        break;
                }
                break;
            case 2:
                searchCanBo();
                break;
            case 3:
                for (Canbo canBoSearch :searchCanBo){
                    System.out.println(canBoSearch);
                }
                break;
            case 4:
                for (Canbo canbo : canbos) {
                    System.out.println(canbo);
                }
                break;
        }
    }

    public Canbo Creat(int x) {
        System.out.println("Nhap ten can bo:");
        String name = sc.nextLine();
        System.out.println("Nhap ngay sinh cua can bo");
        String Date = sc.nextLine();
        System.out.println("Nhap gioi tinh cua can bo:");
        String gender = sc.nextLine();
        System.out.println("Nhap dia chi cua can bo:");
        String address = sc.nextLine();
        if (x == 1) {
            System.out.println("Nhap cap bac cua cong nhan");
            int rank =Integer.parseInt(sc.nextLine());
            return new CongNhan(name, Date, gender, address, rank);
        } else if (x == 2) {
            System.out.println("Nhap nganh dao tao cua ky su :");
            String trainingIndustry = sc.nextLine();
            return new Kysu(name, Date, gender, address, trainingIndustry);
        } else if (x == 3) {
            System.out.println("Nhap thong tin cong viec cua nhan vien:");
            String inforJob = sc.nextLine();
            return new NhanVien(name, Date, gender, address, inforJob);
        } else
            return null;
    }

    public void addCanbos(Canbo canbo) {
        Canbo newCanbo[] = new Canbo[canbos.length + 1];
        System.arraycopy(canbos, 0, newCanbo, 0, canbos.length);
        newCanbo[newCanbo.length - 1] = canbo;
        canbos = newCanbo;
    }
    public void searchCanBo(){
        System.out.println("Nhap ten can bo can tim kiem");
        String searchName = sc.nextLine();
        int dem=0;
        boolean check =false;
         for(int i=0;i<canbos.length;i++){
             if(canbos[i].getName().equals(searchName)){
                 dem++;
                 check=true;
             }
         }
         int x=0;
         Canbo newSearchCanBo[]= new Canbo[dem];
         if (check){
             for(int i=0;i<canbos.length;i++){
                 if (canbos[i].getName().equals(searchName)){
                     newSearchCanBo[x] = canbos[i];
                     x++;
                 }
             }
             searchCanBo= newSearchCanBo;
         }
         else {
             System.out.println("Khong co ten nhan vien ban muon tim kiem !");
         }
    }
}
