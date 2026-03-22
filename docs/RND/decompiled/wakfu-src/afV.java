/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 *  org.jetbrains.annotations.NotNull
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import gnu.trove.list.array.TLongArrayList;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public class afV
extends axq_1 {
    public static final float crU = 86.0f;
    public static final float crV = 43.0f;
    public static final float crW = 10.0f;
    public static final float crX = 4.8f;
    protected float crY = 86.0f;
    protected float crZ = 43.0f;
    protected float csa = 10.0f;
    protected final ArrayList<Entity> csb;
    protected final ArrayList<Entity> csc;
    protected final TLongArrayList csd;
    protected final ArrayList<Entity> cse;
    protected final agb csf;
    private aga csg = aga.csK;

    public afV() {
        this.csf = this.bqK();
        this.csb = new ArrayList(2048);
        this.csd = new TLongArrayList(2048);
        this.csc = new ArrayList(1024);
        this.cse = new ArrayList(3072);
    }

    public void a(@NotNull aga aga2) {
        this.csg.clear();
        this.csg = aga2;
    }

    public void a(Entity entity, boolean bl) {
        if (!this.csg.d(entity, bl)) {
            return;
        }
        this.b(entity, bl);
    }

    public void b(Entity entity, boolean bl) {
        if (bl) {
            this.csb.add(entity);
        } else {
            this.csc.add(entity);
        }
    }

    public final void c(Entity entity, boolean bl) {
        if (bl) {
            this.csb.remove(entity);
        } else {
            this.csc.remove(entity);
        }
    }

    public float byr() {
        return this.crY;
    }

    public void cv(float f2) {
        this.crY = f2;
    }

    public float bys() {
        return this.crZ;
    }

    public void cw(float f2) {
        this.crZ = f2;
    }

    public float byt() {
        return this.csa;
    }

    public void cx(float f2) {
        this.csa = f2;
    }

    public final agb byu() {
        return this.csf;
    }

    public agf brf() {
        return (agf)this.csf;
    }

    public afW byv() {
        return this.brf().byR();
    }

    public void b(afW afW2) {
        this.brf().c(afW2);
    }

    public void bqT() {
        this.brf().byP();
    }

    public float byw() {
        if (this.csf != null) {
            return this.brf().byw();
        }
        return 1.0f;
    }

    public void cy(float f2) {
        if (this.csf != null) {
            this.brf().cy(f2);
        }
    }

    protected agb bqK() {
        return new agf(this);
    }

    public float aM(float f2, float f3) {
        return (f2 - f3) * this.crY * 0.5f;
    }

    public float aN(float f2, float f3) {
        return -(f2 + f3) * this.crZ * 0.5f;
    }

    public float j(float f2, float f3, float f4) {
        return this.aN(f2, f3) + f4 * this.csa;
    }

    public float aO(float f2, float f3) {
        return f2 / this.crY - f3 / this.crZ;
    }

    public float k(float f2, float f3, float f4) {
        return f2 / this.crY - (f3 - f4 * this.csa) / this.crZ;
    }

    public float aP(float f2, float f3) {
        return -(f2 / this.crY + f3 / this.crZ);
    }

    public float l(float f2, float f3, float f4) {
        return -(f2 / this.crY + (f3 - f4 * this.csa) / this.crZ);
    }

    protected long l(int n, int n2, int n3, int n4) {
        return afX.a(n, n2, n3, n4);
    }

    public ArrayList<Entity> byx() {
        return this.csb;
    }

    public boolean a(agV agV2, Entity entity, int n, int n2, int n3, int n4, boolean bl) {
        entity.cWM = this.l(n, n2, n3, n4);
        return true;
    }

    public final boolean a(agV agV2, Entity entity, int n, int n2, int n3, int n4) {
        return this.a(agV2, entity, n, n2, n3, n4, false);
    }

    public float[] a(agV agV2) {
        return aaE.brU().b(agV2);
    }

    public void n(List<DisplayedScreenElement> list) {
        this.csg.a(this, list);
    }

    public boolean e(ZC zC) {
        return this.csg.e(zC);
    }

    public static float bB(int n, int n2) {
        return (float)(n - n2) * 86.0f * 0.5f;
    }

    public static float bC(int n, int n2) {
        return (float)(-(n + n2)) * 43.0f * 0.5f;
    }

    public void cn(boolean bl) {
        if (this.csf instanceof agf) {
            ((agf)this.csf).cp(bl);
        }
    }
}

