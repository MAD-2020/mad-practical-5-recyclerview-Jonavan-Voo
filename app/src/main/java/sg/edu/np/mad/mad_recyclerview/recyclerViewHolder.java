package sg.edu.np.mad.mad_recyclerview;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class recyclerViewHolder extends RecyclerView.ViewHolder {
    TextView txt;
    CheckBox checkbox;

    public recyclerViewHolder(View itemView){
        super(itemView);
        txt = itemView.findViewById(R.id.textView);
        checkbox = itemView.findViewById(R.id.checkBox);
    }
}
