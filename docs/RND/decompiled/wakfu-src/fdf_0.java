/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TShortHashSet
 */
import gnu.trove.set.hash.TShortHashSet;
import java.util.Map;

/*
 * Renamed from fdF
 */
public class fdf_0
extends fdz_0 {
    public static final fdf_0 rWZ = new fdf_0(0);
    private final fiH<fdg_0> rXa = new fiH();
    private final TShortHashSet rXb = new TShortHashSet();

    public fdf_0(int n) {
        super(n, 0, eIx.qwB, 0);
    }

    @Override
    public int clf() {
        throw new UnsupportedOperationException("On essaye de r\u00e9cup\u00e9rer un visuel qu'on ne doit pas r\u00e9cup\u00e9rer");
    }

    public void l(fdg_0 fdg_02) {
        this.rXa.a(fdg_02);
        this.rXb.add(fdg_02.bdL());
    }

    public fdg_0 u(Object object, Object object2, Object object3, Object object4) {
        return this.rXa.w(object, object2, object3, object4).orElse(null);
    }

    public fdg_0 Ul(int n) {
        return this.rXa.Wa(n);
    }

    public Map<Integer, fdg_0> fTF() {
        return this.rXa.fZX();
    }

    public boolean fTG() {
        return this.rXa.aVo() != 0;
    }

    public short[] fTH() {
        return this.rXb.toArray();
    }

    public String toString() {
        return "IETeleporterParameter{m_id=" + this.d() + ", m_destinations=" + String.valueOf(this.rXa) + ", m_instanceIds=" + String.valueOf(this.rXb) + "}";
    }
}

