package estruturaDadosllTest;

import static org.junit.Assert.*;

import org.junit.Test;

import estruturaDadosll.numeroPorExtenso;

public class numeroPorExtensoTest {


	@Test
	public void recebeNumeroTest() {
		numeroPorExtenso extenso = new numeroPorExtenso();
		int recebido = extenso.numero(8);
		int pretendido = 8;
		assertEquals(pretendido, recebido, 0);
	}
	
	@Test
	public void recebeNumeroSomaTest() {
		numeroPorExtenso extenso = new numeroPorExtenso();
		int recebido = extenso.numero(8);
		int pretendido = 16;
		assertEquals(pretendido, recebido + 8, 0);
	}

	@Test
	public void recebeNumeroDiminuirTest() {
		numeroPorExtenso extenso = new numeroPorExtenso();
		int recebido = extenso.numero(8);
		int pretendido = 0;
		assertEquals(pretendido, recebido - 8, 0);
	}
	@Test
	public void recebeNumeroDivTest() {
		numeroPorExtenso extenso = new numeroPorExtenso();
		int recebido = extenso.numero(8);
		int pretendido = 1;
		assertEquals(pretendido, recebido / 8, 0);
	}
	@Test
	public void recebeNumeroMulTest() {
		numeroPorExtenso extenso = new numeroPorExtenso();
		int recebido = extenso.numero(8);
		int pretendido = 16;
		assertEquals(pretendido, recebido *2, 0);
	}
	
	@Test
	public void recebeVariosNumerosTest() {
		numeroPorExtenso extenso = new numeroPorExtenso();
		int recebido = extenso.numero(987);
		int pretendido = 987;
		assertEquals(pretendido, recebido, 0);
	}

	@Test
	public void transformaNumeroEmArrayTest() {
		numeroPorExtenso extenso = new numeroPorExtenso();
		int[] recebido = extenso.transformaArray(98);
		int[] pretendido = { 9, 8 };
		assertArrayEquals(pretendido, recebido);
	}

	@Test
	public void transformaNumeroEmArray2Test() {
		numeroPorExtenso extenso = new numeroPorExtenso();
		int[] recebido = extenso.transformaArray(989);
		int[] pretendido = { 9, 8, 9 };
		assertArrayEquals(pretendido, recebido);
	}

	@Test
	public void numeroEmOrdemDecrescente2Test() {
		numeroPorExtenso extenso = new numeroPorExtenso();
		int[] numero = {7, 8};
		int[] recebido = extenso.OrdenaDes(numero);
		int[]pretendido = {8,7};
		assertArrayEquals(pretendido,recebido);
	}
	@Test
	public void numeroEmOrdemDecrescente3Test(){
		numeroPorExtenso extenso = new numeroPorExtenso();
		int[] numero = {7,8,9};
		int[] recebido = extenso.OrdenaDes(numero);
		int[]pretendido = {9,8,7};
		assertArrayEquals(pretendido,recebido);
	}
	@Test
	public void numeroEmOrdemDecrescente4Test(){
		numeroPorExtenso extenso = new numeroPorExtenso();
		int[] numero = {7,8,9,10};
		int[] recebido = extenso.OrdenaDes(numero);
		int[]pretendido = {10,9,8,7};
		assertArrayEquals(pretendido,recebido);
	}
	@Test
	public void numeroEmOrdemDecrescenteNTest(){
		numeroPorExtenso extenso = new numeroPorExtenso();
		int[] numero = {6,7,8,9,10,11};
		int[] recebido = extenso.OrdenaDes(numero);
		int[]pretendido = {11,10,9,8,7,6};
		assertArrayEquals(pretendido,recebido);
	}
	@Test
	public void numeroEmOrdemDecrescenteDesOrdemTest(){
		
		numeroPorExtenso extenso = new numeroPorExtenso();
		int[] numero = {6,45,8,0,1,11};
		int[] recebido = extenso.OrdenaDes(numero);
		int[]pretendido = {45,11,8,6,1,0};
		assertArrayEquals(pretendido,recebido);
	}
	
	@Test
	public void numeroExtensoTest(){
		numeroPorExtenso extenso = new numeroPorExtenso();
		int[]numero ={1,2,3};
		String[] numeroExtenso = extenso.numeroExtenso(numero);
		String[] pretendida ={"cem","vinte","tres"};
		assertArrayEquals(pretendida, numeroExtenso);
	}
	@Test
	public void numeroExtensoTest1(){
		numeroPorExtenso extenso = new numeroPorExtenso();
		int[]numero ={2,3,1};
		String[] numeroExtenso = extenso.numeroExtenso(numero);
		String[] pretendida ={"docentos","trinta","um"};
		assertArrayEquals(pretendida, numeroExtenso);
	}
	@Test
	public void numeroExtensoTest2(){
		numeroPorExtenso extenso = new numeroPorExtenso();
		int[]numero ={9,6,8};
		String[] numeroExtenso = extenso.numeroExtenso(numero);
		String[] pretendida ={"novecentos","sessenta","oito"};
		assertArrayEquals(pretendida, numeroExtenso);
	}
	@Test
	public void numeroExtensoTest3(){
		numeroPorExtenso extenso = new numeroPorExtenso();
		int[]numero ={1,9,3};
		String[] numeroExtenso = extenso.numeroExtenso(numero);
		String[] pretendida ={"cem","noventa","tres"};
		assertArrayEquals(pretendida, numeroExtenso);
	}
	@Test
	public void numeroExtensoTest4(){
		numeroPorExtenso extenso = new numeroPorExtenso();
		int[]numero ={1,2,0};
		String[] numeroExtenso = extenso.numeroExtenso(numero);
		String[] pretendida ={"cem","vinte",null};
		assertArrayEquals(pretendida, numeroExtenso);
	}
	@Test
	public void numeroExtensoTest5(){
		numeroPorExtenso extenso = new numeroPorExtenso();
		int[]numero ={1,1,3};
		String[] numeroExtenso = extenso.numeroExtenso(numero);
		String[] pretendida ={"cem","treze",null};
		assertArrayEquals(pretendida, numeroExtenso);
	}
	@Test
	public void numeroExtensoTest6(){
		numeroPorExtenso extenso = new numeroPorExtenso();
		int[]numero ={1,2,8};
		String[] numeroExtenso = extenso.numeroExtenso(numero);
		String[] pretendida ={"cem","vinte","oito"};
		assertArrayEquals(pretendida, numeroExtenso);
	}
	@Test
	public void numeroExtensoTest7(){
		numeroPorExtenso extenso = new numeroPorExtenso();
		int[]numero ={7,2,3};
		String[] numeroExtenso = extenso.numeroExtenso(numero);
		String[] pretendida ={"setecentos","vinte","tres"};
		assertArrayEquals(pretendida, numeroExtenso);
	}
	@Test
	public void numeroExtensoTest8(){
		numeroPorExtenso extenso = new numeroPorExtenso();
		int[]numero ={4,2,3};
		String[] numeroExtenso = extenso.numeroExtenso(numero);
		String[] pretendida ={"quatrocentos","vinte","tres"};
		assertArrayEquals(pretendida, numeroExtenso);
	}
	

}
