/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class adi
extends os_1 {
    private static final Logger ciY = Logger.getLogger(adi.class);
    public int o;
    public int ciZ;
    public int bIi;
    public byte bay;
    public boolean bVy;
    public byte aXR;
    public String cja;
    public String asr;

    public adi() {
    }

    public adi(int n, int n2, int n3, byte by, byte by2, byte by3, short s, boolean bl, byte by4, String string, String string2) {
        super(by2, by3, s);
        this.o = n;
        this.ciZ = n2;
        this.bIi = n3;
        this.bay = by;
        this.bVy = bl;
        this.aXR = by4;
        this.cja = string;
        this.asr = string2;
    }

    @Override
    public void a(@NotNull apl_1 apl_12) {
        super.a(apl_12);
        this.o = apl_12.aIA();
        this.ciZ = apl_12.aIA();
        this.bIi = apl_12.aIz();
        this.bay = apl_12.aIy();
        this.bVy = apl_12.bFS();
        this.aXR = apl_12.aIy();
        this.cja = apl_12.aIC();
        this.asr = apl_12.aIC();
    }

    @Override
    public void b(@NotNull fs_0 fs_02) {
        super.b(fs_02);
        fs_02.mz(this.o);
        fs_02.mz(this.ciZ);
        fs_02.k((short)this.bIi);
        fs_02.g(this.bay);
        fs_02.ay(this.bVy);
        fs_02.g(this.aXR);
        fs_02.bo(this.cja);
        fs_02.bo(this.asr);
    }

    @Override
    public String toString() {
        return "SoundDef{m_id=" + this.o + ", m_gfxId=" + this.ciZ + ", m_type=" + this.bIi + ", m_direction=" + this.bay + ", m_x=" + this.bal + ", m_y=" + this.bam + ", m_z=" + this.ban + ", m_occluder=" + this.bVy + ", m_height=" + this.aXR + ", m_baseAnimation=" + this.cja + ", m_params=" + this.asr + "}";
    }

    public adi bux() {
        return new adi(this.o, this.ciZ, this.bIi, this.bay, this.bal, this.bam, this.ban, this.bVy, this.aXR, this.cja, this.asr);
    }

    @Override
    public /* synthetic */ os_1 aXt() {
        return this.bux();
    }
}

