/*
 * Decompiled with CFR 0.152.
 */
import java.util.Objects;

public class GF
extends Number {
    private final double aGL;
    private final Long aGM;

    public GF(long l, double d2) {
        this.aGL = d2;
        this.aGM = l;
    }

    public double aNT() {
        return this.aGL;
    }

    @Override
    public int intValue() {
        return this.aGM.intValue();
    }

    @Override
    public long longValue() {
        return this.aGM;
    }

    @Override
    public float floatValue() {
        return this.aGM.floatValue();
    }

    @Override
    public double doubleValue() {
        return this.aGM.doubleValue();
    }

    public String toString() {
        return this.aGM.toString();
    }

    public int hashCode() {
        return this.aGM.hashCode();
    }

    public boolean equals(Object object) {
        if (object instanceof GF) {
            return Objects.equals(this.aGM, ((GF)object).aGM);
        }
        if (object instanceof Long) {
            return this.aGM.equals(object);
        }
        return false;
    }
}

