/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import java.util.ArrayList;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bVk
 */
class bvk_1
extends afk_1 {
    bvk_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "getGfxIdByElementModelId";
    }

    @Override
    public String getDescription() {
        return "Recupere le gfxId d'un element interactif a partir de l'id de son modele et de sa position";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("modelId", "Model id", aff_2.dJy, false), new afe_1("posX", "Position x", aff_2.dJy, false), new afe_1("posY", "Position y", aff_2.dJy, false), new afe_1("posZ", "Position z", aff_2.dJy, true)};
    }

    @Override
    public afe_1[] bBh() {
        return new afe_1[]{new afe_1("gfxId", null, aff_2.dJy, false)};
    }

    @Override
    protected void ss(int n) {
        int n2 = this.xp(0);
        int n3 = this.xp(1);
        int n4 = this.xp(2);
        ArrayList<afk_0> arrayList = afh_0.bxU().by(n3, n4);
        int n5 = arrayList.size();
        if (n5 == 0) {
            this.cah();
            return;
        }
        if (n < 4) {
            for (int i = 0; i < n5; ++i) {
                afk_0 afk_02 = arrayList.get(i);
                ni_1 ni_12 = afk_02.aVD();
                if (ni_12.beA() != n2) continue;
                this.xC(afk_02.bxZ());
                return;
            }
        } else {
            int n6 = this.xp(3);
            for (int i = 0; i < n5; ++i) {
                afk_0 afk_03 = arrayList.get(i);
                ni_1 ni_13 = afk_03.aVD();
                if (ni_13.beA() != n2 || afk_03.getAltitude() != (float)n6) continue;
                this.xC(afk_03.bxZ());
                return;
            }
        }
        this.a(bvc_2.lrR, "L'element interactif de modelId=" + n2 + " en (" + n3 + "," + n4 + ") n'existe pas");
    }
}

