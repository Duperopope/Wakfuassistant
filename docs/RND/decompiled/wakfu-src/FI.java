/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 *  com.google.inject.Module
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.inject.Module;
import java.util.ArrayList;
import java.util.Collection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class FI {
    private final Fv aBO = new Fv(FT.class);
    private final Fv aBP = new Fv(FS.class);
    private static final Logger aBQ = LoggerFactory.getLogger(FI.class);

    FI() {
    }

    public Iterable<Module> a(Module module) {
        Iterable<FH> iterable = this.aBO.u(module);
        return this.a(iterable, Module.class);
    }

    public Iterable<Class<? extends Module>> b(Module module) {
        Iterable<FH> iterable = this.aBP.u(module);
        Iterable<Class> iterable2 = this.a(iterable, Class.class);
        return this.aH(iterable2);
    }

    private <T> Iterable<T> a(Iterable<FH> iterable, Class<T> clazz) {
        FU<T> fU = new FU<T>(clazz);
        FJ fJ = new FJ(this, fU);
        return Lists.newArrayList((Iterable)Iterables.concat((Iterable)Iterables.transform(iterable, (Function)fJ)));
    }

    private Collection<Class<? extends Module>> aH(Iterable<Class> iterable) {
        ArrayList arrayList = Lists.newArrayList();
        for (Class clazz : iterable) {
            if (!this.g(clazz)) continue;
            arrayList.add(this.h(clazz));
        }
        return arrayList;
    }

    private boolean g(Class<?> clazz) {
        if (!clazz.isInterface()) {
            aBQ.warn(String.format("Required module type %s is not an interface.", clazz.getSimpleName()));
            return false;
        }
        if (!Module.class.isAssignableFrom(clazz)) {
            aBQ.warn(String.format("Required module type %s does not extend Module.", clazz.getSimpleName()));
            return false;
        }
        return true;
    }

    private Class<? extends Module> h(Class<?> clazz) {
        return clazz;
    }
}

