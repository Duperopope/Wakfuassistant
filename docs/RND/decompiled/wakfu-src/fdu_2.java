/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from fDU
 */
class fdu_2
implements fis_1 {
    final /* synthetic */ fdp_1 uiD;

    fdu_2(fdp_1 fdp_12) {
        this.uiD = fdp_12;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        ArrayList<fad_1> arrayList = this.uiD.uiu.get((int)this.uiD.uiv).uiF;
        for (int i = 0; i < arrayList.size(); ++i) {
            arrayList.get(i).setVisible(false);
        }
        this.uiD.uiv = (byte)(this.uiD.uiv == this.uiD.uiu.size() - 1 ? 0 : this.uiD.uiv + 1);
        fly_2 fly_22 = new fly_2(this.uiD, this.uiD.uiv);
        fly_22.aVI();
        this.uiD.h(fly_22);
        arrayList = this.uiD.uiu.get((int)this.uiD.uiv).uiF;
        for (int i = 0; i < arrayList.size(); ++i) {
            arrayList.get(i).setVisible(true);
        }
        this.uiD.gsm();
        return true;
    }
}

