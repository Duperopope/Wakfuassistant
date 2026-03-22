/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  javax.annotation.Nullable
 */
import com.google.common.base.Function;
import javax.annotation.Nullable;

/*
 * Renamed from bed
 */
public class bed_1
implements Function<bee_1, Integer> {
    protected static final bed_1 hMR = new bed_1();

    protected bed_1() {
    }

    @Nullable
    public Integer a(@Nullable bee_1 bee_12) {
        return bee_12 == null ? 0 : bee_12.aXY();
    }

    @Nullable
    public /* synthetic */ Object apply(@Nullable Object object) {
        return this.a((bee_1)object);
    }
}

