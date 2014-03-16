SOURCES = BinarySearchTreeTest.java BinarySearchTree.java


compile:
	javac -g $(SOURCES)
	
run:
	java BinarySearchTreeTest

clean:
	rm *.class
