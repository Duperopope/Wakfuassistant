/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.MessageLite
 */
package com.ankamagames.wakfu.client.chat.console.command;

import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class IntergameMessageCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        aPd.a(aPl.exC, arrayList.get(2));
        String string = arrayList.get(2).replaceAll("\"", "");
        String string2 = arrayList.get(3);
        if (string.contains("<")) {
            aPd.e("error.chat.privateFieldEmpty", new Object[0]);
            return;
        }
        if (!aue_0.cVJ().cWb().bSr()) {
            aPd.e("error.chat.inter.connection", new Object[0]);
            return;
        }
        Optional<String> optional = IntergameMessageCommand.jp(string);
        if (optional.isEmpty()) {
            return;
        }
        bgt_0 bgt_02 = bvz_0.dLl();
        if (bgt_02 != null) {
            v_0 v_02 = t_0.aF();
            v_02.b(bgt_02.Xi());
            v_02.e(string2);
            v_02.d(optional.get());
            aue_0.cVJ().cWb().c((MessageLite)v_02.aM());
        }
    }

    private static Optional<String> jp(String string) {
        String[] stringArray = string.split("#");
        if (stringArray.length == 1) {
            return IntergameMessageCommand.jq(stringArray[0]);
        }
        if (stringArray.length == 2) {
            return IntergameMessageCommand.S(stringArray[0], stringArray[1]);
        }
        return Optional.empty();
    }

    private static Optional<String> jq(String string) {
        List<String> list = apl_0.eAC.jv(string);
        if (list.isEmpty()) {
            aPd.e("error.chat.inter.unknown.recipient", string);
            return Optional.empty();
        }
        if (list.size() > 1) {
            aPd.e("error.chat.inter.multiple.recipient", string);
            return Optional.empty();
        }
        return Optional.of(list.get(0));
    }

    private static Optional<String> S(String string, String string2) {
        Optional<String> optional = apl_0.eAC.U(string, string2);
        if (optional.isPresent()) {
            return optional;
        }
        String string3 = apl_0.T(string, string2);
        aPd.e("error.chat.inter.unknown.recipient", string3);
        return Optional.empty();
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

