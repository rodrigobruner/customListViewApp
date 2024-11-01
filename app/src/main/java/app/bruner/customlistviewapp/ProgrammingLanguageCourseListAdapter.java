package app.bruner.customlistviewapp;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;

public class ProgrammingLanguageCourseListAdapter extends ArrayAdapter<ProgrammingLanguageCourse> {

    private final String TAG = "ProgrammingLanguageCourseListAdapter";

    private final Activity context;

    private final ArrayList<ProgrammingLanguageCourse> plc;

    public ProgrammingLanguageCourseListAdapter(Activity context, ArrayList<ProgrammingLanguageCourse> plc) {
        super(context, R.layout.languages_list_view, plc);

        Log.i(TAG,"Constructor");

        this.context = context;
        this.plc = plc;
    }

    public View getView(int position, View view, ViewGroup parent) {
        Log.i(TAG, "Get View");

        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.languages_list_view, null, true);

        ImageView logoImageView = (ImageView) rowView.findViewById(R.id.logo);
        TextView languageNameTextView = (TextView) rowView.findViewById(R.id.language);
        TextView curseDurationTextView = (TextView) rowView.findViewById(R.id.durantion);
        TextView courseFeesTextView = (TextView) rowView.findViewById(R.id.fees);

        ProgrammingLanguageCourse course = plc.get(position);
        Log.i(TAG, "Course name"+course.getName());

        Picasso.get().load(course.getImage()).into(logoImageView);
        languageNameTextView.setText(course.getName());
        curseDurationTextView.setText(course.getDuration());
        courseFeesTextView.setText(course.getFees());

        return rowView;
    }
}