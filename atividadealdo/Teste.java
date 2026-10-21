package atividadealdo;

public class Teste {

	public static void main(String[] args) {
		AlarmeDeCarro a1 = new AlarmeDeCarro(1);

		if (a1.alternarEstado()) {
			System.out.println("Alarme está ligado");
		} else {
			System.out.println("Alarme está desligado");
		}
		System.out.println("Nivel de sensibilidade = " +a1.getSensibilidade());

		if (a1.isEstadoAtivo()) {
			System.out.println("Sucesso ao ativar o alarme");
		} else {
			System.out.println("Não houve sucesso ao ativar o alarme");
		}

		String resultado = a1.dispararAlarme("Alarme disparado devido a uma " +
				"Tentativa de furto", "10:00");


		System.out.println(resultado);

		if (a1.isEstadoAtivo()) {
					System.out.println("Tipo do último evento: " + a1.getTipoUltimoEvento());
					System.out.println("Horário do último evento: " + a1.getHorarioUltimoEvento());
				}
			}
		}
