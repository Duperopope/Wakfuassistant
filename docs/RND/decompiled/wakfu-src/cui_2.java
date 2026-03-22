/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from cUI
 */
public class cui_2
extends crt_2
implements adi_1 {
    private bsj_0 edi;
    private bdj_2 hKX;
    public static final cui_2 nNq = new cui_2();

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            bsj_0 bsj_02 = aue_0.cVJ().cVK().dnB();
            if (bsj_02 == null) {
                return;
            }
            cty_1.ePV().kh(false);
            aUm.cUI().p("fight", true);
            aUm.cUI().p("world", false);
            this.edi = bsj_02;
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            if (this.hKX != null) {
                bdn_2.d(this.hKX);
                this.hKX = null;
            }
            cty_1.ePV().kh(true);
            aUm.cUI().p("fight", false);
            aUm.cUI().p("world", true);
            this.edi = null;
            this.eNr();
        }
    }

    @Override
    public boolean b(aam_2 aam_22) {
        if (this.edi == null) {
            return true;
        }
        switch (aam_22.d()) {
            case 16902: {
                dcm_0 dcm_02 = (dcm_0)aam_22;
                aam_0 aam_02 = aie_0.cfn().bmC();
                ArrayList<ZH> arrayList = ((aIs)aam_02).cY(dcm_02.bqM(), dcm_02.bqN());
                if (arrayList.isEmpty() || !dcm_02.fcj()) break;
                cui_2.e(arrayList, this.edi.d());
                return false;
            }
            case 16346: {
                dcm_0 dcm_03 = (dcm_0)aam_22;
                aam_0 aam_03 = aie_0.cfn().bmC();
                acd_1 acd_12 = this.a(dcm_03.bqM(), dcm_03.bqN(), !cui_2.eNp(), false, this.edi);
                if (acd_12 != null && this.edi != null && this.edi.ax(acd_12) == null) {
                    this.a(aam_03, acd_12, this.edi);
                }
                return false;
            }
            case 19763: {
                cui_2.r(this.edi);
                return false;
            }
            case 16428: {
                cui_2.s(this.edi);
                return false;
            }
            case 18906: {
                cui_2.eNs();
                return false;
            }
        }
        return true;
    }

    private void eSP() {
        if (this.hKX != null) {
            bdn_2.d(this.hKX);
            this.hKX = null;
        }
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    public String toString() {
        return "UIFightSpectatorFrame{m_fight=" + String.valueOf(this.edi) + ", m_actor=" + String.valueOf(this.hKX) + "}";
    }

    public bsj_0 cXk() {
        return this.edi;
    }
}

