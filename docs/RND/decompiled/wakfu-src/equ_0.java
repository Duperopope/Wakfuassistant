/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eQu
 */
public class equ_0
extends eOa {
    protected static final aox_1 rfQ = new enz_0(new eny_0("Niveau de container al\u00e9atoire", new enx_0("Niveau min", eNA.qYC), new enx_0("Niveau max (exclu)", eNA.qYC)));

    @Override
    @NotNull
    protected enq_0 g(ero_0 ero_02) {
        enq_0 enq_02 = enq_0.a(false, false, ero_02);
        enq_02.RT(this.aQL);
        return enq_02;
    }

    @Override
    public void E(QD qD) {
        if (this.bgC == null) {
            return;
        }
        int n = ((enk_0)this.bgC).a(0, this.fHf(), ene_0.qPu);
        int n2 = ((enk_0)this.bgC).a(1, this.fHf(), ene_0.qPu);
        this.aQL = GC.q(n, n2);
    }

    @Override
    public QD<enk_0, eNl> bbo() {
        equ_0 equ_02 = new equ_0();
        equ_02.aQL = this.aQL;
        return equ_02;
    }

    @Override
    public aox_1 bEt() {
        return rfQ;
    }
}

