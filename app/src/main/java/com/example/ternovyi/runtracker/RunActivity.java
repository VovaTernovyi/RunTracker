package com.example.ternovyi.runtracker;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class RunActivity extends SingleFragmentActivity {

    /** Ключ для передачі ідентифікатора серії в форматі long */
    public static final String EXTRA_RUN_ID =
            "com.example.ternovyi.runtracker.run_id";

    @Override
    protected Fragment createFragment() {
        long runId = getIntent().getLongExtra(EXTRA_RUN_ID, -1);
        if (runId != -1) {
            return RunFragment.newInstance(runId);
        } else {
            return new RunFragment();
        }
    }
}
