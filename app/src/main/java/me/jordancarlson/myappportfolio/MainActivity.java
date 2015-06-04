package me.jordancarlson.myappportfolio;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

/**
 * Main Activity for simple portfolio launcher app.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);

        // Init Toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Check if we're running on Android 5.0 or higher
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            // Call some material design APIs here
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(getResources().getColor(R.color.blue_700));
        }

    }

    @OnClick(R.id.spotifyButton) void onSpotifyClick() {
        Toast.makeText(this, "Launch Spotify Streamer app!", Toast.LENGTH_SHORT).show();
    }
    @OnClick(R.id.scoresButton) void onScoresClick() {
        Toast.makeText(this, "Launch Scores app!", Toast.LENGTH_SHORT).show();
    }
    @OnClick(R.id.libraryButton) void onLibraryClick() {
        Toast.makeText(this, "Launch Library app!", Toast.LENGTH_SHORT).show();
    }
    @OnClick(R.id.buildButton) void onBuildClick() {
        Toast.makeText(this, "Launch Build It Bigger app!", Toast.LENGTH_SHORT).show();
    }
    @OnClick(R.id.xyzButton) void onXyzClick() {
        Toast.makeText(this, "Launch XYZ Reader app!", Toast.LENGTH_SHORT).show();
    }
    @OnClick(R.id.capstoneButton) void onCapstoneClick() {
        Toast.makeText(this, "Launch Capstone app!", Toast.LENGTH_SHORT).show();
    }
}
