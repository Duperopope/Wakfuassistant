/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*
 * Renamed from eQg
 */
public class eqg_0
extends ePN {
    private static final aox_1 rff = new enz_0(new eny_0("Params", new enx_0("nb de rolls", eNA.qYC), new enx_0("0 = cellule, 1 = cibles (default)", eNA.qYD)), new eny_0("V\u00e9rifie le critere sur les cellules de la zone (pas sur l'effet de base)", new enx_0("nb de rolls", eNA.qYC), new enx_0("0 = cellule, 1 = cibles (default)", eNA.qYD), new enx_0("Critere sur zone = 1, critere sur effet de base = 0 (defaut)", eNA.qYD)), new eny_0("Utilise la direction vers la cellule cible", new enx_0("nb de rolls", eNA.qYC), new enx_0("0 = cellule, 1 = cibles (default)", eNA.qYD), new enx_0("Critere sur zone = 1, critere sur effet de base = 0 (defaut)", eNA.qYD), new enx_0("Utilise la direction vers la cible (1 = oui) (pas la direction du caster)", eNA.qYD)), new eny_0("Calcul la zone avec la cellule du caster en cellule cible", new enx_0("nb de rolls", eNA.qYC), new enx_0("0 = cellule, 1 = cibles (default)", eNA.qYD), new enx_0("Critere sur zone = 1, critere sur effet de base = 0 (defaut)", eNA.qYD), new enx_0("Utilise la direction vers la cible (1 = oui) (pas la direction du caster)", eNA.qYD), new enx_0("Calcul la zone avec la cellule du caster en cellule cible (1=oui)", eNA.qYD)), new eny_0("Retrait des cellules deja utilis\u00e9es", new enx_0("nb de rolls", eNA.qYC), new enx_0("0 = cellule, 1 = cibles (default)", eNA.qYD), new enx_0("Critere sur zone = 1, critere sur effet de base = 0 (defaut)", eNA.qYD), new enx_0("Utilise la direction vers la cible (1 = oui) (pas la direction du caster)", eNA.qYD), new enx_0("Calcul la zone avec la cellule du caster en cellule cible (1=oui)", eNA.qYD), new enx_0("Retire de la liste les cellules d\u00e9j\u00e0 cibl\u00e9es (1=oui)", eNA.qYD)), new eny_0("M\u00e9lange les cibles avant d'appliquer la limite", new enx_0("nb de rolls", eNA.qYC), new enx_0("0 = cellule, 1 = cibles (default)", eNA.qYD), new enx_0("Critere sur zone = 1, critere sur effet de base = 0 (defaut)", eNA.qYD), new enx_0("Utilise la direction vers la cible (1 = oui) (pas la direction du caster)", eNA.qYD), new enx_0("Calcul la zone avec la cellule du caster en cellule cible (1=oui)", eNA.qYD), new enx_0("UNUSED : Retire de la liste les cellules d\u00e9j\u00e0 cibl\u00e9es (1=oui)", eNA.qYD), new enx_0("On m\u00e9lange les cibles avant d'appliquer la limite (oui = 1 (defaut), non = 0)", eNA.qYD)), new eny_0("Tri des cellules avant d'appliquer la limite", new enx_0("nb de rolls", eNA.qYC), new enx_0("0 = cellule, 1 = cibles (default)", eNA.qYD), new enx_0("Critere sur zone = 1, critere sur effet de base = 0 (defaut)", eNA.qYD), new enx_0("Utilise la direction vers la cible (1 = oui) (pas la direction du caster)", eNA.qYD), new enx_0("Calcul la zone avec la cellule du caster en cellule cible (1=oui)", eNA.qYD), new enx_0("UNUSED : Retire de la liste les cellules d\u00e9j\u00e0 cibl\u00e9es (1=oui)", eNA.qYD), new enx_0("On m\u00e9lange les cibles avant d'appliquer la limite (oui = 1 (defaut), non = 0)", eNA.qYD), new enx_0("Tri des cellules, voir effet pour les valeurs, outrepasse le m\u00e9lange (0 pour le tri par d\u00e9faut)", eNA.qYD)));
    private boolean rfg;
    private boolean rfh;
    private boolean rfi;
    private boolean rfj;
    private boolean rfk = true;
    private int eQr = 0;

    public eqg_0() {
        this.bby();
    }

    @Override
    public aox_1 bEt() {
        return rff;
    }

    @Override
    public ePN fEQ() {
        eqg_0 eqg_02 = new eqg_0();
        this.a(eqg_02);
        eqg_02.rfk = this.rfk;
        return eqg_02;
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (!this.bbt()) {
            return;
        }
        if (this.bgC == null) {
            bgA.error((Object)"Pas de genericEffect, \u00e7a ne devrait pas arriver");
            this.fHg();
            return;
        }
        rh_0 rh_02 = this.bgJ.bag();
        if (rh_02 == null) {
            bgA.error((Object)("pas de fightmap sur le context " + String.valueOf(this.bgJ)));
            return;
        }
        List<int[]> list = this.fFm();
        if (list.isEmpty()) {
            this.fHg();
            return;
        }
        if (this.rfk) {
            Collections.shuffle(list);
        }
        if (this.eQr > 0) {
            this.aN(list);
        }
        enq_0 enq_02 = enq_0.a(false, false, (ero_0)qD);
        if (this.a(eNi.qWD) && enq_02.Oh() == -1) {
            enq_02.RT(this.fHf());
        }
        this.reA = Math.min(list.size(), this.reA);
        for (int i = 0; i < this.reA; ++i) {
            int[] nArray = list.get(i);
            for (enk_0 enk_02 : this.rfa) {
                short s = rh_02.Z(nArray[0], nArray[1]);
                enk_02.a((Qk)this.bbf(), this.bgE, this.bgJ, enf_0.fBb(), nArray[0], nArray[1], s, null, enq_02, false);
            }
        }
    }

    private void aN(List<int[]> list) {
        eSc eSc2 = eSc.Sh(this.eQr);
        eSg eSg2 = eSc2.at(this.bgE.aZw());
        list.sort(eSg2);
    }

    private List<int[]> fFm() {
        rh_0 rh_02 = this.bgJ.bag();
        if (rh_02 == null) {
            return Collections.emptyList();
        }
        if (this.fFq()) {
            return this.f(rh_02);
        }
        abi_1 abi_12 = this.fFp();
        acd_1 acd_12 = this.fFo();
        acd_1 acd_13 = this.fFn();
        Iterable<int[]> iterable = ((enk_0)this.bgC).aZS().b(acd_12.getX(), acd_12.getY(), acd_12.bdi(), acd_13.getX(), acd_13.getY(), acd_13.bdi(), abi_12);
        ArrayList<int[]> arrayList = new ArrayList<int[]>();
        ang_2 ang_22 = ((enk_0)this.bgC).fAx();
        acd_1 acd_14 = new acd_1();
        for (int[] nArray : iterable) {
            short s;
            int n;
            int n2 = nArray[0];
            if (!rh_02.aK(n2, n = nArray[1]) || !rh_02.T(n2, n) || (s = rh_02.Z(n2, n)) == Short.MIN_VALUE) continue;
            if (this.rfg && ang_22 != null) {
                acd_14.Q(n2, n, s);
                if (!ang_22.b(this.bgE, acd_14, this, this.bgJ)) continue;
            }
            arrayList.add(nArray);
        }
        return arrayList;
    }

    private List<int[]> f(rh_0 rh_02) {
        List<int[]> list = rh_02.bdT();
        ang_2 ang_22 = ((enk_0)this.bgC).fAx();
        if (!this.rfg || ang_22 == null) {
            return list;
        }
        acd_1 acd_12 = new acd_1();
        Iterator<int[]> iterator = list.iterator();
        while (iterator.hasNext()) {
            int n;
            int[] nArray = iterator.next();
            int n2 = nArray[0];
            short s = rh_02.Z(n2, n = nArray[1]);
            if (s == Short.MIN_VALUE) continue;
            acd_12.Q(n2, n, s);
            if (ang_22.b(this.bgE, acd_12, this, this.bgJ)) continue;
            iterator.remove();
        }
        return list;
    }

    private acd_1 fFn() {
        if (this.bgE != null) {
            return this.bgE.aZw();
        }
        return this.bgG;
    }

    private acd_1 fFo() {
        if (this.rfi) {
            return this.bgE.aZw();
        }
        return this.bgG;
    }

    private abi_1 fFp() {
        if (this.bgE == null) {
            return abi_1.dzq;
        }
        if (this.rfh) {
            return this.bgE.aZw().y(this.bgG);
        }
        return this.bgE.bcB();
    }

    @Override
    boolean K(QD qD) {
        if (((enk_0)this.bgC).fAn() >= 3 && ((enk_0)this.bgC).a(2, this.fHf(), ene_0.qPu) == 1) {
            return true;
        }
        return super.K(qD);
    }

    @Override
    public void E(QD qD) {
        super.E(qD);
        this.rfg = false;
        this.rfk = true;
        this.eQr = 0;
        if (((enk_0)this.bgC).fAn() >= 3) {
            boolean bl = this.rfg = ((enk_0)this.bgC).a(2, this.fHf(), ene_0.qPu) == 1;
        }
        if (((enk_0)this.bgC).fAn() >= 4) {
            boolean bl = this.rfh = ((enk_0)this.bgC).a(3, this.fHf(), ene_0.qPu) == 1;
        }
        if (((enk_0)this.bgC).fAn() >= 5) {
            boolean bl = this.rfi = ((enk_0)this.bgC).a(4, this.fHf(), ene_0.qPu) == 1;
        }
        if (((enk_0)this.bgC).fAn() >= 6) {
            boolean bl = this.rfj = ((enk_0)this.bgC).a(5, this.fHf(), ene_0.qPu) == 1;
        }
        if (((enk_0)this.bgC).fAn() >= 7) {
            boolean bl = this.rfk = ((enk_0)this.bgC).a(6, this.fHf(), ene_0.qPu) == 1;
        }
        if (((enk_0)this.bgC).fAn() >= 8) {
            this.eQr = ((enk_0)this.bgC).a(7, this.fHf(), ene_0.qPu);
        }
    }

    @Override
    public void aVH() {
        super.aVH();
        this.rfg = false;
        this.rfi = false;
        this.rfh = false;
        this.rfj = false;
        this.rfk = true;
        this.eQr = 0;
    }

    private boolean fFq() {
        return ((enk_0)this.bgC).aZS().bEl() == aoi_1.cLv;
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

