/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.xulor;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Stream;

public class ThemeInfoCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        ThemeInfoCommand.cUx();
    }

    public static void cUx() {
        aUQ aUQ2 = aue_0.cVJ().cVO();
        if (aUQ2 == null || evm_2.c(aUQ2.cWq(), evm_2.osZ)) {
            return;
        }
        if (fyw_0.gqw().to("themeInfoDialog")) {
            fyw_0.gqw().tl("themeInfoDialog");
            fyw_0.gqw().tc("wakfu.themeInfo");
            fse_1.gFu().vX("themeInfo");
            fse_1.gFu().vX("themeListFilter");
        } else {
            boolean bl = auc_0.cVq().b("useXmlTheme", false);
            Function<String, Stream<String>> function = bl ? string -> fyw_0.gqw().gqB().ru((String)string) : string -> fyw_0.gqw().gqB().gAb().ru((String)string);
            fse_1.gFu().f("themeInfo", new cbi_2(function));
            ffa_2 ffa_22 = new ffa_2();
            ffa_22.z(string -> {
                cbi_2 cbi_22 = (cbi_2)fse_1.gFu().getProperty("themeInfo").getValue();
                fse_1.gFu().a((aef_2)cbi_22, cbi_2.lKG);
            });
            fse_1.gFu().f("themeListFilter", ffa_22);
            ccj_2.g("themeInfoDialog", 32768L);
            fyw_0.gqw().d("wakfu.themeInfo", chl_1.class);
            fse_1.gFu().b("colorPickerValue", awx_2.dob, "themeInfoDialog");
            fse_1.gFu().b("colorPickerPreview", awx_2.dob, "themeInfoDialog");
            fse_1.gFu().b("colorPickerHexPreview", (Object)awx_2.dob.bQk().toUpperCase(), "themeInfoDialog");
        }
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

