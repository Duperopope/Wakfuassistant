/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class adq
implements ot_1 {
    private static final Logger cjq = Logger.getLogger(adq.class);
    public long aXv;
    public short aXy;
    public int[] cjr;
    public byte[] ayE;
    public boolean bfg;
    public short cjs = (short)-1;

    @Override
    public void a(@NotNull apl_1 apl_12) {
        this.aXv = apl_12.bFQ();
        this.aXy = apl_12.aIz();
        int n = apl_12.aIy() & 0xFF;
        this.cjr = apl_12.mx(n);
        int n2 = apl_12.aIz() & 0xFFFF;
        this.ayE = apl_12.mv(n2);
        this.bfg = apl_12.bFS();
        this.cjs = apl_12.aIz();
    }

    @Override
    public void b(@NotNull fs_0 fs_02) {
        fs_02.cq(this.aXv);
        fs_02.k(this.aXy);
        if (this.cjr == null) {
            fs_02.g((byte)0);
        } else {
            fs_02.g((byte)(this.cjr.length & 0xFF));
            for (int i = 0; i < this.cjr.length; ++i) {
                fs_02.mz(this.cjr[i]);
            }
        }
        fs_02.k((short)(this.ayE.length & 0xFFFF));
        fs_02.di(this.ayE);
        fs_02.ay(this.bfg);
        fs_02.k(this.cjs);
        fs_02.aKW();
    }
}

