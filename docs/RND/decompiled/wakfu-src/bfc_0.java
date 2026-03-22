/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bfc
 */
public class bfc_0
implements aeh_2 {
    public static final String hQt = "name";
    bfh_0 hQu;

    bfc_0() {
    }

    bfc_0(bfh_0 bfh_02) {
        this.hQu = bfh_02;
    }

    @Override
    public String[] bxk() {
        return dGM;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(hQt)) {
            if (this.hQu == null) {
                return aum_0.cWf().c("battleground.gameplay.name.all", new Object[0]);
            }
            return this.hQu.eu(hQt);
        }
        return null;
    }
}

