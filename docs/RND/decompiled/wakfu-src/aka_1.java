/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.IsoParticleSystem;
import java.util.List;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from akA
 */
public class aka_1
extends aly_1<akb_1> {
    private static final Logger cDq = Logger.getLogger(aka_1.class);
    public static final String cDr = "playRandomApsSound";
    private static final afe_1[] cDs = new afe_1[]{new afe_1("fightId", null, aff_2.dJy, false), new afe_1("apsId", null, aff_2.dJy, false), new afe_1("duration", null, aff_2.dJy, false), new afe_1("fadeOutTime", null, aff_2.dJy, false), new afe_1("rollOffId", null, aff_2.dJy, false), new afe_1("loop", null, aff_2.dJA, false), new afe_1("soundId, gain", null, aff_2.dJC, true)};

    public aka_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return cDr;
    }

    @Override
    public afe_1[] bBg() {
        return cDs;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    protected akb_1 sF(int n) {
        int n2 = this.xp(0);
        int n3 = this.xp(1);
        int n4 = this.xp(2);
        int n5 = this.xp(3);
        int n6 = this.xp(4);
        boolean bl = this.xx(5);
        if (n < 7) {
            return new akb_1(n2, n3, n4, n5, n6, bl);
        }
        List<alq_1> list = this.g(6, n, false);
        return new akb_1(n2, n3, n4, n5, n6, bl, list);
    }

    @Override
    protected void a(akb_1 akb_12, afx_1 afx_12) {
        alq_1 alq_12 = this.o(akb_12.bBH());
        long l = System.currentTimeMillis();
        if (!age_1.cbv().f(l, alq_12.aYj())) {
            return;
        }
        long l2 = l + (long)akb_12.getDuration();
        long l3 = akb_12.bBF() != 0 ? l2 - (long)akb_12.bBF() : 0L;
        IsoParticleSystem isoParticleSystem = agZ.bzy().sn(akb_12.bBE());
        try {
            if (alq_12.aYj() != 0L) {
                ahm_1 ahm_12 = isoParticleSystem == null ? aiv_2.bBr().a(alq_12.aYj(), alq_12.bBt() / 100.0f, alq_12.bBN(), akb_12.bBD() ? 0 : 1, l2, l3, akb_12.bha()) : aiv_2.bBr().a(alq_12.aYj(), alq_12.bBt() / 100.0f, alq_12.bBN(), akb_12.bBD() ? 0 : 1, l2, l3, akb_12.bha(), (agn_1)isoParticleSystem, akb_12.bBG(), false);
                if (ahm_12 != null) {
                    age_1.cbv().a(akb_12.bBE(), ahm_12.ccq(), l, alq_12.aYj());
                }
            } else {
                cDq.error((Object)"Id du son nul");
            }
        }
        catch (Exception exception) {
            this.a(cDq, "soundExtension or soundPath not initialized " + String.valueOf(exception));
        }
    }

    @Override
    protected /* synthetic */ Object sA(int n) {
        return this.sF(n);
    }
}

