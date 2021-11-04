package cat.dam.alex.buttonlayout;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button btn_lyt1 = findViewById(R.id.btn_lyt1);
        final Button btn_lyt2 = findViewById(R.id.btn_lyt2);
        final Button btn_lyt3 = findViewById(R.id.btn_lyt3);
        final FrameLayout fl_content = findViewById(R.id.fl_content);
        //Per defecte mostra el primer layout
        View child = getLayoutInflater().inflate(R.layout.ex1_activity_main, null);
        fl_content.addView(child);
        //en cas de que es premi algun dels botons mostrarà el layout corresponent
        btn_lyt1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button 1 Clicked");
                fl_content.removeAllViews();
                View child = getLayoutInflater().inflate(R.layout.ex1_activity_main, null);
                fl_content.addView(child);
            }
        });
        btn_lyt2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button 2 Clicked");
                fl_content.removeAllViews();
                View child = getLayoutInflater().inflate(R.layout.ex2_activity_main, null);
                fl_content.addView(child);
            }
        });
        btn_lyt3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button 3 Clicked");
                fl_content.removeAllViews();
                View child = getLayoutInflater().inflate(R.layout.ex3_activity_main, null);
                fl_content.addView(child);
            }
        });
    }
}