/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;

/*
 * Renamed from fUU
 */
public class fuu_1 {
    static final int vnO = 8500;
    static final int vnP = 0;
    static final int vnQ = 1;
    static final int vnR = 2;
    static final int vnS = -1;
    static final int vnT = -2;
    static final int vnU = -3;
    static final int vnV = -128;
    static final int vnW = -129;
    static final int vnX = -130;
    static final int vnY = -131;
    static final int vnZ = -132;
    static final int voa = -133;
    static final int vob = -134;
    static final int voc = -135;
    static final int vod = -136;
    static final int voe = -137;
    static final int vof = -138;
    InputStream vog;
    boolean voh = false;
    long voi;
    long voj;
    final fue_2 vok = new fue_2();
    int vol;
    long[] vom;
    long[] von;
    int[] voo;
    long[] vop;
    fua_1[] voq;
    fuj_2[] vor;
    long vos;
    boolean vot = false;
    int vou;
    int vov;
    float vow;
    float vox;
    final fud_2 voy = new fud_2();
    final fum_1 voz = new fum_1();
    final fuf_1 voA = new fuf_1(this.voz);

    public fuu_1(String string) {
        fuv_2 fuv_22 = null;
        try {
            fuv_22 = new fuv_2(this, string);
            int n = this.a(fuv_22, null, 0);
            if (n == -1) {
                throw new fuc_1("VorbisFile: open return -1");
            }
        }
        catch (Exception exception) {
            throw new fuc_1("VorbisFile: " + exception.toString());
        }
        finally {
            if (fuv_22 != null) {
                try {
                    ((InputStream)fuv_22).close();
                }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                }
            }
        }
    }

    public fuu_1(InputStream inputStream, byte[] byArray, int n) {
        int n2 = this.a(inputStream, byArray, n);
        if (n2 == -1) {
            // empty if block
        }
    }

    private int gIa() {
        int n = this.vok.act(8500);
        byte[] byArray = this.vok.SY;
        int n2 = 0;
        try {
            n2 = this.vog.read(byArray, n, 8500);
        }
        catch (Exception exception) {
            return -128;
        }
        this.vok.acu(n2);
        if (n2 == -1) {
            n2 = 0;
        }
        return n2;
    }

    private void vf(long l) {
        fuu_1.a(this.vog, l, 0);
        this.voi = l;
        this.vok.gHQ();
    }

    private int b(fuc_2 fuc_22, long l) {
        int n;
        int n2;
        block6: {
            if (l > 0L) {
                l += this.voi;
            }
            while (true) {
                if (l > 0L && this.voi >= l) {
                    return -1;
                }
                n2 = this.vok.f(fuc_22);
                if (n2 < 0) {
                    this.voi -= (long)n2;
                    continue;
                }
                if (n2 != 0) break block6;
                if (l == 0L) {
                    return -1;
                }
                n = this.gIa();
                if (n == 0) {
                    return -2;
                }
                if (n < 0) break;
            }
            return -128;
        }
        n = (int)this.voi;
        this.voi += (long)n2;
        return n;
    }

    private int g(fuc_2 fuc_22) {
        int n;
        long l = this.voi;
        int n2 = -1;
        block0: while (n2 == -1) {
            if ((l -= 8500L) < 0L) {
                l = 0L;
            }
            this.vf(l);
            while (this.voi < l + 8500L) {
                n = this.b(fuc_22, l + 8500L - this.voi);
                if (n == -128) {
                    return -128;
                }
                if (n < 0) {
                    if (n2 != -1) continue block0;
                    throw new fuc_1();
                }
                n2 = n;
            }
        }
        this.vf(n2);
        n = this.b(fuc_22, 8500L);
        if (n < 0) {
            return -129;
        }
        return n2;
    }

    int b(long l, long l2, long l3, int n, int n2) {
        int n3;
        long l4 = l3;
        long l5 = l3;
        fuc_2 fuc_22 = new fuc_2();
        while (l2 < l4) {
            long l6 = l4 - l2 < 8500L ? l2 : (l2 + l4) / 2L;
            this.vf(l6);
            n3 = this.b(fuc_22, -1L);
            if (n3 == -128) {
                return -128;
            }
            if (n3 < 0 || fuc_22.gHL() != n) {
                l4 = l6;
                if (n3 < 0) continue;
                l5 = n3;
                continue;
            }
            l2 = n3 + fuc_22.vhH + fuc_22.vhK;
        }
        this.vf(l5);
        n3 = this.b(fuc_22, -1L);
        if (n3 == -128) {
            return -128;
        }
        if (l2 >= l3 || n3 == -1) {
            this.vol = n2 + 1;
            this.vom = new long[n2 + 2];
            this.vom[n2 + 1] = l2;
        } else {
            n3 = this.b(l5, this.voi, l3, fuc_22.gHL(), n2 + 1);
            if (n3 == -128) {
                return -128;
            }
        }
        this.vom[n2] = l;
        return 0;
    }

    int b(fua_1 fua_12, fuj_2 fuj_22, int[] nArray, fuc_2 fuc_22) {
        fuc_2 fuc_23 = new fuc_2();
        fub_2 fub_22 = new fub_2();
        if (fuc_22 == null) {
            int n = this.b(fuc_23, 8500L);
            if (n == -128) {
                return -128;
            }
            if (n < 0) {
                return -132;
            }
            fuc_22 = fuc_23;
        }
        if (nArray != null) {
            nArray[0] = fuc_22.gHL();
        }
        this.voy.tZ(fuc_22.gHL());
        fua_12.bkZ();
        fuj_22.bkZ();
        int n = 0;
        while (n < 3) {
            int n2;
            this.voy.c(fuc_22);
            while (n < 3 && (n2 = this.voy.b(fub_22)) != 0) {
                if (n2 == -1) {
                    fua_12.clear();
                    fuj_22.clear();
                    this.voy.clear();
                    return -1;
                }
                if (fua_12.a(fuj_22, fub_22) != 0) {
                    fua_12.clear();
                    fuj_22.clear();
                    this.voy.clear();
                    return -1;
                }
                ++n;
            }
            if (n >= 3 || this.b(fuc_22, 1L) >= 0) continue;
            fua_12.clear();
            fuj_22.clear();
            this.voy.clear();
            return -1;
        }
        return 0;
    }

    void b(fua_1 fua_12, fuj_2 fuj_22, int n) {
        fuc_2 fuc_22 = new fuc_2();
        this.voq = new fua_1[this.vol];
        this.vor = new fuj_2[this.vol];
        this.von = new long[this.vol];
        this.vop = new long[this.vol];
        this.voo = new int[this.vol];
        block0: for (int i = 0; i < this.vol; ++i) {
            if (fua_12 != null && fuj_22 != null && i == 0) {
                this.voq[i] = fua_12;
                this.vor[i] = fuj_22;
                this.von[i] = n;
            } else {
                this.vf(this.vom[i]);
                this.voq[i] = new fua_1();
                this.vor[i] = new fuj_2();
                if (this.b(this.voq[i], this.vor[i], null, null) == -1) {
                    this.von[i] = -1L;
                } else {
                    this.von[i] = this.voi;
                    this.voy.clear();
                }
            }
            long l = this.vom[i + 1];
            this.vf(l);
            do {
                int n2;
                if ((n2 = this.g(fuc_22)) != -1) continue;
                this.voq[i].clear();
                this.vor[i].clear();
                continue block0;
            } while (fuc_22.gHK() == -1L);
            this.voo[i] = fuc_22.gHL();
            this.vop[i] = fuc_22.gHK();
        }
    }

    private int gIb() {
        if (this.vot) {
            System.exit(1);
        }
        this.voz.a(this.voq[0]);
        this.voA.a(this.voz);
        this.vot = true;
        return 0;
    }

    int gIc() {
        fua_1 fua_12 = new fua_1();
        fuj_2 fuj_22 = new fuj_2();
        fuc_2 fuc_22 = new fuc_2();
        int[] nArray = new int[1];
        int n = this.b(fua_12, fuj_22, nArray, null);
        int n2 = nArray[0];
        int n3 = (int)this.voi;
        this.voy.clear();
        if (n == -1) {
            return -1;
        }
        if (n < 0) {
            return n;
        }
        this.voh = true;
        fuu_1.a(this.vog, 0L, 2);
        long l = this.voi = fuu_1.ha(this.vog);
        l = this.g(fuc_22);
        if (fuc_22.gHL() != n2) {
            if (this.b(0L, 0L, l + 1L, n2, 0) < 0) {
                this.gHR();
                return -128;
            }
        } else if (this.b(0L, l, l + 1L, n2, 0) < 0) {
            this.gHR();
            return -128;
        }
        this.b(fua_12, fuj_22, n3);
        return 0;
    }

    int gId() {
        this.vol = 1;
        this.voq = new fua_1[this.vol];
        this.voq[0] = new fua_1();
        this.vor = new fuj_2[this.vol];
        this.vor[0] = new fuj_2();
        int[] nArray = new int[1];
        if (this.b(this.voq[0], this.vor[0], nArray, null) == -1) {
            return -1;
        }
        this.vou = nArray[0];
        this.gIb();
        return 0;
    }

    void gIe() {
        this.voy.clear();
        this.voz.clear();
        this.voA.gHR();
        this.vot = false;
        this.vow = 0.0f;
        this.vox = 0.0f;
    }

    int acB(int n) {
        fuc_2 fuc_22 = new fuc_2();
        while (true) {
            fub_2 fub_22;
            int n2;
            if (this.vot && (n2 = this.voy.b(fub_22 = new fub_2())) > 0) {
                long l = fub_22.vhC;
                if (this.voA.c(fub_22) == 0) {
                    int n3 = this.voz.a(null, null);
                    this.voz.a(this.voA);
                    this.vox += (float)(this.voz.a(null, null) - n3);
                    this.vow += (float)(fub_22.vhz * 8);
                    if (l != -1L && fub_22.vhB == 0) {
                        n3 = this.voh ? this.vov : 0;
                        int n4 = this.voz.a(null, null);
                        l -= (long)n4;
                        for (int i = 0; i < n3; ++i) {
                            l += this.vop[i];
                        }
                        this.vos = l;
                    }
                    return 1;
                }
            }
            if (n == 0) {
                return 0;
            }
            if (this.b(fuc_22, -1L) < 0) {
                return 0;
            }
            this.vow += (float)(fuc_22.vhH * 8);
            if (this.vot && this.vou != fuc_22.gHL()) {
                this.gIe();
            }
            if (!this.vot) {
                if (this.voh) {
                    this.vou = fuc_22.gHL();
                    for (var3_4 = 0; var3_4 < this.vol && this.voo[var3_4] != this.vou; ++var3_4) {
                    }
                    if (var3_4 == this.vol) {
                        return -1;
                    }
                    this.vov = var3_4;
                    this.voy.tZ(this.vou);
                    this.voy.gHQ();
                } else {
                    int[] nArray = new int[1];
                    int n5 = this.b(this.voq[0], this.vor[0], nArray, fuc_22);
                    this.vou = nArray[0];
                    if (n5 != 0) {
                        return n5;
                    }
                    ++this.vov;
                    var3_4 = 0;
                }
                this.gIb();
            }
            this.voy.c(fuc_22);
        }
    }

    int gHR() {
        this.voA.gHR();
        this.voz.clear();
        this.voy.clear();
        if (this.voq != null && this.vol != 0) {
            for (int i = 0; i < this.vol; ++i) {
                this.voq[i].clear();
                this.vor[i].clear();
            }
            this.voq = null;
            this.vor = null;
        }
        if (this.von != null) {
            this.von = null;
        }
        if (this.vop != null) {
            this.vop = null;
        }
        if (this.voo != null) {
            this.voo = null;
        }
        if (this.vom != null) {
            this.vom = null;
        }
        this.vok.gHR();
        return 0;
    }

    static int a(InputStream inputStream, long l, int n) {
        if (inputStream instanceof fuv_2) {
            fuv_2 fuv_22 = (fuv_2)inputStream;
            try {
                if (n == 0) {
                    fuv_22.gt(l);
                } else if (n == 2) {
                    fuv_22.gt(fuv_22.aPk() - l);
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
            return 0;
        }
        try {
            if (n == 0) {
                inputStream.reset();
            }
            inputStream.skip(l);
        }
        catch (Exception exception) {
            return -1;
        }
        return 0;
    }

    static long ha(InputStream inputStream) {
        try {
            if (inputStream instanceof fuv_2) {
                fuv_2 fuv_22 = (fuv_2)inputStream;
                return fuv_22.bFV();
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return 0L;
    }

    int a(InputStream inputStream, byte[] byArray, int n) {
        return this.b(inputStream, byArray, n);
    }

    int b(InputStream inputStream, byte[] byArray, int n) {
        int n2;
        this.vog = inputStream;
        this.vok.bkZ();
        if (byArray != null) {
            int n3 = this.vok.act(n);
            System.arraycopy(byArray, 0, this.vok.SY, n3, n);
            this.vok.acu(n);
        }
        if ((n2 = inputStream instanceof fuv_2 ? this.gIc() : this.gId()) != 0) {
            this.vog = null;
            this.gHR();
        }
        return n2;
    }

    public int gIf() {
        return this.vol;
    }

    public boolean gIg() {
        return this.voh;
    }

    public int acC(int n) {
        if (n >= this.vol) {
            return -1;
        }
        if (!this.voh && n != 0) {
            return this.acC(0);
        }
        if (n < 0) {
            long l = 0L;
            for (int i = 0; i < this.vol; ++i) {
                l += (this.vom[i + 1] - this.von[i]) * 8L;
            }
            return (int)Math.rint((float)l / this.acG(-1));
        }
        if (this.voh) {
            return (int)Math.rint((float)((this.vom[n + 1] - this.von[n]) * 8L) / this.acG(n));
        }
        if (this.voq[n].vkW > 0) {
            return this.voq[n].vkW;
        }
        if (this.voq[n].vkV > 0) {
            if (this.voq[n].vkX > 0) {
                return (this.voq[n].vkV + this.voq[n].vkX) / 2;
            }
            return this.voq[n].vkV;
        }
        return -1;
    }

    public int gIh() {
        int n;
        int n2 = n = this.voh ? this.vov : 0;
        if (this.vox == 0.0f) {
            return -1;
        }
        int n3 = (int)((double)(this.vow / this.vox * (float)this.voq[n].vjB) + 0.5);
        this.vow = 0.0f;
        this.vox = 0.0f;
        return n3;
    }

    public int acD(int n) {
        if (n >= this.vol) {
            return -1;
        }
        if (!this.voh && n >= 0) {
            return this.acD(-1);
        }
        if (n < 0) {
            return this.vou;
        }
        return this.voo[n];
    }

    public long acE(int n) {
        if (!this.voh || n >= this.vol) {
            return -1L;
        }
        if (n < 0) {
            long l = 0L;
            for (int i = 0; i < this.vol; ++i) {
                l += this.acE(i);
            }
            return l;
        }
        return this.vom[n + 1] - this.vom[n];
    }

    public long acF(int n) {
        if (!this.voh || n >= this.vol) {
            return -1L;
        }
        if (n < 0) {
            long l = 0L;
            for (int i = 0; i < this.vol; ++i) {
                l += this.acF(i);
            }
            return l;
        }
        return this.vop[n];
    }

    public float acG(int n) {
        if (!this.voh || n >= this.vol) {
            return -1.0f;
        }
        if (n < 0) {
            float f2 = 0.0f;
            for (int i = 0; i < this.vol; ++i) {
                f2 += this.acG(i);
            }
            return f2;
        }
        return (float)this.vop[n] / (float)this.voq[n].vjB;
    }

    public int acH(int n) {
        if (!this.voh) {
            return -1;
        }
        if (n < 0 || (long)n > this.vom[this.vol]) {
            this.vos = -1L;
            this.gIe();
            return -1;
        }
        this.vos = -1L;
        this.gIe();
        this.vf(n);
        switch (this.acB(1)) {
            case 0: {
                this.vos = this.acF(-1);
                return 0;
            }
            case -1: {
                this.vos = -1L;
                this.gIe();
                return -1;
            }
        }
        while (true) {
            switch (this.acB(0)) {
                case 0: {
                    return 0;
                }
                case -1: {
                    this.vos = -1L;
                    this.gIe();
                    return -1;
                }
            }
        }
    }

    public int vg(long l) {
        int n = -1;
        long l2 = this.acF(-1);
        if (!this.voh) {
            return -1;
        }
        if (l < 0L || l > l2) {
            this.vos = -1L;
            this.gIe();
            return -1;
        }
        for (n = this.vol - 1; n >= 0 && l < (l2 -= this.vop[n]); --n) {
        }
        long l3 = l - l2;
        long l4 = this.vom[n + 1];
        long l5 = this.vom[n];
        int n2 = (int)l5;
        fuc_2 fuc_22 = new fuc_2();
        while (l5 < l4) {
            long l6 = l4 - l5 < 8500L ? l5 : (l4 + l5) / 2L;
            this.vf(l6);
            int n3 = this.b(fuc_22, l4 - l6);
            if (n3 == -1) {
                l4 = l6;
                continue;
            }
            long l7 = fuc_22.gHK();
            if (l7 < l3) {
                n2 = n3;
                l5 = this.voi;
                continue;
            }
            l4 = l6;
        }
        if (this.acH(n2) != 0) {
            this.vos = -1L;
            this.gIe();
            return -1;
        }
        if (this.vos >= l) {
            this.vos = -1L;
            this.gIe();
            return -1;
        }
        if (l > this.acF(-1)) {
            this.vos = -1L;
            this.gIe();
            return -1;
        }
        while (this.vos < l) {
            int n4 = (int)(l - this.vos);
            float[][][] fArrayArray = new float[1][][];
            int[] nArray = new int[this.acI((int)-1).vkU];
            int n5 = this.voz.a(fArrayArray, nArray);
            if (n5 > n4) {
                n5 = n4;
            }
            this.voz.acw(n5);
            this.vos += (long)n5;
            if (n5 >= n4 || this.acB(1) != 0) continue;
            this.vos = this.acF(-1);
        }
        return 0;
    }

    int gn(float f2) {
        int n = -1;
        long l = this.acF(-1);
        float f3 = this.acG(-1);
        if (!this.voh) {
            return -1;
        }
        if (f2 < 0.0f || f2 > f3) {
            this.vos = -1L;
            this.gIe();
            return -1;
        }
        for (n = this.vol - 1; n >= 0; --n) {
            l -= this.vop[n];
            if (f2 >= (f3 -= this.acG(n))) break;
        }
        long l2 = (long)((float)l + (f2 - f3) * (float)this.voq[n].vjB);
        return this.vg(l2);
    }

    public long gIi() {
        return this.voi;
    }

    public long gIj() {
        return this.vos;
    }

    public float gIk() {
        int n = -1;
        long l = 0L;
        float f2 = 0.0f;
        if (this.voh) {
            l = this.acF(-1);
            f2 = this.acG(-1);
            for (n = this.vol - 1; n >= 0; --n) {
                f2 -= this.acG(n);
                if (this.vos >= (l -= this.vop[n])) break;
            }
        }
        return f2 + (float)(this.vos - l) / (float)this.voq[n].vjB;
    }

    public fua_1 acI(int n) {
        if (this.voh) {
            if (n < 0) {
                if (this.vot) {
                    return this.voq[this.vov];
                }
                return null;
            }
            if (n >= this.vol) {
                return null;
            }
            return this.voq[n];
        }
        if (this.vot) {
            return this.voq[0];
        }
        return null;
    }

    public fuj_2 acJ(int n) {
        if (this.voh) {
            if (n < 0) {
                if (this.vot) {
                    return this.vor[this.vov];
                }
                return null;
            }
            if (n >= this.vol) {
                return null;
            }
            return this.vor[n];
        }
        if (this.vot) {
            return this.vor[0];
        }
        return null;
    }

    int gIl() {
        return 1;
    }

    int a(byte[] byArray, int n, int n2, int n3, int n4, int[] nArray) {
        int n5 = this.gIl();
        int n6 = 0;
        while (true) {
            if (this.vot) {
                float[][][] fArrayArray = new float[1][][];
                int[] nArray2 = new int[this.acI((int)-1).vkU];
                int n7 = this.voz.a(fArrayArray, nArray2);
                float[][] fArray = fArrayArray[0];
                if (n7 != 0) {
                    int n8 = this.acI((int)-1).vkU;
                    int n9 = n3 * n8;
                    if (n7 > n / n9) {
                        n7 = n / n9;
                    }
                    if (n3 == 1) {
                        int n10 = n4 != 0 ? 0 : 128;
                        for (int i = 0; i < n7; ++i) {
                            for (int j = 0; j < n8; ++j) {
                                int n11 = (int)((double)fArray[j][nArray2[j] + i] * 128.0 + 0.5);
                                if (n11 > 127) {
                                    n11 = 127;
                                } else if (n11 < -128) {
                                    n11 = -128;
                                }
                                byArray[n6++] = (byte)(n11 + n10);
                            }
                        }
                    } else {
                        int n12;
                        int n13 = n12 = n4 != 0 ? 0 : 32768;
                        if (n5 == n2) {
                            if (n4 != 0) {
                                for (int i = 0; i < n8; ++i) {
                                    int n14 = nArray2[i];
                                    int n15 = i;
                                    for (int j = 0; j < n7; ++j) {
                                        int n16 = (int)((double)fArray[i][n14 + j] * 32768.0 + 0.5);
                                        if (n16 > Short.MAX_VALUE) {
                                            n16 = Short.MAX_VALUE;
                                        } else if (n16 < Short.MIN_VALUE) {
                                            n16 = Short.MIN_VALUE;
                                        }
                                        byArray[n15] = (byte)(n16 >>> 8);
                                        byArray[n15 + 1] = (byte)n16;
                                        n15 += n8 * 2;
                                    }
                                }
                            } else {
                                for (int i = 0; i < n8; ++i) {
                                    float[] fArray2 = fArray[i];
                                    int n17 = i;
                                    for (int j = 0; j < n7; ++j) {
                                        int n18 = (int)((double)fArray2[j] * 32768.0 + 0.5);
                                        if (n18 > Short.MAX_VALUE) {
                                            n18 = Short.MAX_VALUE;
                                        } else if (n18 < Short.MIN_VALUE) {
                                            n18 = Short.MIN_VALUE;
                                        }
                                        byArray[n17] = (byte)(n18 + n12 >>> 8);
                                        byArray[n17 + 1] = (byte)(n18 + n12);
                                        n17 += n8 * 2;
                                    }
                                }
                            }
                        } else if (n2 != 0) {
                            for (int i = 0; i < n7; ++i) {
                                for (int j = 0; j < n8; ++j) {
                                    int n19 = (int)((double)fArray[j][i] * 32768.0 + 0.5);
                                    if (n19 > Short.MAX_VALUE) {
                                        n19 = Short.MAX_VALUE;
                                    } else if (n19 < Short.MIN_VALUE) {
                                        n19 = Short.MIN_VALUE;
                                    }
                                    byArray[n6++] = (byte)((n19 += n12) >>> 8);
                                    byArray[n6++] = (byte)n19;
                                }
                            }
                        } else {
                            for (int i = 0; i < n7; ++i) {
                                for (int j = 0; j < n8; ++j) {
                                    int n20 = (int)((double)fArray[j][i] * 32768.0 + 0.5);
                                    if (n20 > Short.MAX_VALUE) {
                                        n20 = Short.MAX_VALUE;
                                    } else if (n20 < Short.MIN_VALUE) {
                                        n20 = Short.MIN_VALUE;
                                    }
                                    byArray[n6++] = (byte)(n20 += n12);
                                    byArray[n6++] = (byte)(n20 >>> 8);
                                }
                            }
                        }
                    }
                    this.voz.acw(n7);
                    this.vos += (long)n7;
                    if (nArray != null) {
                        nArray[0] = this.vov;
                    }
                    return n7 * n9;
                }
            }
            switch (this.acB(1)) {
                case 0: {
                    return 0;
                }
                case -1: {
                    return -1;
                }
            }
        }
    }

    public fua_1[] ceg() {
        return this.voq;
    }

    public fuj_2[] gIm() {
        return this.vor;
    }

    public void close() {
        this.vog.close();
    }
}

