/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class adG
extends os_1 {
    private static final Logger ckt = Logger.getLogger(adG.class);
    agw_1 cku;
    int cip;

    public adG() {
    }

    public adG(byte by, byte by2, short s, int n) {
        super(by, by2, s);
        this.cip = n;
    }

    public adG(adG adG2) {
        super(adG2);
        this.cip = adG2.cip;
    }

    @Override
    public void a(@NotNull apl_1 apl_12) {
        super.a(apl_12);
        this.cip = apl_12.aIA();
    }

    @Override
    public void b(@NotNull fs_0 fs_02) {
        super.b(fs_02);
        fs_02.mz(this.cip);
    }

    @Override
    public String toString() {
        return "SoundDef{m_x=" + this.bal + ", m_y=" + this.bam + ", m_z=" + this.ban + "m_soundId=" + this.cip + "}";
    }

    public adG buS() {
        return new adG(this.bal, this.bam, this.ban, this.cip);
    }

    @Override
    public /* synthetic */ os_1 aXt() {
        return this.buS();
    }
}

