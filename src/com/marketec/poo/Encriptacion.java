package com.marketec.poo;

public class Encriptacion {

	private int nivel;
	private String nombre;

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String ejecutarCesar(Usuario usuario) {
		
		final String[] ABC = { "A" ,"B","C","D","E","F","G","H","I","J","K","L","M",
				"N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

		StringBuilder sb = new StringBuilder();
		
	    String texto = usuario.getClave();
		
	    for (int i = 0; i < texto.length(); i++) {
			char elemento = texto.charAt(i);
			for (int j = 0; j < ABC.length; j++) {
				if(String.valueOf(elemento).equalsIgnoreCase(ABC[j])) {
					int posicion = nivel + j;
					if(posicion >= ABC.length) {
						int x = posicion - ABC.length;
						sb.append(ABC[x]);
					} else  {
						sb.append(ABC[posicion]);
						break;
					}
					
				}
			}
			
		}

	return sb.toString();
	
	}
}
