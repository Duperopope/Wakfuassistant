/*
 * Decompiled with CFR 0.152.
 */
final class cfJ
extends ceK<cqE, bsj_0> {
    cfJ() {
    }

    public boolean a(cqE cqE2) {
        bgy bgy2 = (bgy)((bsj_0)this.jkR).qJ(cqE2.OO());
        if (bgy2 == null || ((bsj_0)this.jkR).dGp() != etw_0.rqT) {
            return false;
        }
        bdj_2 bdj_22 = bgy2.ddI();
        if (cqE2.aLB()) {
            if (bgy2 instanceof bhJ) {
                bdj_22.dcY();
                this.l(bgy2, true);
            }
            ((bsj_0)this.jkR).bh(bgy2);
        } else {
            if (bgy2 instanceof bhJ) {
                bdj_22.dcZ();
                this.l(bgy2, false);
            }
            ((bsj_0)this.jkR).bi(bgy2);
        }
        return false;
    }

    private void l(bgy bgy2, boolean bl) {
        for (bgy bgy3 : ((bsj_0)this.jkR).dGs()) {
            if (bgy3.Xi() != bgy2.Xi() || bgy3.aFW() != 5) continue;
            if (bl) {
                bgy3.ddI().dcY();
                continue;
            }
            bgy3.ddI().dcZ();
        }
    }

    @Override
    public /* synthetic */ boolean b(aam_2 aam_22) {
        return this.a((cqE)aam_22);
    }
}

