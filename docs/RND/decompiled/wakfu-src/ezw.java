/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public class ezw
implements gq_0<vy_1> {
    private static final Logger prO = Logger.getLogger(ezw.class);
    private short prP;
    private eyi prQ = null;
    private String p = "";
    private int poU;
    private long prR;
    private short ejt;
    private byte bin = (byte)-1;
    private byte ebP = (byte)-1;
    private long prS = -1L;
    private abi_1 bmk = abi_1.dzt;
    private boolean prT;

    public ezw() {
    }

    public ezw(short s, String string, int n, short s2) {
        this.prP = s;
        this.p = string;
        this.poU = n;
        this.prR = -1L;
        this.ejt = s2;
    }

    public void lM(long l) {
        this.prR = l;
    }

    public int fmi() {
        return this.poU;
    }

    public String getName() {
        return this.p;
    }

    public void setName(String string) {
        this.p = string;
    }

    public short doG() {
        return this.prP;
    }

    public short cmL() {
        return this.ejt;
    }

    public void bw(short s) {
        this.ejt = s;
    }

    public long fmB() {
        return this.prR;
    }

    public void a(eyi eyi2) {
        this.prQ = eyi2;
    }

    @Nullable
    public eyi fmC() {
        return this.prQ;
    }

    public short fmD() {
        if (this.prQ != null) {
            return this.prQ.cqA();
        }
        return 0;
    }

    public short fmE() {
        if (this.prQ != null) {
            return this.prQ.cqz();
        }
        return 0;
    }

    public void N(byte by) {
        this.bin = by;
    }

    public void a(abi_1 abi_12) {
        this.bmk = abi_12;
    }

    public abi_1 bcB() {
        return this.bmk;
    }

    public long fmF() {
        return this.prS;
    }

    public final void pw(long l) {
        this.prS = l;
    }

    public byte aWO() {
        return 0;
    }

    public byte bcP() {
        return this.ebP;
    }

    public void az(byte by) {
        this.ebP = by;
    }

    public boolean dOn() {
        return this.prT;
    }

    public void lr(boolean bl) {
        this.prT = bl;
    }

    public void a(exP exP2, exP exP3) {
        exP2.a(this);
        if (this.poU > 0) {
            exP2.e(exx_2.rGi).op(this.poU);
        }
        this.b(exP2, exP3);
        exP2.setName(this.p);
        exP2.N(this.bin);
        if (exP3.a(ezj_0.pta)) {
            exP2.f(ezj_0.pta);
        }
    }

    private void b(exP exP2, exP exP3) {
        boolean bl = ((eyi)exP2.doV()).c(exe_1.rEC);
        if (bl && exP3.a(exx_2.rGw)) {
            exP2.e(exx_2.rGw).nt(exP3.c(exx_2.rGw));
        }
    }

    @Override
    public boolean a(vy_1 vy_12) {
        vy_12.clear();
        vy_12.afz = this.prP;
        vy_12.Vk = this.p;
        vy_12.afA = this.poU;
        vy_12.afB = this.prR;
        vy_12.Tv = this.bin;
        vy_12.afE = this.bmk.dzy;
        vy_12.afF = this.prS;
        vy_12.Xr = this.ejt;
        vy_12.afG = this.prT;
        return true;
    }

    @Override
    public boolean b(vy_1 vy_12) {
        this.prP = vy_12.afz;
        this.p = vy_12.Vk;
        this.poU = vy_12.afA;
        this.prR = vy_12.afB;
        this.bin = vy_12.Tv;
        this.bmk = abi_1.wG(vy_12.afE);
        this.prS = vy_12.afF;
        this.ejt = vy_12.Xr;
        this.prT = vy_12.afG;
        return true;
    }

    public String toString() {
        return "BasicInvocationCharacteristics{m_breed=" + String.valueOf(this.prQ) + ", m_typeId=" + this.prP + ", m_name='" + this.p + "', m_currentHp=" + this.poU + ", m_summonId=" + this.prR + ", m_level=" + this.ejt + "}";
    }

    public void clean() {
    }
}

