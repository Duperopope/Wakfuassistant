/*
 * Decompiled with CFR 0.152.
 */
final class abs
extends abn {
    @Override
    protected double z(double d2) {
        if (d2 >= 1.0) {
            return 1.0;
        }
        return 1.0 - StrictMath.pow(2.0, -10.0 * d2);
    }
}

