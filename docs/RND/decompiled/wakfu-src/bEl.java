/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.OptionalLong;
import org.jetbrains.annotations.Nullable;

public class bEl
extends buk_0<ffV> {
    public bEl(@Nullable Long l, @Nullable Long l2) {
        super(l, l2);
    }

    protected OptionalLong W(ffV ffV2) {
        return OptionalLong.of(ffV2.cmL());
    }

    @Override
    public buh_0 dcz() {
        return buh_0.jou;
    }

    @Override
    protected /* synthetic */ OptionalLong ai(Object object) {
        return this.W((ffV)object);
    }
}

