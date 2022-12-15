# Desenvolvimento de Sistemas

**Desenvolvimento Desktop x Web x Mobile**

Desktop: Aplicação executável, precisa ser baixada pelo usuário e é usada localmente. (ex: jogos, word, excel, antivírus, etc)

Web: software pode ser executado a partir de qualquer local (ex: apps bancários, google sheets)

Aplicações mobile: em geral precisam de um instalador (a não ser que seja possível acessar pelo navegador). Temos duas plataformas - App Store e Google Play.

IDE: ambiente de desenvolvimento integrado

GUI: interface gráfica usuário

API: Apllication Programming Interface - software intermediário que permite a comunicação entre duas aplicações.

**Profissionais envolvidos no desenvolvimento:**

- **UX/UI Designer:** O profissional UX Designer ocado em melhorar a experiência do usuário com o sistema. Tem como objetivo melhorar usabilidade, acessibilidade e satisfação na interação com o produto. Esse profissional entrega um wireframe de acordo com a persona e feito através de pesquisas - ou seja, ele cria um esboço dos elementos do front-end da aplicação. (ex: onde ficará o menu da aplicação). UI (User Interface) é mais focado em cores, tipografia, microinterações e estilos. Um mesmo profissional pode cumprir os dois papeis ou podem ser realizados separadamente.
- **Front End:** Front end é responsável pela codificação da aplicação do cliente (e não do servidor). Ou seja, ele programa a interface gráfica do aplicativo, o que interagimos. O programador front end programa até as solicitações serem feitas ao servidor. Linguagens geralmente utilizadas em front-end são HTML, CSS e JavaScript.
- **Framework:** Traz soluções pré-definidas, bibliotecas, partes de código já desenvolvidas que automatizam demandas repetitivas. Ex: Angular, Laravel e Vue. Angular é um framework de front-end que usa CSS, HTML e JavaScript.
- **Back End:** Atende às requisições feitas pelo cliente (front end). Faz a ponte entre os dados que vem do navegador rumo ao banco de dados e vice-versa, sempre aplicando regras de negócio, validações e garantias de modo que o usuário final não consiga acessar ou manipular algo. Linguagens: Java, PHP e C#.
- **Full Stack:** São programadores que consegue trabalhar com o back end e o front end. Precisam ter habilidades em ampla variedade de linguagens de programação.

- **QA (Quality Assurance)**: Cuida da qualidade do software. Ele verifica se os padrões de qualidade estão sendo atendidos e se todos os requisitos mínimos esperados no produto serão entregues. Geram confiança e segurança para o cliente. Trabalham com ferramentas de testes e relatórios de erros. Não precisam conhecer programação a fundo, embora possa ser útil/desejável.
- **Intraestrutura:** Cuidam dos servidores (nuvem privada). É preciso ter pessoas que cuidam da segurança dos servidores (lógica e física), ter pessoas especializadas tanto em software quanto em hardware (servidores usam sistemas operacionais específicos) e infraestrutura local (cabeamento, fibra óptica, rede de computadores, backup)
- **Cloud** (Nuvem pública): São empresas que oferecem servidores que você paga pelo tanto que utilizar. Ex: Google cloud, Microsoft Azure, Amazon web services, etc. É uma forma de terceirizar a administração da infraestrutura. Vantagens: Pague pelo que usar, escalabilidade, facilidade de contratação e implementação, performance. O profissional de cloud computing é responsável pela infraestrutura de nuvem oferecida aos clientes.
- **Mobile**: também possui desenvolvimento back end e front end, porém o back end funciona da mesma forma que o desenvolvimento web. Já o front end muda, existem a plataforma e linguagem para android (Android Studio) e para iOS (xcode). Linguagens de programação: JAVA e/ou Kotlin para Android e Swift para iOS. **Desenvolvimento híbrido**: com um único código é possível gerar aplicativos tanto pra Android quanto para iOS (ferramentas: ionic, flutter, react nation).

# Lógica de Programação

- Indução: a partir de fenômenos observados propõe-se uma teoria/lei. (Método experimental).
- Dedução: a partir de uma lei/teoria, prevê-se um comportamento/situação. Ex: ciências exatas, “prove por a+b que…”.
- Abdução: “a grama está molhada, deve ter chovido.” (Diagnóstico)

Técnicas de lógica de programação 

- Linear: modelo tradicional, com estrutura hierárquica, sequência de ações ordenada unidimensional;
- Estruturada: possui alguma condição (if), validação;
- Modular: separação em módulos independentes, decomposição do problema.

