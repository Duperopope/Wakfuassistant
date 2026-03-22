/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Comparator;
import java.util.Optional;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from boR
 */
public class bor_1
extends bop_1 {
    private final long iTq;
    private final int iTr;

    public bor_1(@NotNull ffV ffV2, @Nullable Runnable runnable) {
        super(fhw_0.sqO, runnable);
        this.iTq = ffV2.LV();
        this.iTr = ffV2.acs();
    }

    @Override
    protected boolean dCc() {
        return false;
    }

    @Override
    protected boolean a(ffV ffV2, boolean bl) {
        if (bl) {
            return false;
        }
        return ffV2.acs() == this.iTr && ffV2.LV() != this.iTq && !fgt.cG(ffV2);
    }

    public Optional<ffV> dCf() {
        return this.iTn.stream().min(Comparator.comparingInt(ffV2 -> ffV2.fVX() > 0 ? 0 : 1).thenComparingLong(fgt::cH));
    }

    @Generated
    public long dCg() {
        return this.iTq;
    }

    @Generated
    public int dCh() {
        return this.iTr;
    }
}

