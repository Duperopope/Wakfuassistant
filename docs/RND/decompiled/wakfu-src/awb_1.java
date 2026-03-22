/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL2
 */
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.jogamp.opengl.GL2;
import java.nio.Buffer;

/*
 * Renamed from awB
 */
public class awb_1
extends awx_1 {
    private awy_1 dmf;
    private static final VertexBufferPCT dmg;
    private static final float[] dmh;
    private static final float[] dmi;
    private static final float[] dmj;
    private static final float[] dmk;
    private float aAx = 0.0f;
    private float aAy = 0.0f;
    private final int dml = 1;
    private float aXn = 1.0f;

    public awb_1() {
        awb_1.dmi[3] = 1.0f;
        awb_1.dmi[7] = 1.0f;
        awb_1.dmi[11] = 1.0f;
        awb_1.dmi[15] = 1.0f;
        awb_1.dmj[3] = 1.0f;
        awb_1.dmj[7] = 1.0f;
        awb_1.dmj[11] = 1.0f;
        awb_1.dmj[15] = 1.0f;
    }

    public void a(awy_1 awy_12) {
        this.dmf = awy_12;
    }

    @Override
    public String bNu() {
        if (this.dmf == null) {
            return null;
        }
        return this.dmf.bOO();
    }

    @Override
    public int bNv() {
        if (this.dmf == null) {
            return 0;
        }
        return this.dmf.bNf();
    }

    @Override
    public awh_2 getFont() {
        return this.dmf;
    }

    @Override
    public awh_2 b(int n, float f2) {
        return null;
    }

    @Override
    public int e(char c2) {
        awz_1 awz_12 = this.dmf.aE((short)c2);
        if (awz_12 == null) {
            return 4;
        }
        if (c2 == ' ') {
            return awz_12.dmd;
        }
        return awz_12.dmd + awz_12.dmc;
    }

    @Override
    public int f(char c2) {
        awz_1 awz_12 = this.dmf.aE((short)c2);
        if (awz_12 == null) {
            return 4;
        }
        return awz_12.aAv;
    }

    @Override
    public int g(char c2) {
        awz_1 awz_12 = this.dmf.aE((short)c2);
        if (awz_12 == null) {
            return 4;
        }
        return awz_12.aAw;
    }

    @Override
    public int bNw() {
        if (this.dmf == null) {
            return 8;
        }
        return this.dmf.bNp() + this.dmf.bNg() * 2;
    }

    @Override
    public int bNx() {
        if (this.dmf == null) {
            return 12;
        }
        return this.dmf.bNq() + this.dmf.bNg() * 2;
    }

    @Override
    public int e(String string, int n, int n2) {
        if (string == null || string.length() == 0) {
            return 0;
        }
        if (this.dmf == null) {
            return string.length();
        }
        int n3 = this.dmf.bNg();
        char[] cArray = string.toCharArray();
        boolean bl = true;
        for (int i = 0; i < cArray.length; ++i) {
            if (i == n) {
                return n;
            }
            char c2 = cArray[i];
            awz_1 awz_12 = this.dmf.aE((short)c2);
            if (awz_12 == null) continue;
            if (bl) {
                n3 += awz_12.dmc;
                bl = false;
            }
            n3 = c2 == ' ' ? (n3 += awz_12.dmd) : (n3 += awz_12.dmd);
            if (n3 <= n2) continue;
            return i;
        }
        return string.length();
    }

    @Override
    public int gj(String string) {
        if (this.dmf == null) {
            return 4 * string.length();
        }
        int n = 0;
        char[] cArray = string.toCharArray();
        boolean bl = true;
        for (int i = 0; i < cArray.length; ++i) {
            char c2 = cArray[i];
            awz_1 awz_12 = this.dmf.aE((short)c2);
            if (awz_12 == null) continue;
            if (bl) {
                n += awz_12.dmc;
                bl = false;
            }
            if (c2 == ' ') {
                n += awz_12.dmd;
                continue;
            }
            n += awz_12.dmd;
        }
        return n += this.dmf.bNg();
    }

    @Override
    public int gk(String string) {
        if (this.dmf == null) {
            return 12;
        }
        return this.dmf.bOQ();
    }

    @Override
    public int gp(String string) {
        return 0;
    }

    @Override
    public boolean bNy() {
        return false;
    }

    @Override
    public void c(float f2, float f3, float f4, float f5) {
        awb_1.dmi[0] = f2 * f5;
        awb_1.dmi[1] = f3 * f5;
        awb_1.dmi[2] = f4 * f5;
        awb_1.dmi[3] = f5;
        awb_1.dmi[4] = f2 * f5;
        awb_1.dmi[5] = f3 * f5;
        awb_1.dmi[6] = f4 * f5;
        awb_1.dmi[7] = f5;
        awb_1.dmi[8] = f2 * f5;
        awb_1.dmi[9] = f3 * f5;
        awb_1.dmi[10] = f4 * f5;
        awb_1.dmi[11] = f5;
        awb_1.dmi[12] = f2 * f5;
        awb_1.dmi[13] = f3 * f5;
        awb_1.dmi[14] = f4 * f5;
        awb_1.dmi[15] = f5;
        awb_1.dmj[3] = f5;
        awb_1.dmj[7] = f5;
        awb_1.dmj[11] = f5;
        awb_1.dmj[15] = f5;
    }

    public void a(char[] cArray, float f2, int n, float f3) {
        this.a(cArray, f2, n, f3, 1.0f);
    }

    @Override
    public void a(char[] cArray, float f2, float f3) {
        this.a(cArray, f2, cArray.length, f3, 1.0f);
    }

    @Override
    public void a(char[] cArray, float f2, float f3, float f4) {
        this.a(cArray, f2, cArray.length, f3, f4);
    }

    @Override
    public void a(char[] cArray, float f2, int n, float f3, float f4, float f5) {
        this.a(cArray, f2, cArray.length, f3, f4);
    }

    @Override
    public void a(char[] cArray, float f2, int n, float f3, float f4) {
        int n2;
        if (this.dmf == null) {
            return;
        }
        this.aXn = f4;
        awk_1 awk_12 = this.dmf.bOP();
        short s = this.dmf.bNg();
        f2 += this.aAx - (float)s;
        f3 += this.aAy - (float)s;
        atg_2 atg_22 = aru_2.cVG.bIv();
        GL2 gL2 = atg_22.bIq();
        dmg.bII();
        awk_12.f(gL2);
        acc_1 acc_12 = awk_12.vf(0);
        float f5 = acc_12.bWx();
        float f6 = acc_12.bWy();
        boolean bl = true;
        for (n2 = 0; n2 < Math.min(cArray.length, n); ++n2) {
            char c2 = cArray[n2];
            awz_1 awz_12 = this.dmf.aE((short)c2);
            if (awz_12 == null) continue;
            if (bl) {
                f2 += (float)awz_12.dmc * this.aXn;
                bl = false;
            }
            f2 -= (float)awz_12.dmc * this.aXn;
            if (c2 == ' ') {
                f2 += (float)awz_12.dmd * this.aXn;
                continue;
            }
            this.a(f2, f3, f5, f6, awz_12, dmi);
            f2 += (float)(awz_12.dmd + awz_12.dmc) * this.aXn;
        }
        n2 = dmg.bIF();
        gL2.glVertexPointer(2, 5126, 0, (Buffer)dmg.bIy());
        gL2.glColorPointer(4, 5126, 0, (Buffer)dmg.bIz());
        gL2.glTexCoordPointer(2, 5126, 0, (Buffer)dmg.bIA());
        gL2.glDrawArrays(7, 0, n2);
    }

    private void g(String string, int n, int n2) {
        awk_1 awk_12 = this.dmf.bOP();
        acc_1 acc_12 = awk_12.vf(0);
        float f2 = acc_12.bWx();
        float f3 = acc_12.bWy();
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            char c2 = cArray[i];
            awz_1 awz_12 = this.dmf.aE((short)c2);
            if (awz_12 == null) continue;
            if (c2 == ' ') {
                n += awz_12.dmd;
                continue;
            }
            boolean bl = true;
            for (int j = -1; j <= 1; ++j) {
                for (int i2 = -1; i2 <= 1; ++i2) {
                    if (j == 0 && i2 == 0) continue;
                    this.a(n + j, (float)(n2 + i2), f2, f3, awz_12, dmj);
                }
            }
            n += awz_12.dmd;
        }
    }

    private void a(float f2, float f3, float f4, float f5, awz_1 awz_12, float[] fArray) {
        awb_1.dmh[0] = f2;
        awb_1.dmh[1] = f3;
        awb_1.dmk[0] = (float)awz_12.ccg / f4;
        awb_1.dmk[1] = (float)(awz_12.cch + awz_12.aAw) / f5;
        awb_1.dmh[2] = f2;
        awb_1.dmh[3] = f3 + (float)awz_12.aAw * this.aXn;
        awb_1.dmk[2] = (float)awz_12.ccg / f4;
        awb_1.dmk[3] = (float)awz_12.cch / f5;
        awb_1.dmh[4] = f2 + (float)awz_12.aAv * this.aXn;
        awb_1.dmh[5] = f3 + (float)awz_12.aAw * this.aXn;
        awb_1.dmk[4] = (float)(awz_12.ccg + awz_12.aAv) / f4;
        awb_1.dmk[5] = (float)awz_12.cch / f5;
        awb_1.dmh[6] = f2 + (float)awz_12.aAv * this.aXn;
        awb_1.dmh[7] = f3;
        awb_1.dmk[6] = (float)(awz_12.ccg + awz_12.aAv) / f4;
        awb_1.dmk[7] = (float)(awz_12.cch + awz_12.aAw) / f5;
        dmg.D(dmh);
        dmg.J(dmk);
        dmg.F(fArray);
        dmg.ud(dmg.bIF() + 4);
    }

    @Override
    public void cd(int n, int n2) {
        this.aAx = -n / 2;
        this.aAy = -n2 / 2;
        atg_2 atg_22 = aru_2.cVG.bIv();
        atg_22.dbl.uu(13);
        ava_2.bMH().a(auw_2.dfI, auw_2.dfM);
    }

    @Override
    public void bNz() {
        atg_2 atg_22 = aru_2.cVG.bIv();
        ava_2.bMH().a(auw_2.dfL, auw_2.dfM);
    }

    @Override
    public void bNA() {
        this.aAx = 0.0f;
        this.aAy = 0.0f;
        atg_2 atg_22 = aru_2.cVG.bIv();
        atg_22.dbl.uu(13);
        ava_2.bMH().a(auw_2.dfI, auw_2.dfM);
    }

    @Override
    public void bNB() {
        atg_2 atg_22 = aru_2.cVG.bIv();
        ava_2.bMH().a(auw_2.dfL, auw_2.dfM);
    }

    static {
        dmh = new float[8];
        dmi = new float[16];
        dmj = new float[16];
        dmk = new float[8];
        int n = 4096;
        dmg = VertexBufferPCT.cWa.ue(4096);
    }
}

