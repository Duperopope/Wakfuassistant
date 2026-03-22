/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  com.google.inject.Injector
 *  javax.inject.Provider
 */
import com.google.common.base.Preconditions;
import com.google.inject.Injector;
import javax.inject.Provider;

public class FG {
    private static final FG aBJ = new FG();
    private Injector aBK;

    public static FG aLe() {
        return aBJ;
    }

    private FG() {
    }

    public void a(Injector injector) {
        this.aBK = injector;
    }

    public boolean aLf() {
        return this.aBK != null;
    }

    public <T> T e(Class<T> clazz) {
        Preconditions.checkNotNull((Object)this.aBK, (Object)"Injector is not already configured");
        return (T)this.aBK.getInstance(clazz);
    }

    public <T> Provider<T> f(Class<T> clazz) {
        Preconditions.checkNotNull((Object)this.aBK, (Object)"Injector is not already configured");
        return this.aBK.getProvider(clazz);
    }
}

