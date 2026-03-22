/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from fGH
 */
public class fgh_2
extends fgj_2 {
    public static final Pattern uut = Pattern.compile("(<(\\p{Alpha}+?)( ([^<>]*))*>(.*?)</(\\2)>)|([^<>]+)", 32);

    @Override
    public String gyi() {
        StringBuilder stringBuilder = new StringBuilder();
        for (fgk_2 fgk_22 : this) {
            stringBuilder.append(fgk_22.gzF());
        }
        return stringBuilder.toString();
    }

    @Override
    public boolean tY(@NotNull String string) {
        int n = string.length();
        if (n > 0 && this.aJG()) {
            return false;
        }
        boolean bl = false;
        for (fgk_2 fgk_22 : this) {
            String string2 = fgk_22.gzF();
            int n2 = 0 + string2.length();
            if (n2 > n) {
                return false;
            }
            if (string2.equals(string.substring(0, n2))) continue;
            return false;
        }
        return 0 == n;
    }

    @Override
    public void tZ(String string) {
        this.gzj();
        this.gzx();
        this.ua(string);
    }

    @Override
    public void ua(String string) {
        Matcher matcher = uut.matcher(string);
        matcher.reset();
        ArrayList<fgk_2> arrayList = new ArrayList<fgk_2>();
        while (matcher.find()) {
            fgk_2 fgk_22 = this.a(matcher, null, true);
            fgk_22.a(matcher, arrayList);
        }
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            this.b(arrayList.get(i));
        }
    }

    public fgk_2 a(Matcher matcher, fgk_2 fgk_22, boolean bl) {
        ahr_2 ahr_22 = fgk_2.uj(matcher.group(2));
        if (ahr_22 == ahr_2.dSD) {
            return new fgl_2(this, fgk_22);
        }
        return new fgm_1(this, fgk_22, false);
    }

    public static String uf(String string) {
        Matcher matcher = uut.matcher(string);
        matcher.reset();
        StringBuilder stringBuilder = new StringBuilder();
        while (matcher.find()) {
            String string2 = matcher.group(0);
            if (string2 == null || string2.isEmpty()) continue;
            String string3 = matcher.group(5);
            if (BH.aU(string3)) {
                stringBuilder.append(string2);
                continue;
            }
            stringBuilder.append(string3);
        }
        return stringBuilder.toString();
    }
}

