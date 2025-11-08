package com.example.recyclerview_104;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class CustomAdapter_104 extends RecyclerView.Adapter<CustomAdapter_104.CustomViewHolder_104> {

    private Context context_104;
    private List<ThongTinCaNhan_104> listThongTin_104;
    private SelectListener_104 listener_104;

    public CustomAdapter_104(Context context_104, List<ThongTinCaNhan_104> listThongTin_104, SelectListener_104 listener_104) {
        this.context_104 = context_104;
        this.listThongTin_104 = listThongTin_104;
        this.listener_104 = listener_104;
    }

    @NonNull
    @Override
    public CustomViewHolder_104 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view_104 = LayoutInflater.from(context_104).inflate(R.layout.list_item_layout_104, parent, false);
        return new CustomViewHolder_104(view_104);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder_104 holder, int position) {
        ThongTinCaNhan_104 thongTinHienTai_104 = listThongTin_104.get(position);

        holder.tvTen_104.setText(thongTinHienTai_104.getTen_104());
        holder.tvNgheNghiep_104.setText(thongTinHienTai_104.getNgheNghiep_104());
        holder.cardContainer_104.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener_104.onItemClicked_104(thongTinHienTai_104);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listThongTin_104.size();
    }

    public class CustomViewHolder_104 extends RecyclerView.ViewHolder {
        public TextView tvTen_104;
        public TextView tvNgheNghiep_104;
        public CardView cardContainer_104;

        public CustomViewHolder_104(@NonNull View itemView) {
            super(itemView);
            tvTen_104 = itemView.findViewById(R.id.tvTen_104);
            tvNgheNghiep_104 = itemView.findViewById(R.id.tvNgheNghiep_104);
            cardContainer_104 = itemView.findViewById(R.id.cardContainer_104);
        }
    }
}