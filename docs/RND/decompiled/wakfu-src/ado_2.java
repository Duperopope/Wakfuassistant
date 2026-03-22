/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  aDm$aDp
 *  com.google.common.cache.CacheLoader
 *  org.jetbrains.annotations.NotNull
 */
import com.google.common.cache.CacheLoader;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aDo
 */
class ado_2
extends CacheLoader<String, adm_1.aDp> {
    final /* synthetic */ adm_1 dDv;

    ado_2(adm_1 adm_12) {
        this.dDv = adm_12;
    }

    public adm_1.aDp hf(@NotNull String string) {
        return this.dDv.ha(string);
    }

    public /* synthetic */ Object load(@NotNull Object object) {
        return this.hf((String)object);
    }
}

