/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.NotNull
 */
import lombok.Generated;
import org.jetbrains.annotations.NotNull;

final class bwA {
    @NotNull
    final String jze;
    final short jzf;
    final int jzg;

    @Generated
    public String toString() {
        return "BuildSheetModifications.Modification(m_buildName=" + this.jze + ", m_buildLevel=" + this.jzf + ", m_buildIconIndex=" + this.jzg + ")";
    }

    @Generated
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof bwA)) {
            return false;
        }
        bwA bwA2 = (bwA)object;
        if (this.jzf != bwA2.jzf) {
            return false;
        }
        if (this.jzg != bwA2.jzg) {
            return false;
        }
        String string = this.jze;
        String string2 = bwA2.jze;
        return !(string == null ? string2 != null : !string.equals(string2));
    }

    @Generated
    public int hashCode() {
        int n = 59;
        int n2 = 1;
        n2 = n2 * 59 + this.jzf;
        n2 = n2 * 59 + this.jzg;
        String string = this.jze;
        n2 = n2 * 59 + (string == null ? 43 : string.hashCode());
        return n2;
    }

    @Generated
    public bwA(@NotNull String string, short s, int n) {
        if (string == null) {
            throw new NullPointerException("buildName is marked non-null but is null");
        }
        this.jze = string;
        this.jzf = s;
        this.jzg = n;
    }
}

