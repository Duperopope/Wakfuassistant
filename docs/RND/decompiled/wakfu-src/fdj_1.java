/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fDJ
 */
public class fdj_1
extends frs_1 {
    final /* synthetic */ fdg_2 uhC;

    public fdj_1(fdg_2 fdg_22) {
        this.uhC = fdg_22;
    }

    public boolean gsn() {
        return false;
    }

    @Override
    public fsm_1 getContentMinSize(faw_2 faw_22) {
        int n = this.uhC.tMc.width * this.uhC.tPA + this.uhC.tPz * (this.uhC.tPA - 1);
        int n2 = this.uhC.tMc.height * this.uhC.tPB + this.uhC.tPy * (this.uhC.tPB - 1);
        return new fsm_1(n, n2);
    }

    @Override
    public fsm_1 getContentPreferedSize(faw_2 faw_22) {
        return this.getContentMinSize(faw_22);
    }

    @Override
    public void a(faw_2 faw_22) {
        if (this.uhC.tPx != null) {
            for (int i = 0; i < this.uhC.tPx.size(); ++i) {
                fcv_1 fcv_12 = this.uhC.ncz.get(i);
                fgo_1 fgo_12 = this.uhC.tPx.get(i);
                float f2 = fgo_12.aSc();
                float f3 = fgo_12.aSd();
                int n = (int)((float)(this.uhC.tMc.width + this.uhC.tPz) * f2);
                int n2 = (int)((float)(this.uhC.tMc.height + this.uhC.tPy) * ((float)this.uhC.tPB - f3 - 1.0f));
                fcv_12.setPosition(n, n2);
                fcv_12.setSize(this.uhC.tMc.width, this.uhC.tMc.height);
            }
        }
    }
}

