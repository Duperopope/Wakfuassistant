/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.CellParticleSystem;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class adC
extends os_1 {
    private static final Logger cjR = Logger.getLogger(adC.class);
    CellParticleSystem cjS;
    int cjT = 0;
    byte cjU = 0;
    float cjV = 0.0f;
    byte cjW;
    byte cjX;
    byte cjY;
    byte cjZ;

    public adC() {
    }

    public adC(byte by, byte by2, short s, int n, byte by3, float f2, byte by4, byte by5, byte by6, byte by7) {
        super(by, by2, s);
        this.cjT = n;
        this.cjU = by3;
        this.cjV = f2;
        this.cjW = by4;
        this.cjX = by5;
        this.cjY = by6;
        this.cjZ = by7;
    }

    @Override
    public void a(@NotNull apl_1 apl_12) {
        super.a(apl_12);
        this.cjT = apl_12.aIA();
        this.cjU = apl_12.aIy();
        this.cjV = apl_12.aIB();
        this.cjW = apl_12.aIy();
        this.cjX = apl_12.aIy();
        this.cjY = apl_12.aIy();
        this.cjZ = apl_12.aIy();
    }

    @Override
    public void b(@NotNull fs_0 fs_02) {
        super.b(fs_02);
        fs_02.mz(this.cjT);
        fs_02.g(this.cjU);
        fs_02.b(this.cjV);
        fs_02.g(this.cjW);
        fs_02.g(this.cjX);
        fs_02.g(this.cjY);
        fs_02.g(this.cjZ);
    }

    @Override
    public String toString() {
        return "ParticleDef{m_systemId=" + this.cjT + ", m_level=" + this.cjU + "m_x=" + this.bal + ", m_y=" + this.bam + ", m_z=" + this.ban + ", m_offsetX=" + this.cjW + ", m_offsetY=" + this.cjX + ", m_offsetZ=" + this.cjY + ", m_lod=" + this.cjZ + "}";
    }

    public adC buE() {
        return new adC(this.bal, this.bam, this.ban, this.cjT, this.cjU, this.cjV, this.cjX, this.cjX, this.cjY, this.cjZ);
    }

    @Override
    public /* synthetic */ os_1 aXt() {
        return this.buE();
    }
}

