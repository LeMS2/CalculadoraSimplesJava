<h1>🧮 Calculadora Simples em Java</h1>

<p>Este projeto é uma calculadora simples desenvolvida com <strong>Java</strong> e <strong>Swing</strong> para interface gráfica. Permite realizar operações básicas: soma, subtração, multiplicação e divisão.</p>

<h2>🚀 Funcionalidades</h2>
<ul>
    <li>Interface gráfica amigável usando <code>JFrame</code> e <code>JPanel</code></li>
    <li>Operações básicas: soma, subtração, multiplicação e divisão</li>
    <li>Validação de entrada e tratamento de erros</li>
    <li>Testes automatizados com JUnit 5</li>
</ul>

<h2>📷 Interface</h2>
<div class="screenshot">
    <img width="200" height="200" alt="image" src="https://github.com/user-attachments/assets/88dd1b79-8124-486b-8db6-550aeb32c4da" />

</div>

<h2>📁 Estrutura do Projeto</h2>
<pre>
├── Calculadora.java
├── CalculadoraApp.java
└── CalculadoraTest.java
</pre>

🛠️ Tecnologias Usadas

- Java 17 ou superior
- Swing (GUI)
- JUnit 5 (testes)

🚀 Como Executar

Pré-requisitos:
- Java JDK instalado (Java 17 ou superior)
- IDE como IntelliJ IDEA ou Eclipse

Executar com IntelliJ:

1. Clone o repositório:
   git clone https://github.com/LeMS2/CalculadoraSimplesJava.git
2. Abra o projeto no IntelliJ
3. Execute CalculadoraApp.java
   
Executar via Terminal:
javac Calculadora.java CalculadoraApp.java
java CalculadoraApp

🧪 Executar os Testes

Com IntelliJ:

1. Clique com o botão direito em CalculadoraTest.java
2. Selecione 'Run CalculadoraTest'

Ou pelo terminal (se JUnit estiver configurado):

javac -cp .:junit-platform-console-standalone-1.10.0.jar CalculadoraTest.java
java -jar junit-platform-console-standalone-1.10.0.jar -cp . --select-class CalculadoraTest

✨ Autor

Desenvolvido por Letícia Marques
GitHub: https://github.com/LeMS2
 
