package ifrs.canoas.ifhelper.portal;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import ifrs.canoas.ifhelper.DefaultActivity;
import ifrs.canoas.ifhelper.R;
import ifrs.canoas.ifhelper.notes.ListarNotesActivity;

public class VerCursoActivity extends DefaultActivity {
    private int idCurso = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_curso);
        setToolbar();

        recuperaPutExtra();
        configuraFloatButton();
    }

    private void recuperaPutExtra(){
        //TODO pegar o id do curso que vem do campo anterior
    }

    private void configuraFloatButton(){
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ListarNotesActivity.class);
                intent.putExtra("idCurso", idCurso);
                startActivity(intent);
            }
        });
    }

}