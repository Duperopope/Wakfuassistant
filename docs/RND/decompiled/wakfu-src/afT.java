/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import org.jetbrains.annotations.NotNull;

public class afT
implements afW,
ahb {
    private ZC crR;
    private final float crS;
    private final int crT;

    public afT(@NotNull ZC zC, float f2, int n) {
        this.crR = zC;
        this.crS = f2;
        this.crT = n;
    }

    @Override
    public void aB(float f2, float f3) {
        this.crR.aB(f2, f3);
    }

    @Override
    public void e(float f2, float f3, float f4) {
        this.crR.e(f2, f3, f4);
    }

    @Override
    public float bpZ() {
        return this.crR.bpZ();
    }

    @Override
    public float getWorldX() {
        return this.crR.getWorldX();
    }

    @Override
    public float getWorldY() {
        return this.crR.getWorldY();
    }

    @Override
    public float getAltitude() {
        return this.crR.getAltitude() + this.getOffset();
    }

    @Override
    public int bcC() {
        return this.crR.bcC();
    }

    @Override
    public int bcD() {
        return this.crR.bcD();
    }

    @Override
    public short bcE() {
        return (short)((float)this.crR.bcE() + this.getOffset());
    }

    public afW btr() {
        return this.crR;
    }

    public void setTarget(@NotNull ZC zC) {
        this.crR = zC;
    }

    @Override
    public boolean isVisible() {
        return this.crR.isVisible();
    }

    @Override
    public void a(FreeParticleSystem freeParticleSystem) {
        this.crR.a(freeParticleSystem);
    }

    @Override
    public void b(FreeParticleSystem freeParticleSystem) {
        this.crR.b(freeParticleSystem);
    }

    @Override
    public void bqq() {
    }

    private float getOffset() {
        return (float)this.crR.bpX() * this.crS + (float)this.crT;
    }
}

