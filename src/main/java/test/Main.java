package test;

import android.os.Handler;

public class Main {
	void aVoid() {
		new Handler().post(this::aVoid);
	}
}
