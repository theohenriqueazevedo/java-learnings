package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

//        pessoa.nome = "Theo";
//        pessoa.idade = 20;

        pessoa.setIdade(1);
        pessoa.setNome("Theo");

//        pessoa.imprime();

        System.out.println(pessoa.getIdade());


        /*
            só tem acesso ao metodo get
         *   Pessoa pessoa  ------->  +-----------------------------------+

         *                            | private String nome;              |

         *                            | private int idade;                |

         *                            |                                   |

         *                            | setNome(String nome)              |

         *                            | getNome()                         |

         *                            +-----------------------------------+

         */
    }
}
