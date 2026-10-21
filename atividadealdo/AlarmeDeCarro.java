package atividadealdo;

public class AlarmeDeCarro {
	private boolean estadoAtivo;
	private int sensibilidade;
	private String tipoUltimoEvento;
	private String horarioUltimoEvento;
	
	public AlarmeDeCarro(int sensibilidade) {
		this.sensibilidade = sensibilidade;
	}
	
	public boolean alternarEstado() {
		return estadoAtivo = !estadoAtivo;
	}
	
	public String dispararAlarme(String tipoEvento, String horario) {
		if (!estadoAtivo) {
			return "alarme não ativado";
		}
		
		tipoUltimoEvento = tipoEvento;
		horarioUltimoEvento = horario;
		
		return "Evento: " + tipoUltimoEvento + " Horario: " + horarioUltimoEvento;
	}

	public boolean isEstadoAtivo() {
		return estadoAtivo;
	}

	public void setEstadoAtivo(boolean estadoAtivo) {
		this.estadoAtivo = estadoAtivo;
	}

	public int getSensibilidade() {
		return sensibilidade;
	}

	public void setSensibilidade(int sensibilidade) {
		this.sensibilidade = sensibilidade;
	}

	public String getTipoUltimoEvento() {
		return tipoUltimoEvento;
	}

	public String getHorarioUltimoEvento() {
		return horarioUltimoEvento;
	}

	@Override
	public String toString() {
		return "AlarmeDeCarro [estadoAtivo=" + estadoAtivo + ", sensibilidade=" + sensibilidade + ", tipoUltimoEvento="
				+ tipoUltimoEvento + ", horarioUltimoEvento=" + horarioUltimoEvento + "]";
	}
}
