/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.common.nio.Buffers
 *  com.jogamp.openal.ALCcontext
 *  com.jogamp.openal.ALException
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import com.jogamp.common.nio.Buffers;
import com.jogamp.openal.ALCcontext;
import com.jogamp.openal.ALException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from aHk
 */
public class ahk_1
implements agc_1,
ahm_1,
ayx_2 {
    protected static final Logger dOT = Logger.getLogger(ahk_1.class);
    protected static final boolean dOU = false;
    protected static final int dOV = 65536;
    protected static final int dOW = 2;
    private long dOX;
    private long beA;
    protected int dOY = 2;
    protected final IntBuffer dOZ = Buffers.newDirectIntBuffer((int)2);
    protected final IntBuffer dPa = Buffers.newDirectIntBuffer((int)1);
    private final ByteBuffer dPb = Buffers.newDirectByteBuffer((int)65536);
    private int dPc;
    private int dPd;
    private int dPe;
    private boolean dPf = true;
    private int dPg;
    private final float[] dPh = new float[3];
    private float cnP = 1.0f;
    private float dNC = 1.0f;
    private float dNd = Float.MAX_VALUE;
    private boolean dPi = false;
    private int dPj = -1;
    private int dPk = 0;
    private int dPl = 0;
    protected volatile ahx_1 dPm;
    private volatile boolean dPn = false;
    private ahu_1 dMu;
    private agk_1 dPo;
    protected volatile float dPp;
    protected volatile float cnK;
    protected volatile float dPq;
    protected volatile float czn;
    protected volatile float cCH;
    protected volatile float dMp;
    protected volatile boolean dPr = false;
    protected volatile boolean dPs = false;
    protected volatile boolean dPt = false;
    protected volatile boolean bVZ = false;
    protected volatile boolean dPu = false;
    protected volatile boolean dPv = false;
    protected volatile boolean cDy = false;
    protected volatile long dPw = 0L;
    protected volatile long dPx = 0L;
    private volatile int cDT;
    private volatile boolean dxk = true;
    private volatile boolean dPy = false;
    private volatile boolean dPz = false;
    private volatile boolean dPA = false;
    private volatile boolean dPB = false;

    @Override
    public long ccq() {
        return this.dOX;
    }

    public void hF(long l) {
        this.dOX = l;
    }

    @Override
    public long aYj() {
        return this.beA;
    }

    public void gc(long l) {
        this.beA = l;
    }

    public byte cbF() {
        if (this.dPo == null) {
            return 0;
        }
        return this.dPo.cbF();
    }

    public void b(ahu_1 ahu_12) {
        this.dMu = ahu_12;
    }

    public agk_1 ccr() {
        return this.dPo;
    }

    public ahx_1 ccs() {
        return this.dPm;
    }

    public boolean cct() {
        return this.dPn;
    }

    public void dW(boolean bl) {
        this.dPn = bl;
    }

    public boolean bBD() {
        return this.cDy;
    }

    public void cy(boolean bl) {
        this.cDy = bl;
    }

    @Override
    public void aVI() {
        this.dPv = false;
        this.dPr = false;
        this.dPs = false;
        this.dPt = false;
        this.bVZ = false;
        this.dMp = 0.0f;
        this.cDy = false;
        this.dPp = 0.0f;
        this.cnK = 1.0f;
        this.dPq = 1.0f;
        this.cCH = 1.0f;
        this.czn = this.cnK;
        this.dPw = 0L;
        this.dPx = 0L;
        this.cDT = 1;
        this.dxk = true;
        this.dPy = false;
        this.dPh[2] = 0.0f;
        this.dPh[1] = 0.0f;
        this.dPh[0] = 0.0f;
        this.cnP = 1.0f;
        this.dNC = 1.0f;
        this.dNd = Float.MAX_VALUE;
        this.dPz = false;
        this.dPk = 0;
        this.dPl = 0;
        this.dPi = false;
        this.dPj = 0;
        this.dOY = 0;
    }

    @Override
    public void aVH() {
        this.bmX();
        if (this.dMu != null) {
            this.dMu.n(this.dPj, this.dOX);
        }
    }

    public int ccu() {
        return this.dPa.get(0);
    }

    public synchronized boolean yd(int n) {
        boolean bl = true;
        try {
            this.dPb.clear();
            int n2 = this.dPm.f(this.dPb, 0);
            boolean bl2 = n2 <= 0;
            n2 = Math.abs(n2);
            if (bl2) {
                if (this.cDy || --this.cDT > 0) {
                    this.dPm.reset();
                    n2 += Math.abs(this.dPm.f(this.dPb, n2));
                } else {
                    bl = false;
                }
            }
            this.dPb.position(0).limit(n2);
            this.dMu.cdq().alBufferData(n, this.dPc, (Buffer)this.dPb, this.dPb.remaining(), this.dPg);
            int n3 = this.ccu();
            if (n3 != 0) {
                this.dMu.cdq().alSourceQueueBuffers(n3, 1, new int[]{n}, 0);
            }
        }
        catch (Exception exception) {
            dOT.error((Object)"Exeption lev\u00e9e", (Throwable)exception);
            return false;
        }
        return bl;
    }

    public synchronized boolean ccv() {
        if (!this.ccw()) {
            return false;
        }
        this.dPz = false;
        if (this.dPk != 0) {
            this.ye(this.dPk);
        }
        if (this.dPl != 0) {
            this.yf(this.dPl);
        }
        this.dO(this.dPv);
        this.dY(this.dPp);
        this.dQ(this.cnK);
        this.dZ(this.dPq);
        this.cI(this.czn);
        this.ec(this.cnP);
        this.ea(this.dNC);
        this.eb(this.dNd);
        if (this.dPm != null) {
            this.dPm.cdI();
        }
        return true;
    }

    private synchronized boolean ccw() {
        block9: {
            while (true) {
                if (this.dPo.xY(this.dPd)) {
                    this.dPe = this.dPd;
                    this.dPf = true;
                    break block9;
                }
                if (this.dMu.xY(this.dPd)) {
                    this.dPe = this.dPd;
                    this.dPf = false;
                    break block9;
                }
                ahk_1 ahk_12 = ahn_1.ccT().ccV();
                if (ahk_12 == null) {
                    dOT.debug((Object)"Il n'y a aucune source \u00e0 lib\u00e9rer, mais on n'arrive pas \u00e0 r\u00e9server de voix");
                    this.dPe = 0;
                    return false;
                }
                if (ahk_12.cbF() <= this.dPo.cbF()) break;
                ahk_12.ccF();
            }
            dOT.debug((Object)"Impossible d'assigner suffisament de voix \u00e0 cette Source.");
            this.dPe = 0;
            return false;
        }
        try {
            this.dOZ.clear();
            this.dMu.cdq().alGenBuffers(this.dOZ.capacity(), this.dOZ);
            this.dMu.cdp();
        }
        catch (ALException aLException) {
            dOT.warn((Object)"Impossible de cr\u00e9er un buffer suppl\u00e9mentaire.", (Throwable)aLException);
            return false;
        }
        try {
            this.dPa.clear();
            this.dMu.cdq().alGenSources(this.dPa.capacity(), this.dPa);
            this.dMu.cdp();
        }
        catch (ALException aLException) {
            dOT.warn((Object)"Impossible de cr\u00e9er une source audio suppl\u00e9mentaire.");
            return false;
        }
        int n = this.ccu();
        if (n != 0) {
            this.dMu.cdq().alSourcei(n, 4103, 0);
            this.dMu.cdq().alSourcei(n, 514, 1);
        }
        return true;
    }

    public synchronized boolean a(ahu_1 ahu_12, agk_1 agk_12, ahx_1 ahx_12) {
        this.dMu = ahu_12;
        this.dPo = agk_12;
        this.dPm = ahx_12;
        if (this.dPm.cdJ() == 1) {
            this.dPd = 1;
            this.dPc = 4353;
        } else {
            this.dPd = 2;
            this.dPc = 4355;
        }
        this.dPg = this.dPm.cdK();
        if (!this.ccw()) {
            return false;
        }
        this.dQ(1.0f);
        this.dY(0.0f);
        this.dM(1.0f);
        this.cI(this.bwE());
        return true;
    }

    public synchronized void ye(int n) {
        this.dPk = n;
        int n2 = this.ccu();
        if (n2 != 0) {
            this.dMu.cdq().alSource3i(n2, 131078, n, 0, 0);
        }
    }

    public synchronized void yf(int n) {
        this.dPl = n;
        int n2 = this.ccu();
        if (n2 != 0) {
            this.dMu.cdq().alSourcei(n2, 131077, this.dPi ? this.dPl : 0);
        }
    }

    public synchronized void dX(boolean bl) {
        if (this.dPi == bl) {
            return;
        }
        this.dPi = bl;
        if (this.dPi) {
            this.dMu.m(this.dPj, this.dOX);
        } else {
            this.dMu.n(this.dPj, this.dOX);
        }
        this.yf(this.dPl);
    }

    public int bpp() {
        return this.dPj;
    }

    public void yg(int n) {
        if (this.dPj == n) {
            return;
        }
        this.dMu.n(this.dPj, this.dOX);
        this.dPj = n;
        this.dMu.m(this.dPj, this.dOX);
    }

    public synchronized void ccx() {
        this.ccy();
        if (this.dPm != null) {
            this.dPm.close();
        }
        this.dPz = true;
    }

    private synchronized void ccy() {
        int n = this.ccu();
        if (n != 0 && this.dMu != null) {
            this.dMu.cdq().alSourceStop(n);
            this.ccz();
            this.dPa.position(0);
            this.dMu.cdq().alDeleteSources(this.dPa.capacity(), this.dPa);
            this.dPa.put(0, 0);
            this.dPa.clear();
        }
        if (this.dMu != null) {
            this.dMu.cdq().alDeleteBuffers(this.dOZ.capacity(), this.dOZ);
            for (int i = 0; i < this.dOZ.capacity(); ++i) {
                this.dOZ.put(i, 0);
            }
            this.dOZ.clear();
        }
        if (this.dPe > 0) {
            if (this.dPf) {
                this.dPo.xZ(this.dPe);
            } else {
                this.dMu.xZ(this.dPe);
            }
            this.dPe = 0;
        }
        this.bVZ = false;
        this.dPu = false;
        this.dPA = false;
        this.dPk = 0;
        this.dPl = 0;
    }

    private synchronized void bmX() {
        this.ccy();
        if (this.dPm != null) {
            this.dPm.close();
            this.dPm.cdO();
            this.dPm = null;
        }
        this.dPe = 0;
        this.dPv = false;
        this.dMp = 0.0f;
        this.czn = this.cnK;
        this.dPq = 1.0f;
        this.dPo = null;
    }

    private synchronized void ccz() {
        int n = this.ccu();
        if (n != 0) {
            int n2 = this.dMu.cS(n, 4117);
            this.dMu.cdq().alSourceUnqueueBuffers(n, n2, this.dOZ);
        }
    }

    public synchronized void ccA() {
        this.bVZ = false;
    }

    public synchronized ahl_1 hG(long l) {
        if (this.dPo == null) {
            return ahl_1.dPD;
        }
        if (this.dPw > 0L && l > this.dPw) {
            this.bhk();
            return ahl_1.dPD;
        }
        if (this.bVZ) {
            return ahl_1.dPD;
        }
        if (this.dPy) {
            return ahl_1.dPE;
        }
        boolean bl = false;
        int n = this.ccu();
        if (!this.dPu) {
            for (int i = 0; i < this.dOZ.capacity(); ++i) {
                if (!this.dxk) continue;
                this.dxk = this.yd(this.dOZ.get(i));
                this.dOY = i;
            }
            this.dPA = true;
            bl = true;
            this.dPu = true;
        } else if (n != 0) {
            int n2 = this.dMu.cS(n, 4118);
            if (n2 > 0) {
                this.dMu.cdq().alSourceUnqueueBuffers(n, n2, this.dOZ);
                for (int i = 0; i < n2; ++i) {
                    int n3 = this.dOZ.get(i);
                    if (!this.dxk) continue;
                    this.dxk = this.yd(n3);
                    this.dPA = true;
                }
                bl = true;
            } else {
                this.dPA = false;
            }
        }
        if (bl && !this.isPlaying() && n != 0) {
            this.dMu.cdq().alSourcePlay(n);
        }
        if (this.dPx > 0L && l > this.dPx) {
            this.dMp = this.czn / (float)(this.dPw - this.dPx);
        }
        if (this.dMp != 0.0f) {
            this.cI(this.czn + this.dMp);
        }
        if (this.dMp < 0.0f && this.czn == this.dPp) {
            this.dMp = 0.0f;
        } else if (this.dMp > 0.0f && this.czn == this.cnK) {
            this.dMp = 0.0f;
        }
        if ((this.dPr || this.dPs || this.dPt) && this.czn == this.dPp) {
            this.dMp = 0.0f;
            if (this.dPr) {
                this.bhk();
                return ahl_1.dPD;
            }
            if (this.dPs) {
                this.bVm();
                return ahl_1.dPE;
            }
            this.ccx();
            return ahl_1.dPF;
        }
        return this.dxk || this.isPlaying() ? ahl_1.dPC : ahl_1.dPD;
    }

    private int ccB() {
        if (this.dPz) {
            return 40964;
        }
        int n = this.ccu();
        if (n != 0) {
            return this.dMu.cS(n, 4112);
        }
        return 4116;
    }

    public synchronized boolean ccC() {
        return this.dPu;
    }

    public synchronized boolean apo() {
        return this.dxk;
    }

    public synchronized boolean bbj() {
        return this.dPz;
    }

    public synchronized boolean ccD() {
        return this.dPo == null;
    }

    public synchronized boolean isPlaying() {
        return this.ccB() == 4114;
    }

    public synchronized void bVm() {
        if (this.dPy) {
            return;
        }
        int n = this.ccB();
        if (n == 4114 || n == 4113 || n == 4115) {
            int n2 = this.ccu();
            if (!this.dPz && n2 != 0) {
                this.dMu.cdq().alSourceStop(n2);
            }
        }
        this.dPy = true;
    }

    public synchronized void ccE() {
        this.dPy = false;
    }

    public synchronized void bhk() {
        int n = this.ccB();
        if (n == 4114 || n == 4113 || n == 4115) {
            int n2 = this.ccu();
            if (!this.dPz && n2 != 0) {
                this.dMu.cdq().alSourceStop(n2);
            }
            this.ccz();
        }
        this.dPu = false;
        this.dxk = true;
        if (this.dPm != null) {
            this.dPm.reset();
        }
    }

    public synchronized void close() {
        if (this.dPm != null) {
            this.dPm.close();
        }
    }

    public synchronized void ccF() {
        this.bmX();
    }

    public void dU(float f2) {
        float f3 = this.bBt();
        this.cI(f3 *= f2);
    }

    public void dV(float f2) {
        float f3 = this.bBt();
        this.dX(f3 *= f2);
    }

    public void ccd() {
        this.cI(this.bBt());
    }

    public void cce() {
        this.dX(this.bBt());
    }

    public synchronized void dO(boolean bl) {
        int n = this.ccu();
        if (!this.dPz && n != 0) {
            this.dMu.cdq().alSourcef(n, 4106, bl ? 0.0f : this.czn * this.cCH);
        }
        this.dPv = bl;
    }

    public synchronized void cI(float f2) {
        this.czn = Math.min(this.cnK, Math.max(this.dPp, f2));
        int n = this.ccu();
        if (!this.dPz && n != 0) {
            float f3 = this.dPv ? 0.0f : this.czn * this.cCH;
            this.dMu.cdq().alSourcef(n, 4106, f3);
        }
    }

    public synchronized void dX(float f2) {
        f2 = Math.min(this.cnK, Math.max(this.dPp, f2));
        int n = this.ccu();
        if (!this.dPz && n != 0) {
            float f3 = this.dPv ? 0.0f : f2 * this.cCH;
            this.dMu.cdq().alSourcef(n, 4106, f3);
        }
    }

    public int ccG() {
        if (this.dPm != null) {
            return this.dPm.ccG();
        }
        return 0;
    }

    @Override
    public float bBt() {
        return this.czn;
    }

    public void dQ(float f2) {
        this.cnK = Math.min(1.0f, Math.max(0.0f, f2));
        if (this.cnK < this.dPp) {
            float f3 = this.cnK;
            this.cnK = this.dPp;
            this.dPp = f3;
        }
        this.cI(this.czn);
    }

    public void dY(float f2) {
        this.dPp = Math.min(1.0f, Math.max(0.0f, f2));
        if (this.cnK < this.dPp) {
            float f3 = this.cnK;
            this.cnK = this.dPp;
            this.dPp = f3;
        }
    }

    public float ccH() {
        return this.dPp;
    }

    public float bwE() {
        return this.cnK;
    }

    public synchronized void dZ(float f2) {
        int n = this.ccu();
        if (!this.dPz && n != 0) {
            this.dMu.cdq().alSourcef(n, 4099, f2);
            this.dPq = f2;
        }
    }

    public float ccI() {
        return this.dPq;
    }

    public float bBA() {
        return this.cCH;
    }

    public void dM(float f2) {
        this.cCH = f2;
        this.cI(this.bBt());
    }

    public synchronized void ea(float f2) {
        this.dNC = f2;
        int n = this.ccu();
        if (!this.dPz && n != 0) {
            this.dMu.cdq().alSourcef(n, 4128, f2);
        }
    }

    public synchronized void eb(float f2) {
        this.dNd = f2;
        int n = this.ccu();
        if (!this.dPz && n != 0) {
            this.dMu.cdq().alSourcef(n, 4131, f2);
        }
    }

    public synchronized void ec(float f2) {
        this.cnP = f2;
        int n = this.ccu();
        if (!this.dPz && n != 0) {
            this.dMu.cdq().alSourcef(n, 4129, f2);
        }
    }

    public synchronized void a(acp_1 acp_12) {
        this.dPh[0] = acp_12.aSc();
        this.dPh[1] = acp_12.aSd();
        this.dPh[2] = acp_12.aSe();
        int n = this.ccu();
        if (!this.dPz && n != 0) {
            this.dMu.cdq().alSource3f(n, 4100, this.dPh[0], this.dPh[1], this.dPh[2]);
        }
    }

    public synchronized void r(float f2, float f3, float f4) {
        this.dPh[0] = f2;
        this.dPh[1] = f3;
        this.dPh[2] = f4;
        int n = this.ccu();
        if (!this.dPz && n != 0) {
            this.dMu.cdq().alSource3f(n, 4100, this.dPh[0], this.dPh[1], this.dPh[2]);
            try {
                this.dMu.cdp();
            }
            catch (ALException aLException) {
                dOT.error((Object)"Exception during setPosition", (Throwable)aLException);
            }
        }
    }

    public long ccJ() {
        if (this.dPm == null) {
            return -1L;
        }
        return this.dPm.ccJ();
    }

    public synchronized int hH(long l) {
        if (this.dPm == null) {
            return -1;
        }
        return this.dPm.hH(l);
    }

    public synchronized long dY(boolean bl) {
        if (this.dPm == null || this.dPz) {
            return -1L;
        }
        long l = this.dPm.ccK();
        int n = this.ccu();
        if (bl && n != 0) {
            IntBuffer intBuffer = Buffers.newDirectIntBuffer((int)1);
            this.dMu.cdq().alGetSourcei(n, 4117, intBuffer);
            int n2 = intBuffer.get(0);
            intBuffer.clear();
            return this.dPm.ccK() - (long)(65536 / this.dPm.cdL() * n2);
        }
        return l;
    }

    public long ccK() {
        return this.dY(true);
    }

    public synchronized int hI(long l) {
        if (this.dPm == null) {
            return -1;
        }
        return this.dPm.hI(l);
    }

    public float ccL() {
        if (this.dPm == null) {
            return 0.0f;
        }
        return this.dPm.ccL();
    }

    public synchronized int ed(float f2) {
        if (this.dPm == null) {
            return -1;
        }
        return this.dPm.ed(f2);
    }

    public boolean ccM() {
        return this.dPA;
    }

    public void ee(float f2) {
        this.dPr = true;
        this.eh(f2);
    }

    public void ef(float f2) {
        this.dPs = true;
        this.eh(f2);
    }

    public void eg(float f2) {
        this.dMp = f2;
    }

    @Override
    public void br(float f2, float f3) {
        float f4 = f2 - this.bBt();
        if (f4 > 0.0f && this.bwE() > f2 || f4 < 0.0f && this.bwE() < f2) {
            this.dQ(f2);
        }
        if (f3 > 0.0f) {
            this.dMp = f4 * 10.0f / f3;
        } else {
            this.cI(f2);
        }
    }

    public void eh(float f2) {
        this.dMp = -f2;
    }

    public void hJ(long l) {
        this.dPw = l;
    }

    public void hK(long l) {
        this.dPx = l;
    }

    public void yh(int n) {
        this.cDT = n;
    }

    public void dZ(boolean bl) {
        this.dPr = bl;
    }

    public void ea(boolean bl) {
        this.dPs = bl;
    }

    public void eb(boolean bl) {
        this.dPt = bl;
    }

    public boolean ccN() {
        return this.dPr;
    }

    public boolean ccO() {
        return this.dPs;
    }

    public boolean ccP() {
        return this.dPt;
    }

    public String getDescription() {
        if (this.dPm == null) {
            return null;
        }
        return "URL : " + this.dPm.getDescription();
    }

    public String ccQ() {
        if (this.dPm == null) {
            return null;
        }
        return this.dPm.ccQ();
    }

    public long ccR() {
        if (this.dPm == null) {
            return -1L;
        }
        return Bw.p(this.dPm.ccQ());
    }

    public synchronized void a(@Nullable ALCcontext aLCcontext) {
        if (this.isPlaying() || !this.dPy) {
            this.bVm();
            this.dPB = true;
        }
        this.ccy();
    }

    public synchronized void b(@Nullable ALCcontext aLCcontext) {
        this.ccv();
        if (this.dPB) {
            this.ccE();
            this.dPB = false;
        }
    }

    public String toString() {
        if (this.dPm == null) {
            return "No stream available for " + super.toString();
        }
        return "URL : " + this.dPm.getDescription() + "\n\tSample Rate : " + this.dPm.cdK() + "Hz\n\tChannels : " + this.dPm.cdJ();
    }
}

