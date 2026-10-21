package atividadealdo;


public class TesteList {
	public static void main(String[] args) {
		AlarmeDeCarro[] a = new AlarmeDeCarro[3]; //contem 0, 1 e 2
		
		
		a[0] = new AlarmeDeCarro(1); // declara objeto na lista
		a[1] = new AlarmeDeCarro(313); // declara objeto na lista
		a[2] = new AlarmeDeCarro(12); // declara objeto na lista
		
		System.out.println(a[0].alternarEstado()); // 1 liga 
		
		System.out.println(a[2].alternarEstado()); // 3 liga 

		System.out.println(a[0].dispararAlarme("Porta", "16:03:43")); // 1 registra alarme
		System.out.println(a[1].dispararAlarme("Cu", "34:92:34")); // 2 desligado não resgistra
		System.out.println(a[2].dispararAlarme("tentativa de assalto", "21:39:40")); // 3 registra alarme
		
		for (int i = 0; i>a.length; i++) {
			System.out.println(a[i]); //loop for
		}
	}	
}
