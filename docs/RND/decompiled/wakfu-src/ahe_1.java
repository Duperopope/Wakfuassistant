/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.log4j.Logger;

/*
 * Renamed from aHE
 */
public class ahe_1
implements ahx_1 {
    protected static final Logger dRr = Logger.getLogger(ahe_1.class);
    private static final int dRs = 8500;
    private static final int dRt = 0;
    private static final int dRu = 1;
    private static final int dRv = -1;
    private static final int dRw = -2;
    private static final int dRx = -128;
    private static final int dRy = -129;
    private static final int dRz = -130;
    private int dRA;
    private boolean dRB = true;
    private final AtomicInteger dRC = new AtomicInteger(0);
    private int dRD = 8500;
    private boolean dRE = false;
    private static final boolean dRF = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    private fue_2 dRG;
    private fud_2 dRH;
    private fuc_2 dRI;
    private fub_2 dRJ;
    private fum_1 dRK;
    private fuf_1 dRL;
    private int dRM = 0;
    private long aBo;
    private long[] dRN;
    private long[] dRO;
    private int[] dRP;
    private long[] dRQ;
    private fua_1[] dRR;
    private fuj_2[] dRS;
    private long dRT;
    private boolean dRU = false;
    private int dRV;
    private int dRW;
    private ahz_1 dRX;
    private float dRY;
    public static final int dRZ = 8192;
    private final byte[] dSa = new byte[8192];
    private final float[][][] dSb = new float[1][][];
    private final int[] dSc = new int[2];

    @Override
    public String getDescription() {
        return this.dRX.getDescription();
    }

    @Override
    public String ccQ() {
        return this.dRX.ccQ();
    }

    private boolean ceb() {
        fua_1 fua_12 = new fua_1();
        fuj_2 fuj_22 = new fuj_2();
        this.dRD = Math.min(8500, (int)ahe_1.c(this.dRX));
        fuc_2 fuc_22 = new fuc_2();
        int[] nArray = new int[1];
        int n = this.a(fua_12, fuj_22, nArray, null);
        int n2 = nArray[0];
        int n3 = (int)this.aBo;
        this.dRH.clear();
        if (n < 0) {
            return false;
        }
        ahe_1.a(this.dRX, 0L, 1);
        this.aBo = ahe_1.d(this.dRX);
        long l = this.a(fuc_22);
        if (fuc_22.gHL() != n2 ? this.a(0L, 0L, l + 1L, n2, 0) < 0 : this.a(0L, l, l + 1L, n2, 0) < 0) {
            return false;
        }
        this.a(fua_12, fuj_22, n3);
        this.hH(this.dRO[0]);
        return true;
    }

    private boolean cec() {
        this.dRM = 1;
        this.dRR = new fua_1[]{new fua_1()};
        this.dRS = new fuj_2[]{new fuj_2()};
        int[] nArray = new int[1];
        if (this.a(this.dRR[0], this.dRS[0], nArray, null) == -1) {
            return false;
        }
        this.dRV = nArray[0];
        this.cee();
        return true;
    }

    private int ced() {
        int n;
        int n2 = this.dRG.act(this.dRD);
        if (n2 == -1) {
            dRr.debug((Object)("Stream corrompu : " + this.getDescription()));
            return -128;
        }
        byte[] byArray = this.dRG.SY;
        try {
            n = this.dRX.read(byArray, n2, this.dRD);
        }
        catch (Exception exception) {
            return -128;
        }
        this.dRG.acu(n);
        if (n == -1) {
            n = 0;
        }
        return n;
    }

    private void cee() {
        this.dRK.a(this.dRR[0]);
        this.dRL.a(this.dRK);
        this.dRU = true;
    }

    private void cef() {
        this.dRH.clear();
        this.dRK.clear();
        this.dRL.gHR();
        this.dRU = false;
    }

    private int a(fuc_2 fuc_22, long l) {
        int n;
        int n2;
        block6: {
            if (l > 0L) {
                l += this.aBo;
            }
            while (true) {
                if (l > 0L && this.aBo >= l) {
                    return -1;
                }
                n2 = this.dRG.f(fuc_22);
                if (n2 < 0) {
                    this.aBo -= (long)n2;
                    continue;
                }
                if (n2 != 0) break block6;
                if (l == 0L) {
                    return -1;
                }
                n = this.ced();
                if (n == 0) {
                    return -2;
                }
                if (n < 0) break;
            }
            return -128;
        }
        n = (int)this.aBo;
        this.aBo += (long)n2;
        return n;
    }

    private int a(fuc_2 fuc_22) {
        int n;
        long l = this.aBo;
        int n2 = -1;
        while (n2 == -1) {
            if ((l -= (long)this.dRD) < 0L) {
                l = 0L;
            }
            this.hS(l);
            while (this.aBo < l + (long)this.dRD) {
                n = this.a(fuc_22, l + (long)this.dRD - this.aBo);
                if (n == -128) {
                    return -128;
                }
                if (n < 0) {
                    if (n2 != -1) continue;
                    return -1;
                }
                n2 = n;
            }
        }
        this.hS(n2);
        n = this.a(fuc_22, this.dRD);
        if (n < 0) {
            return -129;
        }
        return n2;
    }

    private void hS(long l) {
        ahe_1.a(this.dRX, l, 0);
        this.aBo = l;
        this.dRG.gHQ();
    }

    private int a(long l, long l2, long l3, int n, int n2) {
        int n3;
        long l4 = l3;
        long l5 = l3;
        fuc_2 fuc_22 = new fuc_2();
        while (l2 < l4) {
            long l6 = l4 - l2 < (long)this.dRD ? l2 : (l2 + l4) / 2L;
            this.hS(l6);
            n3 = this.a(fuc_22, -1L);
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
        this.hS(l5);
        n3 = this.a(fuc_22, -1L);
        if (n3 == -128) {
            return -128;
        }
        if (l2 >= l3 || n3 == -1) {
            this.dRM = n2 + 1;
            this.dRN = new long[n2 + 2];
            this.dRN[n2 + 1] = l2;
        } else {
            n3 = this.a(l5, this.aBo, l3, fuc_22.gHL(), n2 + 1);
            if (n3 == -128) {
                return -128;
            }
        }
        this.dRN[n2] = l;
        return 0;
    }

    public int a(fua_1 fua_12, fuj_2 fuj_22, int[] nArray, fuc_2 fuc_22) {
        if (fuc_22 == null) {
            fuc_22 = new fuc_2();
            int n = this.a(fuc_22, this.dRD);
            if (n == -128) {
                return -128;
            }
            if (n < 0) {
                return -130;
            }
        }
        if (nArray != null) {
            nArray[0] = fuc_22.gHL();
        }
        this.dRH.tZ(fuc_22.gHL());
        fua_12.bkZ();
        fuj_22.bkZ();
        fub_2 fub_22 = new fub_2();
        int n = 0;
        while (n < 3) {
            int n2;
            this.dRH.c(fuc_22);
            while (n < 3 && (n2 = this.dRH.b(fub_22)) != 0) {
                if (n2 == -1) {
                    fua_12.clear();
                    this.dRH.clear();
                    return -1;
                }
                if (fua_12.a(fuj_22, fub_22) != 0) {
                    fua_12.clear();
                    this.dRH.clear();
                    return -1;
                }
                ++n;
            }
            if (n >= 3 || this.a(fuc_22, 1L) >= 0) continue;
            fua_12.clear();
            this.dRH.clear();
            return -1;
        }
        return 0;
    }

    public fua_1[] ceg() {
        return this.dRR;
    }

    private void a(fua_1 fua_12, fuj_2 fuj_22, int n) {
        fuc_2 fuc_22 = new fuc_2();
        this.dRR = new fua_1[this.dRM];
        this.dRS = new fuj_2[this.dRM];
        this.dRO = new long[this.dRM];
        this.dRQ = new long[this.dRM];
        this.dRP = new int[this.dRM];
        block0: for (int i = 0; i < this.dRM; ++i) {
            if (fua_12 != null && fuj_22 != null && i == 0) {
                this.dRR[i] = fua_12;
                this.dRS[i] = fuj_22;
                this.dRO[i] = n;
            } else {
                this.hS(this.dRN[i]);
                this.dRR[i] = new fua_1();
                this.dRS[i] = new fuj_2();
                if (this.a(this.dRR[i], this.dRS[i], null, null) == -1) {
                    this.dRO[i] = -1L;
                } else {
                    this.dRO[i] = this.aBo;
                    this.dRH.clear();
                }
            }
            long l = this.dRN[i + 1];
            this.hS(l);
            do {
                int n2;
                if ((n2 = this.a(fuc_22)) != -1) continue;
                this.dRR[i].clear();
                continue block0;
            } while (fuc_22.gHK() == -1L);
            this.dRP[i] = fuc_22.gHL();
            this.dRQ[i] = fuc_22.gHK();
        }
    }

    @Override
    public boolean cdI() {
        return this.b(this.dRX);
    }

    @Override
    public boolean b(ahz_1 ahz_12) {
        boolean bl;
        this.dRX = ahz_12;
        try {
            this.dRX.cdQ();
        }
        catch (IOException iOException) {
            dRr.info((Object)("Probl\u00e8me \u00e0 l'ouverture du stream " + ahz_12.getDescription()));
            try {
                this.dRX.close();
            }
            catch (IOException iOException2) {
                dRr.info((Object)("Probl\u00e8me au nettoyage du stream " + ahz_12.getDescription()));
            }
            return false;
        }
        this.aBo = 0L;
        boolean bl2 = bl = this.dRI != null;
        if (bl) {
            assert (this.dRJ != null && this.dRG != null && this.dRH != null && this.dRK != null && this.dRL != null);
            this.dRI.eIm();
            this.dRJ.eIm();
            this.dRG.eIm();
            this.dRH.eIm();
            this.dRK = new fum_1();
            this.dRL.a(this.dRK);
        } else {
            assert (this.dRJ == null && this.dRG == null && this.dRH == null && this.dRK == null && this.dRL == null);
            this.dRI = new fuc_2();
            this.dRJ = new fub_2();
            this.dRG = new fue_2();
            this.dRH = new fud_2();
            this.dRK = new fum_1();
            this.dRL = new fuf_1(this.dRK);
        }
        if (ahz_12.cdR()) {
            return this.ceb();
        }
        return this.cec();
    }

    private int eh(boolean bl) {
        while (true) {
            int n;
            if (this.dRU && (n = this.dRH.b(this.dRJ)) > 0) {
                long l = this.dRJ.vhC;
                if (this.dRL.c(this.dRJ) == 0) {
                    this.dRK.a(this.dRL);
                    if (l != -1L) {
                        int n2 = this.dRX.cdR() ? this.dRW : 0;
                        int n3 = this.dRK.a(null, null);
                        l = Math.max(0L, l - (long)n3);
                        for (int i = 0; i < n2; ++i) {
                            l += this.dRQ[i];
                        }
                        this.dRT = l;
                    }
                    return 1;
                }
            }
            if (!bl) {
                return 0;
            }
            if (this.a(this.dRI, -1L) < 0) {
                return 0;
            }
            if (this.dRU && this.dRV != this.dRI.gHL()) {
                this.cef();
            }
            if (!this.dRU) {
                if (this.dRX.cdR()) {
                    this.dRV = this.dRI.gHL();
                    for (n = 0; n < this.dRM && this.dRP[n] != this.dRV; ++n) {
                    }
                    if (n == this.dRM) {
                        return -1;
                    }
                    this.dRW = n;
                    this.dRH.tZ(this.dRV);
                    this.dRH.gHQ();
                } else {
                    int[] nArray = new int[1];
                    int n4 = this.a(this.dRR[0], this.dRS[0], nArray, this.dRI);
                    this.dRV = nArray[0];
                    if (n4 != 0) {
                        return n4;
                    }
                    ++this.dRW;
                }
                this.cee();
            }
            this.dRH.c(this.dRI);
        }
    }

    public long yq(int n) {
        if (!this.dRX.cdR() || n >= this.dRM) {
            return -1L;
        }
        if (n < 0) {
            long l = 0L;
            for (int i = 0; i < this.dRM; ++i) {
                l += this.yq(i);
            }
            return l;
        }
        return this.dRN[n + 1] - this.dRN[n];
    }

    public long yr(int n) {
        if (!this.dRX.cdR() || n >= this.dRM) {
            return -1L;
        }
        if (n < 0) {
            long l = 0L;
            for (int i = 0; i < this.dRM; ++i) {
                l += this.yr(i);
            }
            return l;
        }
        return this.dRQ[n];
    }

    public long ceh() {
        if (!this.dRX.cdR()) {
            return -1L;
        }
        long l = 0L;
        for (int i = 0; i < this.dRM; ++i) {
            l += this.dRQ[i] * (long)this.dRR[i].vkU * 2L;
        }
        return l;
    }

    public float ys(int n) {
        if (!this.dRX.cdR() || n >= this.dRM) {
            return -1.0f;
        }
        if (n < 0) {
            if (this.dRY == 0.0f) {
                for (int i = 0; i < this.dRM; ++i) {
                    this.dRY += this.ys(i);
                }
            }
            return this.dRY;
        }
        return (float)this.dRQ[n] / (float)this.dRR[n].vjB;
    }

    @Override
    public int hH(long l) {
        if (!this.dRX.cdR()) {
            return -1;
        }
        this.dRT = -1L;
        this.cef();
        if (l < 0L || l > this.dRN[this.dRM]) {
            return -1;
        }
        this.hS(l);
        switch (this.eh(true)) {
            case 0: {
                this.dRT = this.yr(-1);
                return 0;
            }
            case -1: {
                this.dRT = -1L;
                this.cef();
                return -1;
            }
        }
        while (true) {
            switch (this.eh(false)) {
                case 0: {
                    return 0;
                }
                case -1: {
                    this.dRT = -1L;
                    this.cef();
                    return -1;
                }
            }
        }
    }

    @Override
    public int hI(long l) {
        int n;
        if (!this.dRX.cdR()) {
            return -1;
        }
        long l2 = this.yr(-1);
        if (l < 0L || l > l2) {
            this.dRT = -1L;
            this.cef();
            return -1;
        }
        for (n = this.dRM - 1; n >= 0 && l < (l2 -= this.dRQ[n]); --n) {
        }
        long l3 = l - l2;
        long l4 = this.dRN[n + 1];
        long l5 = this.dRN[n];
        int n2 = (int)l5;
        fuc_2 fuc_22 = new fuc_2();
        while (l5 < l4) {
            long l6 = l4 - l5 < (long)this.dRD ? l5 : (l4 + l5) / 2L;
            this.hS(l6);
            int n3 = this.a(fuc_22, l4 - l6);
            if (n3 == -1) {
                l4 = l6;
                continue;
            }
            long l7 = fuc_22.gHK();
            if (l7 < l3) {
                n2 = n3;
                l5 = this.aBo;
                continue;
            }
            l4 = l6;
        }
        if (this.hH(n2) != 0) {
            this.dRT = -1L;
            this.cef();
            return -1;
        }
        if (this.dRT >= l) {
            this.dRT = -1L;
            this.cef();
            return -1;
        }
        if (l > this.yr(-1)) {
            this.dRT = -1L;
            this.cef();
            return -1;
        }
        while (this.dRT < l) {
            int n4 = (int)(l - this.dRT);
            int[] nArray = new int[this.dRR[this.dRW].vkU];
            int n5 = this.dRK.a(this.dSb, nArray);
            if (n5 > n4) {
                n5 = n4;
            }
            this.dRK.acw(n5);
            this.dRT += (long)n5;
            if (n5 >= n4 || this.eh(true) != 0) continue;
            this.dRT = this.yr(-1);
        }
        return 0;
    }

    @Override
    public int ed(float f2) {
        int n;
        if (!this.dRX.cdR()) {
            return -1;
        }
        long l = this.yr(-1);
        float f3 = this.ys(-1);
        if (f2 < 0.0f || f2 > f3) {
            this.dRT = -1L;
            this.cef();
            return -1;
        }
        for (n = this.dRM - 1; n >= 0; --n) {
            l -= this.dRQ[n];
            if (f2 >= (f3 -= this.ys(n))) break;
        }
        long l2 = (long)((float)l + (f2 - f3) * (float)this.dRR[n].vjB);
        return this.hI(l2);
    }

    @Override
    public long ccJ() {
        return this.aBo;
    }

    @Override
    public long ccK() {
        return this.dRT;
    }

    @Override
    public float ccL() {
        if (this.dRM < 1) {
            return 0.0f;
        }
        float f2 = 0.0f;
        long l = 0L;
        int n = -1;
        if (this.dRX.cdR()) {
            l = this.yr(-1);
            f2 = this.ys(-1);
            for (n = this.dRM - 1; n >= 0; --n) {
                f2 -= this.ys(n);
                if (this.dRT >= (l -= this.dRQ[n])) break;
            }
        }
        return f2 + (float)(this.dRT - l) / (float)this.dRR[n].vjB;
    }

    @Override
    public int f(ByteBuffer byteBuffer, int n) {
        this.dRB = false;
        byteBuffer.position(n);
        while (byteBuffer.remaining() > 0) {
            boolean bl = true;
            if (this.dRU) {
                fua_1 fua_12 = this.dRR[this.dRW];
                int n2 = this.dRK.a(this.dSb, this.dSc);
                float[][] fArray = this.dSb[0];
                if (n2 > 0) {
                    int n3;
                    int n4 = fua_12.vkU;
                    int n5 = n4 * 2;
                    int n6 = Math.min(n2, byteBuffer.remaining() / n5);
                    bl = (n6 = Math.min(n6, 8192 / n5)) == n2;
                    for (n3 = 0; n3 < n4; ++n3) {
                        int n7 = n3 * 2;
                        int n8 = this.dSc[n3];
                        for (int i = 0; i < n6; ++i) {
                            int n9 = (int)(fArray[n3][n8 + i] * 32767.0f);
                            if (n9 > Short.MAX_VALUE) {
                                n9 = Short.MAX_VALUE;
                            }
                            if (n9 < Short.MIN_VALUE) {
                                n9 = Short.MIN_VALUE;
                            }
                            if (n9 < 0) {
                                n9 |= 0x8000;
                            }
                            if (dRF) {
                                this.dSa[n7] = (byte)(n9 >>> 8 & 0xFF);
                                this.dSa[n7 + 1] = (byte)(n9 & 0xFF);
                            } else {
                                this.dSa[n7] = (byte)(n9 & 0xFF);
                                this.dSa[n7 + 1] = (byte)(n9 >>> 8 & 0xFF);
                            }
                            n7 += 2 * n4;
                        }
                    }
                    n3 = n6 * n5;
                    byteBuffer.put(this.dSa, 0, n3);
                    this.dRK.acw(n6);
                    this.dRT += (long)n6;
                }
            }
            if (!bl) continue;
            switch (this.eh(true)) {
                case 0: {
                    return -(byteBuffer.position() - n);
                }
                case -1: {
                    return -(byteBuffer.position() - n);
                }
            }
        }
        return byteBuffer.position() - n;
    }

    @Override
    public int cdL() {
        return this.dRR[this.dRW].vkU * 2;
    }

    @Override
    public int cdJ() {
        return this.dRR[0].vkU;
    }

    @Override
    public int cdK() {
        return this.dRR[0].vjB;
    }

    @Override
    public void eg(boolean bl) {
        this.dRE = bl;
    }

    @Override
    public int ccG() {
        return (int)(this.ys(-1) * 1000.0f);
    }

    public void cei() {
        if (this.dRX.cdR()) {
            this.hH(this.dRO[0]);
        } else {
            this.reset();
        }
    }

    @Override
    public void close() {
        if (this.dRX != null) {
            try {
                this.dRX.close();
            }
            catch (IOException iOException) {
                dRr.error((Object)("Impossible de fermer le flux pour le stream " + this.dRX.getDescription()));
            }
        }
    }

    @Override
    public void reset() {
        if (!this.dRB) {
            if (this.dRX.cdR()) {
                this.hH(this.dRO[0]);
            } else {
                this.dRH.clear();
                this.dRL.gHR();
                this.dRK.clear();
                if (this.dRR != null) {
                    for (fua_1 fua_12 : this.dRR) {
                        fua_12.clear();
                    }
                }
                this.dRG.gHR();
                try {
                    if (this.dRX != null) {
                        this.dRX.reset();
                    }
                }
                catch (Exception exception) {
                    dRr.error((Object)"Exception during reset", (Throwable)exception);
                }
                this.dRM = 0;
                this.aBo = 0L;
                this.dRN = null;
                this.dRO = null;
                this.dRP = null;
                this.dRQ = null;
                this.dRR = null;
                this.dRS = null;
                this.dRT = 0L;
                this.dRU = false;
                this.dRV = 0;
                this.dRW = 0;
                this.b(this.dRX);
            }
            this.dRB = true;
        }
    }

    @Override
    public int aXY() {
        return this.dRA;
    }

    @Override
    public void yp(int n) {
        this.dRA = n;
    }

    @Override
    public int cdM() {
        return this.dRC.get();
    }

    @Override
    public void cdN() {
        this.dRC.incrementAndGet();
    }

    @Override
    public void cdO() {
        this.dRC.decrementAndGet();
    }

    public String toString() {
        return this.getClass().getSimpleName() + " : url=" + this.dRX.getDescription();
    }

    private static long c(ahz_1 ahz_12) {
        if (!ahz_12.cdR()) {
            return -1L;
        }
        try {
            return ahz_12.bFH();
        }
        catch (IOException iOException) {
            dRr.debug((Object)"Probl\u00e8me lors du length() sur le stream !", (Throwable)iOException);
            return -1L;
        }
    }

    private static int a(ahz_1 ahz_12, long l, int n) {
        if (!ahz_12.cdR()) {
            return -1;
        }
        try {
            if (n == 0) {
                ahz_12.gt(l);
            } else if (n == 1) {
                ahz_12.gt(ahz_12.bFH() - l);
            }
            return 0;
        }
        catch (IOException iOException) {
            dRr.debug((Object)"Probl\u00e8me lors du seek sur le stream !", (Throwable)iOException);
            return -1;
        }
    }

    private static long d(ahz_1 ahz_12) {
        if (!ahz_12.cdR()) {
            return 0L;
        }
        try {
            return ahz_12.bFV();
        }
        catch (IOException iOException) {
            dRr.debug((Object)"Probl\u00e8me lors du tell sur le stream !", (Throwable)iOException);
            return 0L;
        }
    }

    public fuj_2 cej() {
        if (this.dRS == null || this.dRS.length == 0) {
            return null;
        }
        return this.dRS[0];
    }
}

