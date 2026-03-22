/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.commonIn;

import java.util.ArrayList;

public class AutoCompleteContactCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        fdu_1 fdu_12 = AutoCompleteContactCommand.cTF();
        String string = fdu_12.getText();
        if (string == null || string.isEmpty()) {
            return;
        }
        int n = fdu_12.getTextBuilder().gyh().gzt();
        boolean bl = AutoCompleteContactCommand.a(fdu_12, n, string);
        if (!bl && n != -1) {
            AutoCompleteContactCommand.a(fdu_12, string, n);
        }
    }

    private static boolean a(fdu_1 fdu_12, int n, String string) {
        String string2;
        if (!aPh.czg().czh().cBG().b(string, (byte)127)) {
            return false;
        }
        int n2 = string.indexOf(32);
        if (n2 == -1 || n2 >= string.length()) {
            return true;
        }
        String string3 = string.substring(n2 + 1);
        int n3 = string3.lastIndexOf(34) + 1;
        if (string3.indexOf(34) == -1 || string3.indexOf(34) == n3) {
            n3 = string3.indexOf(32);
        }
        if (n3 == -1) {
            n3 = string3.length();
        }
        if (n - (string.length() - string3.length()) > n3) {
            return false;
        }
        string3 = string3.substring(0, n3);
        String string4 = string3.replaceAll("\"", "");
        if ((string4 = string4.trim()).isEmpty()) {
            return true;
        }
        aQl aQl2 = aQl.cBL();
        if (aQl2.cBP() == null || !aQl2.jN(string4)) {
            aQl2.jL(string4);
        }
        fdu_12.setText(string.replaceFirst(string3, (String)((string2 = aQl2.cBO()).equalsIgnoreCase(aQl2.cBP()) ? string2 : "\"" + string2 + "\"")));
        fhw_2.gAL().s(fdu_12);
        return true;
    }

    private static void a(fdu_1 fdu_12, String string, int n) {
        int n2;
        String string2;
        int n3 = string.indexOf(32, n);
        if (n3 == -1) {
            n3 = string.length();
        }
        if ((string2 = string.substring(n2 = string.substring(0, n).lastIndexOf(32) + 1, n3)).isEmpty()) {
            return;
        }
        boolean bl = false;
        if (string2.charAt(0) == '\"') {
            ++n2;
            string2 = string2.substring(1);
            bl = true;
            if (string2.isEmpty()) {
                return;
            }
        }
        if (string2.charAt(string2.length() - 1) == '\"') {
            --n3;
            string2 = string2.substring(0, string2.length() - 1);
            bl = false;
            if (string2.isEmpty()) {
                return;
            }
        }
        if ((string2 = string2.trim()).isEmpty()) {
            return;
        }
        aQl aQl2 = aQl.cBL();
        if (aQl2.cBP() == null || !aQl2.jN(string2)) {
            aQl2.jL(string2);
        }
        String string3 = aQl2.cBO();
        azx_1<fgb_2, fgz_1> azx_12 = fdu_12.getTextBuilder().gY(0, 0);
        fgb_2 fgb_22 = azx_12.getFirst();
        if (fgb_22 == null) {
            return;
        }
        fdu_12.getTextBuilder().a(fgb_22.gyW(), n2);
        fdu_12.getTextBuilder().b(fgb_22.gyW(), n3);
        fdu_12.getTextBuilder().ub((String)(bl ? string3 + "\"" : string3));
    }

    private static fdu_1 cTF() {
        fes_2 fes_22 = fhw_2.gAL().gAM();
        if (fes_22 instanceof fdu_1) {
            return (fdu_1)fes_22;
        }
        int n = aPt.cAg().cAl().czm();
        String string = cza_2.NL(n);
        return (fdu_1)fyw_0.gqw().gqC().uR(string).uH("textEditorRenderableContainer.chatInput");
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

