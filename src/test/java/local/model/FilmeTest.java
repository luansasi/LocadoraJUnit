package local.model;

import javax.validation.Valid;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FilmeTest {
    //TODO: Nome deve possuir entre 2 e 99 caracteres (inclusive)
    // Lança FilmeException - O nome do filme deve possuir entre 2 e 99 caracteres

    @Test
        @DisplayName("Teste Nome com 2 Caracteres")
    public void deveAceitarNomeCom2Caracteres(){
        Filme filme = new Filme();
        String nomeFilme = "OZ";
        
        filme.setNome(nomeFilme);
        
        assertThat(filme.getNome(),is(equalTo(nomeFilme)));
    }
    
    @Test
    @DisplayName("Não deve aceitar nome menor que 2 caracteres")
     public void naodeveAceitarNomeMenor2Caracteres(){
         Filme filme = new Filme();
         String nomeFilme = "a";
         
         filme.setNome(nomeFilme);
         
         assertThat(filme.getNome(),is(equalTo(nomeFilme)));
         
    }
     
    @Test
    @DisplayName("Teste com nome de 99 caracteres")
     public void deveAceitarNomeCom99Caracteres(){
         Filme filme = new Filme();
         String nomeFilme = "CarroCarroCarroCarroCarroCarroCarroCarroCarroCarroCarroCarroCarroCarroCarroCarroCarroCarroCarroCarr";
         
         filme.setNome(nomeFilme);
         
         assertThat(filme.getNome(),is(equalTo(nomeFilme)));
    }
    @Test
    @DisplayName("Não deve aceitar nome maior que 99 caracteres")
     public void naodeveAceitarNomeMaior99Caracteres(){
         Filme filme = new Filme();
         String nomeFilme = "CarroCarroCarroCarroCarroCarroCarroCarroCarroCarroCarroCarroCarroCarroCarroCarroCarroCarroCarroCarro";
         
         filme.setNome(nomeFilme);
         
         assertThat(filme.getNome(),is(equalTo(nomeFilme)));
    }
    //TODO: Estoque não pode ser negativo, e o máximo é 99 (inclusive)
    // Lança FilmeException - Valor de estoque inválido

     @Test
     @DisplayName("Numero em estoque é 0")
     public void numero0EmEstoque(){
         Filme filme = new Filme();
         int filmeEstoque = 0;
         
         filme.setEstoque(filmeEstoque);
         
         assertThat(filme.getNome(), is(equalTo(filmeEstoque)));
     }
     
    //TODO: O preço de Locacao deverá ser um número positivo entre R$ 1,00 e R$ 9,99 (inclusive)
    // Lança FilmeException - Valor locação inválido



}
