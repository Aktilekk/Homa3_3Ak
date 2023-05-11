package com.example.myapplication;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContactsViewHolder extends RecyclerView.ViewHolder {

	TextView nameTextView;
	TextView textSecondName;
	ImageView icon;


	public ContactsViewHolder(@NonNull View itemView) {
		super(itemView);
	}

	public void onBind(String contactName) {
		textSecondName = itemView.findViewById(R.id.textSecondName);
		nameTextView = itemView.findViewById(R.id.textViewName);
		icon = itemView.findViewById(R.id.imageView);

		nameTextView.setText(contactName);
		textSecondName.setText(contactName);
	}
}
