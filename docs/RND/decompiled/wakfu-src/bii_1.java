/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import lombok.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bIi
 */
public class bii_1
implements aeh_2 {
    public static final String keR = "selectedColor";
    public static final String keS = "enabled";
    @NotNull
    private bih_1 keT;
    private boolean cHn = true;

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "selectedColor": {
                return this.keT;
            }
            case "enabled": {
                return this.cHn;
            }
        }
        return null;
    }

    public fjd dXy() {
        return this.keT.dXy();
    }

    @Override
    public String[] bxk() {
        return new String[]{keR, keS};
    }

    @NotNull
    @Generated
    public bih_1 dXA() {
        return this.keT;
    }

    @Generated
    public boolean isEnabled() {
        return this.cHn;
    }

    @Generated
    public void b(@NotNull bih_1 bih_12) {
        if (bih_12 == null) {
            throw new NullPointerException("m_selectedSlotColor is marked non-null but is null");
        }
        this.keT = bih_12;
    }

    @Generated
    public void setEnabled(boolean bl) {
        this.cHn = bl;
    }

    @Generated
    public String toString() {
        return "MarketSlotSelectionView(m_selectedSlotColor=" + String.valueOf(this.dXA()) + ", m_enabled=" + this.isEnabled() + ")";
    }

    @Generated
    public bii_1(@NotNull bih_1 bih_12) {
        if (bih_12 == null) {
            throw new NullPointerException("selectedSlotColor is marked non-null but is null");
        }
        this.keT = bih_12;
    }
}

