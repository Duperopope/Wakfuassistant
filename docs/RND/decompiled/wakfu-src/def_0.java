/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from def
 */
class def_0
extends afk_1 {
    def_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "AddItemShortcut";
    }

    @Override
    public String getDescription() {
        return "Ajoute un raccourci d'item donn\u00e9 aux barres de raccourci";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.oiI;
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        Object object;
        ffV ffV2;
        boolean bl;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        String string = this.xu(0);
        long l = this.xs(1);
        boolean bl2 = bl = n > 2;
        if ("uid".equalsIgnoreCase(string)) {
            ffV2 = bgt_02.dno().tb(l);
        } else if ("refId".equalsIgnoreCase(string)) {
            object = bgt_02.dno().pd((int)l);
            ffV2 = object.toArray(new ffV[0])[0];
        } else {
            ddU.ohA.warn((Object)("Type de r\u00e9f\u00e9rence (uid, ref id) inconnu pour ajouter un item : " + string));
            return;
        }
        if (ffV2 == null) {
            return;
        }
        object = bgt_02.dlG();
        fqt_0 fqt_02 = ((blh_2)object).ede();
        bgv_2 bgv_22 = (bgv_2)ffV2.dOg();
        if (!(ffV2.fAu() && fqt_02 == fqt_0.sTc || fqt_02 == fqt_0.sTd && (bgv_22.dSz().dSD() || ffV2.beB()))) {
            if (!(ffV2.beB() || ffV2.fAu() || bgv_22.dSz().dSD())) {
                return;
            }
            dcz dcz2 = new dcz();
            dcz2.aL(ffV2);
            dcz2.lb(true);
            dcz2.NO(-1);
            dcz2.pz(-1);
            dcz2.cC(false);
            dcz2.lK(19934);
            aaw_1.bUq().h(dcz2);
            return;
        }
        blg_2 blg_22 = fqt_02 == fqt_0.sTd ? ((blh_2)object).edi() : ((blh_2)object).edn();
        int n2 = -1;
        if (bl && !blg_22.ah((short)(n2 = (int)((short)this.xp(2))))) {
            bl = false;
        }
        dcz dcz3 = new dcz();
        dcz3.aL(ffV2);
        dcz3.lb(true);
        dcz3.NO(((blh_2)object).a(blg_22));
        dcz3.pz(bl ? n2 : -1);
        dcz3.cC(false);
        dcz3.lK(19934);
        aaw_1.bUq().h(dcz3);
    }
}

