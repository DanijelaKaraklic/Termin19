package rs.aleph.android.example12.activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

import rs.aleph.android.example12.R;
import rs.aleph.android.example12.providers.CategoryProvider;

/**
 * Created by KaraklicDM on 26.10.2017.
 */

public class CategoryActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        List<String> categoryNames = CategoryProvider.getCategoryNames();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,R.layout.list_item,categoryNames);
        ListView lvKategorije = (ListView) findViewById(R.id.category_list);
        lvKategorije.setAdapter(adapter);

    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
