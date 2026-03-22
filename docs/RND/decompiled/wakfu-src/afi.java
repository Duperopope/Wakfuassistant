/*
 * Decompiled with CFR 0.152.
 */
public interface afi
extends afe {
    public aeb_1 e(aez_0<?, ?> var1);

    @Override
    default public <R extends aed_1 & aew_1> R c(aez_0<?, ?> aez_02) {
        return (R)this.e(aez_02);
    }

    @Override
    default public <W extends aee_1 & aew_1> W d(aez_0<?, ?> aez_02) {
        return (W)this.e(aez_02);
    }
}

