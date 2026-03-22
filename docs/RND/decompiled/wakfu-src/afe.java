/*
 * Decompiled with CFR 0.152.
 */
public interface afe {
    public String getKey();

    public <R extends aed_1 & aew_1> R c(aez_0<?, ?> var1);

    public <W extends aee_1 & aew_1> W d(aez_0<?, ?> var1);

    default public void a(aez_0<?, ?> aez_02, aea_1 aea_12) {
        ((aew_1)this.c(aez_02)).a(this.getKey(), aea_12);
    }

    default public void b(aez_0<?, ?> aez_02, aea_1 aea_12) {
        ((aew_1)this.c(aez_02)).b(this.getKey(), aea_12);
    }
}

