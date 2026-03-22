/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bnp
 */
public final class bnp_2
extends ffd_0<bea_0, bez_1> {
    private float iHH;
    private float iHI;

    public float dyB() {
        return this.iHI;
    }

    public void ex(float f2) {
        this.iHI = f2;
    }

    public float dyC() {
        return this.iHH;
    }

    public void ey(float f2) {
        this.iHH = f2;
    }

    public ArrayList<bea_0> gG(boolean bl) {
        ArrayList<bea_0> arrayList = new ArrayList<bea_0>(bl ? this.fVB() : this.fVA());
        this.Y(new bnq_2(this, bl, arrayList));
        return arrayList;
    }

    public bez_1 a(wa_2 wa_22) {
        fgz_0 fgz_02 = wa_22.agE >= 0 ? fgz_0.values()[wa_22.agE & 0xFF] : null;
        bez_1 bez_12 = new bez_1(wa_22.adP, fgz_02, wa_22.agF, wa_22.agG);
        if (!bez_12.c(wa_22)) {
            sfS.error((Object)"Erreur durant la d\u00e9s\u00e9rialisation du DimensionalBagFlea");
            return null;
        }
        this.d(bez_12);
        return bez_12;
    }

    public void dyD() {
        ArrayList<bea_0> arrayList = this.gG(false);
        for (int i = 0; i < arrayList.size(); ++i) {
            arrayList.get(i).aZp();
        }
    }

    public void Ex(int n) {
    }
}

