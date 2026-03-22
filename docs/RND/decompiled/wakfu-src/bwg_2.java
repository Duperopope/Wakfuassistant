/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bWG
 */
final class bwg_2
extends afk_1 {
    private static final afe_1[] luk = new afe_1[]{new afe_1("posX", null, aff_2.dJy, false), new afe_1("posY", null, aff_2.dJy, false), new afe_1("posZ", null, aff_2.dJy, false)};
    private static final String lul = "getAreaPosition";
    private static final String lum = "Permet de r?cup?rer les coordonn?es de la zone associ?e de l'action";
    private final aVe lun;

    bwg_2(LuaState luaState, aVe aVe2) {
        super(luaState);
        this.lun = aVe2;
    }

    @Override
    public String getName() {
        return lul;
    }

    @Override
    public afe_1[] bBg() {
        return null;
    }

    @Override
    public afe_1[] bBh() {
        return luk;
    }

    @Override
    protected void ss(int n) {
        QR qR = this.lun.bai();
        if (qR == null) {
            return;
        }
        QQ qQ = qR.dp(this.lun.caQ());
        if (qQ == null) {
            return;
        }
        this.xC(qQ.bcC());
        this.xC(qQ.bcD());
        this.xC(qQ.bcE());
    }

    @Override
    public String getDescription() {
        return lum;
    }
}

