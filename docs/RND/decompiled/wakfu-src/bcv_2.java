/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.OptionalLong;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bcV
 */
public class bcv_2
extends buk_0<bci_1> {
    public bcv_2(@Nullable Long l, @Nullable Long l2) {
        super(l, l2);
    }

    protected OptionalLong g(bci_1 bci_12) {
        return OptionalLong.of(bci_12.daS().cjm());
    }

    @Override
    public buh_0 dcz() {
        return buh_0.jox;
    }

    @Override
    protected /* synthetic */ OptionalLong ai(Object object) {
        return this.g((bci_1)object);
    }
}

