package co.edu.unipiloto.encomiendasnav;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class CategoryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        TextView tvCategoryTitle = findViewById(R.id.tvCategoryTitle);
        ListView listCategory = findViewById(R.id.listCategory);

        String category = getIntent().getStringExtra("category");
        tvCategoryTitle.setText(category);

        String[] items = getItemsForCategory(category);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                items
        );

        listCategory.setAdapter(adapter);

        listCategory.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(CategoryActivity.this, DetailActivity.class);
            intent.putExtra("category", category);
            intent.putExtra("item", items[position]);
            startActivity(intent);
        });
    }

    private String[] getItemsForCategory(String category) {
        if ("Encomiendas".equals(category)) {
            return new String[]{
                    "ENV-001 · Bogotá → Medellín",
                    "ENV-002 · Bogotá → Cali",
                    "ENV-003 · Medellín → Bucaramanga"
            };
        }

        if ("Remitentes".equals(category)) {
            return new String[]{
                    "Laura Gómez",
                    "Carlos Rodríguez",
                    "Andrea Martínez"
            };
        }

        return new String[]{
                "Juan Pérez",
                "María Torres",
                "Sofía Hernández"
        };
    }
}
