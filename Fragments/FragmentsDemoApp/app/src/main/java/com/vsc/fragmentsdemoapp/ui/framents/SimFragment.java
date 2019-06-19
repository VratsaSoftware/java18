package com.vsc.fragmentsdemoapp.ui.framents;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.vsc.fragmentsdemoapp.R;
import com.vsc.fragmentsdemoapp.models.Contact;
import com.vsc.fragmentsdemoapp.ui.adapters.ContactsAdapter;

import java.util.ArrayList;
import java.util.List;

public class SimFragment extends Fragment implements ContactsAdapter.ContactsViewHolder.OnItemClickedListener {

    private RecyclerView recyclerView;
    private ContactsAdapter contactsAdapter;
    private List<Contact> sortedContacts;
    private View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.layout_fragment_sim, container, false);
        contactsAdapter = new ContactsAdapter(this);
        recyclerView = view.findViewById(R.id.recycler_view_sim);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(contactsAdapter);
        buildContacts();
        return view;
    }

    private void buildContacts() {
        sortedContacts = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            if (i % 2 == 0) {
                sortedContacts.add(new Contact("Name " + i, "6621456624" + i, false));
            }
        }
        contactsAdapter.addContacts(sortedContacts);
    }

    @Override
    public void onContactClicked(int position) {
        Toast.makeText(getContext(), "Item clicked " + position, Toast.LENGTH_SHORT).show();
    }
}
