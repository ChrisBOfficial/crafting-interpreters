package com.craftinginterpreters.library;

import com.craftinginterpreters.lox.LoxCallable;
import com.craftinginterpreters.lox.Interpreter;

import java.util.List;

public class JStandardLib {
    // Prevent instantiation
    private JStandardLib() {}

    public static LoxCallable clock = new LoxCallable() {
        @Override
        public int arity() {
            return 0;
        }

        @Override
        public Object call(Interpreter interpreter, List<Object> arguments) {
            return (double)System.currentTimeMillis() / 1000.0;
        }

        @Override
        public String toString() {
            return "<std_clock:native fn>";
        }
    };
}
