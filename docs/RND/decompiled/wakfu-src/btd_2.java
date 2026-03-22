/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bTD
 */
public class btd_2
extends afr_1 {
    static final afe_1[] lqd = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false), new afe_1("fromMobileId", null, aff_2.dJw, false)};
    static final afe_1[] lqe = new afe_1[]{new afe_1("mobileId", "Use Mobile.generateClientMobileId() if you don't know what you do", aff_2.dJw, false), new afe_1("spriteName", "GFX name", aff_2.dJx, false), new afe_1("worldX", "Position X", aff_2.dJy, false), new afe_1("worldY", "Position Y", aff_2.dJy, false), new afe_1("altitude", "Position Z", aff_2.dJy, false), new afe_1("availableDirection", "Available movement directions (use 4 if isn't a character class)", aff_2.dJy, true), new afe_1("setId", "Equipped set id", aff_2.dJy, true)};
    static final afe_1[] lqf = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false), new afe_1("height", null, aff_2.dJy, false)};
    static final afe_1[] lqg = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false)};
    static final afe_1[] lqh = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false), new afe_1("layer", "Layer id (default = 7)", aff_2.dJy, false)};
    static final afe_1[] lqi = new afe_1[]{new afe_1("mobileId", "Mobile id", aff_2.dJw, false)};
    static final afe_1[] lqj = new afe_1[]{new afe_1("mobileId", "Mobile id", aff_2.dJw, false)};
    static final afe_1[] lqk = new afe_1[]{new afe_1("sex", "Mobile gender (0 = male, 1 = female)", aff_2.dJy, false)};
    static final afe_1[] lql = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false), new afe_1("source", null, aff_2.dJx, false), new afe_1("partNames", null, aff_2.dJC, true)};
    static final afe_1[] lqm = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false), new afe_1("skinId", null, aff_2.dJx, false), new afe_1("callback", null, aff_2.dJx, true), new afe_1("args", null, aff_2.dJC, true)};
    static final afe_1[] lqn = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false), new afe_1("source", null, aff_2.dJx, false), new afe_1("partNames", null, aff_2.dJC, true)};
    static final afe_1[] lqo = new afe_1[]{new afe_1("characterId", null, aff_2.dJw, false)};
    static final afe_1[] lqp = new afe_1[]{new afe_1("weaponTypeId", null, aff_2.dJy, false)};
    static final afe_1[] lqq = new afe_1[]{new afe_1("characterId", null, aff_2.dJw, false)};
    static final afe_1[] lqr = new afe_1[]{new afe_1("handsOccuped", null, aff_2.dJy, false)};
    static final afe_1[] lqs = new afe_1[]{new afe_1("srcId", "Mobile model id", aff_2.dJw, false), new afe_1("destId", "Mobile destination id", aff_2.dJw, false)};
    static final afe_1[] lqt = new afe_1[]{new afe_1("spellId", "Spell id of spell added", aff_2.dJy, false), new afe_1("position", "Slot index", aff_2.dJy, true)};
    static final afe_1[] lqu = new afe_1[]{new afe_1("petOwner", "Character id of pet owner", aff_2.dJw, false)};
    static final afe_1[] lqv = new afe_1[]{new afe_1("activePetMobileId", "Return id of mobile of pet or -1 if pet owner isn't a character or if current character doesn't have pet mobile", aff_2.dJw, false)};
    private static final btd_2 lqw = new btd_2();

    @Override
    public final String getName() {
        return "Actor";
    }

    @Override
    public String getDescription() {
        return "NO Description<br/>Please Dev... implement me!";
    }

    private btd_2() {
    }

    public static btd_2 eok() {
        return lqw;
    }

    @Override
    public afk_1[] a(LuaState luaState) {
        return new afk_1[]{new btf_2(luaState), new btl_2(luaState), new btn_2(luaState), new btt_2(luaState), new btu_2(luaState), new bts_2(luaState), new bth_2(luaState), new btg_2(luaState), new bti_2(luaState), new bto_2(luaState), new btq_2(luaState), new btr_2(luaState), new btk_2(luaState), new btz_2(luaState), new buz_2(luaState), new bwi_1(luaState), new bte_2(luaState), new bxq_2(luaState), new btp_2(luaState)};
    }

    @Override
    public afk_1[] b(LuaState luaState) {
        return null;
    }

    static /* synthetic */ Logger aGh() {
        return dIl;
    }

    static /* synthetic */ Logger aGi() {
        return dIl;
    }

    static /* synthetic */ Logger aGj() {
        return dIl;
    }

    static /* synthetic */ Logger aGR() {
        return dIl;
    }

    static /* synthetic */ Logger aGS() {
        return dIl;
    }

    static /* synthetic */ Logger dof() {
        return dIl;
    }

    static /* synthetic */ Logger doX() {
        return dIl;
    }

    static /* synthetic */ Logger dog() {
        return dIl;
    }

    static /* synthetic */ Logger doh() {
        return dIl;
    }

    static /* synthetic */ Logger doi() {
        return dIl;
    }

    static /* synthetic */ Logger dqb() {
        return dIl;
    }

    static /* synthetic */ Logger doj() {
        return dIl;
    }

    static /* synthetic */ Logger dqc() {
        return dIl;
    }

    static /* synthetic */ Logger dqd() {
        return dIl;
    }

    static /* synthetic */ Logger dqe() {
        return dIl;
    }

    static /* synthetic */ Logger dok() {
        return dIl;
    }
}

