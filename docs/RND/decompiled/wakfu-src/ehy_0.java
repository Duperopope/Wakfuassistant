/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Unmodifiable
 *  org.jetbrains.annotations.VisibleForTesting
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Unmodifiable;
import org.jetbrains.annotations.VisibleForTesting;

/*
 * Renamed from eHY
 */
public class ehy_0 {
    private static final Logger qtZ = Logger.getLogger(ehy_0.class);
    private final Map<Integer, Short> qua = new HashMap<Integer, Short>();
    private final Collection<eHT> qub = new ArrayList<eHT>();
    private short quc;

    public ehy_0(ehy_0 ehy_02) {
        this.quc = ehy_02.fwc();
        this.qua.putAll(ehy_02.fwb());
        this.qub.addAll(ehy_02.fwe());
    }

    public ehy_0() {
    }

    public short PG(int n) {
        return this.qua.getOrDefault(n, (short)0);
    }

    public void p(int n, short s) {
        if (s > 0) {
            this.qua.put(n, s);
        } else {
            this.qua.remove(n);
        }
        this.r(n, s);
    }

    public void q(int n, short s) {
        short s2 = (short)(this.PG(n) + s);
        this.qua.put(n, s2);
        this.r(n, s2);
    }

    public void g(BiConsumer<Integer, Short> biConsumer) {
        this.qua.forEach(biConsumer);
    }

    private void r(int n, short s) {
        for (eHT eHT2 : this.qub) {
            try {
                eHT2.o(n, s);
            }
            catch (Exception exception) {
                qtZ.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    public void a(eHT eHT2) {
        if (this.qub.contains(eHT2)) {
            return;
        }
        this.qub.add(eHT2);
    }

    public void b(eHT eHT2) {
        this.qub.remove(eHT2);
    }

    public int PH(int n) {
        int n2 = 0;
        for (Integer n3 : eHK.qsX.PD(n)) {
            n2 += this.PG(n3);
        }
        return n2;
    }

    public int s(int n, short s) {
        short s2 = this.dy(s);
        short s3 = eHK.qsX.du(s2).PE(n);
        return s3 - this.PH(n);
    }

    public boolean an(int n, int n2, short s) {
        int n3 = eHK.qsX.PB(n);
        return this.s(n3, s) >= n2;
    }

    public void j(ehy_0 ehy_02) {
        ehy_02.dz(this.fwc());
        ehy_02.E(this.fwb());
    }

    public void k(ehy_0 ehy_02) {
        ehy_02.E(this.fwb());
    }

    public void fwa() {
        this.qua.clear();
    }

    @VisibleForTesting
    public void E(Map<Integer, Short> map) {
        this.fwa();
        this.qua.putAll(map);
    }

    public boolean l(ehy_0 ehy_02) {
        return this.quc != ehy_02.quc || !this.qua.equals(ehy_02.qua);
    }

    public @Unmodifiable Map<Integer, Short> fwb() {
        return Collections.unmodifiableMap(this.qua);
    }

    public short fwc() {
        return this.quc;
    }

    public short dy(short s) {
        return this.quc == -1 ? s : this.quc;
    }

    public void dz(short s) {
        this.quc = s;
    }

    public ehy_0 fwd() {
        ehy_0 ehy_02 = new ehy_0();
        ehy_02.quc = this.quc;
        ehy_02.qua.putAll(this.qua);
        return ehy_02;
    }

    public void m(ehy_0 ehy_02) {
        this.quc = ehy_02.quc;
        this.qua.clear();
        this.qua.putAll(ehy_02.qua);
    }

    public void n(ehy_0 ehy_02) {
        this.qua.clear();
        this.qua.putAll(ehy_02.qua);
    }

    public boolean al(exP exP2) {
        if (exP2 == null) {
            return false;
        }
        return this.quc <= exP2.dnG() - 0;
    }

    public String toString() {
        return this.getClass().getSimpleName() + "{m_levelsByBonus=" + String.valueOf(this.qua) + ", m_sheetLevel=" + this.quc + "}";
    }

    public void clear() {
        this.qua.clear();
    }

    @VisibleForTesting
    public Collection<eHT> fwe() {
        return this.qub;
    }
}

