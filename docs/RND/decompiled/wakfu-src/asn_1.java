/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;

/*
 * Renamed from asN
 */
public class asn_1 {
    private final asy_2 cZD;
    public final String cZE;
    public String cZk;
    private int cWV;
    private boolean cHn = true;
    private final float cZF = 1.0f;
    protected long cwf = 0L;
    protected final asl_1 cZG;
    private boolean cfs;

    public asn_1(String string, String string2, asl_1 asl_12) {
        this.cZE = string;
        this.cZk = string2;
        this.cWV = arn_2.fW(string2);
        this.cZD = new asy_2();
        this.cZD.x(fq_0.bJ(string), string);
        ast_1.bJG().a(this.cZD);
        this.cZG = asl_12;
    }

    public void qF(int n) {
        this.cwf += (long)n;
    }

    public final boolean bJW() {
        return this.cHn;
    }

    public final void cQ(boolean bl) {
        this.cHn = bl;
    }

    public final boolean bJX() {
        return this.cHn;
    }

    public final asy_2 bJY() {
        return this.cZD;
    }

    public final int bJZ() {
        return this.cWV;
    }

    public void a(EntitySprite entitySprite) {
        entitySprite.a(this.bJY(), this.bJZ(), this.cZG);
        entitySprite.b(arn_2.bIc().cVd);
    }

    public void bY(boolean bl) {
        this.cfs = bl;
    }

    public boolean bKa() {
        return this.cfs;
    }

    public void gg(String string) {
        this.cZk = string;
        this.cWV = arn_2.fW(string);
    }
}

