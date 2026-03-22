/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

public final class eQd
extends eOa {
    private static final aox_1 rfc = new enz_0(new eny_0("Facteurs sur le PA/PM/PW", new enx_0("Niveau par PA", eNA.qYD), new enx_0("Niveau par PM", eNA.qYD), new enx_0("Niveau par PW", eNA.qYD)));

    @Override
    public aox_1 bEt() {
        return rfc;
    }

    public eQd() {
        this.bby();
    }

    public eQd fFj() {
        return new eQd();
    }

    @Override
    public void E(QD qD) {
        if (this.bgC == null) {
            return;
        }
        fqE fqE2 = (fqE)this.bgJ.bak().baS();
        if (fqE2 == null) {
            return;
        }
        float f2 = ((enk_0)this.bgC).x(0, this.fHf());
        float f3 = ((enk_0)this.bgC).x(1, this.fHf());
        float f4 = ((enk_0)this.bgC).x(2, this.fHf());
        Object Spell = fqE2.giP();
        int n = ((fqD)Spell).Zc(fqE2.cmL());
        int n2 = ((fqD)Spell).Zf(fqE2.cmL());
        int n3 = ((fqD)Spell).Zd(fqE2.cmL());
        float f5 = (float)n * f2 + (float)n2 * f3 + (float)n3 * f4;
        this.aQL = (int)Math.floor(f5);
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
        return this.fFj();
    }
}

