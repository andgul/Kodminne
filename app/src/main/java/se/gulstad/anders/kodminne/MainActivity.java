package se.gulstad.anders.kodminne;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

/** Kodminne by Anders Gulstad 2018
 *
 * @author Anders Gulstad 2018
 * @version 0.3.0
 * @use This is USE
 *
 * 2017-03-13 : Begin comments
 * 2017-03-17 : Någon ordning på layouten
 * 2017-04-23 : Nu funkar appen äntligen
 * 2017-05-07 : Hur lösa kryptering/lösenord hantering ?
 * 2018-03-28 : Fixa design
 *
 */

// TODO: 2017-04-23 Krypteringen ?


public class MainActivity extends AppCompatActivity {

    public static final String PREFS_NAME = "MyPrefsFile";

    TextView editText1;
    TextView editText2;
    TextView editText3;
    TextView editText4;
    TextView editText5;
    TextView editText6, editText7;

    TextView editCode1;
    TextView editCode2;
    TextView editCode3;
    TextView editCode4;
    TextView editCode5;
    TextView editCode6, editCode7;

    String[] cardText = new String[10];

    String cardText1;
    String cardText2;
    String cardText3;
    String cardText4;
    String cardText5;
    String cardText6, cardText7;

    String[] cardCode = new String[10];

    String cardCode1;
    String cardCode2;
    String cardCode3;
    String cardCode4;
    String cardCode5;
    String cardCode6, cardCode7;

    //---------------------------------------------------------------------------------------------
    // OnCreate() skapar själva appen
    //---------------------------------------------------------------------------------------------

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //ToDo: Debug
        Toast startToast = Toast.makeText(getApplicationContext(), "Läs in datat", Toast.LENGTH_LONG);
        startToast.show();


        //------------------------------------------------------------------------------------------------
        // Hitta fälten i XML
        //------------------------------------------------------------------------------------------------

        editText1 = (TextView) findViewById(R.id.editText1);
        editText2 = (TextView) findViewById(R.id.editText2);
        editText3 = (TextView) findViewById(R.id.editText3);
        editText4 = (TextView) findViewById(R.id.editText4);
        editText5 = (TextView) findViewById(R.id.editText5);
        editText6 = (TextView) findViewById(R.id.editText6);
        editText7 = (TextView) findViewById(R.id.editText7);

        editCode1 = (TextView) findViewById(R.id.editCode1);
        editCode2 = (TextView) findViewById(R.id.editCode2);
        editCode3 = (TextView) findViewById(R.id.editCode3);
        editCode4 = (TextView) findViewById(R.id.editCode4);
        editCode5 = (TextView) findViewById(R.id.editCode5);
        editCode6 = (TextView) findViewById(R.id.editCode6);
        editCode7 = (TextView) findViewById(R.id.editCode7);

        //------------------------------------------------------------------------------------------------
        // Hantera globala variabler med SharedPreferences
        //------------------------------------------------------------------------------------------------

