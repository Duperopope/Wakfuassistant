/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

/*
 * Renamed from eII
 */
public class eii_0 {
    private static final Pattern qwZ = Pattern.compile("([ ]+)");
    private static final Pattern qxa = Pattern.compile("([-]+)");
    private static final Pattern qxb = Pattern.compile("([']+)");
    private static final Pattern qxc = Pattern.compile("[ \\-']");
    public static final String qxd = "[A-Z0-9]{3}-";
    protected static final Logger qxe = Logger.getLogger(eii_0.class);

    private eii_0() {
    }

    public static String sb(String string) {
        Object object = string;
        boolean bl = ((String)object).matches("^[A-Z0-9]{3}-.*");
        if (bl) {
            String string2 = ((String)object).substring(0, 4);
            object = string2 + BH.aS(((String)object).replaceFirst(qxd, ""));
        } else {
            object = BH.aS((String)object);
        }
        object = qwZ.matcher((CharSequence)object).replaceAll(" ");
        object = qxa.matcher((CharSequence)object).replaceAll("-");
        object = qxb.matcher((CharSequence)object).replaceAll("'");
        return object;
    }

    public static eik_0 sc(String string) {
        if (ewo_0.oBF.k(ewr_0.oEu)) {
            return eii_0.b(eij_0.qxf);
        }
        eik_0 eik_02 = eiv_0.qyh.sg(string);
        if (eik_02.fwM() != eij_0.qxf) {
            return eik_02;
        }
        if (!VV.bkY().dB(string)) {
            return eii_0.b(eij_0.qxr);
        }
        return eii_0.b(eij_0.qxf);
    }

    public static eik_0 sd(String string) {
        if (ewo_0.oBF.k(ewr_0.oEu)) {
            return eii_0.b(eij_0.qxf);
        }
        String string2 = string.matches("^[A-Z0-9]{3}-.*") ? string.replaceFirst(qxd, "") : string;
        return eii_0.sc(string2);
    }

    public static eik_0 se(String string) {
        eik_0 eik_02 = eiv_0.qyh.sh(string);
        if (eik_02.fwM() != eij_0.qxf) {
            return eik_02;
        }
        if (!VV.bkY().dB(string)) {
            return eii_0.b(eij_0.qxr);
        }
        return eii_0.b(eij_0.qxf);
    }

    public static eik_0 b(eij_0 eij_02) {
        return new eik_0(eij_02);
    }

    public static eik_0 a(eij_0 eij_02, char c2) {
        return new eib_0(eij_02, c2);
    }
}

