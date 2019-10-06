package id.ac.poliban.mi.latihan04;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu );
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.miFile:
                Toast.makeText(this, "File di klik", Toast.LENGTH_SHORT).show();
                break;
            case R.id.miExite :
                Toast.makeText(this, "SABAR AI !!!", Toast.LENGTH_SHORT).show();
                finish();
                break;
            case R.id.miEdit :
                Toast.makeText(this, "Berhasil", Toast.LENGTH_SHORT).show();
                break;
            case R.id.miSave :
                Toast.makeText(this, "File disimpan", Toast.LENGTH_SHORT).show();
                break;

        }
        return true ;
    }
}
