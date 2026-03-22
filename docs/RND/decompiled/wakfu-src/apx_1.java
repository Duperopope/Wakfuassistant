/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import java.util.zip.CRC32;
import org.apache.log4j.Logger;

/*
 * Renamed from apX
 */
public abstract class apx_1 {
    protected static final Logger cPB = Logger.getLogger(apx_1.class);
    private static final CRC32 cPC = new CRC32();
    private int cPD;
    private short cPE;
    private long cPF = System.currentTimeMillis();
    private long cPG = Long.MAX_VALUE;
    private boolean cPH = false;
    private final boolean cPI;

    private apx_1() {
        this.cPI = false;
    }

    protected apx_1(short s) {
        this();
        this.cPE = s;
    }

    public int bGh() {
        return this.cPD;
    }

    public void tz(int n) {
        this.cPD = n;
    }

    public short bGi() {
        return this.cPE;
    }

    public void aB(short s) {
        this.cPE = s;
    }

    public long dy(byte[] byArray) {
        long l;
        if (byArray != null && byArray.length > 0) {
            cPC.reset();
            cPC.update(byArray);
            l = cPC.getValue();
        } else {
            l = 0L;
        }
        return l;
    }

    public final void bGj() {
        if (!this.cPI) {
            if (this.cPG < Long.MAX_VALUE) {
                this.cPH = true;
            }
        } else {
            cPB.error((Object)("toggleModified sur un BinaryStorable flagg\u00e9 UNUSED " + this.bGh()));
        }
    }

    public abstract int aFS();

    public abstract byte[] aFR();

    public abstract void a(ByteBuffer var1, int var2, short var3);

    public abstract apx_1 aFN();

    public long bGk() {
        return this.cPG;
    }

    public void gu(long l) {
        this.cPG = l;
    }

    public boolean bGl() {
        return this.cPH;
    }

    public long bGm() {
        return this.cPF;
    }

    public void a(aps_1 aps_12) {
        aps_12.a(apv_1.cPq, (Object)this);
        this.cPH = false;
        this.cPF = System.currentTimeMillis();
    }

    public void b(aps_1 aps_12) {
        aps_12.a(apv_1.cPp, (Object)this);
        this.cPH = false;
        this.cPF = System.currentTimeMillis();
    }

    public boolean bGn() {
        return this.cPI;
    }

    public String toString() {
        return "Bstorable type:" + this.aFS() + ", id:" + this.bGh() + ", version:" + this.bGi();
    }
}

