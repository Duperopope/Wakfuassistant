/*
 * Decompiled with CFR 0.152.
 */
final class abq
extends abn {
    @Override
    protected double z(double d2) {
        if (d2 < 0.5) {
            return 2.0 * d2 * d2;
        }
        return -2.0 * d2 * d2 + 4.0 * d2 - 1.0;
    }
}

