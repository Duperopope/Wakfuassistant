/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 *  lombok.Generated
 *  org.jetbrains.annotations.Nullable
 */
import com.google.gson.annotations.SerializedName;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public class bPs {
    @SerializedName(value="hide")
    @Nullable
    private Boolean kPm;
    @SerializedName(value="containsCompanion")
    @Nullable
    private Boolean kPn;
    @SerializedName(value="hideOnNeo")
    @Nullable
    private Boolean kPo;
    @SerializedName(value="neoOnly")
    @Nullable
    private Boolean kPp;

    public boolean isValid() {
        if (this.kPm != null && this.kPm.booleanValue()) {
            return false;
        }
        if (this.kPn != null && this.kPn.booleanValue() && !ewo_0.oBF.k(ewr_0.oDg)) {
            return false;
        }
        if (this.kPo != null && this.kPo.booleanValue() && ewo_0.oBF.k(ewr_0.oCX)) {
            return false;
        }
        return this.kPp == null || this.kPp == false || ewo_0.oBF.k(ewr_0.oCX);
    }

    @Nullable
    @Generated
    public Boolean ehZ() {
        return this.kPm;
    }

    @Nullable
    @Generated
    public Boolean eia() {
        return this.kPn;
    }

    @Nullable
    @Generated
    public Boolean eib() {
        return this.kPo;
    }

    @Nullable
    @Generated
    public Boolean eic() {
        return this.kPp;
    }

    @Generated
    public String toString() {
        return "ShopInGameRequirement(m_hide=" + this.ehZ() + ", m_containsCompanion=" + this.eia() + ", m_hideOnNeo=" + this.eib() + ", m_neoOnly=" + this.eic() + ")";
    }
}