Tipos de variáveis 

- Ação: modificação de estado;
- Controle: vigiada, controle;

Operações:

**Estruturas Condicionais:**

Operadores Lógicos

Problemas computacionais:

- Problemas de Decisão: Caráter lógico - sim/não;
- Problemas de busca: Relacionamento binário;
- Problemas de Otimização: Maximizar ou minimizar uma função.

Linguagens de Programação:

- Tradução: um compilador gera um objeto (baixo nível) a partir do código, que é utilizado pelo computador durante a execução do programa (ex: C, Java)
- Interpretação: o computador executa diretamente a partir do código fonte, por isso é mais lento, mas oferece mais flexibilidade. (ex: Python, Ruby, JavaScript)

Análises do Código feitas pelo compilador:

- Léxica
    - Particionar
    - Classificar
    - Eliminar
- Sintática (forma)
- Semântica (significado)

Paradigmas de programação: Forma de resolução de problemas com
diretrizes e limitações específicas de cada paradigma utilizando linguagem de
programação.

Paradigmas:

- Procedural: Chamadas sucessivas e procedimentos separados
- Funcional: Instruções baseadas em funções
- Computação distribuída: Funções executadas e forma independente
- Lógico
- Estruturado
- Orientação a objetos

Mais utilizados são Estruturado e Orientado a objetos.

1. Estruturado
    
    Conceitos:
    
    - Sequência
    - Decisão (teste lógico)
    - Iteração (funções, laços, condições)
2. Orientada à Objetos
    
    Análoga ao mundo real. Atributos de objetos:
    
    - Características específicas: o que tenho → **Atributos**
    - Comportamentos: o que sou capaz de fazer → **Métodos**
    - Estado: como faço → **Estado**
    
    Pilares da orientação à objetos:
    
    - Herança;
    - Encapsulamento;
    - Polimorfismo;
    - Abstração.

Comandos de terminal:

| Comando | Windows | Linux/Mac |
| --- | --- | --- |
| Mostrar diretório | dir | ls |
| Mudar de diretório | cd endereço | cd endereço |
| Retroceder um nível no diretorio | cd ..  | cd .. |
| Limpar tela terminal | cls | clear / ctrl + L |
| Autocompletar | tab | tab |
| Criar um diretório | mkdir | mkdir |
| Criar um arquivo | echo nome > nome.txt | echo nome > nome.txt |
| Deletar um arquivo | del arquivo/diretorio | rm arquivo |
| Deletar um diretório | rmdir diretório /S /Q | rm -rf diretório |
| Acessar histórico terminal | seta para cima | seta para cima |

Git:

SHA1: Secure Hash Algorithm: conjunto de funções criptográficas que geram uma hash de 40 caracteres que é único e depende do conteúdo do arquivo. Ao alterar o arquivo e passar pelo algoritmo novamente, a hash se altera. Se voltarmos ao original, a hash gerada será igual à anterior. 

Comando: openssl sha1

Usar git bash pra manipular git.

Estando em uma pasta no Windows explorer, pôde-se clicar com o botão direito e a opção “git bash here” vai aparecer. Essa opção evita que você precise navegar até a pasta desejada pelo terminal.

Objetos internos Git

Blob: estrutura básica de dados do git. Guarda o sha1 do arquivo

Tree: composta por blobs. A árvore guarda também o nome do arquivo. Tem um sha1 que muda com qualquer alteração no arquivo.

Commit: aponta para uma árvore, para o commit predecessor, tem o autor ,uma mensagem e um timestamp.

Criando uma chave SSH no windows:

Abrir o git bash e digitar o comando:

```java
ssh-keygen -t ed25519 -C seuemail@gmail.com
```

Fazer um cat na chave gerada. Colocar no github

No git bash, executar o seguinte comando:

```bash
eval $(ssh-agent -s)
```

Mais um comando necessário para selecionar qual a chave privada que será utilizada para descriptografar o conteúdo recebido pela chave pública:

```bash
ssh-add id_ed25519
```

Clonar repositórios privados pelo caminho ssh.

Comandos git:

git init

git add

git commit

git status

git remote add origin LinkDoGitHub

Configurar o git:

```bash
git config --global user.email "seuemail@gmail.com"
git config --global user.name nome
```

Caso de conflitos de merge, ou seja, alterações na mesma linha, o git não resolve automaticamente, é preciso resolver na mão.

Atalho ponto final no GitHub: abre um editor online (VSCode)
