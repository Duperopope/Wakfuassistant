/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.Nullable
 */
import java.util.OptionalLong;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public class bww
extends buk_0<ffV> {
    public static final int jyK = 0;
    public static final int jyL = 1;
    public static final int jyM = 2;
    private final boolean jyN;

    public bww(@Nullable Long l, @Nullable Long l2, boolean bl) {
        super(l, l2);
        this.jyN = bl;
    }

    public static bww dMu() {
        return new bww(null, null, false);
    }

    @Nullable
    protected OptionalLong W(ffV ffV2) {
        if (ffV2.adO()) {
            return OptionalLong.empty();
        }
        Short s = ffV2.fWb();
        return OptionalLong.of(s != null ? (long)s.shortValue() : (long)ffV2.dOg().cmL());
    }

    @Override
    public buh_0 dcz() {
        return buh_0.jou;
    }

    public int dMv() {
        if (!this.isValid()) {
            return 0;
        }
        return this.jyN ? 1 : 2;
    }

    @Generated
    public boolean dMw() {
        return this.jyN;
    }

    @Override
    @Generated
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof bww)) {
            return false;
        }
        bww bww2 = (bww)object;
        if (!bww2.C(this)) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        return this.dMw() == bww2.dMw();
    }

    @Generated
    protected boolean C(Object object) {
        return object instanceof bww;
    }

    @Override
    @Generated
    public int hashCode() {
        int n = 59;
        int n2 = super.hashCode();
        n2 = n2 * 59 + (this.dMw() ? 79 : 97);
        return n2;
    }

    @Override
    @Nullable
    protected /* synthetic */ OptionalLong ai(Object object) {
        return this.W((ffV)object);
    }
}

