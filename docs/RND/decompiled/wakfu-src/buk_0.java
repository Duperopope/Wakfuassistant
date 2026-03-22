/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.OptionalLong;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from buk
 */
public abstract class buk_0<T>
extends bui_0<T> {
    protected buk_0(@Nullable Long l, @Nullable Long l2) {
        super(l, l2);
    }

    protected abstract OptionalLong ai(T var1);

    @Override
    protected final OptionalLong ao(T t) {
        return this.ai(t);
    }

    @Override
    protected final OptionalLong an(T t) {
        return this.ai(t);
    }
}

