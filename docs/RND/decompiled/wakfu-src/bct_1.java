/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.OptionalLong;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bcT
 */
public class bct_1
extends buk_0<bci_1> {
    public bct_1(@Nullable Long l, @Nullable Long l2) {
        super(l, l2);
    }

    protected OptionalLong g(bci_1 bci_12) {
        return OptionalLong.of(bci_12.daS().cjl());
    }

    @Override
    public buh_0 dcz() {
        return buh_0.jou;
    }

    @Override
    protected /* synthetic */ OptionalLong ai(Object object) {
        return this.g((bci_1)object);
    }
}

