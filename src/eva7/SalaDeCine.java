/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva7;

import java.util.ArrayList;

/**
 *
 * @author
 */
public class SalaDeCine {

  private ArrayList<Pelicula> arrayPeliculas;
  private int nMujeres, nActoresJovenes;

  public SalaDeCine() {
	nMujeres = 0;
	nActoresJovenes = 0;
	arrayPeliculas = new ArrayList<Pelicula>();
  }

  public void agregarPelicula(String Titulo, String Genero, String Director, String Protagonista, int edad, String nacionalidad, char sexo) {
	arrayPeliculas.add(new Pelicula(Titulo, Genero, Director, Protagonista,edad, nacionalidad, sexo));
  }

  public boolean buscarPelicula(String Titulo) {

	for (Pelicula actual : arrayPeliculas) {
	  if (actual.getTitulo().equalsIgnoreCase(Titulo)) {
		return true;
	  }
	}

	return false;
  }

  public void ListarPeliculas() {
	for (Pelicula actual : arrayPeliculas) {

	  System.out.println("Titulo: " + actual.getTitulo());
	  System.out.println("Genero: " + actual.getGenero());
	  System.out.println("Protagonista: " + actual.getProtagonista());

	}
  }

  public int ActricesMujeres() {
	  nMujeres=0;
	for (Pelicula actual:arrayPeliculas) {

	  if (actual.actor.getSexo() == 'F') {
		nMujeres += 1;
	  }

	}

	return this.nMujeres;
  }

  public int ObtenerActoresJovenes(String nacionalidad) {

	nActoresJovenes=0;
	for (Pelicula actual:arrayPeliculas) {

	  if (actual.actor.getEdad() >= 18 && actual.actor.getEdad() <= 30 && actual.actor.getNacionalidad().equals(nacionalidad)) {
		nActoresJovenes++;
	  }

	}

	return nActoresJovenes;
  }

}
