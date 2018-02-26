package nurul.id.graphvertexcolouring;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by Brian R on 25/02/2018.
 */

public class TambahGridAdapter extends BaseAdapter {
    private Context context;
    private LayoutInflater inflater;
    private List<Model> list;

    public TambahGridAdapter(Context context, List<Model> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = View.inflate(context, R.layout.grid, null);
        ImageView buttonLv = (ImageView) view.findViewById(R.id.buttonLv);
        TextView titleLv = (TextView) view.findViewById(R.id.textLv);
        Model model = list.get(position);
        buttonLv.setImageResource(Integer.parseInt(model.getButton()));
        titleLv.setText(model.getLevel());
        view.setTag(model.getId());
        return view;
    }
}
