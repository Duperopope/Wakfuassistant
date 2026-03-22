/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import lombok.Generated;

public final class bwg {
    boolean jwC;
    boolean jwD;
    boolean jwE;

    boolean dLy() {
        return this.jwC || this.jwD || this.jwE;
    }

    @Generated
    public boolean dLz() {
        return this.jwC;
    }

    @Generated
    public boolean dLA() {
        return this.jwD;
    }

    @Generated
    public boolean dLB() {
        return this.jwE;
    }

    @Generated
    public String toString() {
        return "CopyBuildView.SheetsToCopy(m_copyEquipments=" + this.dLz() + ", m_copySpells=" + this.dLA() + ", m_copyAptitudes=" + this.dLB() + ")";
    }
}

