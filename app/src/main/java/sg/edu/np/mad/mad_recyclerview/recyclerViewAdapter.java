package sg.edu.np.mad.mad_recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class recyclerViewAdapter extends RecyclerView.Adapter<recyclerViewHolder> {
    ArrayList<String> data;
    public recyclerViewAdapter(ArrayList<String> input){
        data = input;
    }
    public recyclerViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_layout,)
    }
}
