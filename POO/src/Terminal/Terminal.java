package Terminal;

class Terminal {

	  private String numero;
	  private int tiempoDeConversacion; // tiempo de conversaci�n en segundos

	  Terminal(String numero) {
	    this.numero = numero;
	    this.tiempoDeConversacion = 0;
	  }

	  public String getNumero() {
	    return numero;
	  }

	  public void setNumero(String numero) {
	    this.numero = numero;
	  }

	  public int getTiempoDeConversacion() {
	    return tiempoDeConversacion;
	  }

	  public void setTiempoDeConversacion(int tiempoDeConversacion) {
	    this.tiempoDeConversacion = tiempoDeConversacion;
	  }

	  @Override
	  public String toString() {
	    return "N� " + numero + " - " + this.tiempoDeConversacion + "s de conversaci�n ";
	  }

	  public void llama(Terminal t, int segundosDeLlamada) {
	    this.tiempoDeConversacion += segundosDeLlamada;
	    t.tiempoDeConversacion += segundosDeLlamada;
	  }

	}
