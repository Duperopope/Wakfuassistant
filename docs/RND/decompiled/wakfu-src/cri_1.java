/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cRi
 */
public class cri_1
extends cpm_1
implements adm_0 {
    private final fsm nlW;

    public cri_1(fsm fsm2) {
        this.nlW = fsm2;
    }

    @Override
    public cps_1 eLz() {
        return cps_1.niX;
    }

    @Override
    public void run() {
        if (!this.bxO()) {
            return;
        }
        this.eMz();
    }

    @Override
    public boolean bxO() {
        if (this.cqO instanceof bhx_0) {
            bhx_0 bhx_02 = (bhx_0)this.cqO;
            if (bhx_02.doG() == 132) {
                return false;
            }
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            return bhx_02.a(ezj_0.psF) && !bhx_02.djT() && !bgt_02.djT() && !bsl_0.jfZ.dFs();
        }
        nii.error((Object)("[RESURRECTION] On essaye de rez un " + this.cqO.getClass().getSimpleName()));
        return false;
    }

    private void eMz() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bdj_2 bdj_22 = bgt_02.ddI();
        bhx_0 bhx_02 = (bhx_0)this.cqO;
        int n = bdj_22.bqg().A(bhx_02.aZw());
        if (n <= 1) {
            abi_1 abi_12 = bdj_22.bqg().x(bhx_02.aZw());
            if (abi_12 != null) {
                bdj_22.a(abi_12);
            }
            ciO ciO2 = new ciO(bhx_02.Sn(), this.nlW);
            aue_0.cVJ().etu().d(ciO2);
        } else {
            bdj_22.b(this);
            if (!bgt_02.c(bhx_02.aZw(), true, false)) {
                bdj_22.c(this);
                bNG.egl();
                bNG.a(2, new Object[0]);
            }
        }
    }

    @Override
    public void pathEnded(ads_0 ads_02, int n, int n2, short s) {
        ads_02.c(this);
        this.eMz();
    }

    @Override
    public String ely() {
        switch (this.nlW) {
            case tcx: {
                return "resurrect";
            }
            case tcy: {
                return "resurrectPest";
            }
        }
        return "unknown resurrection type";
    }

    @Override
    public cpm_1 eLD() {
        return new cri_1(this.nlW);
    }

    @Override
    protected int eLB() {
        return crc_2.nmY.nnW;
    }
}

