# Seminário — Padrão de Projeto Flyweight

## 1. Checklist individual — divisão entre os integrantes

### Pessoa 1 — Slides, conteúdo teórico e UML
- [ ] Contextualize o padrão Flyweight.
- [ ] Explique o problema que motiva sua utilização (motivação, cenário e desperdício de recursos).
- [ ] Explique o funcionamento do padrão e sua solução.
- [ ] Apresente a estrutura dos participantes do padrão (intrinsic/extrinsic state, Flyweight, Factory, ConcreteFlyweight etc.).
- [ ] Crie o diagrama UML do padrão.
- [ ] Crie o diagrama UML do exemplo prático desenvolvido pela equipe.
- [ ] Explique as consequências do padrão (vantagens, desvantagens e trade-offs).
- [ ] Monte e organizar os slides.
- [ ] Revise a formatação, escrita, consistência e organização dos slides.

### Pessoa 2 — Implementação e exemplo prático
- [ ] Defina um cenário realista de desenvolvimento para demonstrar o Flyweight.
- [ ] Implemente a primeira versão do exemplo **sem Flyweight**.
- [ ] Implemente a segunda versão do mesmo exemplo **com Flyweight**.
- [ ] Garanta que as duas versões resolvam o mesmo problema, permitindo comparação.
- [ ] Evidencie o que é compartilhado e o que permanece individual.
- [ ] Compare consumo de recursos, quantidade de objetos ou outra métrica relevante.
- [ ] Organize e comentar o código.
- [ ] Crie exemplos que serão utilizados nos slides.
- [ ] Suba as implementações para o repositório.
- [ ] Revise o código antes da entrega.

### Pessoa 3 — Pesquisa, frameworks e exercício
- [ ] Pesquise frameworks, bibliotecas e linguagens que utilizam Flyweight.
- [ ] Encontre exemplos reais de uso do padrão em projetos ou frameworks.
- [ ] Selecione exemplos relevantes e verifique as fontes.
- [ ] Crie uma seção no repositório com as referências da pesquisa.
- [ ] Elabore um exercício consistente que permita praticar o padrão Flyweight.
- [ ] Descrever o problema do exercício e os requisitos.
- [ ] Defina o resultado esperado sem entregar a solução.
- [ ] Crie uma branch separada contendo a resolução do exercício.
- [ ] Valide que o exercício é possível de resolver e que a solução utiliza corretamente o padrão.
- [ ] Preparar o exercício para ser apresentado nos slides.

### Responsabilidade de todos
- [ ] Estudar o conteúdo completo do seminário.
- [ ] Entender o código, diagramas e exemplos, mesmo os desenvolvidos por outros integrantes.
- [ ] Revisar o material em conjunto.
- [ ] Definir a ordem e divisão da apresentação oral.
- [ ] Ensaiar a apresentação.
- [ ] Garantir que a apresentação dure entre 20 e 30 minutos.
- [ ] Preparar-se para perguntas do professor e da turma.

---

## 2. Checklist geral


### Repositório
- [ ] Repositório criado
- [ ] README.md
- [ ] Código de exemplo
- [ ] Exercício
- [ ] Solução do exercício em branch separada
- [ ] Diagramas UML
- [ ] Referências de pesquisa
- [ ] Link do repositório inserido nos slides

### Revisão final
- [ ] Revisão técnica
- [ ] Revisão de português
- [ ] UML revisado
- [ ] Slides revisados
- [ ] Código revisado
- [ ] Apresentação ensaiada
- [ ] Tempo entre 20 e 30 minutos
- [ ] Todos os integrantes conseguem explicar o trabalho

---

## 3. Estrutura sugerida para o repositório

```text
flyweight/
├── pom.xml
├── src/
│   └── main/
│       └── java/
│           └── br/com/flyweight/
│               ├── exercise/
│               │   └── Main.java
│               ├── without/
│               │   └── Main.java
│               └── with/
│                   └── Main.java
├── docs/
├── diagrams/
└── README.md


### Branches

| Branch | Conteúdo |
|---|---|
| `main` | Trabalho principal, exemplo e exercício sem solução |
| `exercise-solution` | Resolução completa do exercício |

A ideia é deixar o exercício na `main` para quem clonar o repositório tentar resolver, e manter a solução em uma branch separada.

---

## 4. Informações para preencher no projeto

**Repositório GitHub:**  
Link: 
[Repositorio](https://github.com/codesfb/flyweight)
**Projeto escolhido para demonstração:**  
[Inserir cenário]

**Frameworks/bibliotecas que utilizam Flyweight:**  
[Inserir descobertas da pesquisa]


**Responsáveis:**
- Pessoa 1: Slides, teoria e UML
- Pessoa 2: Código e exemplo prático
- Pessoa 3: Pesquisa de frameworks e exercício

**Data de apresentação:**  
7/12

