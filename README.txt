Esse � um exemplo de projeto referenciando
Struts 2 documentation, Hello World tutorial.
Veja:  http://struts.apache.org.

Para construir o war, execute mvn clean package do diret�rio root do projeto

O arquivo war � criado no target sub-folder

Copie o arquivo war para seu servlet TOMCAT e inicie

Ou se voc� usar maven, execute o seguinte comando:
mvn jetty:run

No browser web, acesse:  http://localhost:8080/helloworld-struts/index.jsp.

Voc� vai ver a exibi��o da p�gina principal

