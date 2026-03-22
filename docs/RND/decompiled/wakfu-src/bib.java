/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

final class bib
extends eyj_0 {
    private final qo_2 ijS;
    final /* synthetic */ bhJ ijT;

    bib(bhJ bhJ2, qo_2 qo_22) {
        this.ijT = bhJ2;
        this.ijS = qo_22;
        this.ijS.DM().a(this);
    }

    @Override
    public void zl() {
        bhJ.dqb().error((Object)"[NATION] Pas de s\u00e9rialization de la nation ID dans le client pour l'instant", (Throwable)new UnsupportedOperationException());
    }

    @Override
    public void zm() {
        eKd eKd2;
        Object object;
        if (this.ijT.bvY()) {
            bgr_0.dmo().f(this.ijT, this.ijS.Vu);
            fse_1.gFu().a((aef_2)this.ijT, "characterListNationIconUrl", "characterListNation", "characterListNationStamp");
            fse_1.gFu().a((aef_2)csx_1.ePi().ePD(), "characterListNationIconUrl", "characterListNation", "characterListNationStamp");
        }
        if (this.ijT.ffF().Xt() != this.ijS.Vu) {
            object = fjt.syH.WG(this.ijS.Vu);
            if (object != null) {
                ((fjo_0)object).a(this.ijT);
            } else {
                bhJ.doj().error((Object)("[NATION] On essaye d'ajouter le joueur " + this.ijT.Sn() + " \u00e0 une nation inconnue du manager, nationId : " + this.ijS.Vu));
            }
        }
        if (this.ijT.bvY() && this.ijT.bXs && !fcK.rUe.as(this.ijT.Xi(), this.ijT.Sn()) && ((Optional)(object = bbs_2.a(eva_1.owr))).isPresent() && (eKd2 = (eKd)((Optional)object).get()).dua() == this.ijT.Sn() && eKd2.Xt() != this.ijT.Xt()) {
            eKd2.Le(this.ijS.Vu);
        }
    }
}