        // Restore preferences

        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);

        cardText1 = settings.getString("cardText1", "Empty");
        cardText2 = settings.getString("cardText2", "Empty");
        cardText3 = settings.getString("cardText3", "Empty");
        cardText4 = settings.getString("cardText4", "Empty");
        cardText5 = settings.getString("cardText5", "Empty");
        cardText6 = settings.getString("cardText6", "Empty");
        cardText7 = settings.getString("cardText7", "String");

        cardCode1 = settings.getString("cardCode1", "0601");
        cardCode2 = settings.getString("cardCode2", "0502");
        cardCode3 = settings.getString("cardCode3", "0403");
        cardCode4 = settings.getString("cardCode4", "0304");
        cardCode5 = settings.getString("cardCode5", "0205");
        cardCode6 = settings.getString("cardCode6", "0106");
        cardCode7 = settings.getString("cardCode7", "NA");

        // TODO: 2017-04-23 Här ska kryptering eller lösenord hanteras ?
        // Lägg upp dialog att ange krypto nyckel

        editText1.setText(cardText1);
        editText2.setText(cardText2);
        editText3.setText(cardText3);
        editText4.setText(cardText4);
        editText5.setText(cardText5);
        editText6.setText(cardText6);
        editText7.setText(cardText7);

        editCode1.setText(cardCode1);
        editCode2.setText(cardCode2);
        editCode3.setText(cardCode3);
        editCode4.setText(cardCode4);
        editCode5.setText(cardCode5);
        editCode6.setText(cardCode6);
        editCode7.setText(cardCode7);

        //ToDo: Debug
        Toast checkToast = Toast.makeText(getApplicationContext(), "Read Prefs Complete ", Toast.LENGTH_LONG);
        checkToast.show();


        //------------------------------------------------------------------------------------------------
        // FAB Toolbar
        //------------------------------------------------------------------------------------------------
        //ToDo: Göra något av FAB

        /*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        */
    }

    /*
    // Fråga med en Dialog

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        // Get the layout inflater
        LayoutInflater inflater = getActivity().getLayoutInflater();

        // Inflate and set the layout for the dialog
        // Pass null as the parent view because its going in the dialog layout
        builder.setView(inflater.inflate(R.layout.dialog_signin, null))
                // Add action buttons
                .setPositiveButton(R.string.signin, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // sign in the user ...
                    }
                })
                .setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        LoginDialogFragment.this.getDialog().cancel();
                    }
                });
        return builder.create();
    }
    */


    // ------------------------------------------------------------------------------------------------
    // Skapa meny (menu_main)
    //------------------------------------------------------------------------------------------------

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    // ------------------------------------------------------------------------------------------------
    // Välj i meny (menu_main)
    //------------------------------------------------------------------------------------------------

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        //int id = item.getItemId();

        // Handle item selection
        switch (item.getItemId()) {
            case R.id.action_settings:
                showSettings();
                return true;
            case R.id.action_quit:
                showQuit();
                return true;
            case R.id.action_about:
                showAbout();
                return true;
            case R.id.action_help:
                showHelp();
                return true;
            case R.id.action_feedback:
                showFeedback();
                return true;
            case R.id.action_reset:
                resetAll();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    // --------------------------------------------------------------------------------------------
    // Trycker knappen "Spara" och Spara data
    //---------------------------------------------------------------------------------------------

    public void onSaveButtonClicked(View view) {

        Toast saveToast = Toast.makeText(getApplicationContext(), "Sparar data", Toast.LENGTH_SHORT);
        saveToast.show();

        // Samla in det som är ifyllt på panelen

        editText1 = (TextView) findViewById(R.id.editText1);
        editText2 = (TextView) findViewById(R.id.editText2);
        editText3 = (TextView) findViewById(R.id.editText3);
        editText4 = (TextView) findViewById(R.id.editText4);
        editText5 = (TextView) findViewById(R.id.editText5);
        editText6 = (TextView) findViewById(R.id.editText6);
        editText7 = (TextView) findViewById(R.id.editText7);

        editCode1 = (TextView) findViewById(R.id.editCode1);
        editCode2 = (TextView) findViewById(R.id.editCode2);
        editCode3 = (TextView) findViewById(R.id.editCode3);
        editCode4 = (TextView) findViewById(R.id.editCode4);
        editCode5 = (TextView) findViewById(R.id.editCode5);
        editCode6 = (TextView) findViewById(R.id.editCode6);
        editCode7 = (TextView) findViewById(R.id.editCode7);

        cardText1 = editText1.getText().toString();
        cardText2 = editText2.getText().toString();
        cardText3 = editText3.getText().toString();
        cardText4 = editText4.getText().toString();
        cardText5 = editText5.getText().toString();
        cardText6 = editText6.getText().toString();
        cardText7 = editText7.getText().toString();

        cardCode1 = editCode1.getText().toString();
        cardCode2 = editCode2.getText().toString();
        cardCode3 = editCode3.getText().toString();
        cardCode4 = editCode4.getText().toString();
        cardCode5 = editCode5.getText().toString();
        cardCode6 = editCode6.getText().toString();
        cardCode7 = editCode7.getText().toString();

        //Toast cardToast = Toast.makeText(getApplicationContext(), cardText1 + " : " + cardCode1, Toast.LENGTH_LONG);
        //cardToast.show();

        // TODO: 2017-04-23 Kryptering måste göras här

        // We need an Editor object to make preference changes.
        // All objects are from android.context.Context

        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        SharedPreferences.Editor editor = settings.edit();

        editor.putString("cardText1", cardText1);
        editor.putString("cardText2", cardText2);
        editor.putString("cardText3", cardText3);
        editor.putString("cardText4", cardText4);
        editor.putString("cardText5", cardText5);
        editor.putString("cardText6", cardText6);
        editor.putString("cardText7", cardText7);

        editor.putString("cardCode1", cardCode1);
        editor.putString("cardCode2", cardCode2);
        editor.putString("cardCode3", cardCode3);
        editor.putString("cardCode4", cardCode4);
        editor.putString("cardCode5", cardCode5);
        editor.putString("cardCode6", cardCode6);
        editor.putString("cardCode7", cardCode7);

        editor.apply();

        Toast myToast = Toast.makeText(getApplicationContext(), "Data är nu sparat", Toast.LENGTH_LONG);
        myToast.show();
    }


    //------------------------------------------------------------------------------------------------
    // Procedurer
    //------------------------------------------------------------------------------------------------

    public void showAbout()
    {
        Toast myToast = Toast.makeText(getApplicationContext(), R.string.About, Toast.LENGTH_LONG);
        myToast.show();
    }

    public void showHelp()
    {
        Toast myToast = Toast.makeText(getApplicationContext(), "Prata med programmeraren", Toast.LENGTH_LONG);
        myToast.show();
    }

    public void showFeedback()
    {
        Toast myToast = Toast.makeText(getApplicationContext(), "Prata med programmeraren", Toast.LENGTH_LONG);
        myToast.show();
    }

    public void showSettings()
    {
        Toast myToast = Toast.makeText(getApplicationContext(), "Det finns inga inställningar ännu", Toast.LENGTH_LONG);
        myToast.show();
    }
    public void showQuit()
    {
        Toast myToast = Toast.makeText(getApplicationContext(), "Avsluta med ?", Toast.LENGTH_LONG);
        myToast.show();
    }
    public void resetAll()
    {
        Toast myToast = Toast.makeText(getApplicationContext(), "Rensar allt data...", Toast.LENGTH_LONG);
        myToast.show();
        // TODO: 2017-04-23 Rensa allt och data
    }
}
