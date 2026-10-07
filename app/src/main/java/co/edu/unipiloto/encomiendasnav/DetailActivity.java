package co.edu.unipiloto.encomiendasnav;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView tvDetailTitle = findViewById(R.id.tvDetailTitle);
        TextView tvDetailContent = findViewById(R.id.tvDetailContent);

        String category = getIntent().getStringExtra("category");
        String item = getIntent().getStringExtra("item");

        tvDetailTitle.setText(item);
        tvDetailContent.setText(buildDetail(category, item));
    }

    private String buildDetail(String category, String item) {
        if ("Encomiendas".equals(category)) {
            return "Código: " + item.split(" · ")[0] +
                    "\nEstado: En tránsito" +
                    "\nTipo: Paquete" +
                    "\nPeso: 2.5 kg" +
                    "\nPrioridad: Normal" +
                    "\n\nDesde esta actividad podrían agregarse posteriormente funciones de edición.";
        }

        if ("Remitentes".equals(category)) {
            return "Nombre: " + item +
                    "\nTeléfono: 300 123 4567" +
                    "\nCiudad: Bogotá" +
                    "\nCorreo: ejemplo@correo.com" +
                    "\n\nEsta pantalla representa el detalle del remitente.";
        }

        return "Nombre: " + item +
                "\nTeléfono: 310 987 6543" +
                "\nCiudad: Medellín" +
                "\nDirección: Calle 10 # 20-30" +
                "\n\nEsta pantalla representa el detalle del destinatario.";
    }
}
