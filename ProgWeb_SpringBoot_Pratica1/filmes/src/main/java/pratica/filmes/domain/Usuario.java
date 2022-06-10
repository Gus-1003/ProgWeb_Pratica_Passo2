package pratica.filmes.domain;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;

/*
-> O projeto "Lombok" é uma biblioteca Java que visa a diminuição de código boilerplate e 
aumento da produtividade no desenvolvimento, ela consegue fazer isso “plugando” código 
no momento de build do projeto. 

-> O Projeto Lombok faz uso de annotations. As anotações são muito famosas entre os desenvolvedores 
Java e são amplamente usadas

-> Para entender os annatations do Lombok: https://imasters.com.br/back-end/projeto-lombok-escrevendo-menos-codigo-em-java
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // Constroi uma tabela no Banco se baseando nos atributos da classe
@NoArgsConstructor // Cria um construtor vazio
@AllArgsConstructor // Cria um construtor com todos os atributos da classe
@Data // Getter´s e Setter´s
public class Usuario {
    
    @Id //Campo relacionado à chave primária da tabela.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    float id;
    
    // Tanto o @NotBlanck quanto o @Size dependem da dependencia "Hibernate" no Pom;

    @NotBlank //Restrição de campo - O valor desse campo não deve ser nulo e o comprimento aparado deve ser maior que zero .
    String username;
    String password;

    boolean admin;
}
