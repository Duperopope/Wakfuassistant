/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TIntProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TIntProcedure;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

public class eLL {
    public static final String qHN = "craft";
    public static final String qHO = "(\\[(el)([0-9]?)\\])";
    public static final String qHP = "(\\[(st)([0-9]+)\\])";
    public static final String qHQ = "(\\[(ar)([0-9]+)\\])";
    public static final String qHR = "(\\[(sp)([0-9]+)\\])";
    public static final Pattern qHS;
    public static final Pattern qHT;
    public static final String qHU = "fighter";
    public static final String qHV = "shield";
    public static final String qHW = "glyph";
    public static final String qHX = "drake";
    public static final String qHY = "undrake";
    public static final String qHZ = "paw";
    public static final String qIa = "tique";
    public static final String qIb = "taque";
    public static final String qIc = "backstab";
    public static final String qId = "sidestab";
    public static final String qIe = "invisible";
    public static final String qIf = "barrel";
    public static final String qIg = "lucky";
    public static final String qIh = "totem";
    public static final String qIi = "puppet";
    public static final String qIj = "enemy";
    public static final String qIk = "ally";
    public static final String qIl = "seed";
    public static final String qIm = "chromatic";
    public static final String qIn = "caster";
    public static final String qIo = "serein";
    public static final String qIp = "exalte";
    public static final String qIq = "bomb";
    public static final String qIr = "deposit";
    public static final String qIs = "natural";
    public static final String qIt = "unnatural";
    public static final String qIu = "portal";
    public static final String qIv = "rune1";
    public static final String qIw = "rune2";
    public static final String qIx = "rune3";
    public static final String qIy = "rune4";
    public static final String qIz = "prey";
    public static final String qIA = "ecnbi";
    public static final String qIB = "ecnbr";
    public static final Pattern qIC;
    public static final Pattern qID;
    public static final Pattern qIE;
    public static final Pattern qIF;
    public static final char qIG = '+';
    public static final char qIH = '-';
    public static final char qII = '*';
    public static final char qIJ = '/';
    public static final String qIK = "([\\+\\-\\*\\/])([0-9]+([,\\.][0-9]+)?)";
    public static final Pattern qIL;
    public static final Pattern qIM;
    public static final Pattern qIN;
    public static final Pattern qIO;
    public static final Pattern qIP;
    public static final Pattern qIQ;
    public static final Pattern qIR;
    public static final int qIS;
    public static final int qIT;
    public static final int qIU;
    public static final int qIV;
    public static final int qIW;
    private static final Logger qIX;
    public static final int qIY = -1;
    public static final int qIZ = 0;
    public static final String qJa = "    ";
    public static String qJb;
    public static String qJc;
    public static My imR;
    public static ahx_2 qJd;
    public static emp_0 qJe;
    public static String gMK;
    public static String gQc;
    public static String gTj;
    public static String gTk;
    public static String gzV;
    public static String gAa;
    public static String gCN;
    public static String gCL;
    public static String gCK;
    public static String gCM;
    public static String gCO;
    public static String gCA;
    public static String gCB;
    public static String gCD;
    public static String qJf;
    public static String gzU;
    public static String gRV;
    public static String gRW;
    public static int qJg;
    public static int qJh;
    public static int qJi;
    public static int qJj;
    public static final TIntObjectHashMap<eLS> qJk;

    public static ArrayList<String> a(eLO eLO2) {
        return eLO2.fzQ();
    }

    public static String a(fqU fqU2, short s, boolean bl, int n, boolean bl2, boolean bl3) {
        eMk eMk2;
        ArrayList<String> arrayList;
        if (fqU2.cmL() != s) {
            fqU2 = fqU2.cm(s);
        }
        if ((arrayList = eLL.a(eMk2 = new eMk(fqU2, eLN.qJo, n))) != null && arrayList.size() != 0) {
            ahv_2 ahv_22 = qJd.ceG();
            if (bl2 && !bl) {
                ahv_22.ih("8888ff");
            }
            ahv_22.c((bl2 ? "\n" : "") + eLL.b(arrayList, bl3));
            return ahv_22.ceL();
        }
        return null;
    }

    public static String b(ArrayList<String> arrayList, boolean bl) {
        Object object = "";
        boolean bl2 = true;
        for (String string : arrayList) {
            if (!bl2) {
                object = (String)object + "\n";
            }
            object = (String)object + string;
            bl2 = false;
        }
        return object;
    }

