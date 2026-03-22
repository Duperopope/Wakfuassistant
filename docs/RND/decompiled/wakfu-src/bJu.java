/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumMap;

public class bJu {
    private static boolean eaM() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        return bgt_02 == null || !bgt_02.i(ezj_0.ptu);
    }

    public static void a(ahv_2 ahv_22, bJr bJr2) {
        fnd_0 fnd_02;
        bJK bJK2 = (bJK)bJr2.gfS();
        if (bJK2 == null) {
            return;
        }
        boolean bl = bJu.eaM();
        if (aum_0.cWf().e(66, bJK2.d()) && (fnd_02 = bJr2.gfR().gbC().Xd(bJr2.d())) != null) {
            boolean bl2 = fnd_02.exj();
            String string = aum_0.cWf().a(66, (long)bJK2.d(), new Object[0]);
            if (string.length() > 0) {
                if (bl && bl2) {
                    ahv_22.ceC().ih(bJN.kmA.bQk());
                }
                ahv_22.ceu().c(string);
                if (bl2 && bl) {
                    ahv_22.c(" " + aum_0.cWf().c("chaos.label", new Object[0]));
                }
                ahv_22.cev().ceH();
                if (bl2 && bl) {
                    ahv_22.ceD();
                }
                if (bl) {
                    short s = bJK2.aVf();
                    short s2 = bJK2.aVe();
                    if (s != -1 && s2 != -1) {
                        ahv_22.c(Bz.a(aum_0.cWf().c("recommended.level", s, s2), new Object[0])).ceH();
                    }
                }
            }
        }
        bJu.a(ahv_22, bJr2, bl);
    }

    private static void a(ahv_2 ahv_22, bJr bJr2, boolean bl) {
        aum_0 aum_02 = aum_0.cWf();
        if (bJr2 == null) {
            ahv_22.c(aum_02.c("map.territories.noProtector", new Object[0]));
        } else {
            ahv_22.c(aum_02.c("map.territories.protectorName", bJr2.getName()));
            if (bl) {
                if (bJr2.gfT() != -1) {
                    ahv_22.c(" - ").c(aum_02.a(39, (long)bJr2.gfT(), new Object[0]));
                } else {
                    ahv_22.c(" - ").c(aum_02.c("map.territories.noNation", new Object[0]));
                }
            }
            if (bl) {
                Object object;
                EnumMap<frk, frj> enumMap = bJr2.eaD();
                if (enumMap != null && !enumMap.isEmpty()) {
                    ahv_22.ceH().ceH().ceu().c(aum_02.c("protector.tax.desc", new Object[0])).cev();
                    object = enumMap.get((Object)frk.sXG);
                    ahv_22.ceH().c(bbr_2.b((frj)object));
                    ahv_22.ceH().c(bbr_2.a((frj)object));
                }
                if ((object = bJr2.eaq()) != null && ((int[])object).length != 0) {
                    ahv_22.ceH().ceH().ceu().c(aum_02.c("protector.craft", new Object[0])).cev();
                    int n = ((int[])object).length;
                    for (int i = 0; i < n; ++i) {
                        ahv_22.ceH().c(aum_02.a(43, (long)object[i], new Object[0]));
                    }
                }
            }
        }
    }
}

