/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bwD
 */
abstract class bwd_0<T extends bwd_0>
extends bwh_0<T> {
    protected final List<bwE> jzq = new ArrayList<bwE>();

    bwd_0() {
    }

    abstract fhk dmL();

    abstract bhx_0 dMK();

    @Override
    public boolean dLQ() {
        return !this.jzq.isEmpty();
    }

    @Override
    public void dMy() {
        if (this.jzq.isEmpty()) {
            return;
        }
        bwE bwE2 = this.jzq.remove(this.jzq.size() - 1);
        switch (bwE2.jzr.ordinal()) {
            case 0: {
                this.p(() -> cvu_2.eTO().n(bwE2.jzu));
                return;
            }
            case 1: 
            case 2: {
                this.p(() -> cvu_2.eTO().d(bwE2.jzs, bwE2.jzu));
            }
        }
    }

    @Override
    public void dMz() {
        while (!this.jzq.isEmpty()) {
            this.dMy();
        }
    }

    abstract Set<Long> dMG();

    @Nullable
    ffV kT(long l) {
        for (int i = this.jzq.size() - 1; i >= 0; --i) {
            ffV ffV2 = this.jzq.get(i).dMO();
            if (ffV2 == null || ffV2.LV() != l) continue;
            return ffV2;
        }
        return null;
    }

    abstract int dML();

    public abstract Optional<ffS> c(ffV var1, @NotNull ffS var2);

    protected void a(@NotNull ffV ffV2, @NotNull ffS ffS2, Optional<Bu<ffV, ffS>> optional) {
        bwE bwE2 = optional.isPresent() ? new bwE(bwF.jzw, optional.get().getFirst(), ffV2, optional.get().aHI()) : new bwE(bwF.jzv, null, ffV2, ffS2);
        this.jzq.add(bwE2);
    }

    public abstract Optional<ffS> f(@NotNull ffS var1);

    abstract boolean a(@NotNull fhk var1);

    void X(@NotNull ffV ffV2) {
        for (int i = this.jzq.size() - 1; i >= 0; --i) {
            bwE bwE2 = this.jzq.get(i);
            if (bwE2.jzt == null || bwE2.jzt.LV() != ffV2.LV()) continue;
            if (bwE2.jzr == bwF.jzv) {
                this.jzq.remove(i);
                continue;
            }
            if (bwE2.jzr != bwF.jzw) continue;
            this.jzq.set(i, new bwE(bwF.jzx, bwE2.jzs, null, bwE2.jzu));
        }
        this.Y(ffV2);
    }

    abstract void Y(@NotNull ffV var1);
}

