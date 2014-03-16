set SOURCES = BinarySearchTreeTest.java BinarySearchTree.java

compile:
	javac $(SOURCES)
	
run:
	java $(SOURCES)

clean:
	rm *.class
