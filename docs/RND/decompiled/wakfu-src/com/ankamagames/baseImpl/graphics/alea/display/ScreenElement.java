/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.baseImpl.graphics.alea.display;

import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement$ObjectFactory;
import org.apache.log4j.Logger;

public class ScreenElement
extends ayq_2 {
    private static final Logger cbI;
    public static final ScreenElement$ObjectFactory cbJ;
    public byte asf;
    public short cbK;
    public int cbL;
    public int cbM;
    public int cbN;
    public int cbO;
    public aeS cbP;
    public int cbQ;
    public byte aXR;
    public int cbR;
    public short bZd;
    public int bXO;
    boolean bVy;
    public long cbS;
    public float[] ayR;
    private static final float[] cbT;
    private static final float cbU = 0.5f;
    private static final float cbV = 1.0f;
    public static final int cbW = 1;
    public static final int cbX = 2;
    public static final int cbY = 4;
    private static final int[] cbZ;

    public ScreenElement() {
    }

    public ScreenElement(byte by) {
        this.asf = by;
        this.ayR = ScreenElement.rr(by);
    }

    public final boolean b(apl_1 apl_12) {
        this.cbK = apl_12.aIz();
        this.aXR = apl_12.aIy();
        this.cbQ = apl_12.aIy();
        this.bVy = apl_12.bFS();
        this.asf = apl_12.bFS() ? (byte)1 : 0;
        this.asf = (byte)(this.asf | (apl_12.bFS() ? 2 : 0));
        this.asf = (byte)(this.asf | (apl_12.bFS() ? 4 : 0));
        int n = apl_12.aIA();
        this.cbP = aeT.sc(n);
        if (this.cbP == null) {
            cbI.error((Object)("Element of id " + n + " is missing"));
            return false;
        }
        return true;
    }

    public final boolean bsr() {
        return this.bVy;
    }

    public final boolean bss() {
        return this.cbP.bss();
    }

    public final short bst() {
        return this.cbK;
    }

    public final int bsu() {
        return this.cbL;
    }

    public final int bsv() {
        return this.cbM;
    }

    public final byte bsw() {
        return this.aXR;
    }

    public final acd_1 bsx() {
        return new acd_1(this.cbL, this.cbM, this.cbK);
    }

    public final short bsy() {
        return (short)(this.cbK - this.aXR);
    }

    public final aeS bsz() {
        return this.cbP;
    }

    public int vD() {
        return this.bXO;
    }

    public final int bsA() {
        return this.cbR;
    }

    public final short bsB() {
        return this.bZd;
    }

    public final boolean bsC() {
        return (this.asf & 4) == 4;
    }

    public final void w(float[] fArray) {
        assert (fArray != null && fArray.length >= 3);
        if ((this.asf & 1) != 1) {
            fArray[2] = 0.5f;
            fArray[1] = 0.5f;
            fArray[0] = 0.5f;
            return;
        }
        int n = ScreenElement.rs(this.asf);
        fArray[0] = this.ayR[n++];
        fArray[1] = this.ayR[n++];
        fArray[2] = this.ayR[n];
    }

    public final void x(float[] fArray) {
        assert (fArray != null && fArray.length >= 4);
        this.w(fArray);
        fArray[3] = this.bsD();
    }

    public final float bsD() {
        return (this.asf & 2) == 2 ? this.ayR[ScreenElement.rt(this.asf)] : 1.0f;
    }

    public final void y(float[] fArray) {
        assert ((this.asf & 4) == 4) : "impossible sur un objet non d\u00e9grad\u00e9. tester avec isGradient()";
        assert (fArray != null && fArray.length >= 3);
        if ((this.asf & 1) != 1) {
            fArray[2] = 0.5f;
            fArray[1] = 0.5f;
            fArray[0] = 0.5f;
            return;
        }
        int n = ScreenElement.ru(this.asf);
        fArray[0] = this.ayR[n++];
        fArray[1] = this.ayR[n++];
        fArray[2] = this.ayR[n];
    }

    public final void z(float[] fArray) {
        assert ((this.asf & 4) == 4) : "impossible sur un objet non d\u00e9grad\u00e9. tester avec isGradient()";
        assert (fArray != null && fArray.length >= 4);
        this.y(fArray);
        fArray[3] = this.bsD();
    }

    public final float bsE() {
        assert ((this.asf & 4) == 4) : "impossible sur un objet non d\u00e9grad\u00e9. tester avec isGradient()";
        return (this.asf & 2) == 2 ? this.ayR[ScreenElement.rv(this.asf)] : 1.0f;
    }

    public void v(float[] fArray) {
        assert (fArray != null);
        assert (fArray.length >= 4);
        this.w(cbT);
        fArray[0] = fArray[0] * cbT[0];
        fArray[1] = fArray[1] * cbT[1];
        fArray[2] = fArray[2] * cbT[2];
        fArray[3] = fArray[3] * this.bsD();
    }

    public final void e(fs_0 fs_02) {
        assert (this.cbP != null);
        fs_02.k(this.cbK);
        fs_02.g(this.aXR);
        fs_02.g((byte)this.cbQ);
        fs_02.ay(this.bVy);
        fs_02.ay((this.asf & 1) == 1);
        fs_02.ay((this.asf & 2) == 2);
        fs_02.ay((this.asf & 4) == 4);
        fs_02.mz(this.cbP.d());
    }

    public final void I(int n, int n2, short s) {
        this.cbL = n;
        this.cbM = n2;
        this.cbK = s;
    }

    public final void bi(int n, int n2) {
        this.cbO = n;
        this.cbN = n2;
    }

    public void bU(boolean bl) {
        this.bVy = bl;
    }

    public final void rn(int n) {
        this.aXR = (byte)n;
    }

    public final void a(aeS aeS2) {
        this.cbP = aeS2;
    }

    public final void ro(int n) {
        this.cbQ = n;
    }

    public int bsF() {
        return this.cbQ;
    }

    public final void at(short s) {
        this.bZd = s;
    }

    public void rp(int n) {
        this.bXO = n;
    }

    public final void rq(int n) {
        this.cbR = n;
    }

    public final void bsG() {
        if ((this.asf & 2) == 2) {
            return;
        }
        this.asf = (byte)(this.asf | 2);
        float[] fArray = (float[])this.ayR.clone();
        this.ayR = ScreenElement.rr(this.asf);
        System.arraycopy(fArray, 0, this.ayR, 0, fArray.length);
    }

    public final void f(float f2, float f3, float f4) {
        if ((this.asf & 1) != 1) {
            return;
        }
        int n = ScreenElement.rs(this.asf);
        this.ayR[n++] = f2;
        this.ayR[n++] = f3;
        this.ayR[n] = f4;
    }

    public final void f(float f2, float f3, float f4, float f5) {
        if ((this.asf & 1) == 1) {
            int n = ScreenElement.rs(this.asf);
            this.ayR[n++] = f2;
            this.ayR[n++] = f3;
            this.ayR[n] = f4;
        }
        if ((this.asf & 2) == 2) {
            this.ayR[ScreenElement.rt((int)this.asf)] = f5;
        }
    }

    public final void bW(float f2) {
        if ((this.asf & 2) == 2) {
            this.ayR[ScreenElement.rt((int)this.asf)] = f2;
        }
    }

    public final void g(float f2, float f3, float f4) {
        if ((this.asf & 4) != 4) {
            return;
        }
        if ((this.asf & 1) != 1) {
            return;
        }
        int n = ScreenElement.rs(this.asf);
        this.ayR[n++] = f2;
        this.ayR[n++] = f3;
        this.ayR[n] = f4;
    }

    public final void g(float f2, float f3, float f4, float f5) {
        if ((this.asf & 4) != 4) {
            return;
        }
        if ((this.asf & 1) == 1) {
            int n = ScreenElement.rs(this.asf);
            this.ayR[n++] = f2;
            this.ayR[n++] = f3;
            this.ayR[n] = f4;
        }
        if ((this.asf & 2) == 2) {
            this.ayR[ScreenElement.rt((int)this.asf)] = f5;
        }
    }

    public final void bX(float f2) {
        if ((this.asf & 4) != 4) {
            return;
        }
        if ((this.asf & 2) == 2) {
            this.ayR[ScreenElement.rt((int)this.asf)] = f2;
        }
    }

    public void J(int n, int n2, short s) {
        this.cbL = n;
        this.cbM = n2;
        this.cbK = s;
    }

    @Override
    public void brr() {
        this.cbS = 0L;
        this.asf = 0;
        this.cbK = 0;
        this.cbM = 0;
        this.cbL = 0;
        this.cbO = 0;
        this.cbN = 0;
        this.cbQ = 0;
        this.aXR = 0;
        this.cbR = 0;
        this.bZd = 0;
        this.bXO = 0;
        this.bVy = false;
        this.cbS = 0L;
    }

    @Override
    public void brs() {
        this.ayR = null;
    }

    public static float ao(byte by) {
        return (float)by / 255.0f + 0.5f;
    }

    public static void a(float[] fArray, int n, apl_1 apl_12) {
        int n2 = 0;
        if ((n & 1) == 1) {
            assert (n2 == ScreenElement.rs(n));
            fArray[n2++] = ScreenElement.ao(apl_12.aIy());
            fArray[n2++] = ScreenElement.ao(apl_12.aIy());
            fArray[n2++] = ScreenElement.ao(apl_12.aIy());
        }
        if ((n & 2) == 2) {
            assert (n2 == ScreenElement.rt(n));
            fArray[n2++] = (float)apl_12.aIy() / 255.0f + 0.5f;
        }
        if ((n & 4) == 4) {
            if ((n & 1) == 1) {
                assert (n2 == ScreenElement.ru(n));
                fArray[n2++] = (float)apl_12.aIy() / 255.0f + 0.5f;
                fArray[n2++] = (float)apl_12.aIy() / 255.0f + 0.5f;
                fArray[n2++] = (float)apl_12.aIy() / 255.0f + 0.5f;
            }
            if ((n & 2) == 2) {
                assert (n2 == ScreenElement.rv(n));
                fArray[n2++] = (float)apl_12.aIy() / 255.0f + 0.5f;
            }
        }
        assert (n2 == fArray.length);
    }

    public static float[] rr(int n) {
        int n2 = 0;
        n2 += (n & 1) == 1 ? 3 : 0;
        n2 += (n & 2) == 2 ? 1 : 0;
        return new float[n2 *= (n & 4) == 4 ? 2 : 1];
    }

    static int rs(int n) {
        return cbZ[n & 0];
    }

    static int rt(int n) {
        return cbZ[n & 1];
    }

    static int ru(int n) {
        int n2 = n & 3;
        assert ((n2 & 1) == 1);
        return cbZ[n2];
    }

    static int rv(int n) {
        int n2 = n & 3;
        assert ((n2 & 2) == 2);
        return cbZ[n2 + 4];
    }

    public void b(aci_1 aci_12) {
        aci_12.y(this.cbO, this.cbO + this.cbP.bwU(), this.cbN - this.cbP.bwV(), this.cbN);
    }

    public void bV(boolean bl) {
        this.cbS = afX.a(this.cbL, this.cbM, this.cbQ, bl ? this.cbK : (short)0);
    }

    public void bsH() {
        this.cbO = aau_0.bj(this.cbL, this.cbM) - this.cbP.bwS();
        this.cbN = aau_0.o(this.cbL, this.cbM, this.cbK - this.aXR) + this.cbP.bwT();
    }

    @Override
    public void bsI() {
        super.bsI();
    }

    static {
        int n;
        cbI = Logger.getLogger(ScreenElement.class);
        cbJ = new ScreenElement$ObjectFactory();
        cbT = new float[4];
        cbZ = new int[8];
        int n2 = 3;
        boolean bl = true;
        ScreenElement.cbZ[0] = 0;
        for (n = 1; n < 2; ++n) {
            ScreenElement.cbZ[n] = 3 + cbZ[n - 1];
        }
        for (n = 2; n < 4; ++n) {
            ScreenElement.cbZ[n] = 1 + cbZ[n - 2];
        }
        for (n = 4; n < cbZ.length; ++n) {
            ScreenElement.cbZ[n] = cbZ[n - 4];
            if ((n & 1) != 1) continue;
            int n3 = n;
            cbZ[n3] = cbZ[n3] + 3;
        }
    }
}

