package atividadealdo;

import java.util.ArrayList;

public class TesteArrayList {
	public static void main(String[] args) {
		ArrayList<AlarmeDeCarro> alarmes = new ArrayList<AlarmeDeCarro>();
		
		alarmes.add(new AlarmeDeCarro(1)); // declara objeto na lista Array
		alarmes.add(new AlarmeDeCarro(313)); // declara objeto na lista Array
		alarmes.add(new AlarmeDeCarro(12)); // declara objeto na lista Array
		
		System.out.println(alarmes.get(0).alternarEstado()); // 1 liga 
		
		System.out.println(alarmes.get(2).alternarEstado()); // 3 liga 

		System.out.println(alarmes.get(0).dispararAlarme("Porta", "16:03:43")); // 1 registra alarme
		System.out.println(alarmes.get(1).dispararAlarme("Cu", "34:92:34")); // 2 desligado não resgistra
		System.out.println(alarmes.get(2).dispararAlarme("tentativa de assaulto", "21:39:40")); // 3 registra alarme
		
		for (AlarmeDeCarro i : alarmes) {
			System.out.println(i);
		}
	}
}
