/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from baT
 */
public class bat_2
extends emz_0 {
    static final Logger hzB = Logger.getLogger(bat_2.class);
    private static final bat_2 hzC = new bat_2();
    private aqd_1<aoc_0> hzD = new bau_2(this);

    protected bat_2() {
    }

    @Override
    public void a(aqd_1<aoc_0> aqd_12) {
        this.hzD = aqd_12;
    }

    public static bat_2 cZD() {
        return hzC;
    }

    @Override
    @Nullable
    protected final enk_0 Ax(int n) {
        if (n <= 0) {
            return null;
        }
        aoc_0 aoc_02 = this.hzD.tE(n);
        if (aoc_02 == null) {
            return null;
        }
        return this.a(aoc_02);
    }

    public final enk_0 Ay(int n) {
        enk_0 enk_02 = this.Ax(n);
        if (enk_02 != null) {
            this.a(enk_02);
        }
        return enk_02;
    }

    protected final enk_0 a(aoc_0 aoc_02) {
        boolean bl = aoc_02.cwK();
        eNB eNB2 = bl ? (aoc_02.cwI() ? this.d(aoc_02) : this.c(aoc_02)) : this.b(aoc_02);
        eNB2.a(QC.L(aoc_02.cxi()));
        eNB2.a(QA.J(aoc_02.cxj()));
        eNB2.a(QB.K(aoc_02.cxh()));
        eNB2.xV(aoc_02.cbj());
        eNB2.lN(aoc_02.aZW());
        eNB2.oA(aoc_02.aZP());
        eNB2.lO(aoc_02.cxB());
        eNB2.lP(aoc_02.cxC());
        eNB2.lV(aoc_02.cxD());
        eNB2.N(aoc_02.cxA());
        this.a(aoc_02, aoc_02.aZH(), eNB2);
        return eNB2;
    }

    private void a(aoc_0 aoc_02, int n, eNB eNB2) {
        String[] stringArray;
        if (aoc_02.cxp().trim().length() == 0) {
            return;
        }
        for (String string : stringArray = BH.a(aoc_02.cxp(), '~')) {
            String[] stringArray2 = string.split("\\|", -1);
            if (stringArray2.length % 2 != 0) {
                hzB.error((Object)("HMI error : Nombre de param\u00e8tres d\u00e9cod\u00e9s: " + stringArray2.length + " Attendu: 8 [" + aoc_02.cxp() + "]"));
                continue;
            }
            Byte by = 0;
            Byte by2 = 0;
            Byte by3 = 0;
            String string2 = "";
            boolean bl = false;
            for (int i = 0; i < stringArray2.length; i += 2) {
                String string3 = stringArray2[i];
                String string4 = stringArray2[i + 1];
                if (string3.equals("start")) {
                    by = Byte.parseByte(string4);
                    continue;
                }
                if (string3.equals("end")) {
                    by2 = Byte.parseByte(string4);
                    continue;
                }
                if (string3.equals("type")) {
                    by3 = Byte.parseByte(string4);
                    continue;
                }
                if (string3.equals("data")) {
                    string2 = string4;
                    continue;
                }
                if (!string3.equals("broadcast")) continue;
                bl = Boolean.parseBoolean(string4);
            }
            Pf pf = Pg.aXx().a(by3, string2, bl);
            if (pf != null) {
                switch (by) {
                    case 0: {
                        eNB2.a(pf);
                        break;
                    }
                    case 1: {
                        eNB2.c(pf);
                        break;
                    }
                    case 2: {
                        eNB2.b(pf);
                        break;
                    }
                    default: {
                        hzB.error((Object)("Impossible d'enregistrer le d\u00e9but d'une HMIAction pour l'effet " + n + " : type de d\u00e9but non connu : " + by));
                    }
                }
                switch (by2) {
                    case 11: {
                        eNB2.e(pf);
                        break;
                    }
                    case 12: {
                        eNB2.d(pf);
                        break;
                    }
                    case 10: {
                        pf.aR(true);
                        break;
                    }
                    default: {
                        hzB.error((Object)("Impossible d'enregistrer la fin d'une HMIAction pour l'effet " + n + " : type de fin non connu : " + by2));
                        break;
                    }
                }
                continue;
            }
            hzB.error((Object)("Erreur lors du chargement de l'HMIAction de type " + by3 + " sur l'effet " + n));
        }
    }

    private eNB b(aoc_0 aoc_02) {
        return new eNB(aoc_02.aZH(), aoc_02.avZ(), this.g(aoc_02), aoc_02.cwR(), aoc_02.cwS(), aoc_02.cwT(), aoc_02.cwU(), aoc_02.cwV(), aoc_02.cwW(), aoc_02.cwX(), this.f(aoc_02), this.e(aoc_02), aoc_02.aZT(), aoc_02.ckl(), aoc_02.cxf(), aoc_02.cxg(), aoc_02.aZz(), aoc_02.cwG(), aoc_02.cwH(), aoc_02.cxk(), aoc_02.cxq(), aoc_02.cxr(), bat_2.j(aoc_02), aoc_02.cxl(), aoc_02.cxm(), aoc_02.cxn(), aoc_02.cxE(), aoc_02.cxv(), false, false, aoc_02.cxw(), bat_2.k(aoc_02), aoc_02.cxx(), aoc_02.cxy(), aoc_02.cxz());
    }

    private eNB c(aoc_0 aoc_02) {
        return new eNE(aoc_02.aZH(), aoc_02.avZ(), this.g(aoc_02), aoc_02.cwR(), aoc_02.cwS(), aoc_02.cwT(), aoc_02.cwU(), aoc_02.cwV(), aoc_02.cwW(), aoc_02.cwX(), this.f(aoc_02), this.e(aoc_02), aoc_02.aZT(), this.h(aoc_02), this.i(aoc_02), aoc_02.ckl(), aoc_02.cxf(), aoc_02.cxg(), aoc_02.aZz(), aoc_02.cwG(), aoc_02.cwH(), aoc_02.cxk(), aoc_02.cxq(), aoc_02.cxr(), bat_2.j(aoc_02), aoc_02.cxl(), aoc_02.cxm(), aoc_02.cxn(), aoc_02.cxE(), aoc_02.cxv(), true, aoc_02.cxw(), bat_2.k(aoc_02), aoc_02.cxx(), aoc_02.cxy(), aoc_02.cxz());
    }

    private eNB d(aoc_0 aoc_02) {
        return new env_0(aoc_02.aZH(), aoc_02.avZ(), this.g(aoc_02), aoc_02.cwR(), aoc_02.cwS(), aoc_02.cwT(), aoc_02.cwU(), aoc_02.cwV(), aoc_02.cwW(), aoc_02.cwX(), this.f(aoc_02), this.e(aoc_02), aoc_02.aZT(), this.h(aoc_02), this.i(aoc_02), aoc_02.cwq(), aoc_02.cxc(), aoc_02.cxd(), aoc_02.cxe(), aoc_02.ckl(), aoc_02.cxf(), aoc_02.cxg(), aoc_02.aZz(), aoc_02.cwG(), aoc_02.cwH(), aoc_02.cxk(), aoc_02.cxq(), aoc_02.cxr(), bat_2.j(aoc_02), aoc_02.cxl(), aoc_02.cxm(), aoc_02.cxn(), aoc_02.cxE(), aoc_02.cxv(), true, aoc_02.cxw(), bat_2.k(aoc_02), aoc_02.cwA(), aoc_02.cxx(), aoc_02.cxy(), aoc_02.cxz());
    }

    private eub_1 e(aoc_0 aoc_02) {
        return new eub_1(aoc_02.cwZ());
    }

    private long f(aoc_0 aoc_02) {
        long l = 0L;
        if (aoc_02.cwY().startsWith("CRITICAL")) {
            l |= 1L;
        }
        return l;
    }

    private aoh_1 g(aoc_0 aoc_02) {
        aoh_1 aoh_12 = null;
        try {
            aoh_12 = aoi_1.a(aoc_02.cwN(), aoc_02.cwM(), aoc_02.cwL());
        }
        catch (IllegalArgumentException illegalArgumentException) {
            hzB.error((Object)("Illegal Argument exception pour l'AOE de l'effect d'id : " + aoc_02.aZH()));
        }
        return aoh_12;
    }

    private int h(aoc_0 aoc_02) {
        boolean bl = aoc_02.cwK();
        return bl ? aoc_02.cxa() : -1;
    }

    private float i(aoc_0 aoc_02) {
        boolean bl = aoc_02.cwK();
        return bl ? aoc_02.cxb() : -1.0f;
    }

    private static ang_2 j(aoc_0 aoc_02) {
        ang_2 ang_22 = null;
        try {
            ang_22 = ehu_0.rY(aoc_02.cxs());
        }
        catch (Exception exception) {
            hzB.error((Object)("Erreur lors de la compilation du crit\u00e8re de l'effet " + aoc_02.aZH() + " de l'item " + aoc_02.cjJ() + " de type " + aoc_02.cxt()), (Throwable)exception);
        }
        return ang_22;
    }

    private static aoh_1 k(aoc_0 aoc_02) {
        short s = aoc_02.cwQ();
        int[] nArray = aoc_02.cwP();
        short s2 = aoc_02.cwO();
        aoh_1 aoh_12 = null;
        try {
            if (s > 0) {
                aoh_12 = aoi_1.a(s, nArray, s2);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            hzB.error((Object)("zone d'effet vide incorrecte pour l'effet d'id : " + aoc_02.aZH()));
        }
        return aoh_12;
    }
}

