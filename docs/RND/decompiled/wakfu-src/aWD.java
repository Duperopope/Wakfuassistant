/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;

public final class aWD
extends aWB {
    public aWD(int n, int n2, int n3, int n4, long l, acd_1 acd_12) {
        super(n, n2, n3, n4, l, acd_12, "AnimSort-Portail-Saut-Debut", "AnimSort-Portail-Saut-Fin");
    }

    void f(afW afW2) {
        FreeParticleSystem freeParticleSystem = agY.bzw().sk(1018808);
        freeParticleSystem.e(afW2.getWorldX(), afW2.getWorldY(), afW2.getAltitude());
        freeParticleSystem.pu(this.bha());
        agZ.bzy().b(freeParticleSystem);
    }

    @Override
    protected void a(bdj_2 bdj_22) {
        abg_2.bUP().a((Runnable)new aWE(this, bdj_22), 500L, 1);
    }

    @Override
    protected void T(bgy bgy2) {
        this.f(bgy2.hKX);
    }
}

