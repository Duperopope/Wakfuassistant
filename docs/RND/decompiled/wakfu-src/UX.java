/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedList;

public abstract class UX
extends ff_1
implements sg_0 {
    public final Va bxu = new UY(this, this);
    protected final LinkedList<UZ> bxv = new LinkedList();
    protected long bxw;
    protected long aDh;
    protected String aFD;
    public static final byte[] bxx = new byte[0];
    private final fi_1[] bxy = new fi_1[]{this.bxu};

    @Override
    public String beT() {
        return "player=" + this.KU();
    }

    public void a(UZ uZ) {
        this.bxv.add(uZ);
    }

    public boolean b(UZ uZ) {
        return this.bxv.remove(uZ);
    }

    public void reset() {
        this.aDh = 0L;
        this.aFD = null;
        this.bxw = 0L;
    }

    public byte[] apI() {
        return this.a(this.zj());
    }

    @Override
    public fi_1[] zj() {
        return this.bxy;
    }

    public long KU() {
        return this.aDh;
    }

    public void db(long l) {
        this.aDh = l;
    }

    public String getName() {
        return this.aFD;
    }

    public void dm(String string) {
        this.aFD = string;
    }

    public long aZj() {
        return this.bxw;
    }

    public void fr(long l) {
        this.bxw = l;
    }

    public String toString() {
        return "CharacterGlobalData{m_clientId=" + this.bxw + ", m_characterId=" + this.aDh + ", m_characterName='" + this.aFD + "'}";
    }
}

