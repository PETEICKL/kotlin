package test;

class NoSamForMethodTypeParameter {
    <K extends Runnable> void foo(K runnable1, Runnable runnable2) {}
}

class NoSamForTypeParameterDerived1 extends NoSamForMethodTypeParameter {
    @Override
    void foo(Runnable runnable1, Runnable runnable2) {}
}

class NoSamForTypeParameterDerived2 extends NoSamForMethodTypeParameter {
    @Override
    <K extends Runnable> void foo(K runnable1, Runnable runnable2) {}
}

class NoSamForTypeParameterDerived3 extends NoSamForTypeParameterDerived1 {
    @Override
    void foo(Runnable runnable1, Runnable runnable2) {}
}
