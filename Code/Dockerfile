# Usar uma imagem oficial do OpenJDK como base
FROM openjdk:21-jdk

# Definir o diretório de trabalho dentro do contêiner
WORKDIR /LABMS

# Copiar o arquivo JAR gerado para o contêiner
# Aqui estamos assumindo que o JAR está na pasta target do projeto.
COPY target/LABMS-0.0.1-SNAPSHOT.jar app.jar

# Expor a porta necessária (ajuste conforme necessário, ex.: 8080, 8081)
EXPOSE 8081

# Comando para executar o JAR
ENTRYPOINT ["java", "-jar", "app.jar"]

