/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.THashMap
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.map.hash.THashMap;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from aWQ
 */
public class awq_0
extends aga_2 {
    private final bhJ hvN;
    private long hvO = Long.MIN_VALUE;
    private afd_1 hvP;

    public awq_0(int n, bhJ bhJ2, @Nullable String string, long l) {
        super(agb_1.cbm(), 0, 0);
        this.hvN = bhJ2;
        this.f(new bvz_2(this));
        if (string != null) {
            THashMap tHashMap = new THashMap(1);
            tHashMap.put((Object)string, (Object)l);
            this.t((Map<String, Object>)tHashMap);
        }
        this.xV(n);
    }

    public void f(afd_1 afd_12) {
        this.hvP = afd_12;
    }

    public bhJ cXJ() {
        return this.hvN;
    }

    public void iI(long l) {
        this.hvO = l;
    }

    public long cXK() {
        return this.hvO;
    }

    @Override
    public void a(afx_1 afx_12, afc_1 afc_12, String string) {
        if (this.hvP != null) {
            this.hvP.a(afx_12, afc_12, string);
        }
        super.a(afx_12, afc_12, string);
    }

    @Override
    public void b(afx_1 afx_12) {
        if (this.hvP != null) {
            this.hvP.b(afx_12);
        }
        super.b(afx_12);
    }

    @Override
    public void a(afx_1 afx_12) {
        if (this.hvP != null) {
            this.hvP.a(afx_12);
        }
        super.a(afx_12);
    }
}

