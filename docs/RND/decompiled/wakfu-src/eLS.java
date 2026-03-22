/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Function;

public interface eLS {
    default public int a(ahv_2 ahv_22, enk_0 enk_02, eLO eLO2) {
        return this.a(ahv_22, enk_02, eLO2, Function.identity());
    }

    public int a(ahv_2 var1, enk_0 var2, eLO var3, Function<Object[], Object[]> var4);
}

