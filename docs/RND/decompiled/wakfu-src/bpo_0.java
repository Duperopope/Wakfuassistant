/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.OptionalLong;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bpO
 */
public class bpo_0
extends bui_0<bpb_1> {
    public bpo_0(@Nullable Long l, @Nullable Long l2) {
        super(l, l2);
    }

    protected OptionalLong b(bpb_1 bpb_12) {
        return OptionalLong.of(bpb_12.aVf());
    }

    protected OptionalLong c(bpb_1 bpb_12) {
        return OptionalLong.of(bpb_12.aVe());
    }

    @Override
    public buh_0 dcz() {
        return buh_0.jou;
    }

    @Override
    protected /* synthetic */ OptionalLong an(Object object) {
        return this.c((bpb_1)object);
    }

    @Override
    protected /* synthetic */ OptionalLong ao(Object object) {
        return this.b((bpb_1)object);
    }
}

