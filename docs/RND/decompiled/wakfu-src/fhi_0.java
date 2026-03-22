/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;

/*
 * Renamed from fhI
 */
public class fhi_0
implements sg_0,
gq_0<yd_2>,
Serializable {
    private static final Logger spQ = Logger.getLogger(fhi_0.class);
    public static final fhi_0 spR = new fhf_0();
    private Map<Byte, fhn_0> jVs = new HashMap<Byte, fhn_0>();
    private int spS;
    private int spT;
    private byte spU;
    @Deprecated
    private final Map<fgg_0, Integer> spV = new HashMap<fgg_0, Integer>();

    public int fYI() {
        return this.jVs.size();
    }

    public long j(rd_0 rd_02) {
        return this.jVs.values().stream().filter(fhn_02 -> fhn_02.dBe() == rd_02).count();
    }

    public Map<Byte, fhn_0> dTS() {
        return this.jVs;
    }

    public fhn_0 gC(byte by) {
        if (!this.jVs.containsKey(by)) {
            return null;
        }
        return this.jVs.get(by);
    }

    public byte a(fhn_0 fhn_02) {
        if (!this.jVs.containsValue(fhn_02)) {
            return -1;
        }
        return this.jVs.entrySet().stream().filter(entry -> entry.getValue() == fhn_02).map(Map.Entry::getKey).findFirst().orElse((byte)-1);
    }

    public boolean a(byte by, fhn_0 fhn_02) {
        if (by < 0) {
            return false;
        }
        this.jVs.put(by, fhn_02);
        return true;
    }

    void O(Map<Byte, fhn_0> map) {
        this.jVs = map;
    }

    public boolean gD(byte by) {
        fhn_0 fhn_02 = this.gC(by);
        if (fhn_02 == null) {
            return true;
        }
        switch (by) {
            default: 
        }
        byte by2 = rd_0.bjA.aJr();
        return by2 == fhn_02.dBe().aJr();
    }

    public byte fYJ() {
        return this.spU;
    }

    public void gE(byte by) {
        this.spU = by;
    }

    public void gF(byte by) {
        this.spU = this.spU < 0 ? by : (byte)(this.spU + by);
    }

    public boolean fYK() {
        return this.jVs.values().stream().anyMatch(fhn_0::fYK);
    }

    public boolean gG(byte by) {
        return this.jVs.containsKey(by) && this.jVs.get(by).fYK();
    }

    public boolean f(byte by, int n) {
        if (!this.e(by, n)) {
            return false;
        }
        this.jVs.get(by).VG(n);
        return true;
    }

    public boolean e(byte by, int n) {
        Object r = fgD.fXh().Vd(n);
        if (r == null) {
            return false;
        }
        if (((fhc_0)r).dSY() == null) {
            return false;
        }
        if (!this.jVs.containsKey(by)) {
            return false;
        }
        return this.jVs.get(by).dBe() != rd_0.bjA;
    }

    public int gB(byte by) {
        if (!this.gG(by)) {
            throw new fgE("We are trying to remove shard from empty or unexisting slot");
        }
        int n = this.jVs.get(by).air();
        this.jVs.get(by).VG(0);
        return n;
    }

    public int fYL() {
        Optional optional = this.jVs.keySet().stream().max(Byte::compareTo);
        return optional.map(this::gB).orElse(-1);
    }

    public boolean fYM() {
        if (this.jVs.size() <= 1) {
            return true;
        }
        rd_0 rd_02 = null;
        for (fhn_0 fhn_02 : this.jVs.values()) {
            if (rd_02 == null) {
                rd_02 = fhn_02.dBe();
                continue;
            }
            if (rd_02 == fhn_02.dBe()) continue;
            return false;
        }
        return true;
    }

    public boolean k(rd_0 rd_02) {
        for (fhn_0 fhn_02 : this.jVs.values()) {
            if (fhn_02.dBe() == rd_02) continue;
            return false;
        }
        return true;
    }

    public boolean fYN() {
        if (this.jVs.size() <= 0) {
            return false;
        }
        return this.jVs.values().stream().anyMatch(fhn_02 -> fhn_02.dBe() != rd_0.bjA);
    }

    public int fYO() {
        return this.jVs.values().stream().mapToInt(fhn_0::dSU).sum();
    }

    public boolean e(fgg_0 fgg_02) {
        Integer n = this.spV.get(fgg_02);
        return n != null && n > 0;
    }

    public int VD(int n) {
        fgg_0 fgg_02 = fgg_0.UZ(n);
        return this.spV.containsKey(fgg_02) ? this.spV.get(fgg_02) : 0;
    }

    public void a(fgg_0 fgg_02, int n) {
        this.spV.put(fgg_02, n);
    }

    public void f(fgg_0 fgg_02) {
        this.spV.remove(fgg_02);
    }

    public Map<fgg_0, Integer> fYP() {
        return this.spV;
    }

    public int ahy() {
        return this.spS;
    }

    public void VE(int n) {
        this.spS = n;
    }

    public boolean fYQ() {
        return this.spS > 0;
    }

    public int ahA() {
        return this.spT;
    }

    public void VF(int n) {
        this.spT = n;
    }

    public boolean dXi() {
        return this.spT > 0;
    }

    public boolean isEditable() {
        return true;
    }

    @Override
    public boolean b(yd_2 yd_22) {
        Object object;
        for (Map.Entry<Byte, fhn_0> entry : this.jVs.entrySet()) {
            object = entry.getValue();
            yf_1 yf_12 = new yf_1();
            yf_12.Tg = entry.getKey();
            yf_12.alk = ((fhn_0)object).dBe().aJr();
            yf_12.all = ((fhn_0)object).dSU();
            yf_12.alj = ((fhn_0)object).air();
            yd_22.alb.add(yf_12);
        }
        for (Map.Entry<Object, Serializable> entry : this.spV.entrySet()) {
            object = new ye_2();
            ((ye_2)object).alg = GC.ct(((fgg_0)entry.getKey()).d());
            ((ye_2)object).alh = (Integer)entry.getValue();
            yd_22.alc.add((ye_2)object);
        }
        yd_22.ald = this.spS;
        yd_22.ale = this.spT;
        yd_22.alf = this.spU;
        return true;
    }

    public boolean c(yd_2 yd_22) {
        int n;
        byte by;
        this.jVs = new HashMap<Byte, fhn_0>();
        for (yf_1 gs_02 : yd_22.alb) {
            by = gs_02.Tg;
            if (by < 0) {
                spQ.warn((Object)("Probl\u00e8me \u00e0 la d\u00e9s\u00e9rialisation, on essaye de placer un eclat sur un slot invalide : " + by), (Throwable)new Exception());
                continue;
            }
            n = gs_02.alj;
            if (fgD.fXh().Vd(n) == null) {
                spQ.warn((Object)("Probl\u00e8me \u00e0 la d\u00e9s\u00e9rialisation, on essaye de placer un eclat inconnu d'id : " + n), (Throwable)new Exception());
                gs_02.alj = 0;
                continue;
            }
            boolean bl = this.a(by, new fhn_0(n, gs_02.alk, gs_02.all));
            if (bl) continue;
            spQ.warn((Object)("Probl\u00e8me \u00e0 la d\u00e9s\u00e9rialisation, on essaye de placer une cr\u00e9er un slot \u00e0 une position invalide : " + by), (Throwable)new Exception());
        }
        this.spV.clear();
        for (ye_2 ye_22 : yd_22.alc) {
            fgg_0 fgg_02;
            by = ye_22.alg;
            n = ye_22.alh;
            if (n != 0 && (fgg_02 = fgD.fXh().Vd(n)) == null) {
                spQ.warn((Object)("Probl\u00e8me \u00e0 la d\u00e9s\u00e9rialisation, on essaye de placer un eclat inconnu d'id : " + n), (Throwable)new Exception());
                ye_22.alh = 0;
                continue;
            }
            fgg_02 = fgg_0.UZ(by);
            if (fgg_02 == null) {
                spQ.fatal((Object)("Saved an item with unknown propertyId : " + by));
                ye_22.alh = 0;
                ye_22.alg = 0;
                continue;
            }
            this.spV.put(fgg_02, n);
        }
        this.spS = yd_22.ald;
        this.spT = yd_22.ale;
        this.spU = yd_22.alf;
        return true;
    }

    @Override
    public String beT() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("shards(");
        for (int i = 0; i < this.jVs.size(); ++i) {
            stringBuilder.append(this.jVs.get(i));
            if (i >= this.jVs.size() - 1) continue;
            stringBuilder.append(", ");
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public fhi_0 fYR() {
        fhi_0 fhi_02 = new fhi_0();
        fhi_02.jVs = new HashMap<Byte, fhn_0>();
        for (Map.Entry<Byte, fhn_0> entry : this.jVs.entrySet()) {
            byte by = entry.getKey();
            fhn_0 fhn_02 = entry.getValue();
            fhi_02.a(by, fhn_02.fYX());
        }
        fhi_02.spV.putAll(this.spV);
        fhi_02.spS = this.spS;
        fhi_02.spT = this.spT;
        fhi_02.spU = this.spU;
        return fhi_02;
    }

    public boolean c(fhi_0 fhi_02) {
        if (this.jVs == null || fhi_02.jVs == null) {
            return this.jVs == null != (fhi_02.jVs == null);
        }
        if (this.jVs.size() != fhi_02.jVs.size()) {
            return false;
        }
        for (Map.Entry<Byte, fhn_0> entry : this.jVs.entrySet()) {
            byte by = entry.getKey();
            if (!fhi_02.jVs.containsKey(by)) {
                return false;
            }
            fhn_0 fhn_02 = entry.getValue();
            fhn_0 fhn_03 = fhi_02.jVs.get(by);
            if (fhn_02.dBe() == fhn_03.dBe()) continue;
            return false;
        }
        return true;
    }

    public boolean d(fhi_0 fhi_02) {
        if (fhi_02 == null) {
            return false;
        }
        if (this.spS != fhi_02.spS) {
            return false;
        }
        if (this.spT != fhi_02.spT) {
            return false;
        }
        if (this.jVs.size() != fhi_02.jVs.size()) {
            return false;
        }
        for (Map.Entry<Byte, fhn_0> entry : this.jVs.entrySet()) {
            fhn_0 fhn_02;
            byte by = entry.getKey();
            if (!fhi_02.jVs.containsKey(by)) {
                return false;
            }
            fhn_0 fhn_03 = entry.getValue();
            if (fhn_03.h(fhn_02 = fhi_02.jVs.get(by))) continue;
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('{');
        stringBuilder.append("m_sublimationItemId:").append(this.spS).append(',');
        stringBuilder.append("m_specialSublimationItemId:").append(this.spT).append(',');
        String string = this.jVs.entrySet().stream().map(entry -> String.join((CharSequence)":", ((Byte)entry.getKey()).toString(), ((fhn_0)entry.getValue()).toString())).collect(Collectors.joining(","));
        stringBuilder.append("m_slots:{").append(string).append("}}");
        return stringBuilder.toString();
    }

    public String fYS() {
        boolean bl = this.jVs.isEmpty();
        String string = bl ? "" : this.jVs.values().stream().map(fhn_02 -> String.valueOf(fhn_02.dBe().aJr())).collect(Collectors.joining(","));
        String string2 = bl ? "" : this.jVs.values().stream().map(fhn_02 -> String.valueOf(fhn_02.dSU())).collect(Collectors.joining(","));
        String string3 = bl ? "" : this.jVs.values().stream().map(fhn_02 -> String.valueOf(fhn_02.cmL())).collect(Collectors.joining(","));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('{');
        stringBuilder.append("colors:[").append(string).append("],");
        stringBuilder.append("shards:[").append(string2).append("],");
        stringBuilder.append("levels:[").append(string3).append("],");
        stringBuilder.append("sub_id:").append(this.spS).append(',');
        stringBuilder.append("ep_sub_id:").append(this.spT);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    @Override
    public /* synthetic */ boolean b(Object object) {
        return this.c((yd_2)object);
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.b((yd_2)object);
    }
}

