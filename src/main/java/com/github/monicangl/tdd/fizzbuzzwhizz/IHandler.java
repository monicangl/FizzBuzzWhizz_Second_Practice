package com.github.monicangl.tdd.fizzbuzzwhizz;

public abstract class IHandler {
    public IHandler() {
    }
    protected IHandler(IHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public IHandler getNextHandler() {
        return nextHandler;
    }

    public abstract String handleNumber(int number);

    private IHandler nextHandler;
}