    public static String p(enk_0 enk_02) {
        assert (enk_02 != null) : "Effect null !";
        ero_0 ero_02 = (ero_0)enf_0.fBb().pU(enk_02.avZ());
        if (ero_02 == null) {
            qIX.error((Object)("impossible de trouver de RunningEffect associ\u00e9 \u00e0 l'actionId " + enk_02.avZ()));
            return "";
        }
        eNd eNd2 = ((ero_0)enf_0.fBb().pU(enk_02.avZ())).dTh();
        return eLL.j(eNd2);
    }

    public static String j(eNd eNd2) {
        if (eNd2 != null && eNd2 != eNd.qPf) {
            return qJe.a(qJd.ceG(), eNd2).ceL();
        }
        return "";
    }

    public static String a(enk_0 enk_02, short s, fqU fqU2, int n) {
        if (enk_02.aZG() == 2) {
            eNs eNs2 = (eNs)enk_02;
            short s2 = eNs2.ei(s).biS();
            if (fqU2 != null) {
                s2 = fqU2.fF((short)n).biS();
            }
            if (s2 == -1) {
                return qJe.a(imR);
            }
            if (s2 > 0) {
                return qJe.a(imR, (int)s2);
            }
        }
        return "";
    }

    public static String Rs(int n) {
        ahv_2 ahv_22 = qJd.ceG();
        exx_2 exx_22 = exx_2.c((byte)n);
        if (exx_22 != null) {
            ahv_22.c(qJe.a(exx_22));
        }
        return ahv_22.ceL();
    }

    public static String Rt(int n) {
        ahv_2 ahv_22 = qJd.ceG();
        exe_1 exe_12 = exe_1.Te(n);
        if (exe_12 != null) {
            ahv_22.c(qJe.a(exe_12));
        }
        return ahv_22.ceL();
    }

    public static String Ru(int n) {
        ahv_2 ahv_22 = qJd.ceG();
        ezj_0 ezj_02 = ezj_0.Pl(n);
        if (ezj_02 != null) {
            ahv_22.c(qJe.b(ezj_02));
        }
        return ahv_22.ceL();
    }

    public static String Rv(int n) {
        ahv_2 ahv_22 = qJd.ceG();
        etl_0 etl_02 = etl_0.Sq(n);
        if (etl_02 != null) {
            ahv_22.c(qJe.a(etl_02));
        }
        return ahv_22.ceL();
    }

    public static String a(fqD fqD2) {
        ahv_2 ahv_22 = qJd.ceG();
        qJe.a(ahv_22, fqD2);
        return ahv_22.ceL();
    }

    public static String a(fqU fqU2, short s, short s2, boolean bl) {
        ahv_2 ahv_22 = qJd.ceG();
        qJe.a(ahv_22, fqU2, s);
        if (s2 > 0 && bl) {
            fqU fqU3 = fqX.gjM().Zr(fqU2.gjy());
            ahv_22.c(" (" + imR.c(fqU3.cww() ? gAa : gzV, Math.min(fqU3.gjG(), s)) + ")");
        }
        return ahv_22.ceL();
    }

    public static String a(eSS eSS2, short s, boolean bl) {
        ahv_2 ahv_22 = qJd.ceG();
        qJe.a(ahv_22, eSS2, s);
        if (bl) {
            ahv_22.c(" (" + imR.c(gzV, Math.min(eSS2.Fq(), s)) + ")");
        }
        return ahv_22.ceL();
    }

    public static eLS Rw(int n) {
        eLS eLS2 = (eLS)qJk.get(n);
        return eLS2 != null ? eLS2 : (eLS)qJk.get(-1);
    }

