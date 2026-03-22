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
 * Renamed from asZ
 */
class asz_2
extends CacheLoader<String, String> {
    asz_2() {
    }

    public String gi(@NotNull String string) {
        byte[] byArray = fo_0.by(string);
        return new String(byArray);
    }

    public /* synthetic */ Object load(@NotNull Object object) {
        return this.gi((String)object);
    }
}

