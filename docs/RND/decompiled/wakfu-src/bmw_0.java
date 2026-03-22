/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Ints
 *  org.jetbrains.annotations.Unmodifiable
 */
import com.google.common.primitives.Ints;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from bMw
 */
public class bmw_0
extends bmd_1
implements frg {
    public static final String kxp = "elementarySpellsList";
    public static final String kxq = "activeSpellsList";
    public static final String kxr = "passiveSpellsList";
    public static final String[] kxs = new String[]{"elementarySpellsList", "activeSpellsList", "passiveSpellsList"};
    public static final String[] kxt = new String[bmd_1.kvQ.length + kxs.length];
    protected fqP<bmx_0> kxu;
    protected bhJ kxv;

    public bmw_0(bhJ bhJ2) {
        this.kxu = new fqP<bmx_0>(zh_22 -> new bmx_0(bhJ2), 80, new bmz_0(bhJ2), null, false, false, false);
        this.kxv = bhJ2;
    }

    @Override
    public Object eu(String string) {
        Comparator comparator = (bmv_02, bmv_03) -> Ints.compare((int)bmv_02.eeG().giG(), (int)bmv_03.eeG().giG());
        if (string.equals(kxp)) {
            return this.eeI().stream().filter(Objects::nonNull).filter(bmv_02 -> bmv_02.eeG().giG() != eNd.qPf.aJr()).sorted(comparator.thenComparing(bmv_0::compareTo)).map(bmv_02 -> bmv_02.eeH() != null ? bmv_02.eeH() : bmv_02.eeG()).toList();
        }
        if (string.equals(kxq)) {
            return this.eeI().stream().filter(Objects::nonNull).filter(bmv_02 -> !bmv_02.eeG().eeY()).filter(bmv_02 -> bmv_02.eeG().giG() == eNd.qPf.aJr()).filter(bmv_02 -> new bme_0(this.kxv).f(bmv_02.eeG())).sorted(comparator.thenComparing(bmv_0::compareTo)).map(bmv_02 -> bmv_02.eeH() != null ? bmv_02.eeH() : bmv_02.eeG()).toList();
        }
        if (string.equals(kxr)) {
            return this.eeI().stream().filter(Objects::nonNull).filter(bmv_02 -> bmv_02.eeG().eeY()).filter(bmv_02 -> new bme_0(this.kxv).f(bmv_02.eeG())).sorted().map(bmv_02 -> bmv_02.eeH() != null ? bmv_02.eeH() : bmv_02.eeG()).toList();
        }
        return super.eu(string);
    }

    private @Unmodifiable List<bmv_0> eeI() {
        HashMap<Integer, bmx_0> hashMap = new HashMap<Integer, bmx_0>();
        for (Map.Entry<Long, bmx_0> object2 : this.kxu.gje().entrySet()) {
            hashMap.put(((bmt_0)object2.getValue().giP()).d(), object2.getValue());
        }
        frf frf2 = this.kxv.dnJ();
        if (frf2 == null) {
            return Collections.emptyList();
        }
        frd frd2 = frf2.Zx(this.kxv.djx());
        if (frd2 == null) {
            return Collections.emptyList();
        }
        int n = frd2.tL() <= 0 ? (int)this.kxv.dnG() : frd2.tL();
        return this.kxv.dkD().dga().stream().map(bmt_02 -> {
            int n2 = bmt_02.d();
            if (!hashMap.containsKey(n2) || ((bmt_0)((bmx_0)hashMap.get(n2)).giP()).cvo() > n) {
                return new bmv_0((bmt_0)bmt_02, null);
            }
            return new bmv_0((bmt_0)bmt_02, (bmx_0)hashMap.get(n2));
        }).toList();
    }

    public void dLb() {
        fse_1.gFu().a((aef_2)this, kxp, kxq, kxr);
    }

    @Override
    public String[] bxk() {
        return kxs;
    }

    public bmx_0 jr(long l) {
        return (bmx_0)this.dkB().dN(l);
    }

    public fqP<bmx_0> dkB() {
        if (this.dkN()) {
            return this.eek();
        }
        return this.kxu;
    }

    public fqP<bmx_0> eeJ() {
        return this.kxu;
    }

    @Override
    public Iterable<bmx_0> dkJ() {
        return this.dkB();
    }

    public long aXb() {
        return this.kxv.Sn();
    }

    @Override
    public void b(frd frd2) {
        fse_1.gFu().a((aef_2)this, kxs);
    }

    @Override
    public void Ie(int n) {
        fse_1.gFu().a((aef_2)this, kxs);
    }

    public void eeK() {
        fse_1.gFu().a((aef_2)this, kxs);
        for (bmx_0 bmx_02 : this.kxu.gje().values()) {
            fse_1.gFu().a((aef_2)bmx_02, "isInCurrentDeck", "unlockLevel", "isUnlockedSpell");
        }
    }

    static {
        System.arraycopy(kxs, 0, kxt, 0, kxs.length);
        System.arraycopy(bmd_1.kvQ, 0, kxt, kxs.length, bmd_1.kvQ.length);
    }
}

