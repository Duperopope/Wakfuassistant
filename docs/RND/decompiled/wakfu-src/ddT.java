/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class ddT
extends afk_1 {
    private static final String ohw = "getFollowedAchievementIndex";
    private static final String ohx = "Retourne l'index de l'achievement dans l'ui de suivi de qu\u00eate";
    private static final afe_1[] ohy = new afe_1[]{new afe_1("AchievementId", aff_2.dJy, false)};
    private static final afe_1[] ohz = new afe_1[]{new afe_1("Index in UI", aff_2.dJy, false)};

    ddT(LuaState luaState) {
        super(luaState);
    }

    @Override
    @Nullable
    public afe_1[] bBg() {
        return ohy;
    }

    @Override
    @Nullable
    public afe_1[] bBh() {
        return ohz;
    }

    @Override
    protected void ss(int n) {
        int n2 = this.xp(0);
        int n3 = ddT.Oe(n2);
        if (n3 < 0) {
            this.cah();
        } else {
            this.xC(n3);
        }
    }

    private static int Oe(int n) {
        String string = fyw_0.gqw().to("followedAchievementsDialog") ? "followedAchievementsDialog" : "verticalFollowedAchievementsDialog";
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR(string);
        if (fhs_22 == null) {
            return -1;
        }
        fdf_1 fdf_12 = (fdf_1)fhs_22.uH("achievementsList");
        ArrayList<Object> arrayList = fdf_12.getItems();
        int n2 = arrayList.size();
        for (int i = 0; i < n2; ++i) {
            bcx_2 bcx_22 = (bcx_2)arrayList.get(i);
            if (bcx_22 == null || bcx_22.d() != n) continue;
            return i;
        }
        return -1;
    }

    @Override
    public String getName() {
        return ohw;
    }

    @Override
    public String getDescription() {
        return ohx;
    }
}

