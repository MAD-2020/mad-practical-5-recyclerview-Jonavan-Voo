package sg.edu.np.mad.mad_recyclerview;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class recyclerViewAdapter extends RecyclerView.Adapter<recyclerViewHolder> {
    ArrayList<Task> data;
    public recyclerViewAdapter(ArrayList<Task> input){
        this.data = input;
    }
    public recyclerViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_layout,parent,false);
        return new recyclerViewHolder(item);
    }
    public void onBindViewHolder(final recyclerViewHolder holder, final int position){
        Task s = data.get(position);
        holder.txt.setText(s.getTask());
        holder.checkbox.setChecked(s.isCheckbox());
        holder.txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(v.getContext());
                builder.setTitle("Delete");
                builder.setMessage("Are you sure you want to delete\n" + holder.txt.getText().toString() + "?");
                builder.setCancelable(false);
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        data.remove(position);
                        notifyDataSetChanged();
                    }
                });
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });
    }
    public int getItemCount(){
        return data.size();
    }
}
