package app.bruner.customlistviewapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "MainActivity";

    private ArrayList<ProgrammingLanguageCourse> plc;

    private ListView cursesListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Log.i(TAG,"Start App");

        plc = new ArrayList<ProgrammingLanguageCourse>();
        plc.add(new ProgrammingLanguageCourse("https://uxwing.com/wp-content/themes/uxwing/download/brands-and-social-media/swift-programming-language-icon.png", "Swift", "6 weeks", "Registration: CAD$15,000.00"));
        plc.add(new ProgrammingLanguageCourse("https://icons.iconarchive.com/icons/dakirby309/simply-styled/256/Java-icon.png", "Android Java", "4 weeks", "Registration: CAD$8,000.00"));
        plc.add(new ProgrammingLanguageCourse("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgv-V8g6NmdOlPXUH1MeKdrw1vQPYbPBNWGsa6MdjfKDksfGu8pVhlXRorc7FdE5C3CQ2yLZOtehczQ8jT3ZyIgrzedDNlev4YLxBRHqxUO6LNYPfNu09KXgdKkEV22BeMz9gfKB4LnqmQh/s1600/kotlin-logo.png", "Android Kotlin", "5 weeks", "Registration: CAD$12,000.00"));

        ProgrammingLanguageCourseListAdapter adapter = new ProgrammingLanguageCourseListAdapter(this, plc);
        cursesListView = (ListView) findViewById(R.id.languageCoursesListView);
        cursesListView.setAdapter(adapter);

        cursesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "You select "+plc.get(i).getName()+" course.", Toast.LENGTH_SHORT).show();
            }
        });

        Log.i(TAG,"End App");
    }
}