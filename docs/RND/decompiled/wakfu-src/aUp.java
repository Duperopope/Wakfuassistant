/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.lang.runtime.SwitchBootstraps;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class aUp
implements aeh_2 {
    private static final String gyj = "(?<!\\\\);";
    public static final String gyk = "inputText";
    public static final String gyl = "parameters";
    public static final String gym = "outputText";
    @NotNull
    private String gyn = "";
    @NotNull
    private String eLo = "";
    @NotNull
    private String gyo = "";

    @Override
    @Nullable
    public Object eu(String string) {
        String string2 = string;
        int n = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{gyk, gyl, gym}, (Object)string2, n)) {
            case 0 -> this.gyn;
            case 1 -> this.eLo;
            case 2 -> this.gyo;
            default -> null;
        };
    }

    public void aa(@NotNull String string, @NotNull String string2) {
        this.gyn = string;
        this.eLo = string2;
        Object[] objectArray = aUp.km(string2);
        this.gyo = Bz.a(this.gyn, objectArray);
        fse_1.gFu().a((aef_2)this, gym);
    }

    public void cUP() {
        this.aa("", this.eLo);
        fse_1.gFu().a((aef_2)this, gyk);
    }

    public void bbl() {
        this.aa(this.gyn, "");
        fse_1.gFu().a((aef_2)this, gyl);
    }

    private static Object[] km(@NotNull String string) {
        String[] stringArray = string.split(gyj);
        Object[] objectArray = new Object[stringArray.length];
        for (int i = 0; i < stringArray.length; ++i) {
            objectArray[i] = aUp.kn(stringArray[i]);
        }
        return objectArray;
    }

    private static Object kn(@NotNull String string) {
        try {
            return Long.parseLong(string);
        }
        catch (NumberFormatException numberFormatException) {
            try {
                return Double.parseDouble(string);
            }
            catch (NumberFormatException numberFormatException2) {
                if (Boolean.TRUE.toString().equals(string) || Boolean.FALSE.toString().equals(string)) {
                    return Boolean.parseBoolean(string);
                }
                return string;
            }
        }
    }

    @Override
    public String[] bxk() {
        return new String[]{gyk, gyl, gym};
    }
}

