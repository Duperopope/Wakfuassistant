/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

/*
 * Renamed from cRo
 */
public class cro_1
extends cpm_1
implements adm_0 {
    private bmd_2 nkL = bmd_2.iCg;
    private fqy_0 ipI;

    public cro_1() {
    }

    public cro_1(fqy_0 fqy_02) {
        this.ipI = fqy_02;
    }

    @Override
    public void run() {
        if (!this.bxO()) {
            nii.error((Object)("Tentative de lancement de l'action '" + this.eLz().aXB() + "' alors que isRunnable retourne que l'action est impossible"));
            return;
        }
        bCA bCA2 = (bCA)this.cqO;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (!bgt_02.i(false, true)) {
            return;
        }
        bgt_02.ddI().b(this);
        if (!bgt_02.b(false, true, bCA2.aVK())) {
            bgt_02.ddI().c(this);
            if (!bgt_02.ddI().bvE() && bCA2.T(bgt_02.ddI().bqg())) {
                this.eMB();
            } else {
                aPd.e("too.far.to.interact", new Object[0]);
            }
        }
    }

    @Override
    public String getLabel() {
        ahv_2 ahv_22 = new ahv_2();
        ahv_22.ceu().c(this.eLA()).cev();
        String string = aue_0.cVJ().cVK().dnw().dyT();
        ahv_22.k('\n').c(aum_0.cWf().c("craft.secured.machine.owner", string));
        if (!this.isEnabled() && this.nkL != bmd_2.iCg) {
            ahv_22.c("\n").ceC().ih(nim);
            switch (this.nkL) {
                case iCh: {
                    ahv_22.c(aum_0.cWf().c("craft.secured.craft.unknown", new Object[0]));
                    break;
                }
                case iCi: {
                    ahv_22.c(aum_0.cWf().c("error.playerNotSubscribed", new Object[0]));
                    break;
                }
                case iCj: {
                    ahv_22.c(aum_0.cWf().c("craft.secured.craftsman.absent", new Object[0]));
                    break;
                }
            }
            ahv_22.ceD();
        }
        return ahv_22.toString();
    }

    @Override
    public boolean isEnabled() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (!evg_1.osQ.a(new eve_2[]{bgt_02})) {
            this.nkL = bmd_2.iCi;
            return false;
        }
        bnv_2 bnv_22 = bgt_02.dnw();
        if (bnv_22 == null) {
            return false;
        }
        long l = bnv_22.Xi();
        bhJ bhJ2 = (bhJ)bgg_0.dlO().ju(l);
        if (bhJ2 == null) {
            this.nkL = bmd_2.iCj;
            return false;
        }
        Optional<eki_0> optional = bhJ2.dpJ();
        if (optional.isEmpty()) {
            this.nkL = bmd_2.iCk;
            return false;
        }
        int n = ((bDs)this.cqO).cms();
        if (!optional.get().tX(n)) {
            this.nkL = bmd_2.iCh;
            return false;
        }
        return true;
    }

    @Override
    public boolean bxO() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bnv_2 bnv_22 = bgt_02.dnw();
        if (bnv_22 == null) {
            return false;
        }
        if (bnv_22.Xi() == bgt_02.Sn()) {
            return false;
        }
        this.setEnabled(true);
        return true;
    }

    @Override
    public String ely() {
        return this.ipI.giw();
    }

    @Override
    public void pathEnded(ads_0 ads_02, int n, int n2, short s) {
        ads_02.c(this);
        bCA bCA2 = (bCA)this.cqO;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bCA2.T(bgt_02.ddI().bqg())) {
            this.eMB();
        }
    }

    public void eMB() {
        bDs bDs2 = (bDs)this.cqO;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bgt_02.ddI().a(bgt_02.aZw().O(bDs2.bcC(), bDs2.bcD(), (short)0));
        ctg_1.eQG().a((bDs)this.cqO, false);
    }

    @Override
    public cpm_1 eLD() {
        return new cro_1(this.ipI);
    }

    @Override
    public cps_1 eLz() {
        return cps_1.njD;
    }

    @Override
    protected int eLB() {
        return this.ipI.giv();
    }

    public fqy_0 drR() {
        return this.ipI;
    }

    public void b(fqy_0 fqy_02) {
        this.ipI = fqy_02;
    }
}

