/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Iterator;
import java.util.LinkedList;
import org.apache.log4j.Logger;

/*
 * Renamed from bew
 */
public class bew_2
extends beg_2<bet_2> {
    private static final Logger hNA = Logger.getLogger(bew_2.class);
    private final LinkedList<bet_2> hNB = new LinkedList();
    private final beu_2 hNC = new beu_2(this);
    private boolean hND = true;

    public void a(bdj_2 bdj_22, enk_0 enk_02, int n, pg_0 pg_02, acd_1 acd_12, boolean bl, boolean bl2) {
        bet_2 bet_22 = new bet_2(enk_02, n, acd_12, bl, bl2, pg_02, this);
        this.b(bdj_22, bet_22);
        if (!bet_22.hNs) {
            this.hMX.add(bet_22);
        }
        bet_22.p(bdj_22);
    }

    @Override
    public void a(bdj_2 bdj_22, bet_2 bet_22) {
        if (bet_22.hNu == null) {
            bet_22.hNu = this;
        }
        super.b(bdj_22, bet_22);
    }

    @Override
    private void b(bet_2 bet_22) {
        bgy bgy2 = bet_22.hKX.dcP();
        if (bgy2 != null && bgy2.dlw()) {
            bet_22.hNt = null;
            return;
        }
        if (bgy2 != null && bgy2.dmc() && !bgy2.djT()) {
            bet_22.hNt = null;
            return;
        }
        if (bet_22.hMZ.a(eNi.qWW)) {
            int n = ((bsg_1)aie_0.cfn().bmH()).d(bsn_1.lkp);
            bsc_1 bsc_12 = bsc_1.Jv(n).orElse(bsc_1.lhu);
            if (bsc_12 == bsc_1.lhw) {
                bet_22.hNt = null;
                return;
            }
            if (bsc_12 == bsc_1.lhv && (bgy2 == null || bgy2.Sn() != aue_0.cVJ().cVK().Sn())) {
                bet_22.hNt = null;
                return;
            }
        }
        bet_22.hNt = agY.bzw().sk(bet_22.hNo);
        if (bgy2 != null && bgy2.djT()) {
            bet_22.hNt.pu(bgy2.bqo());
        }
        if (bet_22.hNp != null) {
            bet_22.hNt.e(bet_22.hNp.getX(), bet_22.hNp.getY(), bet_22.hNp.bdi());
        } else {
            boolean bl;
            float f2 = -1.0f;
            int n = -1;
            if (bgy2 instanceof bhJ && (bl = bgy2.bwb())) {
                f2 = 0.0f;
                n = 3;
            }
            switch (bet_22.hNr) {
                case beE: 
                case beF: {
                    break;
                }
                case beH: {
                    f2 = 1.0f;
                    n = 0;
                    break;
                }
                case beG: {
                    f2 = 0.5f;
                    n = 0;
                    break;
                }
                default: {
                    hNA.error((Object)("Localisation d'aps non traitee " + String.valueOf((Object)bet_22.hNr)));
                }
            }
            if (f2 < 0.0f || n < 0) {
                bet_22.hNt.a(bet_22.hKX);
            } else {
                bet_22.hNt.a(bet_22.hKX, f2, n);
            }
        }
        if (bet_22.hNv) {
            bet_22.hNt.cW(false);
        } else {
            bet_22.hNv = true;
        }
        bet_22.hNt.setVisible(this.hND);
        agZ.bzy().b(bet_22.hNt);
    }

    @Override
    protected void b(bdj_2 bdj_22, bet_2 bet_22) {
        if (!bet_22.hNq && !bet_22.hNs) {
            this.hNB.addLast(bet_22);
        }
        if (!this.hNC.bhl()) {
            this.hNC.dex();
        }
    }

    @Override
    public void a(bet_2 bet_22, bet_2 bet_23, bdj_2 bdj_22) {
        this.d(bet_23);
        if (bet_23 == this.hNB.peek()) {
            this.hNB.poll();
            this.f(this.hNB.peek());
        } else {
            this.c(bet_23);
        }
        if (this.dem()) {
            this.hNC.dey();
        }
    }

    protected void c(bet_2 bet_22) {
        Iterator iterator = this.hNB.iterator();
        while (iterator.hasNext()) {
            bet_2 bet_23 = (bet_2)iterator.next();
            if (bet_23 != bet_22) continue;
            iterator.remove();
        }
    }

    private void d(bet_2 bet_22) {
        if (bet_22 == null) {
            return;
        }
        if (bet_22.hNt == null) {
            return;
        }
        bet_22.hNt.bLI();
        bet_22.hNt = null;
    }

    public void dez() {
        if (this.hNB.isEmpty() || this.hNB.size() == 1) {
            return;
        }
        bet_2 bet_22 = this.hNB.poll();
        this.e(bet_22);
        this.hNB.addLast(bet_22);
        try {
            this.f(this.hNB.peek());
        }
        catch (Exception exception) {
            hNA.error((Object)"Exception levee", (Throwable)exception);
            this.hNB.poll();
        }
    }

    private void e(bet_2 bet_22) {
        if (bet_22 == null || bet_22.hNt == null || !bet_22.hNt.bnq()) {
            return;
        }
        bet_22.hNt.bLH();
    }

    private void f(bet_2 bet_22) {
        if (bet_22 == null) {
            return;
        }
        if (bet_22.hNt == null || !bet_22.hNt.bnq()) {
            this.b(bet_22);
        } else {
            bet_22.hNt.reset();
            bet_22.hNt.start();
        }
    }

    public void fv(boolean bl) {
        this.hND = bl;
        bet_2 bet_22 = this.hNB.peek();
        if (bet_22 == null || bet_22.hNt == null) {
            return;
        }
        agZ.bzy().e(bet_22.hNt.bLJ(), bl);
    }

    public void g(bet_2 bet_22) {
        if (bet_22.hNq || bet_22.hNs) {
            this.b(bet_22);
        } else if (this.hNB.size() == 1) {
            if (this.hNB.peek() == bet_22) {
                this.b(bet_22);
            } else {
                hNA.warn((Object)"Si la liste est de taille 1, le premier element devrait etre celui la, ce n'est pas nomal d'en avoir un autre");
            }
        }
    }

    @Override
    public void e(bdj_2 bdj_22) {
        for (bet_2 bet_22 : this.hMX) {
            this.a(bet_22, bet_22, bdj_22);
        }
        this.hMX.clear();
    }

    public void b(bdj_2 bdj_22, enk_0 enk_02, int n, pg_0 pg_02, acd_1 acd_12, boolean bl, boolean bl2) {
        bet_2 bet_22 = new bet_2(enk_02, n, acd_12, bl, bl2, pg_02, this);
        if (bet_22.hNs) {
            bet_2 bet_23 = (bet_2)this.den();
            this.a(bet_23, (bet_2)null, bdj_22);
        } else {
            this.a(bdj_22, bet_22, false);
        }
    }

    @Override
    protected /* synthetic */ void a(bdj_2 bdj_22, beh_2 beh_22) {
        this.b(bdj_22, (bet_2)beh_22);
    }

    @Override
    public /* synthetic */ void b(bdj_2 bdj_22, beh_2 beh_22) {
        this.a(bdj_22, (bet_2)beh_22);
    }
}

