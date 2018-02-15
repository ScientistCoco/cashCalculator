package com.example.court.moneycounter;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    // Initializing views
    EditText fiveCent;
    EditText tenCent;
    EditText twentyCent;
    EditText fiftyCent;
    EditText oneDollar;
    EditText twoDollar;
    EditText fiveDollar;
    EditText tenDollar;
    EditText twentyDollar;
    EditText fiftyDollar;
    EditText fourDollar;
    TextView totalOfCashView;

    Double totalResult = 0.00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        fiveCent = (EditText) findViewById(R.id.fiveCent);
        tenCent = (EditText) findViewById(R.id.tenCent);
        twentyCent = (EditText) findViewById(R.id.twentyCent);
        fiftyCent = (EditText) findViewById(R.id.fiftyCent);
        oneDollar = (EditText) findViewById(R.id.oneDollar);
        twoDollar = (EditText) findViewById(R.id.twoDollar);
        fiveDollar = (EditText) findViewById(R.id.fiveDollar);
        tenDollar = (EditText) findViewById(R.id.tenDollar);
        twentyDollar = (EditText) findViewById(R.id.twentyDollar);
        fiftyDollar = (EditText) findViewById(R.id.fiftyDollar);
        fourDollar = (EditText) findViewById(R.id.fourDollar);

        totalOfCashView = (TextView)findViewById(R.id.totalValue);

        // Set text watcher listener
        fiveCent.addTextChangedListener(fiveCentWatcher);
        tenCent.addTextChangedListener(tenCentWatcher);
        twentyCent.addTextChangedListener(twentyCentWatcher);
        fiftyCent.addTextChangedListener(fiftyCentWatcher);
        oneDollar.addTextChangedListener(oneDollarWatcher);
        twoDollar.addTextChangedListener(twoDollarWatcher);
        fiveDollar.addTextChangedListener(fiveDollarWatcher);
        tenDollar.addTextChangedListener(tenDollarWatcher);
        twentyDollar.addTextChangedListener(twentyDollarWatcher);
        fiftyDollar.addTextChangedListener(fiftyDollarWatcher);
        fourDollar.addTextChangedListener(fourDollarWatcher);
    }

    //Creating an object?
    private final TextWatcher fiveCentWatcher = new TextWatcher(){
        public void beforeTextChanged(CharSequence s, int start, int count, int after){
        }
        public void onTextChanged(CharSequence s, int start, int before, int count){
        }
        public void afterTextChanged(Editable s){
            TextView text = (TextView) findViewById(R.id.fiveCentResult);
            // Second condition prevents the enter button from triggering and error
            if(s.length() > 0) {
                text.setText(String.format("%.2f", resultTotal(fiveCent)));
            } else {
                text.setText("0.00");
            }
            getAllCashDenominations();
        }
    };

    private final TextWatcher tenCentWatcher = new TextWatcher(){
        public void beforeTextChanged(CharSequence s, int start, int count, int after){
        }
        public void onTextChanged(CharSequence s, int start, int before, int count){
        }
        public void afterTextChanged(Editable s){
            TextView text = (TextView) findViewById(R.id.tenCentResult);
            // Second condition prevents the enter button from triggering and error
            if(s.length() > 0) {
                text.setText(String.format("%.2f", resultTotal(tenCent)));
            } else {
                text.setText("0.00");
            }
            getAllCashDenominations();
        }
    };

    private final TextWatcher twentyCentWatcher = new TextWatcher(){
        public void beforeTextChanged(CharSequence s, int start, int count, int after){
        }
        public void onTextChanged(CharSequence s, int start, int before, int count){
        }
        public void afterTextChanged(Editable s){
            TextView text = (TextView) findViewById(R.id.twentyCentResult);
            // Second condition prevents the enter button from triggering and error
            if(s.length() > 0 && s.toString().contains("\n") == false) {
                text.setText(String.format("%.2f", resultTotal(twentyCent)));
            } else {
                text.setText("0.00");
            }
            getAllCashDenominations();
        }
    };

    private final TextWatcher fiftyCentWatcher = new TextWatcher(){
        public void beforeTextChanged(CharSequence s, int start, int count, int after){
        }
        public void onTextChanged(CharSequence s, int start, int before, int count){
        }
        public void afterTextChanged(Editable s){
            TextView text = (TextView) findViewById(R.id.fiftyCentResult);
            // Second condition prevents the enter button from triggering and error
            if(s.length() > 0 && s.toString().contains("\n") == false) {
                text.setText(String.format("%.2f", resultTotal(fiftyCent)));
            } else {
                text.setText("0.00");
            }
            getAllCashDenominations();
        }
    };

    private final TextWatcher oneDollarWatcher = new TextWatcher(){
        public void beforeTextChanged(CharSequence s, int start, int count, int after){
        }
        public void onTextChanged(CharSequence s, int start, int before, int count){
        }
        public void afterTextChanged(Editable s){
            TextView text = (TextView) findViewById(R.id.oneDollarResult);
            // Second condition prevents the enter button from triggering and error
            if(s.length() > 0 && s.toString().contains("\n") == false) {
                text.setText(String.format("%.2f", resultTotal(oneDollar)));
            } else {
                text.setText("0.00");
            }
            getAllCashDenominations();
        }
    };

    private final TextWatcher twoDollarWatcher = new TextWatcher(){
        public void beforeTextChanged(CharSequence s, int start, int count, int after){
        }
        public void onTextChanged(CharSequence s, int start, int before, int count){
        }
        public void afterTextChanged(Editable s){
            TextView text = (TextView) findViewById(R.id.twoDollarResult);
            // Second condition prevents the enter button from triggering and error
            if(s.length() > 0 && s.toString().contains("\n") == false) {
                text.setText(String.format("%.2f", resultTotal(twoDollar)));
            } else {
                text.setText("0.00");
            }
            getAllCashDenominations();
        }
    };

    private final TextWatcher fiveDollarWatcher = new TextWatcher(){
        public void beforeTextChanged(CharSequence s, int start, int count, int after){
        }
        public void onTextChanged(CharSequence s, int start, int before, int count){
        }
        public void afterTextChanged(Editable s){
            TextView text = (TextView) findViewById(R.id.fiveDollarResult);
            // Second condition prevents the enter button from triggering and error
            if(s.length() > 0 && s.toString().contains("\n") == false) {
                text.setText(String.format("%.2f", resultTotal(fiveDollar)));
            } else {
                text.setText("0.00");
            }
            getAllCashDenominations();
        }
    };

    private final TextWatcher tenDollarWatcher = new TextWatcher(){
        public void beforeTextChanged(CharSequence s, int start, int count, int after){
        }
        public void onTextChanged(CharSequence s, int start, int before, int count){
        }
        public void afterTextChanged(Editable s){
            TextView text = (TextView) findViewById(R.id.tenDollarResult);
            // Second condition prevents the enter button from triggering and error
            if(s.length() > 0 && s.toString().contains("\n") == false) {
                text.setText(String.format("%.2f", resultTotal(tenDollar)));
            } else {
                text.setText("0.00");
            }
            getAllCashDenominations();
        }
    };

    private final TextWatcher twentyDollarWatcher = new TextWatcher(){
        public void beforeTextChanged(CharSequence s, int start, int count, int after){
        }
        public void onTextChanged(CharSequence s, int start, int before, int count){
        }
        public void afterTextChanged(Editable s){
            TextView text = (TextView) findViewById(R.id.twentyDollarResult);
            // Second condition prevents the enter button from triggering and error
            if(s.length() > 0 && s.toString().contains("\n") == false) {
                text.setText(String.format("%.2f", resultTotal(twentyDollar)));
            } else {
                text.setText("0.00");
            }
            getAllCashDenominations();
        }
    };

    private final TextWatcher fiftyDollarWatcher = new TextWatcher(){
        public void beforeTextChanged(CharSequence s, int start, int count, int after){
        }
        public void onTextChanged(CharSequence s, int start, int before, int count){
        }
        public void afterTextChanged(Editable s){
            TextView text = (TextView) findViewById(R.id.fiftyDollarResult);
            // Second condition prevents the enter button from triggering and error
            if(s.length() > 0 && s.toString().contains("\n") == false) {
                text.setText(String.format("%.2f", resultTotal(fiftyDollar)));
            } else {
                text.setText("0.00");
            }
            getAllCashDenominations();
        }
    };

    private final TextWatcher fourDollarWatcher = new TextWatcher(){
        public void beforeTextChanged(CharSequence s, int start, int count, int after){
        }
        public void onTextChanged(CharSequence s, int start, int before, int count){
        }
        public void afterTextChanged(Editable s){
            TextView text = (TextView) findViewById(R.id.fourDollarResult);
            // Second condition prevents the enter button from triggering and error
            if(s.length() > 0 && s.toString().contains("\n") == false) {
                text.setText(String.format("%.2f", resultTotal(fourDollar)));
            } else {
                text.setText("0.00");
            }
            getAllCashDenominations();
        }
    };

    // This method calculates the individual result for each denomination
    private Double resultTotal(EditText view) {
        double multiplier = Double.parseDouble(view.getHint().toString());
        double quantity = Double.parseDouble(view.getText().toString());
        return multiplier * quantity;
    }

    // This method calculates the whole result
    private void getAllCashDenominations(){
        TextView fiveCentView = (TextView) findViewById(R.id.fiveCentResult);
        TextView tenCentView = (TextView) findViewById(R.id.tenCentResult);
        TextView twentyCentView = (TextView) findViewById(R.id.twentyCentResult);
        TextView fiftyCentView = (TextView) findViewById(R.id.fiftyCentResult);
        TextView oneDollarView = (TextView) findViewById(R.id.oneDollarResult);
        TextView twoDollarView = (TextView) findViewById(R.id.twoDollarResult);
        TextView fiveDollarView = (TextView) findViewById(R.id.fiveDollarResult);
        TextView tenDollarView = (TextView) findViewById(R.id.tenDollarResult);
        TextView twentyDollarView = (TextView) findViewById(R.id.twentyDollarResult);
        TextView fiftyDollarView = (TextView) findViewById(R.id.fiftyDollarResult);
        TextView fourDollarView = (TextView) findViewById(R.id.fourDollarResult);

        Double sum = Double.parseDouble(fiveCentView.getText().toString())+
                Double.parseDouble(tenCentView.getText().toString()) +
                Double.parseDouble(twentyCentView.getText().toString()) +
                Double.parseDouble(fiftyCentView.getText().toString()) +
                Double.parseDouble(oneDollarView.getText().toString()) +
                Double.parseDouble(twoDollarView.getText().toString()) +
                Double.parseDouble(fiveDollarView.getText().toString()) +
                Double.parseDouble(tenDollarView.getText().toString()) +
                Double.parseDouble(twentyDollarView.getText().toString()) +
                Double.parseDouble(fiftyDollarView.getText().toString()) +
                Double.parseDouble(fourDollarView.getText().toString());

        totalOfCashView.setText("$" + String.format("%.2f", sum));
    }

    public void clearAll(View view){
        TextView fiveCentView = (TextView) findViewById(R.id.fiveCentResult);
        TextView tenCentView = (TextView) findViewById(R.id.tenCentResult);
        TextView twentyCentView = (TextView) findViewById(R.id.twentyCentResult);
        TextView fiftyCentView = (TextView) findViewById(R.id.fiftyCentResult);
        TextView oneDollarView = (TextView) findViewById(R.id.oneDollarResult);
        TextView twoDollarView = (TextView) findViewById(R.id.twoDollarResult);
        TextView fiveDollarView = (TextView) findViewById(R.id.fiveDollarResult);
        TextView tenDollarView = (TextView) findViewById(R.id.tenDollarResult);
        TextView twentyDollarView = (TextView) findViewById(R.id.twentyDollarResult);
        TextView fiftyDollarView = (TextView) findViewById(R.id.fiftyDollarResult);
        TextView fourDollarView = (TextView) findViewById(R.id.fourDollarResult);

        fiveCentView.setText("0.00");
        tenCentView.setText("0.00");
        twentyCentView.setText("0.00");
        fiftyCentView.setText("0.00");
        oneDollarView.setText("0.00");
        twoDollarView.setText("0.00");
        fiveDollarView.setText("0.00");
        tenDollarView.setText("0.00");
        twentyDollarView.setText("0.00");
        fiftyDollarView.setText("0.00");
        fourDollarView.setText("0.00");

        fiveCent.setText(null);
        tenCent.setText(null);
        twentyCent.setText(null);
        fiftyCent.setText(null);
        oneDollar.setText(null);
        twoDollar.setText(null);
        fiveDollar.setText(null);
        tenDollar.setText(null);
        twentyDollar.setText(null);
        fiftyDollar.setText(null);
        fourDollar.setText(null);
    }
}
