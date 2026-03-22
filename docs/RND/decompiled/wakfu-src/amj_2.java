/*
 * Decompiled with CFR 0.152.
 */
import java.util.regex.Pattern;

/*
 * Renamed from amj
 */
public class amj_2
extends amp_2 {
    public amj_2(Class<? extends anc_1> clazz, boolean bl, String ... stringArray) {
        super(clazz, bl, stringArray);
    }

    public amj_2(Class<? extends anc_1> clazz, String ... stringArray) {
        super(clazz, stringArray);
    }

    @Override
    public boolean fj(String string) {
        if (string != null) {
            return Pattern.matches("(\"([^\"\\\\]|\\\\(.|\n))*\")", string);
        }
        return false;
    }
}

