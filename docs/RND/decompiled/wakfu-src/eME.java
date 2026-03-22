/*
 * Decompiled with CFR 0.152.
 */
import java.util.regex.Matcher;

public class eME
extends emr_0 {
    @Override
    protected String a(enk_0 enk_02, String object, Object[] objectArray, boolean bl, eLO eLO2) {
        int n;
        Object object2;
        short s = 0;
        Object object3 = null;
        if ((enk_02.avZ() == eLL.qIS || enk_02.avZ() == eLL.qIT) && (object2 = fqX.gjM().Zr(((Number)objectArray[0]).intValue())) != null) {
            if (enk_02.avZ() == eLL.qIS) {
                s = ((Number)objectArray[1]).shortValue();
                object3 = object2;
                objectArray[0] = eLL.a((fqU)object2, s, ((fqU)object2).gjG(), true);
            } else {
                objectArray[0] = eLL.a((fqU)object2, s, (short)1, false);
            }
        }
        if (object3 != null && enk_02.avZ() == eLL.qIS) {
            object2 = eLL.qID.matcher((CharSequence)object);
            while (((Matcher)object2).find()) {
                String string = ((Matcher)object2).group(1);
                char c2 = string.charAt(0);
                block0 : switch (c2) {
                    case 'l': {
                        char c3 = string.charAt(1);
                        switch (c3) {
                            case 'i': {
                                String string2 = eLL.a((fqU)object3, s, false, 0, false, false);
                                if (string2 == null) break;
                                object = ((String)object).substring(0, ((Matcher)object2).start()) + string2 + ((String)object).substring(((Matcher)object2).end());
                                object2 = eLL.qID.matcher(((String)object).trim());
                                break block0;
                            }
                            case 'p': {
                                String string2 = eLL.a((fqU)object3, s, false, 0, false, true);
                                if (string2 == null) break;
                                object = ((String)object).substring(0, ((Matcher)object2).start()) + string2 + ((String)object).substring(((Matcher)object2).end());
                                object2 = eLL.qID.matcher(((String)object).trim());
                                break block0;
                            }
                        }
                        break;
                    }
                }
            }
        }
        if (enk_02.fAu() && !enk_02.beB() && (n = ((fqU)object3).gjx()) != -1000) {
            object = (String)object + "(" + uc_0.l(uz_0.fo(n / 1000)) + ")";
        }
        return Bz.a((String)object, objectArray);
    }
}

