Esse é um exemplo de projeto referenciando
Struts 2 documentation, Hello World tutorial.
Veja:  http://struts.apache.org.

Para construir o war, execute mvn clean package do diretório root do projeto

O arquivo war é criado no target sub-folder

Copie o arquivo war para seu servlet TOMCAT e inicie

Ou se você usar maven, execute o seguinte comando:
mvn jetty:run

No browser web, acesse:  http://localhost:8080/helloworld-struts/index.jsp.

Você vai ver a exibição da página principal

