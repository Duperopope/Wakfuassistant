/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from OS
 */
public class os_1
implements ot_1 {
    private static final Logger bak = Logger.getLogger(os_1.class);
    public byte bal;
    public byte bam;
    public short ban;

    public os_1() {
    }

    public os_1(os_1 os_12) {
        this.bal = os_12.bal;
        this.bam = os_12.bam;
        this.ban = os_12.ban;
    }

    public os_1(byte by, byte by2, short s) {
        this.bal = by;
        this.bam = by2;
        this.ban = s;
        assert (this.bal >= 0 && this.bal < 18);
        assert (this.bam >= 0 && this.bam < 18);
    }

    @Override
    public void a(@NotNull apl_1 apl_12) {
        this.bal = apl_12.aIy();
        this.bam = apl_12.aIy();
        this.ban = apl_12.aIz();
        assert (this.bal >= 0 && this.bal < 18);
        assert (this.bam >= 0 && this.bam < 18);
    }

    @Override
    public void b(@NotNull fs_0 fs_02) {
        assert (this.bal >= 0 && this.bal < 18);
        assert (this.bam >= 0 && this.bam < 18);
        fs_02.g(this.bal);
        fs_02.g(this.bam);
        fs_02.k(this.ban);
    }

    public String toString() {
        return "ElementDef{m_x=" + this.bal + ", m_y=" + this.bam + ", m_z=" + this.ban + "}";
    }

    public os_1 aXt() {
        throw new UnsupportedOperationException("TODO");
    }
}

