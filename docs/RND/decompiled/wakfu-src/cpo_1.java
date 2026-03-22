/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cPO
 */
abstract class cpo_1
extends cpm_1
implements adm_0 {
    cpo_1() {
    }

    @Override
    public void run() {
        if (!this.bxO()) {
            return;
        }
        bCA bCA2 = (bCA)this.cqO;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bdj_2 bdj_22 = bgt_02.ddI();
        if (!bCA2.aVP() && bCA2.T(bdj_22.bqg()) || bCA2.aVP() && bdj_22.bqg().L(bCA2.bcC(), bCA2.bcD(), bCA2.bcE())) {
            this.eLE();
        } else {
            anp_2 anp_22 = czi_2.a(bdj_22, bCA2);
            if (anp_22.bDV()) {
                bdj_22.b(this);
                bgt_02.a(anp_22, true);
            } else {
                nii.warn((Object)("Impossible de trouver un chemin jusqu'a l'element interactif " + String.valueOf(this.cqO)));
            }
        }
    }

    @Override
    public void pathEnded(ads_0 ads_02, int n, int n2, short s) {
        ads_02.c(this);
        this.eLE();
    }

    protected abstract void eLE();
}

