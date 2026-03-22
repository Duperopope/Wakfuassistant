/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.kernel.core.maths.Matrix44;

/*
 * Renamed from awO
 */
public final class awo_1
extends awn_1 {
    @Override
    public Matrix44 bIT() {
        return this.dnk;
    }

    @Override
    public void bPx() {
        this.dnk.bPx();
    }

    @Override
    public float aIQ() {
        return this.dnk.bQE()[12];
    }

    @Override
    public float aIR() {
        return this.dnk.bQE()[13];
    }

    @Override
    public float aRH() {
        return this.dnk.bQE()[0];
    }

    @Override
    public float aRI() {
        return this.dnk.bQE()[5];
    }

    @Override
    public void A(float f2, float f3, float f4) {
        float[] fArray = this.dnk.bQE();
        fArray[12] = f2;
        fArray[13] = f3;
        fArray[14] = f4;
    }

    @Override
    public void B(float f2, float f3, float f4) {
        float[] fArray = this.dnk.bQE();
        fArray[0] = f2;
        fArray[5] = f3;
        fArray[10] = f4;
    }
}

