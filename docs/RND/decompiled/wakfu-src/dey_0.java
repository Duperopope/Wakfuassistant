/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from deY
 */
class dey_0
extends afk_1 {
    private static final Set<String> ojZ = new HashSet<String>(Arrays.asList("emissaryTutoDialog", "fleaDialog", "verticalFollowedAchievementsDialog", "minimapDialog", "fighterDescriptionDialog"));

    dey_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "loadDialog";
    }

    @Override
    public String getDescription() {
        return "Ouvre une fen?tre de dialogue si elle n'est pas ouverte";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.oig;
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        String string = this.xu(0);
        if (fyw_0.gqw().to(string)) {
            ddU.ohA.info((Object)("dialog " + string + " d\u00e9j\u00e0 ouvert"));
            return;
        }
        Optional<String> optional = ojZ.stream().filter(string::contains).findFirst();
        if (optional.isEmpty()) {
            this.a(ddU.ohA, "Ce dialogue n'est pas pris en charge");
            return;
        }
        String string2 = ccj_2.pe(optional.get());
        fyw_0.gqw().az(string, string2);
        if (string.contains("fighterDescriptionDialog")) {
            String string3 = string.substring("fighterDescriptionDialog".length());
            long l = Long.parseLong(string3);
            bgy bgy2 = bgg_0.dlO().ju(l);
            fse_1.gFu().b("fighter", bgy2, string);
        }
    }
}

