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
 * Renamed from aaR
 */
class aar_0
extends CacheLoader<String, byte[]> {
    aar_0() {
    }

    public byte[] dG(@NotNull String string) {
        return apr_1.by(string);
    }

    public /* synthetic */ Object load(@NotNull Object object) {
        return this.dG((String)object);
    }
}

