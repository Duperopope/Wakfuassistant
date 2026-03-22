/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.IsoParticleSystem;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aku
 */
public class aku_1
extends alz_1<akp_1> {
    private static final Logger cCX = Logger.getLogger(aku_1.class);
    public static final String cCY = "playApsSound";
    private static final afe_1[] cCZ = new afe_1[]{new afe_1("soundFileId", null, aff_2.dJw, false), new afe_1("fightId", null, aff_2.dJy, false), new afe_1("gain", null, aff_2.dJz, false), new afe_1("apsId", null, aff_2.dJy, false), new afe_1("duration", null, aff_2.dJy, false), new afe_1("fadeOutTime", null, aff_2.dJy, false), new afe_1("rollOffId", null, aff_2.dJy, false), new afe_1("loop", null, aff_2.dJA, false), new afe_1("minPitch", null, aff_2.dJz, true), new afe_1("maxPitch", null, aff_2.dJz, true)};

    public aku_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return cCY;
    }

    @Override
    public afe_1[] bBg() {
        return cCZ;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    protected akp_1 sC(int n) {
        long l = this.xs(0);
        int n2 = this.xp(1);
        float f2 = this.xr(2);
        int n3 = this.xp(3);
        int n4 = this.xp(4);
        int n5 = this.xp(5);
        int n6 = this.xp(6);
        boolean bl = this.xx(7);
        if (n < 10) {
            return new akp_1(new akq_2(l, n2, n3), f2, n4, n5, n6, bl);
        }
        float f3 = this.xr(8);
        float f4 = this.xr(9);
        return new akp_1(new akq_2(l, n2, n3), f2, f3, f4, n4, n5, n6, bl);
    }

    @Override
    protected void a(akp_1 akp_12, afx_1 afx_12) {
        long l = System.currentTimeMillis();
        long l2 = ((akq_2)akp_12.aHA()).bBy();
        if (!age_1.cbv().f(l, l2)) {
            return;
        }
        long l3 = akp_12.getDuration() != -1 ? l + (long)akp_12.getDuration() : -1L;
        long l4 = akp_12.bBF() != 0 ? l3 - (long)akp_12.bBF() : -1L;
        IsoParticleSystem isoParticleSystem = agZ.bzy().sn(((akq_2)akp_12.aHA()).bBE());
        try {
            if (l2 != 0L) {
                ahm_1 ahm_12 = isoParticleSystem != null ? aiv_2.bBr().a(l2, akp_12.bBt() / 100.0f, akp_12.bBN(), akp_12.bBD() ? 0 : 1, l3, l4, ((akq_2)akp_12.aHA()).bha(), (agn_1)isoParticleSystem, akp_12.bBG(), false) : aiv_2.bBr().a(l2, akp_12.bBt() / 100.0f, akp_12.bBN(), akp_12.bBD() ? 0 : 1, l3, l4, ((akq_2)akp_12.aHA()).bha());
                if (ahm_12 != null) {
                    age_1.cbv().a(((akq_2)akp_12.aHA()).bBE(), ahm_12.ccq(), l, l2);
                }
            } else {
                cCX.error((Object)"Id du son nul");
            }
        }
        catch (Exception exception) {
            this.a(cCX, "soundExtension or soundPath not initialized " + String.valueOf(exception));
        }
    }

    @Override
    protected /* synthetic */ Object sA(int n) {
        return this.sC(n);
    }
}

