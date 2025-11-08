package com.example.recyclerview_104;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class MainActivity_104 extends AppCompatActivity implements SelectListener_104 {

    private RecyclerView recyclerView_104;
    private CustomAdapter_104 adapter_104;
    private List<ThongTinCaNhan_104> danhSach_104;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_104);

        recyclerView_104 = findViewById(R.id.recyclerView_104);

        danhSach_104 = getDuLieuViet_104();

        adapter_104 = new CustomAdapter_104(this, danhSach_104, this);

        recyclerView_104.setLayoutManager(new GridLayoutManager(this, 1));
        recyclerView_104.setAdapter(adapter_104);
    }

    private List<ThongTinCaNhan_104> getDuLieuViet_104() {
        List<ThongTinCaNhan_104> list_104 = new ArrayList<>();
        list_104.add(new ThongTinCaNhan_104("Nguyễn Phước Quý Bửu", "Sinh viên Lập trình"));
        list_104.add(new ThongTinCaNhan_104("Trần Thị Bình", "Nhà thiết kế Đồ họa"));
        list_104.add(new ThongTinCaNhan_104("Lê Văn Cường", "Kỹ sư Phần mềm"));
        list_104.add(new ThongTinCaNhan_104("Phạm Thu Dung", "Giáo viên Tiếng Anh"));
        list_104.add(new ThongTinCaNhan_104("Hoàng Đình Hải", "Quản lý Dự án"));
        list_104.add(new ThongTinCaNhan_104("Mai Thanh Hương", "Nhân viên Kế toán"));
        list_104.add(new ThongTinCaNhan_104("Đinh Đức Khải", "Chuyên viên Marketing"));
        list_104.add(new ThongTinCaNhan_104("Bùi Thúy Lan", "Y tá điều dưỡng"));
        list_104.add(new ThongTinCaNhan_104("Vũ Công Minh", "Tài xế Công nghệ"));
        list_104.add(new ThongTinCaNhan_104("Kiều Ngọc Nga", "Chủ cửa hàng Hoa"));
        list_104.add(new ThongTinCaNhan_104("Ngô Văn Phát", "Nhân viên Bán hàng"));
        list_104.add(new ThongTinCaNhan_104("Lý Thị Quyên", "Biên tập viên"));
        list_104.add(new ThongTinCaNhan_104("Trịnh Văn Sơn", "Thợ điện lạnh"));
        list_104.add(new ThongTinCaNhan_104("Dương Thanh Tâm", "Hướng dẫn viên Du lịch"));
        list_104.add(new ThongTinCaNhan_104("Phan Đình Vinh", "Thủ thư"));
        return list_104;
    }

    @Override
    public void onItemClicked_104(ThongTinCaNhan_104 thongTin_104) {
        Toast.makeText(MainActivity_104.this, "Bạn đã chọn: " + thongTin_104.getTen_104(), Toast.LENGTH_SHORT).show();
    }
}