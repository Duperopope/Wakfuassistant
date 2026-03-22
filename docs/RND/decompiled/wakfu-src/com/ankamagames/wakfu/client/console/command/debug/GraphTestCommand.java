/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;
import org.apache.log4j.Logger;

public class GraphTestCommand
implements aQm {
    protected static final Logger gvD = Logger.getLogger(GraphTestCommand.class);
    private static Runnable gvp = null;

    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        int n;
        String string = "graphDialog";
        if (fyw_0.gqw().to("graphDialog")) {
            fyw_0.gqw().tl("graphDialog");
            return;
        }
        ccj_2.pd("graphDialog");
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("graphDialog");
        int[] nArray = new int[5];
        axb_2[] axb_2Array = new awx_2[]{new awx_2(1.0f, 0.8f, 0.3f, 1.0f), new awx_2(0.0f, 0.5f, 1.0f, 1.0f)};
        axb_2[] axb_2Array2 = new awx_2[]{new awx_2(1.0f, 0.8f, 0.3f, 0.3f), new awx_2(0.0f, 0.5f, 1.0f, 0.3f)};
        ffn_1 ffn_12 = new ffn_1();
        ffn_12.a(axb_2Array, nArray);
        ffn_12.ae(new float[]{12.0f, 8.5f, 9.0f, 10.0f, 15.0f});
        int[] nArray2 = new int[5];
        nArray2[1] = 1;
        ffn_1 ffn_13 = new ffn_1();
        ffn_13.a(axb_2Array, nArray2);
        ffn_13.ae(new float[]{11.0f, -5.0f, 3.0f, 8.0f, 7.0f});
        int[] nArray3 = new int[10];
        nArray3[3] = 1;
        ffo_1 ffo_12 = new ffo_1();
        ffo_12.a(axb_2Array2, nArray3);
        ffo_12.a(ffn_12);
        ffo_12.a(ffn_13);
        ffm_1 ffm_12 = new ffm_1();
        ffm_12.o(null);
        ffm_12.setModulationColor(new awx_2(0.9f, 0.9f, 1.0f, 1.0f));
        ffm_1 ffm_13 = new ffm_1();
        ffm_13.o(null);
        ffm_13.setModulationColor(new awx_2(0.9f, 1.0f, 0.9f, 1.0f));
        fbr_1 fbr_12 = (fbr_1)fhs_22.uH("graph");
        fbs_1 fbs_12 = new fbs_1();
        fbs_12.a(ffn_12);
        fbs_12.a(ffn_13);
        fbs_12.a(ffo_12);
        for (n = 0; n < 3; ++n) {
            fbs_12.a(ffm_12);
        }
        for (n = 0; n < 2; ++n) {
            fbs_12.a(ffm_13);
        }
        fbs_12.fu(-8.0f);
        fbs_12.fv(22.0f);
        fbr_12.setContent(fbs_12);
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

