.PHONY: all
all: clox

clox: main.c chunk.c memory.c debug.c value.c vm.c compiler.c scanner.c object.c table.c
				gcc -Wall -O2 -std=c99 -o $@ $^

.PHONY: repl
repl:
				./clox.exe

.PHONY: test
test:
				./clox.exe test.txt

.PHONY: clean
clean:
				rm clox.exe