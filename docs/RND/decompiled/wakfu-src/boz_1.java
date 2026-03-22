/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from boZ
 */
public class boz_1
extends bun_0<ffV> {
    public boz_1(@Nullable Boolean bl) {
        super(bl);
    }

    protected boolean M(ffV ffV2) {
        if (!ffV2.dXg()) {
            return false;
        }
        return ffV2.eAZ().ahy() > 0 || ffV2.eAZ().ahA() > 0;
    }

    @Override
    public buh_0 dcz() {
        return buh_0.joN;
    }

    @Override
    protected /* synthetic */ boolean ak(Object object) {
        return this.M((ffV)object);
    }
}

