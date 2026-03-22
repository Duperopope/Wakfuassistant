/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dem
extends afk_1 {
    dem(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "addSpellShortcut";
    }

    @Override
    public String getDescription() {
        return "Ajoute un lien vers un sort dans la barre de raccourcis active.";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.oiH;
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        Object c2;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        String string = this.xu(0);
        long l = this.xs(1);
        short s = -1;
        boolean bl = n > 2;
        blg_2 blg_22 = bgt_02.dlG().ck((byte)0);
        if (bl && !blg_22.ah(s = (short)((short)this.xp(2)))) {
            bl = false;
        }
        if (!bl) {
            s = blg_22.beO();
        }
        if (s == -1) {
            return;
        }
        fqP<bmx_0> fqP2 = bgt_02.dkB();
        if (fqP2 == null) {
            ddU.ohA.warn((Object)("No spell inventory when trying to add spell : " + string + " for player " + bgt_02.Sn() + "/" + bgt_02.aZj()));
            return;
        }
        if ("uid".equalsIgnoreCase(string)) {
            c2 = fqP2.dN(l);
            if (c2 == null) {
                return;
            }
        } else if ("refId".equalsIgnoreCase(string)) {
            c2 = fqP2.pc((int)l);
            if (c2 == null) {
                return;
            }
        } else {
            ddU.ohA.warn((Object)("Reference type (uid, ref id) unknown when trying to add a spell : " + string));
            return;
        }
        dcz dcz2 = new dcz();
        dcz2.aL(c2);
        dcz2.lb(true);
        dcz2.NO(bgt_02.dlG().a(blg_22));
        dcz2.pz(s);
        dcz2.cC(false);
        dcz2.lK(19934);
        aaw_1.bUq().h(dcz2);
    }
}

