package com.vsc.fragmentsdemoapp.ui.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.vsc.fragmentsdemoapp.R;
import com.vsc.fragmentsdemoapp.models.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ContactsViewHolder> {

    private ContactsViewHolder.OnItemClickedListener onItemClickedListener;
    private List<Contact> contacts;

    public ContactsAdapter(ContactsViewHolder.OnItemClickedListener onItemClickedListener) {
        this.onItemClickedListener = onItemClickedListener;
        contacts = new ArrayList<>();
    }

    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.layout_contacts_item, viewGroup, false);
        return new ContactsViewHolder(itemView, onItemClickedListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder contactsViewHolder, final int i) {
        contactsViewHolder.txtName.setText(contacts.get(i).getContactName());
        contactsViewHolder.txtPhone.setText(contacts.get(i).getContactPhone());
        contactsViewHolder.grpContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickedListener.onContactClicked(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public void addContacts(List<Contact> contactList) {
        this.contacts = contactList;
        notifyDataSetChanged();
    }

    public static class ContactsViewHolder extends RecyclerView.ViewHolder {

        private TextView txtName;
        private TextView txtPhone;
        private LinearLayout grpContact;

        public ContactsViewHolder(@NonNull View itemView, OnItemClickedListener onItemClickedListener) {
            super(itemView);

            txtName = itemView.findViewById(R.id.txt_contact_name);
            txtPhone = itemView.findViewById(R.id.txt_contact_phone);
            grpContact = itemView.findViewById(R.id.grp_conatcts);
        }

        public interface OnItemClickedListener {
            void onContactClicked(int position);
        }
    }
}
