/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import java.util.Random;
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from dec
 */
class dec_0
extends afk_1 {
    dec_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "addEmoteShortcut";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.oiE;
    }

    @Override
    public String getDescription() {
        return "Ajoute l'emote sp?cifi?e dans la barre de raccourci d'item courante";
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        int n2 = this.xp(0);
        short s = -1;
        boolean bl = n > 2;
        blg_2 blg_22 = bgt_02.dlG().edn();
        if (bl && !blg_22.ah(s = (short)((short)this.xp(1)))) {
            bl = false;
        }
        if (!bl) {
            s = blg_22.beO();
        }
        if (s == -1) {
            return;
        }
        if (blg_22.HY(n2) == null) {
            blb_2 blb_22 = blb_2.a(fqu_0.sTu, new Random().nextLong(), n2, n2);
            dcz dcz2 = new dcz();
            dcz2.aL(blb_22);
            dcz2.lb(true);
            dcz2.NO(bgt_02.dlG().edo());
            dcz2.pz(s);
            dcz2.cC(false);
            dcz2.lK(19934);
            aaw_1.bUq().h(dcz2);
        }
    }
}

