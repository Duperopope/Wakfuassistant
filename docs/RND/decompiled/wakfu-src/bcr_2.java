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
 * Renamed from bcr
 */
class bcr_2
implements Function<bci_1, Integer> {
    bcr_2() {
    }

    @Nullable
    public Integer c(@Nullable bci_1 bci_12) {
        return bci_12 == null ? 0 : bci_12.aYs();
    }

    @Nullable
    public /* synthetic */ Object apply(@Nullable Object object) {
        return this.c((bci_1)object);
    }
}

