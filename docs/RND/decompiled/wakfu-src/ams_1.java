/*
 * Decompiled with CFR 0.152.
 */
import java.util.regex.Pattern;

/*
 * Renamed from ams
 */
public class ams_1
extends amp_2 {
    public ams_1(Class<? extends anc_1> clazz, boolean bl, String ... stringArray) {
        super(clazz, bl, stringArray);
    }

    public ams_1(Class<? extends anc_1> clazz, String ... stringArray) {
        super(clazz, stringArray);
    }

    @Override
    public boolean fj(String string) {
        if (string != null) {
            return Pattern.matches("([0-9]+)", string);
        }
        return false;
    }
}

