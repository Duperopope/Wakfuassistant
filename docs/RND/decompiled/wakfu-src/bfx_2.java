/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bfx
 */
public class bfx_2
implements aeh_2 {
    public static final String hTS = "id";
    public static final String hTT = "name";
    public static final String hTU = "iconUrl";
    public static final String hTV = "iconSelectUrl";
    public static final String hTW = "description";
    private final eyA hTX;
    private final eym hTY;

    public bfx_2(eyA eyA2) {
        this.hTX = eyA2;
        this.hTY = eym.phV;
    }

    public bfx_2(eyA eyA2, eym eym2) {
        this.hTX = eyA2;
        this.hTY = eym2;
    }

    @Override
    public String[] bxk() {
        return new String[0];
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(hTS)) {
            return this.hTX.aIi();
        }
        if (string.equals(hTT)) {
            return this.dgC();
        }
        if (string.equals(hTU)) {
            return auc_0.cVq().kx(String.valueOf(this.hTX.aIi()));
        }
        if (string.equals(hTV)) {
            return auc_0.cVq().cVF();
        }
        if (string.equals(hTW)) {
            if (this.hTY == eym.phV) {
                return "";
            }
            return aum_0.cWf().c("breed.role.desc." + this.hTY.aWP() + "." + this.hTX.aIi(), new Object[0]);
        }
        return false;
    }

    @NotNull
    public String dgC() {
        return aum_0.cWf().c("breed.role.name." + this.hTX.aIi(), new Object[0]);
    }

    public int d() {
        return this.hTX.aIi();
    }

    public eyA dgD() {
        return this.hTX;
    }
}

