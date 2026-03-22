/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ePN
extends eqc_0 {
    private static final aox_1 rez = new enz_0(new eny_0("groupe d'effets standard", new enx_0("nb d'effets \u00e0 executer", eNA.qYC)), new eny_0("groupe d'effets cibl\u00e9", new enx_0("nb d'effets \u00e0 executer", eNA.qYC), new enx_0("0 = cellule, 1 = cibles (default)", eNA.qYD)), new eny_0("Gestion de la tansmission de la cible originale", new enx_0("nb d'effets \u00e0 executer", eNA.qYC), new enx_0("0 = cellule, 1 = cibles (default)", eNA.qYD), new enx_0("Transmission de la cible originale aux effets du groupe : oui = 1 (d\u00e9faut), non = 0 ", eNA.qYD)));
    protected int reA = -1;

    public ePN fEQ() {
        ePN ePN2 = new ePN();
        this.a(ePN2);
        return ePN2;
    }

    @Override
    protected void a(ePN ePN2) {
        ePN2.reA = this.reA;
        ePN2.reY = this.reY;
        ePN2.rfa = null;
    }

    @Override
    protected void c(QD qD, boolean bl) {
        this.fHg();
        if (!this.bbt()) {
            return;
        }
        if (this.rfa == null) {
            bgA.error((Object)("Groupe d'effets inexistant " + this.aZH()));
            return;
        }
        List<enk_0> list = this.fER();
        enq_0 enq_02 = enq_0.a(true, false, (ero_0)qD);
        if (this.a(eNi.qWD) && enq_02.Oh() == -1) {
            enq_02.RT(this.fHf());
        }
        for (enk_0 enk_02 : list) {
            if (this.bbB()) {
                enk_02.a((Qk)this.bbf(), this.bbc(), this.bbh(), enf_0.fBb(), this.bgF.bcC(), this.bgF.bcD(), this.bgF.bcE(), this.reY ? this.bgF : null, enq_02, false);
                continue;
            }
            if (this.bgC == null || ((enk_0)this.bgC).aZS() == null) {
                return;
            }
            this.a(enq_02, enk_02);
        }
    }

    private void a(enq_0 enq_02, enk_0 enk_02) {
        rh_0 rh_02 = this.bgJ.bag();
        if (rh_02 == null) {
            bgA.warn((Object)("pas de fightmap sur le context " + String.valueOf(this.bgJ)));
            return;
        }
        acd_1 acd_12 = new acd_1(this.bbe());
        aoh_1 aoh_12 = ((enk_0)this.bgC).aZS();
        Iterable<int[]> iterable = aoh_12.b(this.bgG.getX(), this.bgG.getY(), this.bgG.bdi(), this.bgE.bcC(), this.bgE.bcD(), this.bgE.bcE(), this.bgE.bcB());
        for (int[] nArray : iterable) {
            short s;
            acd_12.setX(nArray[0]);
            acd_12.setY(nArray[1]);
            if (!rh_02.T(acd_12.getX(), acd_12.getY()) || (s = rh_02.Z(acd_12.getX(), acd_12.getY())) == Short.MIN_VALUE) continue;
            acd_12.aM(s);
            if (!rh_02.aK(acd_12.getX(), acd_12.getY())) continue;
            enk_02.a((Qk)this.bbf(), this.bbc(), this.bbh(), enf_0.fBb(), acd_12.getX(), acd_12.getY(), acd_12.bdi(), null, enq_02, false);
        }
    }

    private boolean t(enk_0 enk_02) {
        if (enk_02.fAv() > this.fHf()) {
            return false;
        }
        if (enk_02.fAw() < this.fHf()) {
            return false;
        }
        ang_2 ang_22 = enk_02.fAx();
        return ang_22 == null || ang_22.b(this.bgE, this.bbB() ? this.bgF : this.bgG, null, this.bgJ);
    }

    private List<enk_0> fER() {
        Object object22;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        for (Object object22 : this.rfa) {
            if (!this.t((enk_0)object22)) continue;
            arrayList.add(object22);
        }
        object22 = new ArrayList();
        Iterator<enk_0> iterator = arrayList.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            enk_0 enk_02 = iterator.next();
            n = (int)((float)n + enk_02.eb(this.fHf()));
        }
        block2: for (int i = 0; i < this.reA; ++i) {
            int n2 = 0;
            int n3 = GC.mR(n);
            for (enk_0 enk_03 : arrayList) {
                if (object22.contains(enk_03) || (n2 = (int)((float)n2 + enk_03.eb(this.fHf()))) < n3) continue;
                object22.add(enk_03);
                n = (int)((float)n - enk_03.eb(this.fHf()));
                continue block2;
            }
        }
        return object22;
    }

    @Override
    public void E(QD qD) {
        short s = this.fHf();
        fqB fqB2 = fqC.giD().Za(((enk_0)this.bgC).aZH());
        if (fqB2 != null) {
            this.rfa = fqB2.ci(s);
        }
        this.reA = ((enk_0)this.bgC).a(0, s, ene_0.qPu);
        if (((enk_0)this.bgC).fAn() >= 3) {
            this.reY = ((enk_0)this.bgC).a(2, s, ene_0.qPu) == 1;
        }
    }

    @Override
    public aox_1 bEt() {
        return rez;
    }

    @Override
    public boolean bbB() {
        if (this.bgC != null && ((enk_0)this.bgC).fAn() >= 2) {
            return ((enk_0)this.bgC).Rz(1) == 1.0f;
        }
        return true;
    }

    @Override
    public boolean bbC() {
        if (this.bgC != null && ((enk_0)this.bgC).fAn() >= 2) {
            return ((enk_0)this.bgC).Rz(1) == 0.0f;
        }
        return false;
    }

    @Override
    public void aVH() {
        this.rfa = null;
        this.reA = -1;
        this.reY = false;
        super.aVH();
    }

    @Override
    public /* synthetic */ eqc_0 fES() {
        return this.fEQ();
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fEQ();
    }
}

