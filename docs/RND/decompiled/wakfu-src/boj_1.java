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
 * Renamed from bOJ
 */
class boj_1
implements Function<bLd, Integer> {
    boj_1() {
    }

    @Nullable
    public Integer b(bLd bLd2) {
        return bLd2.tL();
    }

    @Nullable
    public /* synthetic */ Object apply(Object object) {
        return this.b((bLd)object);
    }
}

