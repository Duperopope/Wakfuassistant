/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cQP
 */
public class cqp_2
extends cpm_1 {
    @Override
    public cps_1 eLz() {
        return cps_1.nja;
    }

    @Override
    public void run() {
        if (!this.bxO()) {
            return;
        }
        bhx_0 bhx_02 = (bhx_0)this.cqO;
        bJr bJr2 = bhx_02.doD();
        if (bJr2 != null) {
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            if (!bgt_02.i(false, true)) {
                return;
            }
            this.eMt();
        }
    }

    private void eMs() {
        bhx_0 bhx_02 = (bhx_0)this.cqO;
        bJr bJr2 = bhx_02.doD();
        if (bJr2 != null) {
            cnG cnG2 = new cnG();
            cnG2.Ck(bJr2.d());
            aie_0.cfn();
            aie_0.cfo().etu().d(cnG2);
        } else {
            nii.error((Object)("Tentative de management d'un protecteur inconnu source=" + String.valueOf(this.cqO)));
        }
    }

    private void eMt() {
        if (!aue_0.cVJ().c(cxf_1.eXs())) {
            aue_0.cVJ().a(cxf_1.eXs());
        }
    }

    @Override
    public boolean bxO() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02.djT()) {
            return false;
        }
        if (bsl_0.jfZ.dFs()) {
            return false;
        }
        fjn_0 fjn_02 = bgt_02.ffF();
        if (!(this.cqO instanceof bhx_0)) {
            return false;
        }
        bJr bJr2 = ((bhx_0)this.cqO).doD();
        if (bJr2 == null) {
            return false;
        }
        int n = bjx_0.klY.d(bJr2);
        return n != -1 && n != 0 && n == fjn_02.Xt();
    }

    @Override
    public String ely() {
        fkJ fkJ2 = brx_1.elI().ems().gbB();
        fkH fkH2 = fkJ2.uc(aue_0.cVJ().cVK().Sn());
        return fkH2 != null && fkM.f(fkH2.emF()) ? "manageProtector" : "seeProtector";
    }

    @Override
    public cpm_1 eLD() {
        return new cqp_2();
    }

    @Override
    protected int eLB() {
        return crc_2.nmG.nnW;
    }
}

