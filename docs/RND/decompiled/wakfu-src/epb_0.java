/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from ePb
 */
public class epb_0
extends ero_0 {
    private static final int rcD = Integer.MIN_VALUE;
    private static final aox_1 rcE = new enz_0(new eny_0("D\u00e9faut (on retire tous les effets)", new enx_0[0]), new eny_0("D\u00e9senvoutement avec l'id AGT", new enx_0("Id de l'effet a retirer (ID AGT)", eNA.qYC)), new eny_0("D\u00e9senvoutement avec l'id de l'action", new enx_0("Id de l'effet a retirer (ID de l'action)", eNA.qYC), new enx_0("Pas d'utilit\u00e9", eNA.qYC)));

    @Override
    public aox_1 bEt() {
        return rcE;
    }

    public epb_0 fDq() {
        epb_0 epb_02 = new epb_0();
        return epb_02;
    }

    @Override
    protected void c(QD qD, boolean bl) {
        this.mk(true);
        if (this.bgC == null || this.bgF == null || this.bgF.baz() == null) {
            return;
        }
        ArrayList<ero_0> arrayList = new ArrayList<ero_0>();
        boolean bl2 = ((enk_0)this.bgC).fAn() == 2;
        int n = ((enk_0)this.bgC).fAn() > 0 ? ((enk_0)this.bgC).a(0, this.fHf(), ene_0.qPu) : Integer.MIN_VALUE;
        for (QD qD2 : this.bgF.baz()) {
            if (qD2.bba() == null) continue;
            int n2 = bl2 ? qD2.bba().avZ() : ((enk_0)((ero_0)qD2).bba()).aZH();
            if (((ero_0)qD2).bba() != null && n == n2) {
                arrayList.add((ero_0)qD2);
                continue;
            }
            if (!this.G(qD2) || qD2.d() == enf_0.qVx.d() || n != Integer.MIN_VALUE) continue;
            arrayList.add((ero_0)qD2);
        }
        for (ero_0 ero_02 : arrayList) {
            ero_02.mi(true);
            this.bgF.baz().q(ero_02);
        }
    }

    private boolean G(QD qD) {
        fqU fqU2;
        boolean bl;
        boolean bl2;
        boolean bl3 = bl2 = qD.bba() != null && qD.bba().aZG() == 2;
        if (bl2 && !(bl = ((eNs)qD.bba()).cwA())) {
            return false;
        }
        if (qD instanceof erh_0 && (fqU2 = ((erh_0)qD).fGk()) != null && (fqU2.gjC() || !fqU2.cwA())) {
            return false;
        }
        Object EC = qD.bbf();
        if (EC == null) {
            return false;
        }
        int n = EC.bab();
        if (n == 3) {
            return true;
        }
        if (n == 1) {
            return true;
        }
        if (n != 11) {
            return false;
        }
        if (!(EC instanceof fqE)) {
            return true;
        }
        fqE fqE2 = (fqE)EC;
        return !((fqD)fqE2.giP()).eeY();
    }

    @Override
    public void E(QD qD) {
    }

    @Override
    public boolean bbA() {
        return false;
    }

    @Override
    public boolean bbB() {
        return true;
    }

    @Override
    public boolean bbC() {
        return false;
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fDq();
    }
}

