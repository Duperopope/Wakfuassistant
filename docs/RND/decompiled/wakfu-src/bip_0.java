/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from biP
 */
public class bip_0
extends bil_0 {
    public static final float imF = 100.0f;

    public bip_0(exf_2 exf_22, bim_0 bim_02) {
        super(exf_22, bim_02, (byte)10);
    }

    @Override
    public String dqx() {
        Object object;
        float f2 = 0.0f;
        int n = enf_0.qSG.d();
        List<QD> list = aue_0.cVJ().cVK().dmz().oH(n);
        for (QD object22 : list) {
            if (!(object22 instanceof eoe_0)) continue;
            object = (enk_0)((eoe_0)object22).bba();
            byte by = (byte)object.Rz(0);
            byte by2 = (byte)object.Rz(1);
            if (by != exx_2.rGQ.aJr() || by2 != exx_2.rGO.aJr()) continue;
            float f3 = object.Rz(3);
            f2 += f3 / 100.0f;
        }
        int n2 = (int)Math.floor((float)this.img.aYB() * f2);
        String string = fty_2.c(this.eu(f2), new String[0]);
        object = fty_2.c(String.valueOf(n2), new String[0]);
        return aum_0.cWf().c("sacrierChrageDescription", string, object);
    }

    private String eu(float f2) {
        if (f2 == 0.0f) {
            return "0";
        }
        String string = String.format("%.2f", Float.valueOf(f2));
        if (string.indexOf(46) != -1) {
            int n = string.length();
            for (int i = string.length() - 1; i >= 0 && (string.charAt(i) == '0' || string.charAt(i) == '.'); --i) {
                n = i;
                if (string.charAt(i) == '.') break;
            }
            return string.substring(0, n);
        }
        return string;
    }
}

