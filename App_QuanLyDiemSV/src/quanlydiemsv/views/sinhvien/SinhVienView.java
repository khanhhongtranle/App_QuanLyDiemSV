package quanlydiemsv.views.sinhvien;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class SinhVienView extends JFrame {
    JLabel taiKhoanLabel;
    JButton xemDiemButton;
    JButton phucKhaoButton;
    JButton logoutButton;
    JButton doiPassButton;

    public void initComponents(){
        this.setTitle("Trình quản lý của sinh viên");
        this.setSize(400,300);
        this.setResizable(false);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        taiKhoanLabel = new JLabel("Xin chào");
        xemDiemButton = new JButton("Xem điểm");
        phucKhaoButton = new JButton("Phúc khảo");
        logoutButton = new JButton("Đăng xuất");
        doiPassButton = new JButton("Đổi mật khẩu");

        JPanel panel_sv = new JPanel();
        BoxLayout boxLayout = new BoxLayout(panel_sv, BoxLayout.Y_AXIS);
        panel_sv.setLayout(boxLayout);
        panel_sv.setBorder(new EmptyBorder(new Insets(150,200,150,200)));
        panel_sv.add(taiKhoanLabel);
        panel_sv.add(xemDiemButton);
        panel_sv.add(phucKhaoButton);
        panel_sv.add(doiPassButton);
        panel_sv.add(logoutButton);

        this.add(panel_sv);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
