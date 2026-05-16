# ⚔️ ProjectRPG-Java

Sistema de RPG desenvolvido em Java com foco em Programação Orientada a Objetos (POO), modelagem de entidades, progressão de personagens e arquitetura de sistemas.

O projeto foi criado com o objetivo de praticar conceitos fundamentais e intermediários de desenvolvimento backend utilizando Java.

---

# 📚 Conceitos aplicados

- Programação Orientada a Objetos (POO)
- Encapsulamento
- Composição
- Enumerações (`enum`)
- Factory Pattern
- Estruturação de entidades
- Sistema de progressão por nível
- Escalonamento de atributos
- Organização de responsabilidades
- Versionamento com Git/GitHub

---

# 🧙 Sistema de Classes

O projeto possui diferentes classes jogáveis, cada uma contendo:

- atributos únicos
- scaling próprio
- habilidades exclusivas
- progressão individual

Exemplos:

- Batedor Furioso
- Ancião Negro
- Arcanista Supremo
- Defensor Colossal
- Guerreiro das Sombras
- Sentinela Fantasma

---

# ⚡ Sistema de Progressão

Cada personagem possui:

- nível
- XP atual
- XP necessário para evolução
- atributos escaláveis

Ao subir de nível, os atributos são aumentados automaticamente conforme o tipo da classe escolhida.

---

# 🛠️ Estrutura do Projeto

## `FichaRPG`
Responsável por:
- gerenciamento do personagem
- sistema de XP
- level up
- exibição da ficha
- gerenciamento de habilidades

---

## `StatusRPG`
Contém os atributos principais:

- HP
- Mana
- Armadura
- Força
- Inteligência
- Resistência
- Dano Base
- Destreza
- Mentalidade
- Fúria

---

## `ClasseBase`
Enum responsável pelos:
- atributos iniciais
- scaling por nível
- configuração base de cada classe

---

## `Habilidades`
Sistema responsável pelas habilidades dos personagens.

Cada habilidade possui:
- nome
- efeito
- dano
- custo
- nível necessário

---

## `Factory`
As factories foram utilizadas para:
- criação de personagens
- organização das habilidades
- separação de responsabilidades

---

# 🚀 Tecnologias utilizadas

- Java
- IntelliJ IDEA
- Git
- GitHub

---

# 🎯 Objetivos futuros

- Sistema de batalha
- Persistência com banco de dados
- Integração com SQL
- API REST com Spring Boot
- Salvamento de personagens
- Inventário
- Equipamentos
- Sistema de status temporários (buff/debuff)
- Interface gráfica

---

# 📸 Exemplo de saída

```text
========== FICHA DO PERSONAGEM ==========

Classe: Batedor Furioso
Nível: 2

HP: 585
Mana: 0
Força: 20
Destreza: 10

XP Atual: 700
XP para próximo nível: 1500
```

💡 Sobre o projeto

Este projeto representa minha evolução prática em desenvolvimento backend utilizando Java.

O foco principal não é apenas criar um RPG, mas desenvolver:

pensamento lógico
arquitetura de sistemas
organização de código
abstração
modelagem de regras de negócio


👨‍💻 Autor
Joelson Moreira
