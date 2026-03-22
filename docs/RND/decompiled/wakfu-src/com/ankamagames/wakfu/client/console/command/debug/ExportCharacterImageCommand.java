/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.debug;

import com.ankamagames.wakfu.client.WakfuClient;
import java.io.File;
import java.util.ArrayList;
import java.util.Optional;

public class ExportCharacterImageCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            return;
        }
        boolean bl = evm_2.b(bgt_02.dpL().cWq(), evn_2.otW);
        if (!bl) {
            return;
        }
        Optional<eym> optional = ExportCharacterImageCommand.v(arrayList);
        try {
            String string = WakfuClient.dSV.ceT() + "export";
            new File(string).mkdirs();
            bfy_2 bfy_22 = new bfy_2(string);
            if (optional.isEmpty()) {
                bfy_22.dgG();
                bfy_22.dgH();
            } else {
                eym eym2 = optional.get();
                bfy_22.c(eym2);
                bfy_22.d(eym2);
            }
            aqh_0.cBI().jF("Export completed in : " + bfy_22.dgI());
        }
        catch (Exception exception) {
            aqh_0.cBI().jI("Error during export");
        }
    }

    private static Optional<eym> v(ArrayList<String> arrayList) {
        if (arrayList.size() < 3) {
            return Optional.empty();
        }
        int n = Bw.m(arrayList.get(2));
        if (n == 0) {
            return Optional.empty();
        }
        eym eym2 = eym.OR(n);
        if (eym2 == eym.phV || eym2 == eym.phU || eym2 == eym.pim) {
            return Optional.empty();
        }
        return Optional.of(eym2);
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

