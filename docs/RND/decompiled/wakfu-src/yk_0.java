/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Yk
 */
public final class yk_0
extends Yh {
    public short aRx;

    @Override
    public float floatValue() {
        return this.aRx;
    }

    @Override
    public String bor() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void reset() {
        this.aRx = 0;
    }

    @Override
    public void bL(float f2) {
        this.aRx = (short)f2;
    }

    @Override
    public void a(Yg yg) {
        this.aRx = (short)yg.floatValue();
    }
}

