/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Contract
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class eIn {
    private static final Logger qwa = Logger.getLogger(eIn.class);
    public static final int qwb = -1;

    public int a(long l, String string, int n, boolean bl) {
        return this.a(l, string, n, null, bl);
    }

    public int a(long l, String string, int n, @Nullable Integer n2, boolean bl) {
        Object t = fcL.rUh.sw(l);
        if (t == null) {
            qwa.error((Object)("[Build][Creation] Unknown character of id " + l));
            return -1;
        }
        ety_0 ety_02 = t.dlK();
        if (ety_02 != null && ety_02.dGp() != etw_0.rqT && ety_02.dGp() != etw_0.rqW) {
            qwa.error((Object)("[Build][Creation] Player is in fight " + l));
            return -1;
        }
        eIm eIm2 = ((exP)t).dnK();
        fhm fhm2 = ((exP)t).dnO();
        frf frf2 = ((exP)t).dnJ();
        eHZ eHZ2 = ((exP)t).dnN();
        if (eIm2 == null || fhm2 == null || frf2 == null || eHZ2 == null) {
            qwa.error((Object)("[Build][Creation] One sheet set not found for player " + l + " : " + (eIm2 == null ? "builds, " : "") + (fhm2 == null ? "equipments, " : "") + (frf2 == null ? "spells, " : "") + (eHZ2 == null ? "aptitudes" : "")));
            return -1;
        }
        if (eIi.PO(n) == null) {
            qwa.error((Object)("[Build][Creation] Invalid level " + n + " for player " + l));
            return -1;
        }
        if (n > 0 && n > ((exP)t).dnG()) {
            qwa.error((Object)("[Build][Creation] Level " + n + " is too high for player " + l + " (real level=" + ((exP)t).dnG() + ")"));
            return -1;
        }
        if (eIm2.fws() >= eIp.fwv()) {
            qwa.error((Object)("[Build][Creation] Player has reached maximum number of non-permanent builds (" + eIp.fwv() + "): " + l));
            return -1;
        }
        int n3 = eIm2.fwr();
        if (fhm2.gq((byte)n3) != null || frf2.Zx(n3) != null || eHZ2.PK(n3)) {
            qwa.error((Object)("[Build][Creation] The build index " + n3 + " for player " + l + " is already used by equipments or spells or aptitudes. This is really strange and must be investigated quickly."));
            return -1;
        }
        eIj eIj2 = n2 != null ? new eIj(string, n, n3, n2, bl) : new eIj(string, n, n3, bl);
        eIm2.g(eIj2);
        fhm2.fR(n3, n);
        frf2.gr(n3, n);
        eHZ2.fj(n3, n);
        return n3;
    }

    public boolean O(long l, int n) {
        return this.d(l, n, true);
    }

    public boolean d(long l, int n, boolean bl) {
        if (!this.e(l, n, bl)) {
            return false;
        }
        Object t = fcL.rUh.sw(l);
        eIm eIm2 = ((exP)t).dnK();
        eIm2.PS(n);
        if (t instanceof emj_0) {
            ((emj_0)t).dmE().a(eIm2);
        }
        return true;
    }

    public boolean P(long l, int n) {
        return this.e(l, n, true);
    }

    public boolean e(long l, int n, boolean bl) {
        if (!this.Q(l, n)) {
            return false;
        }
        Object t = fcL.rUh.sw(l);
        return eIn.a(t, ((exP)t).dnK().PR(n).tL(), bl);
    }

    public static boolean a(@Nullable exP exP2, int n, boolean bl) {
        if (exP2 == null) {
            return false;
        }
        ety_0 ety_02 = exP2.dlK();
        if (ety_02 != null && ety_02.dGp() != etw_0.rqV && ety_02.dGp() != etw_0.rqT && ety_02.dGp() != etw_0.rqW) {
            return false;
        }
        if (ety_02 != null && ety_02.dGo().fLf() && n > 0) {
            return false;
        }
        return !bl || eml_0.a(n, exP2);
    }

    public boolean Q(long l, int n) {
        Object t = fcL.rUh.sw(l);
        if (t == null) {
            qwa.error((Object)("Character unknown , characterId id=" + l));
            return false;
        }
        eIm eIm2 = ((exP)t).dnK();
        if (eIm2 == null) {
            qwa.error((Object)("BuildSheetSet not found : player id=" + l));
            return false;
        }
        eIj eIj2 = eIm2.PR(n);
        if (eIj2 == null) {
            qwa.error((Object)("Can't set active build, build sheet not found : characterId id=" + l + ", sheetIndex = " + n));
            return false;
        }
        return true;
    }

    public boolean b(long l, int n, int n2) {
        Object t = fcL.rUh.sw(l);
        if (t == null) {
            qwa.error((Object)("Character unknown , characterId id=" + l));
            return false;
        }
        ety_0 ety_02 = t.dlK();
        if (ety_02 != null && ety_02.dGp() != etw_0.rqT && ety_02.dGp() != etw_0.rqW) {
            qwa.error((Object)("Setting active spelldeck error : player in fight, player id=" + l));
            return false;
        }
        eIm eIm2 = ((exP)t).dnK();
        if (eIm2 == null) {
            qwa.error((Object)("BuildSheetSet not found : player id=" + l));
            return false;
        }
        eIj eIj2 = eIm2.PR(n);
        if (eIj2 == null) {
            qwa.error((Object)("Unknown Sheet, index " + n + ", character id=" + l));
            return false;
        }
        if (((exP)t).dnJ() != null && !((exP)t).dnJ().Zw(n2)) {
            qwa.error((Object)("No deck at index " + n2 + ", character id=" + l));
            return false;
        }
        if (eIm2.wM() == n) {
            ((emj_0)t).dmE().i(eIj2);
        }
        return true;
    }

    public boolean c(long l, int n, int n2) {
        Object t = fcL.rUh.sw(l);
        if (t == null) {
            qwa.error((Object)("Character unknown, characterId id=" + l));
            return false;
        }
        ety_0 ety_02 = t.dlK();
        if (ety_02 != null && ety_02.dGp() != etw_0.rqT && ety_02.dGp() != etw_0.rqW) {
            qwa.error((Object)("Setting active aptitude sheet error : player in fight, player id=" + l));
            return false;
        }
        eIm eIm2 = ((exP)t).dnK();
        if (eIm2 == null) {
            qwa.error((Object)("BuildSheetSet not found : player id=" + l));
            return false;
        }
        eIj eIj2 = eIm2.PR(n);
        if (eIj2 == null) {
            qwa.error((Object)("Unknown Sheet, index " + n + ", character id=" + l));
            return false;
        }
        Object t2 = ((exP)t).dnN().PI(n2);
        if (t2 == null) {
            qwa.error((Object)("No sheet at index " + n2 + ", character id=" + l));
            return false;
        }
        if (eIm2.wM() == n) {
            ((emj_0)t).dmE().j(eIj2);
        }
        return true;
    }

    public boolean d(long l, int n, int n2) {
        Object t = fcL.rUh.sw(l);
        if (t == null) {
            qwa.error((Object)("Character unknown, characterId id=" + l));
            return false;
        }
        ety_0 ety_02 = t.dlK();
        if (ety_02 != null && ety_02.dGp() != etw_0.rqT && ety_02.dGp() != etw_0.rqW) {
            qwa.error((Object)("Setting active aptitude sheet error : player in fight, player id=" + l));
            return false;
        }
        eIm eIm2 = ((exP)t).dnK();
        if (eIm2 == null) {
            qwa.error((Object)("BuildSheetSet not found : player id=" + l));
            return false;
        }
        eIj eIj2 = eIm2.PR(n);
        if (eIj2 == null) {
            qwa.error((Object)("Unknown Sheet, index " + n + ", character id=" + l));
            return false;
        }
        fhk fhk2 = ((exP)t).dnO().gq((byte)n2);
        if (fhk2 == null) {
            qwa.error((Object)("No sheet at index " + n2 + ", character id=" + l));
            return false;
        }
        if (eIm2.wM() != n) {
            return true;
        }
        if (t instanceof emj_0) {
            ((emj_0)t).dmE().d(eIj2);
        }
        return true;
    }

    public boolean e(long l, int n, int n2) {
        Object t = fcL.rUh.sw(l);
        if (t == null) {
            qwa.error((Object)("Character unknown, characterId id=" + l));
            return false;
        }
        ety_0 ety_02 = t.dlK();
        if (ety_02 != null && ety_02.dGp() != etw_0.rqT && ety_02.dGp() != etw_0.rqW) {
            qwa.error((Object)("Setting active aptitude sheet error : player in fight, player id=" + l));
            return false;
        }
        eIm eIm2 = ((exP)t).dnK();
        if (eIm2 == null) {
            qwa.error((Object)("BuildSheetSet not found : player id=" + l));
            return false;
        }
        eIj eIj2 = eIm2.PR(n);
        if (eIj2 == null) {
            qwa.error((Object)("Unknown Sheet, index " + n + ", character id=" + l));
            return false;
        }
        eIj2.PQ(n2);
        return true;
    }

    @Deprecated
    public boolean f(long l, int n, int n2) {
        Object t = fcL.rUh.sw(l);
        if (t == null) {
            qwa.error((Object)("Character unknown , characterId id=" + l));
            return false;
        }
        if (n == 0) {
            qwa.error((Object)("Setting build sheet level error : this is the forced real level sheet, player id=" + l));
            return false;
        }
        ety_0 ety_02 = t.dlK();
        if (ety_02 != null && ety_02.dGp() != etw_0.rqT && ety_02.dGp() != etw_0.rqW) {
            qwa.error((Object)("Setting build sheet level error : player in fight, player id=" + l));
            return false;
        }
        eIm eIm2 = ((exP)t).dnK();
        if (eIm2 == null) {
            qwa.error((Object)("BuildSheetSet not found : player id=" + l));
            return false;
        }
        eIj eIj2 = eIm2.PR(n);
        if (eIj2 == null) {
            qwa.error((Object)("Unknown Sheet, index " + n + ", character id=" + l));
            return false;
        }
        if (ety_02 != null && ety_02.dGo().fLf() && n2 > 0) {
            qwa.error((Object)("Setting build sheet level error, player in Pvp fight - can't use downscaled sheet : characterId id=" + l + ", sheetIndex = " + n));
        }
        if (eIi.PO(n2) == null) {
            qwa.error((Object)"Setting build sheet level error : level not allowed");
            return false;
        }
        int n3 = eIm2.wM();
        if (n3 == n && !eml_0.a(n2, t)) {
            qwa.error((Object)("Setting build sheet level error : downscaled level too high in current instance, id=" + l));
            return false;
        }
        if (n2 > ((exP)t).dnG()) {
            qwa.error((Object)("Setting build sheet level error : downscaled level too high for the player, id=" + l));
            return false;
        }
        eIj2.PP(n2);
        if (t instanceof emj_0) {
            ((emj_0)t).dmE().c(eIj2);
        }
        return true;
    }

    public boolean R(long l, int n) {
        Object t = fcL.rUh.sw(l);
        if (t == null) {
            qwa.error((Object)("[Build][Deletion] Unknown character of id " + l));
            return false;
        }
        if (!eIn.c(t, n)) {
            return false;
        }
        eIm eIm2 = ((exP)t).dnK();
        fhm fhm2 = ((exP)t).dnO();
        frf frf2 = ((exP)t).dnJ();
        eHZ eHZ2 = ((exP)t).dnN();
        int n2 = eIm2.wM();
        if (n == n2 && !this.O(((exP)t).Sn(), 0)) {
            return false;
        }
        eIm2.PT(n);
        fhm2.Vk(n);
        frf2.Zy(n);
        eHZ2.PJ(n);
        return true;
    }

    public static boolean c(@NotNull exP exP2, int n) {
        if (n == 0) {
            return false;
        }
        fse_0 fse_02 = ((fsf)fsf.gkM()).mC(exP2.aqZ());
        if (fse_02 == null || fse_02.eqx() || fse_02.eqw()) {
            return false;
        }
        ety_0 ety_02 = exP2.dlK();
        if (ety_02 != null && ety_02.dGp() != etw_0.rqT && ety_02.dGp() != etw_0.rqW) {
            return false;
        }
        eIm eIm2 = exP2.dnK();
        fhm fhm2 = exP2.dnO();
        frf frf2 = exP2.dnJ();
        eHZ eHZ2 = exP2.dnN();
        if (eIm2 == null || fhm2 == null || frf2 == null || eHZ2 == null) {
            qwa.error((Object)("[Build][Deletion] One sheet set not found for player " + exP2.Sn() + " : " + (eIm2 == null ? "builds, " : "") + (fhm2 == null ? "equipments, " : "") + (frf2 == null ? "spells, " : "") + (eHZ2 == null ? "aptitudes" : "")));
            return false;
        }
        if (eIm2.aVo() < 2) {
            return false;
        }
        eIj eIj2 = eIm2.PR(n);
        if (eIj2 == null) {
            return false;
        }
        return !eIj2.dhe();
    }

    public void S(long l, int n) {
        Object t = fcL.rUh.sw(l);
        if (t == null) {
            qwa.error((Object)("Character unknown , characterId id=" + l));
            return;
        }
        ety_0 ety_02 = t.dlK();
        if (ety_02 != null && ety_02.dGp() != etw_0.rqT && ety_02.dGp() != etw_0.rqW) {
            qwa.error((Object)("Cleaning build sheet error : player in fight, player id=" + l));
            return;
        }
        eIm eIm2 = ((exP)t).dnK();
        if (eIm2 == null) {
            qwa.error((Object)("BuildSheetSet not found : player id=" + l));
            return;
        }
        eIj eIj2 = eIm2.PR(n);
        if (eIj2 == null) {
            qwa.error((Object)("BuildSheet not found : player id=" + l));
            return;
        }
        int n2 = eIj2.wp();
        int n3 = eIj2.wp();
        int n4 = eIj2.wp();
        int n5 = eIj2.tL();
        eHZ eHZ2 = ((exP)t).dnN();
        if (eHZ2 == null) {
            qwa.error((Object)("AptitudeSheetSet not found : player id=" + l));
            return;
        }
        Object t2 = eHZ2.PI(n2);
        if (t2 == null) {
            this.c(l, n, -1);
        } else if (n5 > 0) {
            short s = ((ehy_0)t2).fwc();
            n5 = GC.a(n5, (int)s, new int[0]);
        }
        frf frf2 = ((exP)t).dnJ();
        if (frf2 == null) {
            qwa.error((Object)("SpellDeckSet not found : player id=" + l));
            return;
        }
        frd frd2 = frf2.Zx(n3);
        if (frd2 == null) {
            this.b(l, n, -1);
        } else if (n5 > 0) {
            int n6 = frd2.tL();
            n5 = GC.a(n5, n6, new int[0]);
        }
        fhm fhm2 = ((exP)t).dnO();
        if (fhm2 == null) {
            qwa.error((Object)("EquipmentSheetSet not found : player id=" + l));
            return;
        }
        fhk fhk2 = fhm2.gq((byte)n4);
        if (fhk2 == null) {
            this.d(l, n, -1);
        } else if (n5 > 0) {
            short s = fhk2.cmL();
            n5 = GC.a(n5, (int)s, new int[0]);
        }
        if (eIj2.tL() != n5) {
            this.f(l, n, n5);
        }
    }

    @Contract(value="_, null, _ -> false")
    public boolean a(long l, @Nullable eIj eIj2, @NotNull String string) {
        if (eIj2 == null) {
            return false;
        }
        String string2 = eIj2.getName();
        if (string.equals(string2)) {
            return false;
        }
        if (string.length() > 20) {
            return false;
        }
        eIj2.setName(string);
        return true;
    }

    public boolean g(long l, int n, int n2) {
        if (n == n2) {
            return false;
        }
        if (n < 1 || n2 < 1) {
            return false;
        }
        Object t = fcL.rUh.sw(l);
        if (t == null) {
            qwa.error((Object)("Character unknown , characterId id=" + l));
            return false;
        }
        fse_0 fse_02 = ((fsf)fsf.gkM()).mC(((exP)t).aqZ());
        if (fse_02 == null || fse_02.eqx() || fse_02.eqw()) {
            return false;
        }
        ety_0 ety_02 = t.dlK();
        if (ety_02 != null) {
            qwa.warn((Object)"Swap build in fight is prohibited");
            return false;
        }
        eIm eIm2 = ((exP)t).dnK();
        if (eIm2 == null) {
            qwa.error((Object)("BuildSheetSet not found : player id=" + l));
            return false;
        }
        eIj eIj2 = eIm2.PR(n);
        if (eIj2 == null) {
            qwa.error((Object)("Unknown Sheet, index " + n + ", character id=" + l));
            return false;
        }
        eIj eIj3 = eIm2.PR(n2);
        if (eIj3 == null) {
            qwa.error((Object)("Unknown Sheet, index " + n2 + ", character id=" + l));
            return false;
        }
        eIm2.a(n2, eIj2);
        eIm2.a(n, eIj3);
        eIj2.tr(n2);
        eIj3.tr(n);
        if (eIm2.wM() == n) {
            eIm2.PS(n2);
        } else if (eIm2.wM() == n2) {
            eIm2.PS(n);
        }
        if (eIm2.wR() == n) {
            eIm2.PU(n2);
        } else if (eIm2.wR() == n2) {
            eIm2.PU(n);
        }
        return true;
    }

    public void pD(long l) {
        Object t = fcL.rUh.sw(l);
        if (t == null) {
            qwa.error((Object)("Character unknown , characterId id=" + l));
            return;
        }
        eIm eIm2 = ((exP)t).dnK();
        if (eIm2 == null) {
            qwa.error((Object)("BuildSheetSet not found : player id=" + l));
            return;
        }
        eIm2.PU(eIm2.wM());
    }

    public void pE(long l) {
        Object t = fcL.rUh.sw(l);
        if (t == null) {
            qwa.error((Object)("Character unknown , characterId id=" + l));
            return;
        }
        eIm eIm2 = ((exP)t).dnK();
        if (eIm2 == null) {
            qwa.error((Object)("BuildSheetSet not found : player id=" + l));
            return;
        }
        int n = eIm2.wR();
        if (n == -2) {
            qwa.error((Object)"Trying to restore a previous build but there is no registered previous build");
            return;
        }
        this.O(l, n);
        eIm2.PU(-2);
    }

    @NotNull
    @Contract(pure=true)
    public static String rZ(@NotNull String string) {
        String string2 = BH.bf(string);
        if (string2.length() > 20) {
            return string2.substring(0, 20);
        }
        return string2;
    }
}

