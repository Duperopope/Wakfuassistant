/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from fDV
 */
class fdv_2
implements fis_1 {
    final /* synthetic */ fdp_1 uiE;

    fdv_2(fdp_1 fdp_12) {
        this.uiE = fdp_12;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        ArrayList<fad_1> arrayList = this.uiE.uiu.get((int)this.uiE.uiv).uiF;
        for (int i = 0; i < arrayList.size(); ++i) {
            arrayList.get(i).setVisible(false);
        }
        this.uiE.uiv = (byte)(this.uiE.uiv == 0 ? this.uiE.uiu.size() - 1 : this.uiE.uiv - 1);
        fly_2 fly_22 = new fly_2(this.uiE, this.uiE.uiv);
        fly_22.aVI();
        this.uiE.h(fly_22);
        arrayList = this.uiE.uiu.get((int)this.uiE.uiv).uiF;
        for (int i = 0; i < arrayList.size(); ++i) {
            arrayList.get(i).setVisible(true);
        }
        this.uiE.gsm();
        return true;
    }
}

