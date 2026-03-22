/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from fSz
 */
public class fsz_2
extends fsr_2<axb_2> {
    private final ArrayList<fzc> veq;

    public fsz_2(axb_2 axb_22, axb_2 axb_23, ArrayList<fzc> arrayList, int n, int n2, int n3, abn abn2) {
        this.bl(axb_22);
        this.bm(axb_23);
        this.veq = arrayList;
        this.sO(n);
        this.setDuration(n2);
        this.acd(n3);
        this.setEasing(abn2);
    }

    @Override
    public boolean Ma(int n) {
        if (!super.Ma(n)) {
            return false;
        }
        if (this.tXJ != null) {
            axb_2 axb_22 = (axb_2)this.veb;
            axb_2 axb_23 = (axb_2)this.vec;
            float f2 = this.tXJ.h(axb_22.aIU(), axb_23.aIU(), this.bUi, this.bMn);
            float f3 = this.tXJ.h(axb_22.aIV(), axb_23.aIV(), this.bUi, this.bMn);
            float f4 = this.tXJ.h(axb_22.aIW(), axb_23.aIW(), this.bUi, this.bMn);
            float f5 = this.tXJ.h(axb_22.aIX(), axb_23.aIX(), this.bUi, this.bMn);
            awx_2 awx_22 = new awx_2(f2, f3, f4, f5);
            for (int i = this.veq.size() - 1; i >= 0; --i) {
                this.veq.get(i).setModulationColor(awx_22);
            }
        }
        return true;
    }

    @Override
    public void cbz() {
        for (int i = this.veq.size() - 1; i >= 0; --i) {
            this.veq.get(i).setModulationColor((axb_2)this.vec);
        }
        super.cbz();
    }

    public String toString() {
        return "[ModulationColorListTween] " + String.valueOf(this.veb) + " -> " + String.valueOf(this.vec);
    }
}

