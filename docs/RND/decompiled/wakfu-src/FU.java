/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  com.google.common.collect.Iterables
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
import com.google.common.base.Preconditions;
import com.google.common.collect.Iterables;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class FU<T> {
    private final Class<T> aCp;
    private static final Logger aCq = LoggerFactory.getLogger(FU.class);

    FU(Class<T> clazz) {
        this.aCp = clazz;
    }

    public Iterable<T> b(FH fH) {
        Preconditions.checkArgument((boolean)fH.aLh(), (Object)"'method' must be a property.");
        if (this.c(fH)) {
            return this.d(fH);
        }
        if (this.e(fH)) {
            return this.f(fH);
        }
        if (this.g(fH)) {
            return this.h(fH);
        }
        this.i(fH);
        return Collections.emptyList();
    }

    private boolean c(FH fH) {
        return this.aCp.isAssignableFrom(fH.aLg());
    }

    private Iterable<T> d(FH fH) {
        return Collections.singleton(this.aCp.cast(fH.aLj()));
    }

    private boolean e(FH fH) {
        return Iterable.class.isAssignableFrom(fH.aLg());
    }

    private Iterable<T> f(FH fH) {
        return Iterables.filter((Iterable)((Iterable)fH.aLj()), this.aCp);
    }

    private boolean g(FH fH) {
        Class<?> clazz = Array.newInstance(this.aCp, 0).getClass();
        return clazz.equals(fH.aLg());
    }

    private List<T> h(FH fH) {
        return Arrays.asList((Object[])fH.aLj());
    }

    private void i(FH fH) {
        aCq.warn(String.format("The method %s must have a return type of %s, Iterable, or %s[]", fH.toString(), this.aCp.getSimpleName(), this.aCp.getSimpleName()));
    }
}

