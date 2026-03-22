/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Objects;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from boC
 */
final class boc_0
implements aeh_2 {
    public static final String iQE = "name";
    public static final String iQF = "iconUrl";
    public static final String iQG = "isDoubled";
    private final ffS iQH;
    private final boolean iQI;

    @Override
    @Nullable
    public Object eu(String string) {
        return switch (string) {
            case iQE -> aum_0.cWf().c(this.iQH.shc, new Object[0]);
            case iQF -> auc_0.cVq().aZ(this.iQH.she);
            case iQG -> this.iQI;
            default -> null;
        };
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        boc_0 boc_02 = (boc_0)object;
        return this.iQH.she == boc_02.iQH.she;
    }

    public int hashCode() {
        return Objects.hash(this.iQH.she);
    }

    @Override
    public String[] bxk() {
        return new String[]{iQE, iQF};
    }

    @Generated
    public boc_0(ffS ffS2, boolean bl) {
        this.iQH = ffS2;
        this.iQI = bl;
    }
}

