package br.com.designpatterns2.bridge;

public class GoogleMaps implements Mapa{

	@Override
	public String devolveMapa(String rua) {		
		return "Mapa";
	}

}
