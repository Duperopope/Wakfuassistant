/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public class bwx
extends bwh_0<bwx> {
    private final bgt_0 jyO;
    private final ehy_0 jyP;
    private final ehy_0 jyQ;
    private final List<bwy> jyR = new ArrayList<bwy>();
    private final Runnable jyS;

    public bwx(bgt_0 bgt_02, int n, @NotNull Runnable runnable) {
        this.jyO = bgt_02;
        this.jyP = bgt_02 == null ? new ehy_0() : bgt_02.dnN().PI(n);
        this.jyQ = this.jyP.fwd();
        this.jyS = runnable;
    }

    ehy_0 dMx() {
        return this.jyP;
    }

    @Override
    public boolean dLQ() {
        return !this.jyR.isEmpty() && this.jyQ.l(this.jyP);
    }

    @Override
    public void dMy() {
        if (this.jyR.isEmpty()) {
            return;
        }
        bwy bwy2 = this.jyR.remove(this.jyR.size() - 1);
        if (bwy2.jyV == null) {
            this.p(() -> cvu_2.eTO().b(bwy2.jyT, -bwy2.jyU));
        } else {
            this.p(() -> cvu_2.eTO().d(bwy2.jyV));
        }
    }

    @Override
    public void dMz() {
        if (this.jyR.isEmpty()) {
            return;
        }
        this.jyP.m(this.jyQ);
        this.jyR.clear();
        cvu_2.eTO().eUi();
        this.jyO.b(this.jyO.dmQ(), true);
    }

    @Override
    public void a(bwx bwx2) {
        this.jyR.clear();
        this.jyR.addAll(bwx2.jyR);
    }

    public void a(@NotNull bes_2 bes_22, int n) {
        this.jyP.q(bes_22.deX(), (short)n);
        if (this.dMS()) {
            this.jyR.add(new bwy(bes_22, n));
            this.jyS.run();
        }
    }

    public void b(@NotNull ehy_0 ehy_02) {
        ehy_0 ehy_03 = this.jyP.fwd();
        ehy_02.k(this.jyP);
        if (this.dMS()) {
            bwy bwy2 = new bwy(null, 0);
            bwy2.jyV = ehy_03;
            this.jyR.add(bwy2);
            this.jyS.run();
        }
    }
}

