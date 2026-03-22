/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.display;

import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class HideFightOccluders
implements aQm {
    private static final Logger gxg = Logger.getLogger(HideFightOccluders.class);
    public static final int gxh = 0;
    public static final int gxi = 1;
    public static final int gxj = 2;
    private static int gxk = 0;
    private static float ayP;

    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        gxk = (gxk + 1) % 3;
        HideFightOccluders.zq(gxk);
        ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_1.liM, gxk);
    }

    @Override
    public boolean cAW() {
        return false;
    }

    public static int ep(float f2) {
        return f2 == 0.0f ? 2 : (f2 == 1.0f ? 0 : 1);
    }

    private static int zp(int n) {
        switch (n) {
            case 0: {
                return 50;
            }
            case 1: 
            case 2: {
                return 1000;
            }
        }
        gxg.error((Object)("state inconnu " + n));
        return 0;
    }

    public static void zq(int n) {
        HideFightOccluders.e(n, 0.4f);
    }

    public static void e(int n, float f2) {
        HideFightOccluders.a(n, f2, HideFightOccluders.zp(n));
    }

    public static void a(int n, float f2, int n2) {
        Object object;
        Object object2;
        boolean bl = n != 0;
        ayP = f2;
        gxk = n;
        switch (n) {
            case 0: {
                break;
            }
            case 1: {
                aah_0.brY().bV(ayP);
                break;
            }
            case 2: {
                aah_0.brY().bV(0.0f);
                break;
            }
            default: {
                gxg.error((Object)("state inconnu " + n));
            }
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            return;
        }
        aah_0.brY().a(bl, n2);
        bsj_0 bsj_02 = bgt_02.dkZ();
        if (bsj_02 == null) {
            return;
        }
        bsj_02.dGJ().ez(f2);
        rh_0 rh_02 = bsj_02.bag();
        if (rh_02 == null) {
            return;
        }
        int n3 = rh_02.bgm();
        int n4 = rh_02.bgn();
        short s = rh_02.bdI();
        short s2 = rh_02.bdJ();
        ArrayList<DisplayedScreenElement> arrayList = new ArrayList<DisplayedScreenElement>(64);
        Iterator<aay_0> iterator = aaa_0.brC().brD();
        int n5 = Integer.MIN_VALUE;
        int n6 = Integer.MIN_VALUE;
        ArrayList<Object> arrayList2 = new ArrayList<Object>();
        while (iterator.hasNext()) {
            object2 = iterator.next();
            object = ((aay_0)object2).brA();
            for (int i = 0; i < ((DisplayedScreenElement[])object).length; ++i) {
                DisplayedScreenElement displayedScreenElement = object[i];
                ScreenElement screenElement = displayedScreenElement.brk();
                if (screenElement.bst() <= s) continue;
                int n7 = screenElement.bsu();
                int n8 = screenElement.bsv();
                if (n8 < n4 || n7 < n3) continue;
                if (rh_02.T(n7, n8)) {
                    if (screenElement.bst() <= s2 || screenElement.bsz().bwZ()) continue;
                    arrayList2.add(displayedScreenElement);
                    continue;
                }
                if (n7 != n5 || n8 != n6) {
                    n5 = n7;
                    n6 = n8;
                    arrayList.clear();
                    aaa_0.brC().b(n7, n8, arrayList, abd.ccZ);
                    for (int j = 0; j < arrayList.size(); ++j) {
                        for (int i2 = j + 1; i2 < arrayList.size(); ++i2) {
                            DisplayedScreenElement displayedScreenElement2 = arrayList.get(j);
                            DisplayedScreenElement displayedScreenElement3 = arrayList.get(i2);
                            if (displayedScreenElement3.brm() >= displayedScreenElement2.brm()) continue;
                            arrayList.set(j, displayedScreenElement3);
                            arrayList.set(i2, displayedScreenElement2);
                        }
                    }
                }
                if (arrayList.size() != 0 && screenElement.bst() <= ((DisplayedScreenElement)arrayList.get(0)).brk().bst()) continue;
                arrayList2.add(displayedScreenElement);
            }
        }
        bLe.ecw().u(new aUh(n3, n4, s, s2, arrayList2));
        object2 = afh_0.bxU().bxX();
        while (object2.hasNext()) {
            object = (afk_0)object2.next();
            if (((afk_0)object).aVD() instanceof byx_0 || !HideFightOccluders.a((ZC)object, n3, n4, s, s2)) continue;
            arrayList2.add(object);
        }
        for (aaG aaG2 : arrayList2) {
            aaG2.bG(bl);
        }
    }

    public static boolean a(ZC zC, int n, int n2, int n3, int n4) {
        if (zC.bcE() + zC.bpX() <= n3) {
            return false;
        }
        return zC.bcD() >= n2 && zC.bcC() >= n;
    }

    public static int cUt() {
        return gxk;
    }

    public static void g(ZC zC) {
        short s;
        short s2;
        int n;
        aie_0.cfn();
        bgt_0 bgt_02 = aie_0.cfo().cVK();
        if (bgt_02 == null) {
            return;
        }
        bsj_0 bsj_02 = bgt_02.dkZ();
        if (bsj_02 == null) {
            return;
        }
        rh_0 rh_02 = bsj_02.bag();
        if (rh_02 == null) {
            return;
        }
        int n2 = rh_02.bgm();
        if (HideFightOccluders.a(zC, n2, n = rh_02.bgn(), s2 = rh_02.bdI(), s = rh_02.bdJ())) {
            zC.bG(gxk != 0);
        }
    }
}

