/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from caZ
 */
public class caz_1
implements afZ {
    public static final caz_1 lId = new caz_1();
    private static final Logger lIe = Logger.getLogger(caz_1.class);
    private static final float lIf = 0.01f;
    private static final float lIg = 2.1f;
    private static final byte lIh = 0;
    private static final byte lIi = 1;
    aah_1<cax_1> lIj = new aah_1();
    private final aah_1<cba_1> lIk = new aah_1();
    private int lIl = Integer.MIN_VALUE;
    private int lIm = Integer.MIN_VALUE;
    private agf bUu;
    private static final acp_1 lIn = new acp_1();

    private caz_1() {
        for (cbc_1 cbc_12 : cbc_1.values()) {
            this.lIk.b(cbc_12.aJr(), new cba_1(this, cbc_12));
        }
    }

    public void P(short s, short s2) {
        short s3;
        if (this.bUu == null) {
            this.bUu = aie_0.cfn().bmC().bqL();
        }
        if (this.lIl == s && this.lIm == s2) {
            return;
        }
        this.lIl = s;
        this.lIm = s2;
        aah_1<cax_1> aah_12 = new aah_1<cax_1>();
        short s4 = (short)(s + 1);
        for (s3 = (short)(s - 1); s3 <= s4; s3 = (short)(s3 + 1)) {
            short s5 = (short)(s2 + 1);
            for (short s6 = (short)(s2 - 1); s6 <= s5; s6 = (short)(s6 + 1)) {
                int n = this.Q(s3, s6);
                cax_1 cax_12 = this.lIj.vK(n);
                if (cax_12 == null) {
                    try {
                        cax_12 = new cax_1(s3, s6);
                    }
                    catch (Exception exception) {
                        continue;
                    }
                }
                aah_12.b(n, cax_12);
            }
        }
        this.lIj = aah_12;
        for (s3 = this.lIk.bTR() - 1; s3 >= 0; --s3) {
            this.lIk.vU(s3).a(this.lIj);
        }
    }

    public void er(int n, int n2) {
        for (int i = this.lIk.bTR() - 1; i >= 0; --i) {
            cba_1 cba_12 = this.lIk.vU(i);
            if (cba_12.lIs) {
                if (this.a(cba_12, n, n2) == 0) {
                    this.b(cba_12, n, n2);
                    continue;
                }
                this.c(cba_12, n, n2);
                continue;
            }
            if (cba_12.lIr == 0) continue;
            cba_12.lIr = 0;
            cAY.eHc().a(new cCr(cba_12.lIo.erT(), cba_12.lIo.erU(), 0));
            lIe.debug((Object)("Aucune " + String.valueOf((Object)cba_12.lIo) + " alentour"));
        }
    }

    private byte a(cba_1 cba_12, int n, int n2) {
        int n3 = this.Q((short)Wa.qf(n), (short)Wa.qg(n2));
        cax_1 cax_12 = this.lIj.vK(n3);
        if (cax_12 == null) {
            return 0;
        }
        int n4 = (n % 18 + 18) % 18;
        int n5 = (n2 % 18 + 18) % 18;
        return cax_12.c(cba_12.lIo.aJr(), n4, n5);
    }

    private void b(cba_1 cba_12, int n, int n2) {
        int n3;
        int n4;
        int n5 = cax_1.Ku(n);
        int n6 = cax_1.Ku(n2);
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        for (n4 = -1; n4 < 2; ++n4) {
            for (n3 = -1; n3 < 2; ++n3) {
                byte by;
                int n10 = n5 + n4;
                int n11 = n6 + n3;
                int n12 = this.Q(cax_1.Ky(n10), cax_1.Ky(n11));
                cax_1 cax_12 = this.lIj.vK(n12);
                if (cax_12 == null || (by = cax_12.b(cba_12.lIo.aJr(), n10, n11)) <= 0) continue;
                n7 += n4;
                n8 += n3;
                n9 += by;
            }
        }
        lIn.m(n7, n8, 0.0f);
        lIn.bWX();
        n4 = cax_1.Kw(n5);
        n3 = cax_1.Kw(n6);
        lIe.debug((Object)("[weight]OrigPos= " + n + ", " + n2));
        lIe.debug((Object)("[weight]CenterPos= " + n4 + ", " + n3));
        if (cba_12.lIr == 0) {
            cba_12.lIp.cG((float)n4 + lIn.aSc() * 10.0f);
            cba_12.lIq.cG((float)n3 + lIn.aSd() * 10.0f);
        } else {
            cba_12.lIp.aS((float)n4 + lIn.aSc() * 10.0f);
            cba_12.lIq.aS((float)n3 + lIn.aSd() * 10.0f);
        }
        lIe.debug((Object)("[weight]Pos= " + cba_12.lIp.aSK() + ", " + cba_12.lIq.aSK()));
        if (n9 == 0) {
            if (cba_12.lIr != 0) {
                cba_12.lIr = 0;
                cAY.eHc().a(new cCr(cba_12.lIo.erT(), cba_12.lIo.erU(), 0));
                lIe.debug((Object)("Aucune " + String.valueOf((Object)cba_12.lIo) + " alentour"));
            }
        } else if (cba_12.lIr != 1) {
            cba_12.lIr = 1;
            cAY.eHc().a(new cCr(cba_12.lIo.erT(), cba_12.lIo.erU(), 75));
            lIe.debug((Object)("D\u00e9tection d'une " + String.valueOf((Object)cba_12.lIo) + "\u00e9loign\u00e9e - Force=" + n9));
        }
    }

    private void c(cba_1 cba_12, int n, int n2) {
        int n3;
        int n4;
        int n5 = cax_1.Kt(n);
        int n6 = cax_1.Kt(n2);
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        for (n4 = -1; n4 < 2; ++n4) {
            for (n3 = -1; n3 < 2; ++n3) {
                int n10 = n5 + n4;
                int n11 = n6 + n3;
                int n12 = this.Q(cax_1.Kx(n10), cax_1.Kx(n11));
                cax_1 cax_12 = this.lIj.vK(n12);
                if (cax_12 == null || !cax_12.d(cba_12.lIo.aJr(), n10, n11)) continue;
                n7 += n4;
                n8 += n3;
                ++n9;
            }
        }
        lIn.m(n7, n8, 0.0f);
        lIn.bWX();
        n4 = cax_1.Kv(n5);
        n3 = cax_1.Kv(n6);
        lIe.debug((Object)("[pos]OrigPos= " + n + ", " + n2));
        lIe.debug((Object)("[pos]CenterPos= " + n4 + ", " + n3));
        if (cba_12.lIr == 0) {
            cba_12.lIp.cG((float)n4 + lIn.aSc() * (float)(10 - n9));
            cba_12.lIq.cG((float)n3 + lIn.aSd() * (float)(10 - n9));
        } else {
            cba_12.lIp.aS((float)n4 + lIn.aSc() * (float)(10 - n9));
            cba_12.lIq.aS((float)n3 + lIn.aSd() * (float)(10 - n9));
        }
        lIe.debug((Object)("[pos]Pos= " + cba_12.lIp.aSK() + ", " + cba_12.lIq.aSK()));
        if (cba_12.lIr != 1) {
            cba_12.lIr = 1;
            cAY.eHc().a(new cCr(cba_12.lIo.erT(), cba_12.lIo.erU(), 75));
            lIe.debug((Object)("D\u00e9tection d'un " + String.valueOf((Object)cba_12.lIo) + " proche - Force=" + n9));
        }
    }

    public void clear() {
        this.lIj.clear();
        for (int i = this.lIk.bTR() - 1; i >= 0; --i) {
            cba_1 cba_12 = this.lIk.vU(i);
            if (cba_12.lIr == 0) continue;
            cba_12.lIr = 0;
            cAY.eHc().a(new cCr(cba_12.lIo.erT(), cba_12.lIo.erU(), 0));
        }
        this.lIl = Integer.MIN_VALUE;
        this.lIm = Integer.MIN_VALUE;
    }

    private int Q(short s, short s2) {
        return GC.d(s, s2);
    }

    public void a(afV afV2, int n) {
        for (int i = this.lIk.bTR() - 1; i >= 0; --i) {
            cba_1 cba_12 = this.lIk.vU(i);
            cba_12.lIp.sj(n);
            cba_12.lIq.sj(n);
        }
    }

    public void a(afV afV2, float f2, float f3) {
    }

    final float a(cbc_1 cbc_12) {
        cba_1 cba_12 = this.lIk.vK(cbc_12.aJr());
        if (cba_12 == null) {
            return 0.0f;
        }
        return cba_12.lIp.getValue();
    }

    final float b(cbc_1 cbc_12) {
        cba_1 cba_12 = this.lIk.vK(cbc_12.aJr());
        if (cba_12 == null) {
            return 0.0f;
        }
        return cba_12.lIq.getValue();
    }

    final float c(cbc_1 cbc_12) {
        return this.bUu.byU().aSe();
    }
}

