package controller;

public class ThreadEx2 extends Thread {
	private int idThread;

	public ThreadEx2(int idThread) {
		this.idThread = idThread;

	}

	@Override
	public void run() {
		System.out.println(idThread + " = " + getId());
	}
}
