/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.lang.runtime.SwitchBootstraps;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from aUq
 */
public class auq_0
implements aeh_2 {
    public static final String gyp = "results";
    public static final String gyq = "resultsCount";
    public static final String gyr = "keySearch";
    public static final String gys = "textSearch";
    public static final String[] gyt = new String[]{"results", "resultsCount"};
    private static final String gyu = ".*?";
    private static final int gyv = 150;
    private final aUr gyw = new aUr();
    private final Map<String, aus_0> gyx = new HashMap<String, aus_0>();
    @Nullable
    private List<aus_0> gyy;
    @Nullable
    private String gyz;
    @Nullable
    private String gyA;

    public void bkZ() {
        this.gyw.cL(auc_0.cVq().bS("i18nPath"));
        this.gyw.a(Mv.aVA);
        this.gyx.clear();
        this.gyw.b((Mv mv, String string) -> {
            String string2 = this.gyw.a((Mv)((Object)mv), (String)string, false);
            String string3 = this.gyw.a((Mv)((Object)mv), (String)string, true);
            aus_0 aus_02 = this.gyx.computeIfAbsent((String)string, aus_0::new);
            aus_02.gyJ.put((Mv)((Object)mv), string2);
            aus_02.gyK.add(string3);
        });
        this.gyy = null;
        this.gyz = null;
        this.gyA = null;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        String string2 = string;
        int n = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{gyp, gyq, gyr, gys}, (Object)string2, n)) {
            case 0 -> {
                if (this.gyy == null) {
                    yield null;
                }
                yield this.gyy.subList(0, Math.min(this.gyy.size(), 150));
            }
            case 1 -> this.gyy == null ? this.gyx.size() : this.gyy.size();
            case 2 -> this.gyz;
            case 3 -> this.gyA;
            default -> null;
        };
    }

    public void ko(@Nullable String string) {
        if (!Objects.equals(this.gyz, string)) {
            this.gyz = string;
            this.gyA = null;
            this.cUR();
        }
    }

    public void kp(@Nullable String string) {
        if (!Objects.equals(this.gyA, string)) {
            this.gyz = null;
            this.gyA = string;
            this.cUR();
        }
    }

    public void cUQ() {
        this.gyz = null;
        this.gyA = null;
        this.cUR();
    }

    private void cUR() {
        if (this.gyz == null && this.gyA == null) {
            this.gyy = null;
        } else if (this.gyz != null) {
            auq_0.kq(this.gyz).ifPresent(pattern -> {
                this.gyy = this.gyx.entrySet().stream().filter(entry -> pattern.matcher(((aus_0)entry.getValue()).gyI).matches()).sorted(Map.Entry.comparingByKey()).map(Map.Entry::getValue).toList();
            });
        } else {
            auq_0.kq(this.gyA).ifPresent(pattern -> {
                this.gyy = this.gyx.entrySet().stream().filter(entry -> {
                    for (String string : ((aus_0)entry.getValue()).gyK) {
                        if (!pattern.matcher(string).matches()) continue;
                        return true;
                    }
                    return false;
                }).sorted(Map.Entry.comparingByKey()).map(Map.Entry::getValue).toList();
            });
        }
        fse_1.gFu().a((aef_2)this, gyt);
    }

    private static Optional<Pattern> kq(@NotNull String string) {
        Object object = BH.aT(string);
        if (!((String)object).startsWith("^")) {
            object = gyu + (String)object;
        }
        if (!((String)object).endsWith("$")) {
            object = (String)object + gyu;
        }
        try {
            return Optional.of(Pattern.compile((String)object, 32));
        }
        catch (PatternSyntaxException patternSyntaxException) {
            return Optional.empty();
        }
    }

    @Override
    public String[] bxk() {
        return gyt;
    }
}

