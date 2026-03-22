/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

public final class eQe
extends eOa {
    private static final aox_1 rfd = new enz_0(new eny_0("Facteurs sur le nombre de cases", new enx_0("Niveau par case parcourue", eNA.qYD)));

    @Override
    public aox_1 bEt() {
        return rfd;
    }

    public eQe() {
        this.bby();
    }

    public eQe fFk() {
        return new eQe();
    }

    @Override
    public void E(QD qD) {
        if (this.bgC == null) {
            return;
        }
        float f2 = ((enk_0)this.bgC).x(0, this.fHf());
        acd_1 acd_12 = this.bgE.aZw();
        int n = this.bgG.A(acd_12);
        float f3 = (float)n * f2;
        this.aQL = (int)Math.floor(f3);
    }

    @Override
    @NotNull
    protected enq_0 g(ero_0 ero_02) {
        enq_0 enq_02 = enq_0.a(false, false, ero_02);
        enq_02.RT(this.aQL);
        return enq_02;
    }

    @Override
    public void aVH() {
        super.aVH();
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fFk();
    }
}

