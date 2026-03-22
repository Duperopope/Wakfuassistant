/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ClassToInstanceMap
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.google.common.collect.MutableClassToInstanceMap
 *  com.google.inject.Module
 */
import com.google.common.collect.ClassToInstanceMap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.MutableClassToInstanceMap;
import com.google.inject.Module;
import java.util.Iterator;
import java.util.List;

public final class FP
implements FF {
    private final ClassToInstanceMap<Module> aCh = MutableClassToInstanceMap.create();
    private final List<FR> aCi = Lists.newArrayList();
    private final FI aCj = new FI();
    private final Fx aCk = new Fx();

    public static FF aLt() {
        return new FP();
    }

    @Override
    public Module a(Module ... moduleArray) {
        FL fL = new FL(this.aCj, (Iterable<Module>)ImmutableList.copyOf((Object[])moduleArray), this.aCh, this.aCi);
        FK fK = fL.aLp();
        return this.aCk.a(fK);
    }

    @Override
    public <T extends Module> FF a(Class<T> clazz, T t) {
        this.aCh.put(clazz, t);
        return this;
    }

    @Override
    public FF b(Module ... moduleArray) {
        this.aCi.add(new FR(Module.class, (Iterable<? extends Module>)ImmutableList.copyOf((Object[])moduleArray)));
        return this;
    }

    @Override
    public FF a(Class<? extends Module> clazz, Module ... moduleArray) {
        this.aCi.add(new FR(clazz, (Iterable<? extends Module>)ImmutableList.copyOf((Object[])moduleArray)));
        return this;
    }

    @Override
    public FF b(Class<? extends Module> clazz, Module ... moduleArray) {
        Iterator<FR> iterator = this.aCi.iterator();
        while (iterator.hasNext()) {
            FR fR = iterator.next();
            if (fR.aLv() != clazz) continue;
            iterator.remove();
        }
        this.a(clazz, moduleArray);
        return this;
    }

    private FP() {
    }
}

