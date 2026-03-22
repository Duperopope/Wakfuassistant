/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dfb
extends afk_1 {
    dfb(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "manageFrame";
    }

    @Override
    public String getDescription() {
        return "Active ou d\u00e9sactive des frames, donc des types d'interactions entre l'utilisateur et le jeu.";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.ohX;
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        String string = this.xu(0);
        adi_1 adi_12 = "FightItemUse".equalsIgnoreCase(string) ? cud_1.eSz() : ("ControlCenter".equalsIgnoreCase(string) ? cty_1.ePV() : ("Chat".equalsIgnoreCase(string) ? csz_1.ePn() : ("Shortcut".equalsIgnoreCase(string) ? cxx_2.eXH() : ("World".equalsIgnoreCase(string) ? czi_2.eYU() : ("Overhead".equalsIgnoreCase(string) ? cxq_1.eWO() : ("FightMovementFrame".equalsIgnoreCase(string) ? cue_2.eSA() : ("Equipment".equalsIgnoreCase(string) ? cvo_2.eUK() : ("CharacterSheet".equalsIgnoreCase(string) ? csx_1.ePi() : ("TemporaryInventory".equalsIgnoreCase(string) ? cyv_2.eXZ() : ("FightEndFrame".equalsIgnoreCase(string) ? cux_2.eSa() : ("SystemBar".equalsIgnoreCase(string) ? cyt_1.eXX() : ("MRU".equalsIgnoreCase(string) ? cwd_2.eVe() : ("Menu".equalsIgnoreCase(string) ? cwq_2.eVS() : ("UITimelineFrame".equalsIgnoreCase(string) ? cya_1.eYj() : ("Protector".equalsIgnoreCase(string) ? cxe_1.eXq() : null)))))))))))))));
        boolean bl = this.xx(1);
        ddU.ohA.info((Object)(bl ? "On remet la frame " + string : "On enl\u00e8ve la frame " + string));
        if (adi_12 != null) {
            if (bl) {
                if (!aue_0.cVJ().c(adi_12)) {
                    aue_0.cVJ().a(adi_12);
                } else {
                    this.a(ddU.ohA, " On essaie de pousser une frame qui est d\u00e9j\u00e0 l\u00e0. C'est soit un bug, soit une erreur dans un sc\u00e9nario.");
                }
            } else {
                aue_0.cVJ().b(adi_12);
            }
        } else {
            this.a(ddU.ohA, "Cette frame n'est pas support\u00e9e par manageFrame " + string);
        }
    }
}

