package com.flip.connect.presentation.views.edit;

import android.support.design.widget.TextInputLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.flip.connect.R;
import com.flip.connect.domain.model.account.EmailsAccount;

import java.util.List;

/**
 * Created by Kanda on 13/07/2017.
 */

public class EmailAdapter extends RecyclerView.Adapter<EmailAdapter.ViewHolder> {
    int SECTION = 0;

    private List items;

    public EmailAdapter(List items) {
        this.items = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        return new ViewHolder(layoutInflater.inflate(R.layout.item_phone, parent, false));
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        TextInputLayout emailText = (TextInputLayout) holder.itemView.findViewById(R.id.email);
        EmailsAccount email = (EmailsAccount) items.get(position);
        emailText.getEditText().setText(email.getAddress());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private View itemView;

        ViewHolder(View itemView) {
            super(itemView);
            this.itemView = itemView;
        }
    }
}
