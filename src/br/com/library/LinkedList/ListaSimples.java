package br.com.library.LinkedList;
/**
 * lista simples
 * @author BmLeonardo
 *
 */
public class ListaSimples {

	private ListaSimples lista;
	private String nome;

	public ListaSimples getLista() {
		return lista;
	}

	public void setLista(ListaSimples lista) {
		this.lista = lista;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static void main(String[] args) {
		Dinamica teste = new Dinamica();
		teste.add("A");
		teste.add("b");
		teste.add("c");
		teste.imprimir();

	}

}

class Dinamica {
	int tamanho = 0;
	ListaSimples primeiro;
	ListaSimples ultimo;

	public void add(String nome) {

		if (this.primeiro == null) {
			this.primeiro = new ListaSimples();
			this.ultimo = this.primeiro;
			ListaSimples novo = new ListaSimples();
			novo.setNome(nome);
			novo.setLista(null);
			this.ultimo.setLista(novo);
			this.ultimo = novo;
			tamanho++;
		} else {
			ListaSimples novo = new ListaSimples();
			novo.setNome(nome);
			novo.setLista(null);
			this.ultimo.setLista(novo);
			this.ultimo = novo;
			tamanho++;
		}

	}

	public void imprimir() {
		ListaSimples percorre = primeiro.getLista();
		while (percorre != null) {
			System.out.println(percorre.getNome());
			percorre = percorre.getLista();

		}

	}

}
/**
* lista feita pelo professor
* @author alexandre
*/

 class Menu {
   
   public static void main(String[] args) {
       
       No startNo = new No();
       ListNo li = new ListNo();
       int cont = (int) (Math.random()*1000);
       
       for(int i =0; i < cont; i++){
            
           startNo = li.insertNo(startNo, i);
           
       }
       
       System.out.println(li.readList(startNo));
       
       cont = (int) (Math.random()*1000);
       
        for(int i =0; i < cont; i++){
           
           startNo = li.insertNo(startNo, i);
           
       }
       
       System.out.println(li.readList(startNo));
       
       
   }
   
   
}


class No {
   
   public int value;
   public No nextNo = null;
   
   
}

class ListNo {
   
   public No insertNo(No noRoot, int value) {
       
            if(noRoot.nextNo==null) {
                
                No newNo = new No();
                newNo.value = value;
                newNo.nextNo = null;
                noRoot.nextNo = newNo;
                
            } else {
                
                No newNo = new No();
                No aux = new No();
                
                newNo.value = value;
                newNo.nextNo = null;
                
                aux = noRoot.nextNo;
                
                while(aux.nextNo != null){
                    
                    aux = aux.nextNo;
                    
                }    
                
                aux.nextNo = newNo;
                
            }
            
            return noRoot;        
   }
   
   public String readList(No no){
       
       No aux = no.nextNo;
       String out = "";
       while(aux != null) {
           
           out = out + " " +aux.value;
           aux = aux.nextNo;
           
       }       
       
       return out;
   }
   
   
}


