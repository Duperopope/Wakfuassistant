/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.regex.Matcher;
import org.apache.log4j.Logger;

/*
 * Renamed from eMu
 */
public class emu_0
extends emr_0 {
    private static final Logger qMP = Logger.getLogger(emu_0.class);

    @Override
    protected String a(enk_0 enk_02, String string, Object[] objectArray, boolean bl, eLO eLO2) {
        short s = eLO2.cmL();
        if (enh_0.qWn.contains(enk_02.avZ())) {
            Matcher matcher = eLL.qIE.matcher(string);
            fqB fqB2 = fqC.giD().Za(enk_02.aZH());
            if (fqB2 == null) {
                qMP.error((Object)("Groupe d'effet vide " + enk_02.aZH() + ", voir : RunningEffectGroupType.WITHOUT_EFFECT_GROUP_DESCRIPTION"));
                return null;
            }
            if (!matcher.find() && !bl) {
                ahv_2 ahv_22 = eLL.qJd.ceG();
                boolean bl2 = true;
                for (enk_0 enk_03 : fqB2) {
                    ahv_2 ahv_23;
                    eLS eLS2 = eLL.Rw(enk_03.avZ());
                    int n = eLS2.a(ahv_23 = eLL.qJd.ceG(), enk_03, eLO2);
                    if (n == -1) continue;
                    if (!bl2) {
                        ahv_22.c("\n");
                    }
                    ahv_22.c(ahv_23.ceL());
                    bl2 = false;
                }
                return ahv_22.ceL();
            }
            string = this.a(string, fqB2, s, false, eLO2);
        }
        return Bz.a(string, objectArray);
    }

    private String a(String string, fqB fqB2, short s, boolean bl, eLO eLO2) {
        if (fqB2 == null) {
            return string;
        }
        short s2 = 0;
        Matcher matcher = eLL.qIE.matcher(string);
        ahv_2 ahv_22 = eLL.qJd.ceG();
        int n = 0;
        while (matcher.find()) {
            String string2 = matcher.group();
            if (string2.length() == 0) continue;
            Matcher matcher2 = eLL.qIF.matcher(string2);
            fqB fqB3 = null;
            Qj qj = null;
            while (matcher2.find()) {
                String string3 = matcher2.group();
                if (string3.length() > 0) {
                    char c2 = string3.charAt(0);
                    switch (c2) {
                        case '$': {
                            byte by = Byte.parseByte(string3.substring(1));
                            enk_0 enk_02 = (fqB3 != null ? fqB3 : fqB2).Pv(by - 1);
                            if (enk_02 == null) {
                                qMP.error((Object)("description d'effet foireuse, on demande l'effet inexistant " + by + " du groupe d'effet " + String.valueOf(fqB2)));
                                break;
                            }
                            fqB3 = null;
                            qj = enk_02;
                            if (!enh_0.qWn.contains(enk_02.avZ())) break;
                            fqB3 = fqC.giD().Za(enk_02.aZH());
                            break;
                        }
                        case '#': {
                            byte by = Byte.parseByte(string3.substring(1));
                            if (qj == null) {
                                qMP.error((Object)("description d'effet foireuse, on demande le param\u00e8tre " + by + " d'un effet non sp\u00e9cifi\u00e9 !"));
                                break;
                            }
                            String string4 = null;
                            try {
                                string4 = "";
                                if (by == 1 && (qj.avZ() == eLL.qIS || qj.avZ() == eLL.qIT)) {
                                    fqU fqU2 = fqX.gjM().Zr(qj.a(by - 1, s, ene_0.qPu));
                                    if (qj.fAn() > by) {
                                        s2 = (short)qj.a(by, s, ene_0.qPu);
                                    }
                                    if (fqU2 != null) {
                                        string4 = eLL.a(fqU2, s2, (short)qj.fAw(), true);
                                    }
                                } else {
                                    string4 = String.valueOf(qj.a(by - 1, s, ene_0.qPu));
                                }
                            }
                            catch (RuntimeException runtimeException) {
                                qMP.error((Object)("Exception while retriieving parameter of effect " + String.valueOf(qj)), (Throwable)runtimeException);
                                string4 = "TRANSLATION_ERROR";
                            }
                            ahv_22.a(string, n, matcher.start());
                            ahv_22.c(string4);
                            n = matcher.end();
                            break;
                        }
                        case 'p': {
                            char c3 = string3.charAt(1);
                            switch (c3) {
                                case 'r': {
                                    if (qj == null) {
                                        qMP.error((Object)"description d'effet foireuse, on demande la probabilit\u00e9 d'un effet non sp\u00e9cifi\u00e9 !");
                                        break;
                                    }
                                    ahv_22.a(string, n, matcher.start());
                                    ahv_22.c(String.valueOf(Math.round(qj.eb(s))) + "%");
                                    n = matcher.end();
                                }
                            }
                            break;
                        }
                        case 'e': {
                            char c4 = string3.charAt(1);
                            switch (c4) {
                                case 'l': {
                                    if (qj == null) {
                                        qMP.error((Object)"description d'effet foireuse, on demande l'\u00e9l\u00e9ment d'un effet non sp\u00e9cifi\u00e9 !");
                                        break;
                                    }
                                    ahv_22.a(string, n, matcher.start());
                                    ahv_22.c(eLL.p((enk_0)qj));
                                    n = matcher.end();
                                    break;
                                }
                                case 'a': 
                                case 'f': {
                                    if (qj == null) {
                                        qMP.error((Object)"description d'effet foireuse, on veut d\u00e9crire un effet non sp\u00e9cifi\u00e9 !");
                                        break;
                                    }
                                    ahv_2 ahv_23 = eLL.qJd.ceG();
                                    eLS eLS2 = eLL.Rw(qj.avZ());
                                    if (c4 == 'a') {
                                        eLO2.lM(true);
                                    }
                                    eLS2.a(ahv_23, (enk_0)qj, eLO2);
                                    ahv_22.a(string, n, matcher.start());
                                    ahv_22.c(ahv_23.ceL());
                                    n = matcher.end();
                                    break;
                                }
                            }
                            break;
                        }
                        case 'a': {
                            char c5 = string3.charAt(1);
                            switch (c5) {
                                case 'e': {
                                    if (qj == null) {
                                        qMP.error((Object)"description d'effet foireuse, on demande l'aoe d'un effet non sp\u00e9cifi\u00e9 !");
                                        break;
                                    }
                                    ahv_22.a(string, n, matcher.start());
                                    ahv_22.c(emu_0.r((enk_0)qj));
                                    n = matcher.end();
                                }
                            }
                            break;
                        }
                        case 's': {
                            char c6 = string3.charAt(1);
                            switch (c6) {
                                case 't': {
                                    String string5;
                                    fqU fqU3;
                                    if (qj == null) {
                                        qMP.error((Object)"description d'effet foireuse, on veut d\u00e9crire un effet (\u00e9tat) non sp\u00e9cifi\u00e9 !");
                                        break;
                                    }
                                    if (qj.avZ() != eLL.qIS && qj.avZ() != eLL.qIT || (fqU3 = fqX.gjM().Zr(qj.a(0, s, ene_0.qPu))) == null || (string5 = eLL.a(fqU3, s2 = (short)qj.a(1, s, ene_0.qPu), false, eLO2.fzW(), false, false)) == null) break;
                                    ahv_22.a(string, n, matcher.start());
                                    ahv_22.c(string5);
                                    n = matcher.end();
                                    break;
                                }
                            }
                            break;
                        }
                        case 'l': {
                            char c7 = string3.charAt(1);
                            if (qj == null) {
                                qMP.error((Object)"description d'effet foireuse, on veut d\u00e9crire un effet (\u00e9tat) non sp\u00e9cifi\u00e9 !");
                                break;
                            }
                            boolean bl2 = false;
                            switch (c7) {
                                case 'i': {
                                    bl2 = false;
                                    break;
                                }
                                case 'p': {
                                    bl2 = true;
                                    break;
                                }
                                default: {
                                    return "";
                                }
                            }
                            boolean bl3 = eLO2.fzX();
                            if (qj.avZ() == eLL.qIW) {
                                eLO2.lL(true);
                            }
                            String string6 = null;
                            if (enh_0.qWn.contains(qj.avZ())) {
                                ArrayList<String> arrayList = eLL.a(new eLX(fqB3, qj.aZH(), s, eLO2.fzW()));
                                string6 = bl ? "\n" : eLL.b(arrayList, bl2);
                            } else if (qj.avZ() == eLL.qIS || qj.avZ() == eLL.qIT) {
                                fqU fqU4 = fqX.gjM().Zr(qj.a(0, s, ene_0.qPu));
                                if (fqU4 == null) break;
                                s2 = (short)qj.a(1, s, ene_0.qPu);
                                string6 = eLL.a(fqU4, s2, false, eLO2.fzW(), false, bl2);
                            } else {
                                int n2 = qj.fAn();
                                Object[] objectArray = new Object[n2];
                                for (int i = 0; i < n2; ++i) {
                                    objectArray[i] = qj.a(i, s, ene_0.qPu);
                                }
                                ahv_2 ahv_24 = new ahv_2();
                                eLS eLS3 = eLL.Rw(qj.avZ());
                                eLS3.a(ahv_24, (enk_0)qj, eLO2);
                                string6 = ahv_24.ceL();
                            }
                            if (string6 != null) {
                                ahv_22.a(string, n, matcher.start());
                                ahv_22.c(string6);
                                n = matcher.end();
                            }
                            eLO2.lL(bl3);
                            break;
                        }
                    }
                }
            }
        }
        ahv_22.a(string, n, string.length());
        return ahv_22.ceL();
    }
}

