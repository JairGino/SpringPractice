package com.helloWorld.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldController {

    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello World!";
    }

//    Testing html on TOMCAT server
    @GetMapping("/bst")
    public String bst() {
        return "<h1>BST</h1>" +
                "<ul>" +
                "<li>Persistência</li>" +
                "<li>Mentalidade de Crescimento</li>" +
                "<li>Orientação ao Futuro</li>" +
                "<li>Responsabilidade Pessoal</li>" +
                "<li>Trabalho em Equipe</li>" +
                "<li>Comunicação</li>" +
                "<li>Orientação aos Detalhes</li>" +
                "<li>Proatividade</li>" +
                "</ul>";
    }

//    Testing html on TOMCAT server
    @GetMapping("/tests")
    public String tests() {
        return "<!DOCTYPE html>" +
                "<html>" +
                "<head>" +
                "    <meta charset=\"UTF-8\">" +
                "    <title>Testes Unitários em Java: Garantindo a Qualidade do Código</title>" +
                "<style>" +
                "        body {" +
                "            background-color: #272822; /* Cor de fundo escura */" +
                "            color: #F8F8F2; /* Cor do texto */" +
                "            font-family: \"Courier New\", monospace; /* Fonte monoespaçada */" +
                "        }" +
                "        pre {" +
                "            background-color: #1E1E1E; /* Cor de fundo do bloco de código */" +
                "            padding: 10px; /* Espaçamento interno do bloco de código */" +
                "            border-radius: 5px; /* Cantos arredondados */" +
                "            border: 1px solid #333; /* Borda ao redor do bloco de código */" +
                "            overflow: auto; /* Barra de rolagem quando necessário */" +
                "        }" +
                "        code {" +
                "            color: #A6E22E; /* Cor do código */" +
                "        }" +
                "    </style>" +
                "</head>" +
                "<body>" +
                "    <h1>Testes Unitários em Java: Garantindo a Qualidade do Código</h1>" +
                "    <p>Os testes unitários desempenham um papel fundamental no desenvolvimento de software de qualidade. Eles são uma prática essencial para garantir que o código-fonte Java seja confiável, robusto e livre de erros. Neste artigo, exploraremos a importância dos testes unitários em Java, como escrevê-los e integrá-los em seu processo de desenvolvimento.</p>" +
                "\n" +
                "    <h2>O que são Testes Unitários?</h2>" +
                "    <p>Testes unitários são um tipo de teste de software que se concentra na verificação do funcionamento individual de componentes ou unidades de código, como classes, métodos e funções. O objetivo principal é garantir que cada parte do código funcione conforme o esperado, isoladamente, antes de integrá-las em um sistema maior. Os testes unitários devem ser automatizados, repetíveis e independentes, o que os torna uma ferramenta valiosa para a detecção precoce de problemas.</p>" +
                "\n" +
                "    <h2>Ferramentas para Testes Unitários em Java</h2>" +
                "    <p>Java oferece uma série de bibliotecas e frameworks para escrever e executar testes unitários. Alguns dos mais populares incluem:</p>" +
                "    <ol>" +
                "        <li><strong>JUnit:</strong> O JUnit é a estrutura de teste unitário mais amplamente usada em Java. Ele fornece uma estrutura simples e eficaz para escrever e executar testes.</li>" +
                "        <li><strong>TestNG:</strong> O TestNG é outra biblioteca de teste muito poderosa que suporta testes unitários, testes de integração e testes funcionais.</li>" +
                "    </ol>" +
                "\n" +
                "    <h2>Escrevendo Testes Unitários em Java</h2>" +
                "    <p>Aqui estão as etapas básicas para escrever testes unitários em Java:</p>" +
                "    <ol>" +
                "        <li><strong>Preparação:</strong> Configure seu ambiente de teste, carregando as dependências necessárias e criando objetos de teste.</li>" +
                "        <li><strong>Ação:</strong> Chame o método ou a função que você deseja testar.</li>" +
                "        <li><strong>Avaliação:</strong> Verifique se o resultado da ação é o que você espera. Isso envolve a comparação do resultado real com o resultado esperado.</li>" +
                "        <li><strong>Limpeza:</strong> Libere recursos e reverta qualquer estado modificado durante o teste.</li>" +
                "    </ol>" +
                "    <p>Vejamos um exemplo simples de teste unitário em Java usando JUnit:</p>" +
                "\n" +
                "    <pre><code>\n" +
                "import org.junit.jupiter.api.Test;\n" +
                "import static org.junit.jupiter.api.Assertions.assertEquals;\n" +
                "\n" +
                "public class MinhaClasseTest {\n" +
                "\n" +
                "    @Test\n" +
                "    public void testMetodoAdicao() {\n" +
                "        MinhaClasse minhaInstancia = new MinhaClasse();\n" +
                "        int resultado = minhaInstancia.adicionar(2, 3);\n" +
                "        assertEquals(5, resultado);\n" +
                "    }\n" +
                "}\n" +
                "    </code></pre>\n" +
                "\n" +
                "    <p>Neste exemplo, estamos testando o método <code>adicionar</code> da classe <code>MinhaClasse</code> e verificando se a soma de 2 e 3 é igual a 5.</p>\n" +
                "\n" +
                "    <h2>Integração de Testes Unitários no Processo de Desenvolvimento</h2>" +
                "    <p>Para obter o máximo benefício dos testes unitários, é importante integrá-los em seu processo de desenvolvimento. Aqui estão algumas práticas recomendadas:</p>" +
                "    <ol>" +
                "        <li><strong>Escreva testes antes do código:</strong> Siga a metodologia de Desenvolvimento Orientado a Testes (Test-Driven Development, TDD), escrevendo testes antes de implementar o código real.</li>" +
                "        <li><strong>Execute testes automaticamente:</strong> Configure um sistema de integração contínua (CI) para executar seus testes unitários sempre que houver uma alteração no código-fonte.</li>" +
                "        <li><strong>Mantenha os testes atualizados:</strong> À medida que o código evolui, atualize seus testes para refletir as mudanças.</li>" +
                "        <li><strong>Use cobertura de código:</strong> Utilize ferramentas de análise de cobertura de código para determinar quais partes do código não estão sendo testadas.</li>" +
                "    </ol>" +
                "\n" +
                "    <h2>Conclusão</h2>" +
                "    <p>Os testes unitários são uma prática essencial no desenvolvimento de software em Java. Eles proporcionam uma maneira eficaz de detectar e prevenir erros de código, melhoram a qualidade do software e facilitam a manutenção e a refatoração. Ao adotar testes unitários como parte de seu processo de desenvolvimento, você estará investindo na criação de um código mais confiável e robusto.</p>" +
                "</body>" +
                "</html>";
    }
}
