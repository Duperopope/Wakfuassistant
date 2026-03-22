/*
 * Decompiled with CFR 0.152.
 */
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.function.Consumer;

public abstract class bDy
implements aeh_2 {
    public static final String jKn = "bagIconUrl";
    public static final String jKo = "bagName";
    public static final String jKp = "bagId";
    public static final String jKq = "bagInventory";
    public static final String jKr = "bagSize";
    public static final String jKs = "bagNameSize";
    public static final String jKt = "bagSizeMaxSize";
    public static final String jKu = "bagPosition";
    public static final String jKv = "canBeSorted";
    public static final String[] jKw = new String[]{"bagName", "bagId", "bagInventory", "bagSize", "bagNameSize", "bagPosition", "canBeSorted", "bagSizeMaxSize"};

    public abstract void j(Consumer<fgf_0> var1);

    public OptionalInt lb(long l) {
        return OptionalInt.empty();
    }

    public OptionalLong Gk(int n) {
        return OptionalLong.empty();
    }

    public abstract int aVo();

    public int bTg() {
        return this.aVo();
    }

    public OptionalLong dQS() {
        return OptionalLong.empty();
    }

    @Override
    public String[] bxk() {
        return jKw;
    }
}

