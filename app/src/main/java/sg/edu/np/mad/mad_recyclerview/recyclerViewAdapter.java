package sg.edu.np.mad.mad_recyclerview;

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
    public void onBindViewHolder(recyclerViewHolder holder,int position){
        Task s = data.get(position);
        holder.txt.setText(s.getTask());
        holder.checkbox.setChecked(s.isCheckbox());
    }
    public int getItemCount(){
        return data.size();
    }
}
