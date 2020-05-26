package quanlydiemsv.views.giaovu;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class GiaoVuQuanLyView extends JFrame {
    JButton dsLopButton;
    JButton TKBButton;
    JButton bangDiemButton;
    JButton phucKhaoButton;
    JButton logoutButton;
    JButton doiPassButton;
    JLabel taiKhoanLabel;

    public void initComponents(){
        this.setTitle("Trình quản lý của giáo vụ");
        this.setSize(400,300);
        this.setResizable(false);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        dsLopButton = new JButton("Danh sách lớp");
        TKBButton = new JButton("Thời khóa biểu");
        bangDiemButton = new JButton("Bảng điểm");
        phucKhaoButton = new JButton("Phúc khảo");
        logoutButton = new JButton("Đăng xuất");
        doiPassButton = new JButton("Đổi mật khẩu");
        taiKhoanLabel = new JLabel("Xin chào ");

        JPanel panel_giaovu = new JPanel();
        //panel_giaovu.setSize(400,300);
        BoxLayout boxLayout = new BoxLayout(panel_giaovu, BoxLayout.Y_AXIS);
        panel_giaovu.setLayout(boxLayout);
        panel_giaovu.setBorder(new EmptyBorder(new Insets(150,200,150,200)));
        panel_giaovu.add(taiKhoanLabel);
        panel_giaovu.add(dsLopButton);
        panel_giaovu.add(TKBButton);
        panel_giaovu.add(bangDiemButton);
        panel_giaovu.add(phucKhaoButton);

        JPanel panel_bottom = new JPanel();
        BoxLayout box_bottom = new BoxLayout(panel_bottom,BoxLayout.X_AXIS );
        panel_bottom.setLayout(box_bottom);
        panel_bottom.add(doiPassButton);
        panel_bottom.add(logoutButton);
        panel_giaovu.add(panel_bottom);

        this.add(panel_giaovu);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
