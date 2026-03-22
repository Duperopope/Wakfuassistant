/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import java.util.ArrayList;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bVj
 */
class bvj_1
extends afk_1 {
    bvj_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "getElementsId";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("type", "ClientInteractiveAnimatedElementSceneView GFX id", aff_2.dJy, false), new afe_1("posX", null, aff_2.dJy, false), new afe_1("posY", null, aff_2.dJy, false), new afe_1("posZ", null, aff_2.dJy, true)};
    }

    @Override
    public afe_1[] bBh() {
        return new afe_1[]{new afe_1("id", null, aff_2.dJw, false)};
    }

    @Override
    protected void ss(int n) {
        int n2 = this.xp(0);
        int n3 = this.xp(1);
        int n4 = this.xp(2);
        ArrayList<afk_0> arrayList = afh_0.bxU().by(n3, n4);
        int n5 = arrayList.size();
        boolean bl = false;
        if (n5 != 0) {
            if (n < 4) {
                for (int i = 0; i < n5; ++i) {
                    afk_0 afk_02 = arrayList.get(i);
                    if (afk_02.bxZ() != n2) continue;
                    this.hA(afk_02.Sn());
                    bl = true;
                }
            } else {
                int n6 = this.xp(3);
                for (int i = 0; i < n5; ++i) {
                    afk_0 afk_03 = arrayList.get(i);
                    if (afk_03.bxZ() != n2 || afk_03.getAltitude() != (float)n6) continue;
                    this.hA(afk_03.Sn());
                    bl = true;
                }
            }
        }
        if (!bl) {
            this.cah();
            this.a(bvc_2.lrR, "L'element interactif de type=" + n2 + " en (" + n3 + "," + n4 + ") n'existe pas");
        }
    }
}

