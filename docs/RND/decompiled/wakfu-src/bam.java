/*
 * Decompiled with CFR 0.152.
 */
public class bam
implements afl {
    @Override
    public String getName() {
        return aum_0.cWf().c("contentLoader.spell", new Object[0]);
    }

    public void a(WL wL) {
        aOx aOx2 = new aOx();
        for (bfo_2 bfo_22 : bfq_2.dge().dgj()) {
            this.a(aOx2, bfo_22.aIi());
        }
        this.a(aOx2, eym.phU.aWP());
        wL.b(this);
    }

    private void a(aOx aOx2, int n) {
        aqb_1.bGD().a(aOx2, "breed_id", n, new ban(this));
    }
}

