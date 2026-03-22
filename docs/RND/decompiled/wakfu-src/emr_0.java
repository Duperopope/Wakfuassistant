/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  org.apache.log4j.Logger
 */
import com.google.common.base.Strings;
import java.util.function.Function;
import java.util.regex.Matcher;
import org.apache.log4j.Logger;

/*
 * Renamed from eMr
 */
public class emr_0
implements eLS {
    private static final Logger qML = Logger.getLogger(emr_0.class);
    protected boolean qMM = false;
    private final emv_0 qMN;

    public emr_0() {
        this.qMN = emq_0.qMK;
    }

    public emr_0(emv_0 emv_02) {
        this.qMN = emv_02;
    }

    protected boolean z(String string, int n) {
        return !Strings.isNullOrEmpty((String)string);
    }

    @Override
    public final int a(ahv_2 ahv_22, enk_0 enk_02, eLO eLO2, Function<Object[], Object[]> function) {
        Object object;
        String string;
        Object object2;
        String string2;
        if (!eLO2.q(enk_02)) {
            return -1;
        }
        String string3 = "";
        boolean bl = false;
        boolean bl2 = eLO2.fzS();
        if (!bl2 && eLL.imR.e(eLL.qJh, enk_02.aZH())) {
            string3 = eLL.imR.J(eLL.qJh, enk_02.aZH());
        }
        if (string3.isEmpty()) {
            if (eLL.imR.e(eLL.qJg, enk_02.avZ())) {
                string3 = eLL.imR.J(eLL.qJg, enk_02.avZ());
            }
        } else {
            bl = true;
        }
        short s = eLO2.cmL();
        float f2 = enk_02.eb(s);
        boolean bl3 = false;
        boolean bl4 = false;
        ahv_2 ahv_23 = eLL.qJd.ceG();
        int n = 0;
        exP exP2 = eLL.qJe.cZy();
        Matcher matcher = eLL.qHT.matcher(string3);
        while (matcher.find()) {
            string2 = matcher.group(1);
            ahv_23.a(string3, n, matcher.start());
            if (string2.startsWith("pr")) {
                ahv_23.c(String.valueOf(Math.round(f2)));
                bl3 = true;
            } else if (string2.startsWith("pl")) {
                ahv_23.c(eLL.qJb);
            } else if (string2.startsWith("ae")) {
                object2 = emr_0.r(enk_02);
                if (!Strings.isNullOrEmpty((String)object2)) {
                    ahv_23.k(' ');
                }
                ahv_23.c((CharSequence)object2);
                bl4 = true;
            } else if (string2.startsWith("se")) {
                eLO2.lK(true);
                object2 = eLL.Rw(enk_02.avZ());
                object2.a(ahv_23, enk_02, eLO2);
                eLO2.lK(bl2);
                if (!this.z(string3, enk_02.aZH())) {
                    return -1;
                }
            } else if (string2.startsWith("lv")) {
                ahv_23.yx(exP2 == null ? 63 : (int)exP2.cmL());
            }
            n = matcher.end();
        }
        ahv_23.a(string3, n, string3.length());
        string2 = emr_0.sp(ahv_23.ceL());
        object2 = this.qMN.c(enk_02, s);
        String string4 = this.a(enk_02, string2, function.apply((Object[])object2), bl, eLO2);
        this.qMM = false;
        ahv_2 ahv_24 = eLL.qJd.ceG();
        int n2 = 0;
        Matcher matcher2 = eLL.qIN.matcher(string4);
        while (matcher2.find()) {
            string = matcher2.group(3);
            ahv_24.a(string4, n2, matcher2.start());
            if (string.isEmpty()) {
                ahv_24.c(eLL.p(enk_02));
                this.qMM = true;
            } else {
                ahv_24.c(eLL.j(eNd.ff(Byte.parseByte(string))));
            }
            n2 = matcher2.end();
        }
        ahv_24.a(string4, n2, string4.length());
        string = ahv_24.toString();
        if (!bl4) {
            object = eLL.qJd.ceG();
            int n3 = 0;
            Matcher matcher3 = eLL.qIR.matcher(string);
            while (matcher3.find()) {
                String string5 = matcher3.group(1);
                ((ahv_2)object).a(string, n3, matcher3.start());
                ((ahv_2)object).k(' ').c(eLL.qJe.kZ(string5));
                n3 = matcher3.end();
            }
            ((ahv_2)object).a(string, n3, string.length());
            string = ((ahv_2)object).toString();
        }
        ahv_22.c(string);
        if (!bl2 && !bl4) {
            object = emr_0.r(enk_02);
            if (!Strings.isNullOrEmpty((String)object)) {
                ahv_22.k(' ');
            }
            ahv_22.c((CharSequence)object);
        }
        if (!bl2 && f2 < 100.0f && !bl3) {
            ahv_22.c(" (").yx(Math.round(f2)).c("%)");
        }
        return 0;
    }

    public static String sp(String string) {
        Object object;
        Object object2;
        ahv_2 ahv_22 = eLL.qJd.ceG();
        int n = 0;
        Matcher matcher = eLL.qIC.matcher(string);
        while (matcher.find()) {
            object2 = matcher.group(1);
            ahv_22.a(string, n, matcher.start());
            eLL.qJe.b(ahv_22, (String)object2);
            n = matcher.end();
        }
        ahv_22.a(string, n, string.length());
        string = ahv_22.ceL();
        ahv_22 = eLL.qJd.ceG();
        n = 0;
        object2 = eLL.qIO.matcher(string);
        while (((Matcher)object2).find()) {
            ahv_22.a(string, n, ((Matcher)object2).start());
            n = ((Matcher)object2).end();
            object = ((Matcher)object2).group(3);
            try {
                int n2 = Integer.parseInt((String)object);
                fqU fqU2 = fqX.gjM().Zr(n2);
                if (fqU2 == null) {
                    qML.error((Object)String.format("Unable to retrieve state (id = %s)", n2));
                    continue;
                }
                ahv_22.c(eLL.a(fqU2, (short)1, (short)1, false));
            }
            catch (NumberFormatException numberFormatException) {
                qML.error((Object)String.format("Error on extraction of state id (Value related : %s)", object), (Throwable)numberFormatException);
            }
        }
        ahv_22.a(string, n, string.length());
        string = ahv_22.ceL();
        ahv_22 = eLL.qJd.ceG();
        n = 0;
        object = eLL.qIP.matcher(string);
        while (((Matcher)object).find()) {
            ahv_22.a(string, n, ((Matcher)object).start());
            n = ((Matcher)object).end();
            String string2 = ((Matcher)object).group(3);
            try {
                int n3 = Integer.parseInt(string2);
                eSS eSS2 = eTo.fIZ().iY(n3);
                if (eSS2 == null) {
                    qML.error((Object)String.format("Unable to retrieve aoe (id = %s)", n3));
                    continue;
                }
                ahv_22.c(eLL.a(eSS2, (short)0, false));
            }
            catch (NumberFormatException numberFormatException) {
                qML.error((Object)String.format("Error on extraction of aoe id (Value related : %s)", string2), (Throwable)numberFormatException);
            }
        }
        ahv_22.a(string, n, string.length());
        string = ahv_22.ceL();
        ahv_22 = eLL.qJd.ceG();
        n = 0;
        Matcher matcher2 = eLL.qIQ.matcher(string);
        while (matcher2.find()) {
            ahv_22.a(string, n, matcher2.start());
            n = matcher2.end();
            String string3 = matcher2.group(3);
            try {
                int n4 = Integer.parseInt(string3);
                Object Spell = fqF.giR().Ig(n4);
                if (Spell == null) {
                    qML.error((Object)String.format("Unable to find spell (id = %s)", n4));
                    continue;
                }
                ahv_22.c(eLL.a(Spell));
            }
            catch (NumberFormatException numberFormatException) {
                qML.error((Object)String.format("Error on extraction of spell id (Value related : %s)", string3), (Throwable)numberFormatException);
            }
        }
        ahv_22.a(string, n, string.length());
        string = ahv_22.ceL();
        return string;
    }

    protected String a(enk_0 enk_02, String string, Object[] objectArray, boolean bl, eLO eLO2) {
        return Bz.a(string, objectArray);
    }

    public static String r(enk_0 enk_02) {
        String string = enk_02.aZS().bEq().toString();
        if (!string.equals(aoy_2.cLA.name()) && !string.equals(aoy_2.cLB.name())) {
            return eLL.qJe.c(enk_02.aZS());
        }
        return "";
    }
}

