/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.function.Function;
import javax.annotation.Nullable;

/*
 * Renamed from bMA
 */
public class bma_0
implements Function<bmx_0, Short> {
    @Nullable
    public Short f(@Nullable bmx_0 bmx_02) {
        if (bmx_02 == null || bmx_02.giP() == null) {
            return (short)-1;
        }
        return ((bmt_0)bmx_02.giP()).cvD();
    }

    @Override
    @Nullable
    public /* synthetic */ Object apply(@Nullable Object object) {
        return this.f((bmx_0)object);
    }
}

