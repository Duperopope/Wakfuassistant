/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class cAM
implements aeh_2 {
    public static final cAM mpj = new cAM(null);
    public static final String mpk = "OpenAL Soft on ";
    public static final String mpl = "name";
    public static final String[] mpm = new String[]{"name"};
    @Nullable
    private final String mpn;

    public cAM(@Nullable String string) {
        this.mpn = string;
    }

    @Nullable
    public String eGP() {
        return this.mpn;
    }

    @Nullable
    private static String oM(@Nullable String string) {
        if (ady_1.bZb() && string != null && string.startsWith(mpk)) {
            return string.substring(mpk.length());
        }
        return string;
    }

    @NotNull
    public String getName() {
        @Nullable String string = cAM.oM(this.mpn);
        if (string != null) {
            return string;
        }
        String string2 = cAM.oM(cAY.eHc().cdx());
        return aum_0.cWf().c("audio.device.default", string2 != null ? string2 : "");
    }

    @NotNull
    public String eGQ() {
        return this.mpn != null ? this.mpn : "";
    }

    @Override
    public String[] bxk() {
        return mpm;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "name": {
                return this.getName();
            }
        }
        return null;
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (!(object instanceof cAM)) {
            return false;
        }
        String string = ((cAM)object).eGP();
        return Objects.equals(this.eGP(), string);
    }
}

