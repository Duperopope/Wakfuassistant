/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheLoader
 *  org.jetbrains.annotations.NotNull
 */
import com.google.common.cache.CacheLoader;
import org.jetbrains.annotations.NotNull;

class acK
extends CacheLoader<String, byte[]> {
    acK() {
    }

    public byte[] dG(@NotNull String string) {
        return apr_1.by(string);
    }

    public /* synthetic */ Object load(@NotNull Object object) {
        return this.dG((String)object);
    }
}

