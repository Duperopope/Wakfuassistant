/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;
import java.util.Arrays;
import org.apache.log4j.Logger;

public class FlyingTextCommand
implements aQm {
    protected static final Logger gvq = Logger.getLogger(FlyingTextCommand.class);
    private static final String gvr = "help";
    public static final String gvs = "stop";
    private static final String gvt = "static";
    private static final String gvu = "fading";
    private static final String gvv = "shake";
    private static final String gvw = "moving";
    private static final String gvx = "sploding";
    private static final String gvy = "dragonica";
    private static final String gvz = "honkai";
    private static final String[] gvA = new String[]{"static", "fading", "shake", "moving", "sploding", "dragonica", "honkai"};
    private static Runnable gvp;
    private int brS;
    private String gvB;

    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        String string;
        String string2 = string = arrayList.size() > 2 && arrayList.get(2) != null ? arrayList.get(2) : "";
        if (gvr.equals(string)) {
            aqh_0.cBI().jF("Flying text deformers are : " + Arrays.toString(gvA));
            return;
        }
        if (gvs.equals(string)) {
            this.cTV();
            return;
        }
        if (gvp == null) {
            this.gvB = string;
            gvp = () -> {
                this.brS = (this.brS + 5000) % 55000;
                int n = this.brS + GC.mR(999);
                float f2 = XG.qE(n) * 0.5f;
                xf_0 xf_02 = switch (this.gvB) {
                    case gvt -> new xe_0(0, 100, f2);
                    case gvu -> new xy_0(0, 100);
                    case gvv -> new xc_0(500);
                    case gvw -> new XB(100, 100);
                    case gvx -> new XD(GC.q(-25, 25), GC.q(0, 30), 0, 100, f2, 100, 350);
                    case gvy -> new xx_0(0, 400, 0, 100, f2, 50);
                    case gvz -> new xz_0(0, 20, 0, 100, f2, 150);
                    default -> new xw_0(0, 60);
                };
                Object object = awk_2.f("poetsenone", 0, 80);
                String string = "-" + String.valueOf(aum_0.cWf().cQ(n));
                xv_0 xv_02 = new xv_0((awh_2)object, string, xf_02, 1000);
                xv_02.c(1.0f, 0.0f, 0.0f, 1.0f);
                bdj_2 bdj_22 = aue_0.cVJ().cVK().ddI();
                xv_02.a(bdj_22);
                xd_0.bnv().a(xv_02);
            };
            abg_2.bUP().a(gvp, 500L, -1);
        } else if (!BH.a(string, this.gvB, true)) {
            this.gvB = string;
        } else {
            this.cTV();
        }
    }

    private void cTV() {
        abg_2.bUP().h(gvp);
        gvp = null;
        this.gvB = null;
        this.brS = 0;
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

