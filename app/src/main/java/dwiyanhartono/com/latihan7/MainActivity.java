package dwiyanhartono.com.latihan7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ET1,ET2,ET3;
    Button Submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ET1 = findViewById(R.id.ET1);
        ET2 = findViewById(R.id.ET2);
        ET3 = findViewById(R.id.ET3);
        Submit = findViewById(R.id.button_Main_Submit);

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Password = ET3.getText().toString();
                if(!Password.equals("1234")) {
                    Toast.makeText(MainActivity.this, "Password anda salah", Toast.LENGTH_SHORT).show();
                    return;
                }
                Integer Panjang = Integer.parseInt(ET1.getText().toString());
                Integer Lebar = Integer.parseInt((ET2.getText().toString()));
                int Luas = Panjang * Lebar;
                int Kell = 2 *(Panjang + Lebar);
                String Pesan = "Luas persegi adalah: " + Luas + " dan keliling persegi adalah: " + Kell;
                Toast.makeText(MainActivity.this, Pesan, Toast.LENGTH_LONG).show();
            }
        });
    }
}