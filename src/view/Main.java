package view;
import control.Identidade;
public class Main {
	public static void main (String[] args){
		for (int id = 0; id < 6; id++){
			//ThreadID threadID = new ThreadID(idThread);
			Thread Tid = new Identidade(id);
			Tid.start();
		}
	}
}
