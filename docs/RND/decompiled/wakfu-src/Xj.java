/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.text.EntityText;

public class Xj
extends xi_0
implements xa_0 {
    private int o;
    private int atn = 1;

    public Xj(awh_2 awh_22, String string, int n) {
        super(awh_22, string, n);
    }

    protected void bkZ() {
        this.a(new Xl());
    }

    @Override
    public void a(aaj_0 aaj_02, int n) {
        this.qy(n);
    }

    @Override
    public int d() {
        return this.o;
    }

    @Override
    public void lK(int n) {
        this.o = n;
    }

    @Override
    public int aHp() {
        return this.atn;
    }

    @Override
    public void ma(int n) {
        this.atn = n;
    }

    @Override
    public void b(float f2, float f3, float f4, float f5) {
        this.bny().a(new acr_1(f2, f3, -1.0f));
        this.bny().ce((int)f4, (int)f5 + 3);
    }

    @Override
    public final EntityText bny() {
        return super.bny();
    }

    @Override
    public void bmX() {
    }

    @Override
    public /* synthetic */ Entity getEntity() {
        return this.bny();
    }
}

