.PHONY: all
all: clox

clox: main.c chunk.c memory.c debug.c value.c vm.c
				gcc -Wall -O2 -std=c99 -o $@ $^

.PHONY: clean
clean:
				rm clox.exe