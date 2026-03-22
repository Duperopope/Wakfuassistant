/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashSet;

/*
 * Renamed from eOb
 */
public abstract class eob_0
extends ero_0 {
    private static final aox_1 rao = new enz_0(new eny_0("Modifie la valeur de la caract\u00e9ristique dans 1-n \u00e9l\u00e9ments tir\u00e9s au hasard \u00e0 la cr\u00e9ation de l'item", new enx_0("Valeur", eNA.qYC), new enx_0("Nombre d'\u00e9l\u00e9ments", eNA.qYD)));
    private final ArrayList<eON> rap = new ArrayList();

    @Override
    public aox_1 bEt() {
        return rao;
    }

    @Override
    protected void c(QD qD, boolean bl) {
        eNl eNl2 = (eNl)this.bbf();
        if (!(eNl2 instanceof ffV)) {
            return;
        }
        ffV ffV2 = (ffV)eNl2;
        if (!ffV2.fWv()) {
            return;
        }
        HashSet<eNd> hashSet = ffV2.UY(this.d());
        if (hashSet == null) {
            return;
        }
        for (eNd eNd2 : hashSet) {
            eON eON2 = new eON(this.k(eNd2));
            eON2.oB(this.aQL);
            eON2.f(this.bgF);
            eON2.e(this.bgE);
            eON2.mk(true);
            eON2.b((enk_0)this.bgC);
            eON2.c(qD, bl);
            eON2.rdU = true;
            this.rap.add(eON2);
        }
    }

    protected abstract exx_2 k(eNd var1);

    @Override
    public void bbS() {
        for (eON eON2 : this.rap) {
            eON2.bbS();
        }
    }

    @Override
    public void E(QD qD) {
        this.aQL = ((enk_0)this.bgC).a(0, this.fHf(), ene_0.qPu);
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
    public void aVH() {
        super.aVH();
        this.rap.clear();
    }
}

