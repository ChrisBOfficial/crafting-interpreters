.PHONY: all
all: clox

clox: main.c chunk.c memory.c debug.c value.c
				gcc -Wall -O3 -pedantic -std=c99 -o $@ $^

.PHONY: clean
clean:
				rm clox.exe