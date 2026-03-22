/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.function.Consumer;

public interface fhw {
    public short cyv();

    public int aVo();

    public fhv Vl(int var1);

    public List<fhv> fXW();

    default public <T extends fhv> void s(Consumer<T> consumer) {
        int n = this.aVo();
        for (int i = 0; i < n; ++i) {
            consumer.accept(this.Vl(i));
        }
    }
}

