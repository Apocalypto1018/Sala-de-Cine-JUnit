/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import eva7.SalaDeCine;
import static org.junit.Assert.*;
import org.junit.*;

/**
 *
 * @author Kenshin
 */
public class SalaDeCineTest {

  SalaDeCine miCine;

  @Before
  public void before() {
	miCine = new SalaDeCine();
	miCine.agregarPelicula("Peli1", "Accion", "Director", "Mujer1", 18, "Espania", 'F');
	miCine.agregarPelicula("Peli2", "Drama", "Director", "Mujer2", 30, "Espania", 'F');
	miCine.agregarPelicula("Peli3", "Accion", "Director", "hombreJoven", 25, "Mexico", 'M');
	miCine.agregarPelicula("Peli4", "Comedia", "Director", "actor", 20, "Venezuela", 'M');
	miCine.agregarPelicula("Peli5", "Animada", "Director", "mujerJoven", 25, "Espania", 'F');
	miCine.agregarPelicula("Peli6", "Superheroes", "Director", "actor", 46, "Chile", 'M');

  }

  @Test
  public void testBuscarPelicula() {
	assertTrue(miCine.buscarPelicula("Peli1"));
	assertFalse(miCine.buscarPelicula("peliFalsa"));
  }

  @Test
  public void testListarPelicula() {
	miCine.ListarPeliculas();
  }

  @Test

  public void testActricesMujeres() {
	assertEquals(3, miCine.ActricesMujeres());
  }

  @Test
  public void testObtenerActoresJovenes() {
	assertEquals(3, miCine.ObtenerActoresJovenes("Espania"));
	assertEquals(1, miCine.ObtenerActoresJovenes("Mexico"));

  }

}
