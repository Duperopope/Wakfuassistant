/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eQT
 */
public class eqt_0
extends eQN {
    @Override
    public eQN fFK() {
        return new eqt_0();
    }

    @Override
    protected void c(QD qD, boolean bl) {
        super.c(qD, bl);
        this.fFU();
    }

    private void fFU() {
        fqE fqE2;
        byte by;
        eNd eNd2;
        if (this.bgE == null) {
            return;
        }
        if (this.odg == null) {
            return;
        }
        if (!this.odg.a(exx_2.rGw)) {
            return;
        }
        if (this.bgE.a(exx_2.rGw)) {
            this.odg.b(exx_2.rGw).nt(this.bgE.c(exx_2.rGw));
        }
        if (this.odg.a(exx_2.rGv)) {
            if (this.bgE.a(exx_2.rGv)) {
                this.odg.b(exx_2.rGv).nt(this.bgE.c(exx_2.rGv));
            }
            if (this.bgE.a(exx_2.rGy)) {
                this.odg.b(exx_2.rGv).nt(this.bgE.c(exx_2.rGy));
            }
        }
        if (this.odg.a(etl_0.rnh)) {
            this.odg.a(exx_2.rGx, this.bgE);
            this.odg.a(exx_2.rGy, this.bgE);
            this.odg.a(exx_2.rGA, this.bgE);
            this.odg.a(exx_2.rGz, this.bgE);
            this.odg.a(exx_2.rHC, this.bgE);
            this.odg.a(exx_2.rHB, this.bgE);
            this.odg.a(exx_2.rHz, this.bgE);
            this.odg.a(exx_2.rHA, this.bgE);
        } else if (((eNl)this.bgD).bab() == 11 && this.bgE.a((eNd2 = eNd.ff(by = ((fqD)(fqE2 = (fqE)this.bgD).giP()).giG())).fAU())) {
            this.odg.b(exx_2.rGw).nt(this.bgE.c(eNd2.fAU()));
        }
    }
}

