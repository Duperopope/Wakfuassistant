/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.apache.commons.lang3.ArrayUtils
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import lombok.Generated;
import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bHr
 */
public final class bhr_1
implements aeh_2,
fgf_0 {
    public static final String jZw = "quantity";
    public static final String jZx = "totalPurchasePrice";
    public static final String jZy = "canPurchase";
    public static final String[] jZz = new String[]{"quantity", "totalPurchasePrice", "canPurchase"};
    @NotNull
    private final bhu_1 jZA;
    private int ejM;

    public bhr_1(@NotNull bhu_1 bhu_12) {
        this.jZA = bhu_12;
        this.Fq(1);
    }

    public void Fq(int n) {
        this.z(n, true);
    }

    public void z(int n, boolean bl) {
        this.ejM = GC.a(n, 0, this.dVz());
        if (bl) {
            fse_1.gFu().a((aef_2)this, jZz);
        } else {
            fse_1.gFu().a((aef_2)this, jZx, jZy);
        }
    }

    public int dVz() {
        return this.jZA.oP();
    }

    public boolean dVA() {
        return this.ejM > 0 && (long)this.ejM * this.jZA.akd() <= aue_0.cVJ().cVK().cWp().exS();
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "quantity": {
                return this.ejM > 0 ? Integer.valueOf(this.ejM) : null;
            }
            case "totalPurchasePrice": {
                return (long)this.ejM * this.jZA.akd();
            }
            case "canPurchase": {
                return this.dVA();
            }
        }
        return this.jZA.eu(string);
    }

    @Override
    public String[] bxk() {
        return (String[])ArrayUtils.addAll((Object[])jZz, (Object[])this.jZA.bxk());
    }

    @Override
    public ffV getItem() {
        return this.jZA.getItem();
    }

    @NotNull
    @Generated
    public bhu_1 dVB() {
        return this.jZA;
    }

    @Generated
    public int oP() {
        return this.ejM;
    }
}

