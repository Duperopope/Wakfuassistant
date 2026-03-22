/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Module
 */
import com.google.inject.Module;

public interface FF {
    public Module a(Module ... var1);

    public <T extends Module> FF a(Class<T> var1, T var2);

    public FF b(Module ... var1);

    public FF a(Class<? extends Module> var1, Module ... var2);

    public FF b(Class<? extends Module> var1, Module ... var2);
}

