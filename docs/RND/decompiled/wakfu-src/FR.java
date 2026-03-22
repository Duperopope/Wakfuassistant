/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.inject.Module
 */
import com.google.common.collect.ImmutableList;
import com.google.inject.Module;

class FR {
    private final Class<? extends Module> aCn;
    private final ImmutableList<Module> aCo;

    FR(Class<? extends Module> clazz, Iterable<? extends Module> iterable) {
        this.aCn = clazz;
        this.aCo = ImmutableList.copyOf(iterable);
    }

    public Class<? extends Module> aLv() {
        return this.aCn;
    }

    public ImmutableList<Module> aLw() {
        return this.aCo;
    }
}

