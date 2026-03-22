/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.Nullable
 */
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bJi
 */
public final class bji_0
implements aeh_2,
bek_0 {
    private final ffV klk;
    private final int kll;

    bji_0(int n, int n2) {
        this.klk = fgD.fXh().Ve(n);
        this.kll = n2;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if ("quantity".equals(string)) {
            return this.kll;
        }
        return this.klk.eu(string);
    }

    public int avr() {
        return this.klk.avr();
    }

    @Override
    public bgv_2 duo() {
        return (bgv_2)this.klk.dOg();
    }

    @Override
    public String[] bxk() {
        return bEf.jNn;
    }

    @Generated
    public ffV getItem() {
        return this.klk;
    }

    @Generated
    public int oP() {
        return this.kll;
    }
}

