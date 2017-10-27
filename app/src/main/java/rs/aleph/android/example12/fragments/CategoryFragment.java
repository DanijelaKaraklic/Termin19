package rs.aleph.android.example12.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

import rs.aleph.android.example12.R;
import rs.aleph.android.example12.providers.CategoryProvider;

/**
 * Created by KaraklicDM on 26.10.2017.
 */

public class CategoryFragment extends Fragment{
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        List<String> categoryNames = CategoryProvider.getCategoryNames();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(), R.layout.list_item,categoryNames);
        ListView lvKategorije = (ListView) getActivity().findViewById(R.id.listOfCategories);
        lvKategorije.setAdapter(adapter);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.category_fragment,container,false);

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}
