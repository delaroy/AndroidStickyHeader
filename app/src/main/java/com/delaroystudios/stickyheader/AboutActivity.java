package com.delaroystudios.stickyheader;

/**
 * Created by delaroystudios on 7/10/2016.
 */
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;


public class AboutActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.about, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
            case R.id.action_github:
                startActivity(new Intent("android.intent.action.VIEW",
                        Uri.parse("https://github.com/delaroy")));
                break;
            case R.id.action_gplus:
                startActivity(new Intent("android.intent.action.VIEW",
                        Uri.parse("https://plus.google.com/u/0/+DelaroyStudios")));
                break;
            case R.id.action_twitter:
                startActivity(new Intent("android.intent.action.VIEW",
                        Uri.parse("https://twitter.com/delaroystudios")));
                break;
            case R.id.action_feedback:
                Intent intentFeedback = new Intent("android.intent.action.SEND");
                intentFeedback.setType("text/email");
                intentFeedback.putExtra("android.intent.extra.EMAIL", new String[]{"bamoyk@yahoo.com"});
                intentFeedback.putExtra("android.intent.extra.SUBJECT", "AStickyHeader Feedback");
                startActivity(Intent.createChooser(intentFeedback, "Send Feedback"));
                break;
            case R.id.action_support:
                Intent intentMarketAll = new Intent("android.intent.action.VIEW");
                intentMarketAll.setData(Uri.parse("http://www.delaroystudios.com"));
                startActivity(intentMarketAll);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
