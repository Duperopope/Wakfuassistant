/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  javax.annotation.Nullable
 */
import com.google.common.base.Function;
import javax.annotation.Nullable;

/*
 * Renamed from bOI
 */
class boi_1
implements Function<bLd, ejj_0> {
    boi_1() {
    }

    @Nullable
    public ejj_0 a(@Nullable bLd bLd2) {
        return ejj_0.dG(bLd2.ecu().ghz());
    }

    @Nullable
    public /* synthetic */ Object apply(@Nullable Object object) {
        return this.a((bLd)object);
    }
}

