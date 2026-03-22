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
 * Renamed from bGp
 */
public class bgp_1
implements aeh_2,
ejl_0,
fgf_0 {
    public static final String jVi = "item";
    public static final String jVj = "name";
    public static final String jVk = "isSelected";
    public static final String jVl = "additionalBorder";
    public static final String jVm = "backgroundImageStyle";
    public static final String[] jVn = new String[]{"item", "name", "isSelected", "backgroundImageStyle", "additionalBorder"};
    @NotNull
    private final ffS jVo;
    @Nullable
    private ffV iWZ;
    private boolean izO;
    private boolean izP;

    @Override
    public String[] bxk() {
        return jVn;
    }

    bgp_1(@NotNull ffS ffS2) {
        this(ffS2, null);
    }

    bgp_1(@NotNull ffS ffS2, @Nullable ffV ffV2) {
        this.jVo = ffS2;
        this.iWZ = ffV2;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "item": {
                return this.iWZ;
            }
            case "name": {
                return aum_0.cWf().c(this.jVo.shc, new Object[0]);
            }
            case "isSelected": {
                return this.izO;
            }
            case "backgroundImageStyle": {
                if (this.iWZ != null) {
                    return bEf.az(this.iWZ);
                }
                return this.jVo.shd;
            }
            case "additionalBorder": {
                if (this.izP) {
                    return "positiveBorder";
                }
                return this.iWZ != null && !bEf.aA(this.iWZ) ? "negativeBorder" : null;
            }
        }
        return null;
    }

    @Override
    @Nullable
    public ffV getItem() {
        return this.iWZ;
    }

    @NotNull
    public ffS dTQ() {
        return this.jVo;
    }

    public void setItem(@Nullable ffV ffV2) {
        this.iWZ = ffV2;
    }

    public void setSelected(boolean bl) {
        this.izO = bl;
    }

    public void gz(boolean bl) {
        this.izP = bl;
    }

    @Override
    public ejm_0 drG() {
        return ejm_0.qyS;
    }

    @Override
    public Object drH() {
        return this.iWZ != null ? this.iWZ.drH() : null;
    }

    @Override
    public String drI() {
        return this.iWZ != null ? this.iWZ.drI() : null;
    }
}

