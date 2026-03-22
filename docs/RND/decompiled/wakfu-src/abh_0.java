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
 * Renamed from abH
 */
class abh_0
extends CacheLoader<String, axc_2> {
    abh_0() {
    }

    public axc_2 ej(@NotNull String string) {
        return axd_1.bQW().gN("TGA").gM(string);
    }

    public /* synthetic */ Object load(@NotNull Object object) {
        return this.ej((String)object);
    }
}

