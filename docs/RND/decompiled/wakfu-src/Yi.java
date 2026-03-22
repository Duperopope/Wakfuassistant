/*
 * Decompiled with CFR 0.152.
 */
public final class Yi
extends Yh {
    public byte axm;

    @Override
    public float floatValue() {
        return this.axm;
    }

    @Override
    public String bor() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void reset() {
        this.axm = 0;
    }

    @Override
    public void bL(float f2) {
        this.axm = (byte)f2;
    }

    @Override
    public void a(Yg yg) {
        this.axm = (byte)yg.floatValue();
    }
}

