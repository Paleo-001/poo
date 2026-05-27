# Desafio de Arquitetura: Sistema de Batalha RPG 🗡️

**Missão:** Vocês acabam de receber a planta arquitetônica abaixo. O desafio de vocês é codificar exatamente o que está nesta planta usando Herança, Polimorfismo e Interfaces em Java.

```mermaid
classDiagram
    direction TB

    class Personagem {
        <<abstract>>
        -String nome
        -int pontosVida
        -int nivel
        +atacar(Personagem alvo)*
        +receberDano(int quantidade)
        +exibirStatus()
    }

    class Guerreiro {
        -int forcaFisica
        +atacar(Personagem alvo)
        +usarEscudo()
    }

    class Mago {
        -int poderMagico
        -int mana
        +atacar(Personagem alvo)
        +lancarFeitico(Personagem alvo)
    }

    class Chefe {
        -int multiplicadorDano
        +atacar(Personagem alvo)
        +invocarAliados()
    }

    class Curandeiro {
        <<interface>>
        +curar(Personagem alvo)
    }

    Personagem <|-- Guerreiro : Herda
    Personagem <|-- Mago : Herda
    Personagem <|-- Chefe : Herda
    Curandeiro <|.. Mago : Implementa
```