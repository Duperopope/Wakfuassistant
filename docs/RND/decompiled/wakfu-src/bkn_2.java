/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;

/*
 * Renamed from bkN
 */
class bkn_2 {
    static final ZJ irV;
    int cDu;
    static final /* synthetic */ boolean irW;

    bkn_2() {
    }

    void ab(bhJ bhJ2) {
        bdj_2 bdj_22 = bhJ2.ddI();
        bdj_22.a(abi_1.dzk);
        if (!bhJ2.dmc()) {
            bdj_22.a(irV);
        }
        bdj_22.dT("AnimDesincarnation");
        FreeParticleSystem freeParticleSystem = agY.bzw().sk(bhJ2.dlC());
        this.cDu = freeParticleSystem.bLJ();
        freeParticleSystem.a(bdj_22);
        agZ.bzy().b(freeParticleSystem);
    }

    void ac(bhJ bhJ2) {
        if (!irW && this.cDu == 0) {
            throw new AssertionError();
        }
        agZ.bzy().so(this.cDu);
        bhJ2.ddI().b(irV);
        this.cDu = 0;
    }

    static {
        irW = !bkk_2.class.desiredAssertionStatus();
        irV = new bko_2();
    }
}

