/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.ankamagames.baseImpl.graphics.isometric.particles;

import com.ankamagames.baseImpl.graphics.isometric.particles.IsoParticleSystem;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;

public class FreeParticleSystem
extends IsoParticleSystem
implements WQ,
afW {
    private afW cfP;
    private int bsx = -1;
    private int bVF = Integer.MIN_VALUE;
    private int bVG = Integer.MIN_VALUE;
    private int bVH;
    private ArrayList<WR> bVI;

    public FreeParticleSystem(boolean bl) {
        super(bl);
    }

    @Override
    public boolean bzp() {
        return this.uz(this.bha());
    }

    @Override
    public float aSc() {
        if (this.cfP != null) {
            return this.cfP.getWorldX();
        }
        return super.aSc();
    }

    @Override
    public float aSd() {
        if (this.cfP != null) {
            return this.cfP.getWorldY();
        }
        return super.aSd();
    }

    @Override
    public float aSe() {
        if (this.cfP != null) {
            return this.cfP.getAltitude();
        }
        return super.aSe();
    }

    public afW btr() {
        return this.cfP;
    }

    public void a(@Nullable afW afW2) {
        if (afW2 == this.cfP) {
            return;
        }
        if (this.cfP instanceof ahb) {
            ((ahb)((Object)this.cfP)).b(this);
        }
        this.cfP = afW2;
        if (this.cfP instanceof ahb) {
            ((ahb)((Object)this.cfP)).a(this);
        }
    }

    @Override
    public boolean isVisible() {
        boolean bl = super.isVisible();
        if (this.cfP != null) {
            return bl && this.cfP.isVisible();
        }
        return bl;
    }

    public void a(ZC zC, float f2, int n) {
        this.a(f2 == 0.0f && n == 0 ? zC : new afT(zC, f2, n));
    }

    @Override
    public float getAltitude() {
        return this.aSe();
    }

    @Override
    public float getWorldX() {
        return this.aSc();
    }

    @Override
    public float getWorldY() {
        return this.aSd();
    }

    @Override
    public void aB(float f2, float f3) {
        this.aw(f2, f3);
    }

    @Override
    public void e(float f2, float f3, float f4) {
        this.r(f2, f3, f4);
    }

    @Override
    public int getScreenX() {
        return this.bVF;
    }

    @Override
    public int getScreenY() {
        return this.bVG;
    }

    @Override
    public void qu(int n) {
        if (this.bVF == n) {
            return;
        }
        this.bVF = n;
        this.bqm();
    }

    @Override
    public void qv(int n) {
        if (this.bVG == n) {
            return;
        }
        this.bVG = n;
        this.bqm();
    }

    @Override
    public void qw(int n) {
        if (this.bVH == n) {
            return;
        }
        this.bVH = n;
        this.bqm();
    }

    @Override
    public int bng() {
        return this.bVH;
    }

    @Override
    public boolean bnh() {
        return this.bVF != Integer.MIN_VALUE && this.bVG == Integer.MIN_VALUE;
    }

    @Override
    public void a(WR wR) {
        if (this.bVI == null) {
            this.bVI = new ArrayList(1);
        }
        this.bVI.add(wR);
    }

    @Override
    public void b(WR wR) {
        if (this.bVI == null) {
            return;
        }
        this.bVI.remove(wR);
        if (this.bVI.isEmpty()) {
            this.bVI = null;
            this.bVG = Integer.MIN_VALUE;
            this.bVF = Integer.MIN_VALUE;
        }
    }

    protected void bqm() {
        if (this.bVI != null) {
            int n = this.bVI.size();
            for (int i = 0; i < n; ++i) {
                this.bVI.get(i).a(this, this.bVF, this.bVG, this.bVH);
            }
        }
    }

    public int bha() {
        afW afW2 = this.cfP;
        if (afW2 instanceof afT) {
            afW2 = ((afT)afW2).btr();
        }
        if (afW2 instanceof arj_2) {
            return ((arj_2)((Object)afW2)).bqo();
        }
        return this.bsx;
    }

    public void pu(int n) {
        this.bsx = n;
    }

    @Override
    public float bpZ() {
        return this.azR;
    }

    @Override
    public boolean bzq() {
        return this.cfP != null || super.bzq();
    }

    @Override
    public int bzr() {
        if (this.cfP instanceof ZC) {
            return ((ZC)this.cfP).bpv() + (this.aNi ? -1 : 1);
        }
        return super.bzr();
    }

    @Override
    public boolean f(afV afV2) {
        if (this.cfP != null) {
            ZC zC;
            Entity entity;
            afW afW2 = this.cfP;
            if (afW2 instanceof afT) {
                afW2 = ((afT)afW2).btr();
            }
            if (afW2 instanceof ZC && (entity = (zC = (ZC)afW2).bpq()) != null) {
                this.cWM = entity.cWM + (long)(this.aNi ? -1 : 1);
                if (this.cWM < 0L) {
                    this.cWM = 0L;
                }
                this.a(zC.bqh(), zC.bqi());
                return true;
            }
        }
        return super.f(afV2);
    }

    @Override
    public void brr() {
        super.brr();
        this.bsx = -1;
        this.bVF = Integer.MIN_VALUE;
        this.bVG = Integer.MIN_VALUE;
        this.bVH = 0;
        this.bVI = null;
    }

    @Override
    public void brs() {
        super.brs();
        this.a((afW)null);
    }

    public String toString() {
        return "FreeParticleSystem{m_target=" + String.valueOf(this.cfP) + ", m_fightId=" + this.bsx + ", m_screenX=" + this.bVF + ", m_screenY=" + this.bVG + ", m_screenHeight=" + this.bVH + ", m_watchers=" + String.valueOf(this.bVI) + "}";
    }
}

