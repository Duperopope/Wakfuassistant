/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashSet;

/*
 * Renamed from ePS
 */
public final class eps_0
extends ePU {
    private static final aox_1 reF = new enz_0(new eny_0("Pas de params", new enx_0[0]));

    @Override
    public aox_1 bEt() {
        return reF;
    }

    @Override
    public ePU fEY() {
        eps_0 eps_02 = new eps_0();
        eps_02.qXs = this.qXs;
        return eps_02;
    }

    public eps_0() {
    }

    public eps_0(int n) {
        super(n);
    }

    @Override
    protected void c(QD qD, boolean bl) {
        super.c(qD, bl);
        QE qE = this.bgF.baz();
        if (this.bgF == null || qE == null) {
            this.fHg();
            return;
        }
        HashSet<erh_0> hashSet = new HashSet<erh_0>();
        for (QD qD2 : qE) {
            erh_0 erh_02;
            if (!(qD2 instanceof erh_0) || !(erh_02 = (erh_0)qD2).fCz()) continue;
            hashSet.add(erh_02);
        }
        for (erh_0 erh_03 : hashSet) {
            erh_03.bbO();
        }
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fEY();
    }
}

