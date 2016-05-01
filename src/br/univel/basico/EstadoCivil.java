package br.univel.basico;

public enum EstadoCivil {
	SOLTEIRO, CASADO, VIUVO, SEPARADO, AMASIADO, OUTROS;
	
	public static Object getPorid(int value) {
		for (EstadoCivil item : EstadoCivil.values()) {
            if (item.ordinal() == value) {
            	return item;
            }
        }
		throw new RuntimeException("Estado Civil Inválido: " + value);
	
		
	}
}