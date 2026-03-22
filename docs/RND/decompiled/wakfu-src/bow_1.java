/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from boW
 */
public class bow_1
extends bun_0<ffV> {
    public bow_1(@Nullable Boolean bl) {
        super(bl);
    }

    protected boolean M(ffV ffV2) {
        return bow_1.N(ffV2) > 0;
    }

    private static int N(ffV ffV2) {
        if (!ffV2.dXg()) {
            return 0;
        }
        return ffV2.eAZ().fYO();
    }

    @Override
    public buh_0 dcz() {
        return buh_0.joM;
    }

    @Override
    protected /* synthetic */ boolean ak(Object object) {
        return this.M((ffV)object);
    }
}

