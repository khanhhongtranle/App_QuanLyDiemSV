package quanlydiemsv;

import quanlydiemsv.views.LoginView;
import quanlydiemsv.views.giaovu.GiaoVuQuanLyView;
import quanlydiemsv.views.sinhvien.SinhVienView;

public class MainApp {
    public static void main (String[] agrs){
        //LoginView loginView = new LoginView();
        //loginView.initComponents();

        //GiaoVuQuanLyView giaoVuQuanLyView = new GiaoVuQuanLyView();
        //giaoVuQuanLyView.initComponents();

        SinhVienView sinhVienView = new SinhVienView();
        sinhVienView.initComponents();
    }
}
