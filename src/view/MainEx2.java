package view;

import controller.ThreadEx2;

public class MainEx2 {
	public static void main(String[] args) {

		for (int idThread = 0; idThread < 5; idThread++) {
			Thread threadId = new ThreadEx2(idThread);
			threadId.start();
		}

	}
}