/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bwI
 */
public class bwi_0
extends bwh_0<bwi_0> {
    private final bgt_0 jzF;
    private final frd jzG;
    private final frd jzH;
    private final int jzI;
    private final List<bwj_0> jzJ = new ArrayList<bwj_0>();
    private final Runnable jzK;

    public bwi_0(bgt_0 bgt_02, int n, @NotNull Runnable runnable) {
        this.jzF = bgt_02;
        this.jzG = bgt_02 == null ? new frd() : bgt_02.dnJ().Zx(n);
        this.jzH = this.jzG.gjQ();
        this.jzI = n;
        this.jzK = runnable;
    }

    frd dMT() {
        return this.jzG;
    }

    @Override
    public boolean dLQ() {
        return !this.jzJ.isEmpty() && this.jzH.k(this.jzG);
    }

    @Override
    public void dMy() {
        if (this.jzJ.isEmpty()) {
            return;
        }
        bwj_0 bwj_02 = this.jzJ.remove(this.jzJ.size() - 1);
        switch (bwj_02.jzL.ordinal()) {
            case 0: {
                if (bwj_02.jzO == null) {
                    return;
                }
                this.p(() -> cvu_2.eTO().e(bwj_02.jzO));
                break;
            }
            case 1: {
                this.p(() -> cvu_2.eTO().b(bwj_02.jzN));
                return;
            }
            case 2: 
            case 3: {
                this.p(() -> cvu_2.eTO().b(bwj_02.jzM, bwj_02.jzN));
            }
        }
    }

    @Override
    public void dMz() {
        if (this.jzJ.isEmpty()) {
            return;
        }
        this.jzG.i(this.jzH);
        this.jzJ.clear();
        cvu_2.eTO().eUh();
        this.jzF.ge(true);
    }

    @Override
    public void a(bwi_0 bwi_02) {
        this.jzJ.clear();
        this.jzJ.addAll(bwi_02.jzJ);
    }

    public boolean a(@NotNull bmx_0 bmx_02, @NotNull bmd_0 bmd_02) {
        @Nullable bmx_0 bmx_03 = bmd_02.eeW();
        boolean bl = new frb().a(this.jzF.Sn(), bmx_02.axA(), this.jzI, (int)bmd_02.eeX());
        if (!bl) {
            byi_1.a(byh_1.lAv, "build.error.spell.add", aum_0.cWf().a(3, (long)bmx_02.axA(), new Object[0]));
            return false;
        }
        if (this.dMS()) {
            bwj_0 bwj_02 = bmx_03 != null ? new bwj_0(bwK.jzR, bmx_03, bmd_02) : new bwj_0(bwK.jzQ, bmx_02, bmd_02);
            this.jzJ.add(bwj_02);
            this.jzK.run();
        }
        return true;
    }

    public boolean a(@NotNull bmd_0 bmd_02) {
        boolean bl = new frb().i(this.jzF.Sn(), bmd_02.eeW().axA(), this.jzI);
        if (!bl) {
            byi_1.a(byh_1.lAv, "build.error.spell.remove", aum_0.cWf().a(3, (long)bmd_02.eeW().axA(), new Object[0]));
            return false;
        }
        if (this.dMS()) {
            bwj_0 bwj_02 = new bwj_0(bwK.jzS, bmd_02.eeW(), bmd_02);
            this.jzJ.add(bwj_02);
            this.jzK.run();
        }
        return true;
    }

    public boolean a(@NotNull frd frd2) {
        frd frd3 = new frd(this.jzG.eEu(), this.jzG.eEv());
        boolean bl = new frb().a(this.jzF.Sn(), frd2, this.jzI);
        if (!bl) {
            byi_1.a(byh_1.lAv, "build.error.spell.full.deck", new Object[0]);
            return false;
        }
        if (this.dMS()) {
            bwj_0 bwj_02 = new bwj_0(bwK.jzP, null, null);
            bwj_02.jzO = frd3;
            this.jzJ.add(bwj_02);
            this.jzK.run();
        }
        return bl;
    }
}

