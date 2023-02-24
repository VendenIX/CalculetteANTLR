#export CLASSPATH=.:"/usr/share/java/*":$CLASSPATH
java org.antlr.v4.Tool Calculette.g4 
java org.antlr.v4.Tool MVaP.g4 
javac *.java
java -Xmx500M -cp "/usr/share/java/antlr-4.11.1-complete.jar:$CLASSPATH" org.antlr.v4.gui.TestRig Calculette 'start' -gui > test.mvap
#java MainCalculette > test.mvap 
javac MVaPAssembler.java CBaP.java
java MVaPAssembler -d test.mvap
java CBaP -d test.mvap.cbap