package co.edu.unipiloto.encomiendasnav;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TopLevelActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);

        ListView listOptions = findViewById(R.id.listOptions);
        String[] options = getResources().getStringArray(R.array.main_options);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                options
        );

        listOptions.setAdapter(adapter);

        listOptions.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(TopLevelActivity.this, CategoryActivity.class);
            intent.putExtra("category", options[position]);
            startActivity(intent);
        });
    }
}