    static {
        Object object3;
        qHS = Pattern.compile("\\[@(el|mr|Mr|ap|mp|wp|ch|lv)\\]");
        qHT = Pattern.compile("\\[(pr|se|pl|ae|lv)\\]");
        qIC = Pattern.compile("\\[(fighter|shield|glyph|paw|taque|tique|backstab|sidestab|invisible|barrel|lucky|totem|puppet|enemy|ally|caster|serein|exalte|deposit|bomb|seed|natural|unnatural|portal|rune1|rune2|rune3|rune4|prey|chromatic|undrake|ecnbi|ecnbr|drake)\\]");
        qID = Pattern.compile("\\[(li|lp)\\]");
        qIE = Pattern.compile("(\\[(\\$[0-9]+)+(ef|ae|el|pr|st|li|lp|ea|(#[0-9]+))\\])");
        qIF = Pattern.compile("(\\$[0-9]+|ef|ae|el|pr|st|li|lp|ea|#[0-9]+)");
        qIL = Pattern.compile(qIK);
        qIM = Pattern.compile("\\|([0-9]d)?([0-9]+([,\\.][0-9]+)?)([^|]*)\\|");
        qIN = Pattern.compile(qHO);
        qIO = Pattern.compile(qHP);
        qIP = Pattern.compile(qHQ);
        qIQ = Pattern.compile(qHR);
        qIS = enf_0.qUR.d();
        qIT = enf_0.qUT.d();
        qIU = enf_0.qTU.d();
        qIV = enf_0.qTP.d();
        qIW = enf_0.qTT.d();
        qIX = Logger.getLogger(eLL.class);
        qJb = "";
        qJc = "";
        qJk = new TIntObjectHashMap();
        Object object2 = "\\[(";
        for (Object object3 : aoy_2.values()) {
            if (object3 != aoy_2.values()[0]) {
                object2 = (String)object2 + "|";
            }
            object2 = (String)object2 + object3.name();
        }
        object2 = (String)object2 + ")\\]";
        qIR = Pattern.compile((String)object2);
        qJk.put(-1, (Object)new emr_0());
        emt_0 emt_02 = new emt_0();
        qJk.put(enf_0.qTX.d(), (Object)emt_02);
        qJk.put(enf_0.qTQ.d(), (Object)emt_02);
        qJk.put(enf_0.qTO.d(), (Object)emt_02);
        qJk.put(enf_0.qTT.d(), (Object)emt_02);
        qJk.put(enf_0.qTR.d(), (Object)emt_02);
        qJk.put(enf_0.qTS.d(), (Object)emt_02);
        qJk.put(enf_0.qTW.d(), (Object)emt_02);
        qJk.put(enf_0.qTP.d(), (Object)emt_02);
        qJk.put(enf_0.qTV.d(), (Object)emt_02);
        qJk.put(enf_0.qTU.d(), (Object)emt_02);
        qJk.put(enf_0.qTS.d(), (Object)emt_02);
        emu_0 emu_02 = new emu_0();
        enh_0.qWn.forEach((TIntProcedure)new eLM(emu_02));
        eMC eMC2 = new eMC();
        qJk.put(enf_0.qUE.d(), (Object)eMC2);
        qJk.put(enf_0.qUJ.d(), (Object)eMC2);
        object3 = new eMy();
        qJk.put(enf_0.qPI.d(), object3);
        qJk.put(enf_0.qQO.d(), object3);
        eMA eMA2 = new eMA();
        qJk.put(enf_0.qTd.d(), (Object)eMA2);
        qJk.put(enf_0.qTe.d(), (Object)eMA2);
        qJk.put(enf_0.qTb.d(), (Object)eMA2);
        qJk.put(enf_0.qTc.d(), (Object)eMA2);
        qJk.put(enf_0.qTf.d(), (Object)eMA2);
        qJk.put(enf_0.qTg.d(), (Object)eMA2);
        eMD eMD2 = new eMD();
        qJk.put(enf_0.qUH.d(), (Object)eMD2);
        qJk.put(enf_0.qUI.d(), (Object)eMD2);
        emw_0 emw_02 = new emw_0();
        qJk.put(enf_0.qUF.d(), (Object)emw_02);
        eME eME2 = new eME();
        qJk.put(enf_0.qUR.d(), (Object)eME2);
        qJk.put(enf_0.qUT.d(), (Object)eME2);
        eMF eMF2 = new eMF();
        qJk.put(enf_0.qUj.d(), (Object)eMF2);
        emr_0 emr_02 = new emr_0(emx_0.qMQ);
        eMG eMG2 = new eMG();
        qJk.put(enf_0.qPQ.d(), (Object)eMG2);
        qJk.put(enf_0.qPR.d(), (Object)eMG2);
        eMz eMz2 = new eMz();
        qJk.put(enf_0.qTh.d(), (Object)eMz2);
        qJk.put(enf_0.qTi.d(), (Object)eMz2);
        qJk.put(enf_0.qTj.d(), (Object)eMz2);
        qJk.put(enf_0.qTl.d(), (Object)eMz2);
        qJk.put(enf_0.qTk.d(), (Object)eMz2);
        qJk.put(enf_0.qTm.d(), (Object)eMz2);
        qJk.put(enf_0.qTp.d(), (Object)eMz2);
        qJk.put(enf_0.qTn.d(), (Object)eMz2);
        qJk.put(enf_0.qTo.d(), (Object)eMz2);
    }
}

