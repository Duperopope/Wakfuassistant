/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;

public class bYV
extends VV {
    public static String nU(String string) {
        try {
            return bYV.nV(string);
        }
        catch (Exception exception) {
            return VV.bkY().g(string, bYV.epH());
        }
    }

    private static boolean epH() {
        return true;
    }

    public static void m(api_0 api_02) {
        String string = api_02.getMessage();
        try {
            api_02.co(bYV.nV(string));
        }
        catch (Exception exception) {
            api_02.co(VV.bkY().g(api_02.getMessage(), bYV.epH()));
        }
    }

    private static String nV(String string) {
        aqs_2 aqs_22 = new aqs_2();
        aqr_2 aqr_22 = new aqr_2();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(String.format("<text>%s</text>", string).getBytes(StandardCharsets.UTF_8));
        aqr_22.gU(byteArrayInputStream);
        aqr_22.a(aqs_22, new ape_1[0]);
        aqr_22.close();
        bYV.b(aqs_22.bGT());
        aqr_2 aqr_23 = new aqr_2();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        aqr_23.c(byteArrayOutputStream);
        aqr_23.a(aqs_22, true, false, false);
        String string2 = new String(byteArrayOutputStream.toByteArray(), StandardCharsets.UTF_8);
        return string2.substring(6, string2.length() - 7);
    }

    private static void b(aqt_2 aqt_22) {
        if ("#text".equals(aqt_22.getName())) {
            aqt_22.fa(VV.bkY().g(aqt_22.bCt(), bYV.epH()));
        } else {
            for (apd_1 apd_12 : aqt_22.getChildren()) {
                aqt_2 aqt_23 = (aqt_2)apd_12;
                bYV.b(aqt_23);
            }
        }
    }
}

