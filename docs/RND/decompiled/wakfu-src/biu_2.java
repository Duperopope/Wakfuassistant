/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from bIu
 */
public abstract class biu_2 {
    public static final bix_2 kgz = new bix_2();
    public static final biu_2 kgA = new biv_2();

    public abstract void a(fsn_1 var1);

    public List<fsn_1> aa(List<fsn_1> list) {
        return list;
    }

    static boolean b(fsn_1 fsn_12) {
        if (fsn_12.getValue() instanceof adq) {
            adq adq2 = (adq)fsn_12.getValue();
            switch (adq2.aXy) {
                case 48: {
                    Object Info2 = frb_0.sYO.a(fre_0.sZc, adq2.aXv);
                    return ((frk_0)Info2).gkp() != null;
                }
            }
        } else if (fsn_12.getValue() instanceof adr) {
            adr adr2 = (adr)fsn_12.getValue();
            if (adr2.cjv != -1) {
                bcd_2 bcd_22 = aue_0.cVJ().cVK().dpy();
                return !bcd_22.ob(adr2.cjv) || bcd_22.oc(adr2.cjv);
            }
            if (adr2.asf == bRr.lae.aFW()) {
                if (adr2.cju <= 0) {
                    return true;
                }
                eki_0 eki_02 = baj_2.hzf.cZr();
                return eki_02.tX(adr2.cju);
            }
        }
        return true;
    }

    static void a(fsn_1 fsn_12, fre_0 fre_02) {
        switch (fre_02) {
            case sZc: {
                fsn_12.a(bit_2.kgm);
                break;
            }
            case sZb: {
                fsn_12.a(bit_2.kgl);
                break;
            }
            case sZa: {
                fsn_12.a(bit_2.kgk);
                break;
            }
            case sYZ: {
                fsn_12.a(bit_2.kgj);
            }
        }
    }
}

