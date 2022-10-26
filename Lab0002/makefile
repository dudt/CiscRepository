Lab0002:
	@read -p "Java File Name Without the extension " FILENAME; \
	make compile-file f=$$FILENAME; \
	make run-file f=$$FILENAME 

compile-file:
	javac ${f}.java

run-file:
	java ${f}.java < input.txt > makeFileOutput.txt

clean:
	rm *.class
