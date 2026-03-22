/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

/*
 * Renamed from cQg
 */
public class cqg_2
extends cpm_1
implements adm_0 {
    private final boolean nkK;
    private fqy_0 ipI;
    private bmd_2 nkL = bmd_2.iCg;

    public cqg_2(boolean bl) {
        this.nkK = bl;
    }

    public cqg_2(fqy_0 fqy_02, boolean bl) {
        this.ipI = fqy_02;
        this.nkK = bl;
    }

    public cqg_2 eLY() {
        return new cqg_2(this.ipI, this.nkK);
    }

    public void b(fqy_0 fqy_02) {
        this.ipI = fqy_02;
    }

    @Override
    public String ely() {
        return this.ipI.giw();
    }

    @Override
    public String getLabel() {
        ahv_2 ahv_22 = new ahv_2();
        ahv_22.ceu().c(this.eLA());
        if (this.nkK) {
            ahv_22.c(" (").c(aum_0.cWf().c("craft.improvise", new Object[0])).c(")");
        }
        ahv_22.cev();
        if (!this.isEnabled() && this.nkL != bmd_2.iCg) {
            ahv_22.c("\n").ceC().ih(nim);
            switch (this.nkL) {
                case iCh: {
                    ahv_22.c(aum_0.cWf().c("craft.unknown", new Object[0])).ceD();
                    break;
                }
                case iCi: {
                    ahv_22.c(aum_0.cWf().c("error.playerNotSubscribed", new Object[0])).ceD();
                    break;
                }
                case iCm: {
                    ahv_22.c(aum_0.cWf().c("craft.error.kamaCraftingNotAllowed", new Object[0])).ceD();
                }
            }
        }
        return ahv_22.ceL();
    }

    @Override
    public boolean bxO() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bnv_2 bnv_22 = bgt_02.dnw();
        if (bnv_22 != null && bnv_22.Xi() != bgt_02.Sn()) {
            return false;
        }
        if (this.nkK && bgt_02.fgO()) {
            return false;
        }
        this.setEnabled(true);
        return true;
    }

    @Override
    public boolean isEnabled() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (!evg_1.osQ.a(new eve_2[]{bgt_02})) {
            this.nkL = bmd_2.iCi;
            return false;
        }
        if (this.nkK && bgt_02.fgO()) {
            this.nkL = bmd_2.iCl;
            return false;
        }
        int n = ((bDs)this.cqO).cms();
        Optional<eki_0> optional = bgt_02.dpJ();
        if (optional.isEmpty()) {
            this.nkL = bmd_2.iCk;
            return false;
        }
        if (!optional.get().tX(n)) {
            this.nkL = bmd_2.iCh;
            return false;
        }
        boolean bl = ewo_0.oBF.k(ewr_0.oDz);
        bDn bDn2 = ((bDs)this.cqO).dOd();
        if (bDn2 != null && !bl && ewO.oKm.contains((short)bDn2.d())) {
            this.nkL = bmd_2.iCm;
            return false;
        }
        this.nkL = bmd_2.iCg;
        return true;
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
                this.eLZ();
            } else {
                aPd.e("too.far.to.interact", new Object[0]);
            }
        }
    }

    @Override
    public cps_1 eLz() {
        return this.nkK ? cps_1.njj : cps_1.niK;
    }

    @Override
    public void pathEnded(ads_0 ads_02, int n, int n2, short s) {
        ads_02.c(this);
        bCA bCA2 = (bCA)this.cqO;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bCA2.T(bgt_02.ddI().bqg())) {
            this.eLZ();
        }
    }

    @Override
    protected int eLB() {
        return this.nkK ? crc_2.nnC.nnW : this.ipI.giv();
    }

    protected void eLZ() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bDs bDs2 = (bDs)this.cqO;
        bgt_02.ddI().a(bgt_02.aZw().O(bDs2.bcC(), bDs2.bcD(), (short)0));
        ctg_1.eQG().a((bDs)this.cqO, this.nkK);
    }

    @Override
    public /* synthetic */ cpm_1 eLD() {
        return this.eLY();
    }
}

