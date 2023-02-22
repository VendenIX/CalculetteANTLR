# CalculetteANTLR

## Commandes utiles

export CLASSPATH=.:"/usr/share/java/*":$CLASSPATH

java org.antlr.v4.Tool Calculette.g4
javac *.java
antlr4-grun Calculette 'start' -gui > test.mvap

javac MVaPAssembler.java CBaP.java
java MVaPAssembler -d test.mvap
java CBaP -d test.mvap.cbap