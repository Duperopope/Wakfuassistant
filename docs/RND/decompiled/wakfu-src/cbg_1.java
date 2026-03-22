/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.List;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from cbG
 */
public class cbg_1
implements aeh_2 {
    private static final String lJw = "cinematicsAvailables";
    private static final String lJx = "debugMode";
    private static final String lJy = "withLoadingFrame";
    public static final String[] lJz = new String[]{"cinematicsAvailables", "debugMode", "withLoadingFrame"};
    protected boolean lJA;
    protected boolean lJB;

    @Override
    public String[] bxk() {
        return lJz;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "cinematicsAvailables": {
                return this.erW();
            }
            case "debugMode": {
                return this.lJA;
            }
            case "withLoadingFrame": {
                return this.lJB;
            }
        }
        return null;
    }

    public void setDebugMode(boolean bl) {
        if (this.lJA == bl) {
            return;
        }
        this.lJA = bl;
        fse_1.gFu().a((aef_2)this, lJx);
    }

    public void iV(boolean bl) {
        if (this.lJB == bl) {
            return;
        }
        this.lJB = bl;
        fse_1.gFu().a((aef_2)this, lJy);
    }

    public @Unmodifiable List<String> erW() {
        return aQd.eBx.cBw().stream().sorted(CharSequence::compare).toList();
    }

    @Generated
    public boolean erX() {
        return this.lJA;
    }

    @Generated
    public boolean erY() {
        return this.lJB;
    }
}

