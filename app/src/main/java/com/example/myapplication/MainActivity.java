package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

	ArrayList<String> arrayList;

	RecyclerView recyclerView;

	@SuppressLint("MissingInflatedId")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		arrayList = new ArrayList<>();

		arrayList.add("Akti");
		arrayList.add("Boris");
		arrayList.add("Dimon");
		arrayList.add("Tolik");
		arrayList.add("Vova");
		arrayList.add("Vika");

		ContactsAdapter adapter = new ContactsAdapter(arrayList);

		recyclerView = findViewById(R.id.recyclerView);

		recyclerView.setAdapter(adapter);
	}

	int[] nums = {10002, 293, 123, 4352, 96354, 816, 992, 984, 884, 38};
         System.out.println  ("Четные числа:");
        for (int num : nums) {
		if (num % 2 == 0) {
			System.out.println(num);
		}
	}
        System.out.printin ("Нечетные числа:");
        for (int num : nums) {
		if (num % 2 != 0) {
			System.out.println(num);
		}
	}
}
