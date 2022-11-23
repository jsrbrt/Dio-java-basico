# Tratamento de Exceções em Java

<h2>Visão Geral</h2>

<h4>Error:</h4> Usado pela JVM que serve para indicar se existe algum problema de recurso do programa, tornando a execução impossível de continuar.
<h4>Unchecked (Runtime):</h4> Exceptions que PODEM ser evitados se forem tratados e analisados pelo desenvolvedor. 
<h4>Checked Exception:</h4> Exceptions que DEVEM ser evitados etratados pelo desenvolvedor para o programa funcionar.

<div align="center">
    <img src="https://i.ibb.co/VjT23Rr/amoTu.png" alt="amoTu" border="0" width="400" height="600">
    <p>Hierarquia Exceptions</p>
</div>

<h2 aling="center">Palavras Reservadas:</h2>
<ul>
    <li>try, catch, finally: Cada uma dessas palavras, juntas, definem blocos para o tratamento de exceções.</li>
    <li>throws: Declara que um método pode lançar uma ou várias exceções.</li>
    <li>throw: Lança explicitamente uma exception.</li>
</ul>

<hr>
<h2>Error</h2>
<ul>
    <li>Usado pela JVM, serve para indicar quando existe algum problema de recurso do programa, tornando a execução impossível de continuar.</li>
    <li>O “Erro” é algo que não pode mais ser tratado, ao contrário da “Exceção” que trata seus erros, pois todas as subclasses de Exception (menos as subclasses RuntimeException) são exceções que obrigatóriamente devem ser tratadas.</li>
</ul>

<h2>Unchecked Exception</h2>
<ul>
    <li>Herdam da classe <em>RuntimeException</em> ou da classe <em>Error</em>.</li>
    <li>O compilador não verifica o código para ver se a exceção foi capturada ou declarada.</li>
    <li>Se uma exceção não-verificada ocorrer e não tiver sido capturada, o programa terminará ou executará com resultados inesperados.</li>
    <li>Em geral, podem ser evitadas com uma codificação adequada.</li>
</ul>

<h2>Checked Exception</h2>
<ul>
    <li>As exceções que são herdadas da classe <em>Exception</em>, mas não de <em>RuntimeException</em>.</li>
    <li>O compilador impõe um requisito do tipo "capturar ou declarar".</li>
    <li>O compilador verifica cada chamada de método e declaração de método para determinar se o método lança (<em>throws</em>) exceções verificadas.</li>
    <li>Se lançar, o compilador assegura que a exceção verificada é capturada ou declarada em uma cláusula <em>throws</em>. 
    <li>Caso não capturada nem declarada, ocorre um erro de compilação.
</li>
</ul>

<h2>Exception Personalizada</h2>
<ul>
    <li>Programadores podem achar útil declarar suas próprias classes de exceção.</li>
    <li>Essas Exceptions são específicas aos problemas que podem ocorrer quando outro programador empregar suas classes reutilizáveis.
</li>
    <li>Uma nova classe de exceção deve estender uma classe de exceção existente que assegura que a classe pode ser utilizada com o mecanismo de tratamento de exceções, logo essas Exceções customizadas são derivadas da classe Exception.</li>
    <li><em>Importante</em>: Antes de criar a nossa própria exceção, é recomendado verificar se já existe alguma exceção na biblioteca Java que já nos forneça o que precisamos. Afinal, não queremos reinventar a roda!</li>
</ul>

<h2>Blocos try/catch/finally</h2>
<ul>
  Bloco <strong><em>try</em></strong> :<br>
    - Região onde se encontra o código que queremos verificar se irá ou não lançar uma exceção.</li><br>
    - Caso ocorra uma exceção em algum ponto, o restante do código contido no bloco <em>try</em> não será executado.</li><br>
    - O bloco <em>try</em> não pode ser declarado sozinho, por tanto, precisa estar seguido de um ou vários blocos <em>catch</em> e/ou de um bloco <em>finally</em>.<br>

  Bloco <strong><em>catch</em></strong> :<br>
    - Região onde se encontra o possível tratamento da exceção. Isso significa que só será executado caso o bloco <em>try</em> apresentar alguma exceção.</li><br>
    - Recebe como argumento a classe ou subclasse da possível exceção.</li><br>
    - No seu escopo ficam as instruções de como tratar essa exceção.</li><br>
    - Pode haver mais de um bloco <em>catch</em>, porém, será executado apenas o primeiro bloco que identificar a exceção.</li><br>

><em>Importante</em>: <br>
>- Caso você utilize mais de um <em>catch</em> e houver exceções de uma mesma hierarquia de classes, certifique-se que a classe mais genérica esteja como argumento do último <em>catch</em>. Caso contrário, qualquer exceção sempre cairá neste primeiro <em>catch</em>, assim fazendo com que a exception mais específica não seja verificada.<br>

  Bloco <strong><em>finally</em></strong>:<br>
    - Este bloco é opcional, mas caso seja construído, quase sempre será executado. (A menos que seja forçada sua parada, por exemplo, com um System.exit(0), no <em>catch</em>)<br>
    - Dentro do bloco <em>finally</em>, poderá conter outros blocos <em>try, catch,</em> bem como outro <em>finally</em>.<br>
    - Geralmente utilizado quando precisamos executar algum código independente se ocorrer exception ou não.
</ul>

<h2> Cláusulas throws e throw</h2>
<ul>
Cláusula <strong><em>throws</em></strong><br>
    - Usada na assinatura do método.<br>
    - Necessária apenas para exceções checked.<br>
    - Informa ao chamador que este método pode lançar uma das exceções listadas no escopo do método. Isso obriga a fazer a captura dessa exception (<em>try-catch</em>) ou relançar o <em>throws</em>.<br>
</ul>
<ul>
Cláusula <strong><em>throw</em></strong><br>
  - É usada para lançar explicitamente uma exceção de um método ou de qualquer bloco de código.<br>
  - Usada principalmente para lançar exceções personalizadas<br>

><em>Importante</em>:
> - O fluxo de execução "normal" do programa para imeditamente apos a execução da cláusula <em>throw</em>. O bloco <em>try</em> envolvente mais próximo é verificado para encontrar um bloco <em>catch</em> que corresponda ao tipo de exceção.<br>
> - Caso encontre essa correspondência, o controlado é transferido para esse bloco. Caso contrário, o próximo bloco <em>try</em> envolvente é verificado e assim por diante.<br>
> - Outro caso, é se nenhuma captura for encontrada, o manipulador da exceção padrão interromperá o programa.
</ul>
