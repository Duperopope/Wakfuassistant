/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheLoader
 *  org.jetbrains.annotations.NotNull
 */
import com.google.common.cache.CacheLoader;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from atC
 */
class atc_1
extends CacheLoader<String, byte[]> {
    atc_1() {
    }

    public byte[] dG(@NotNull String string) {
        return fo_0.by(string);
    }

    public /* synthetic */ Object load(@NotNull Object object) {
        return this.dG((String)object);
    }
}

