/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteObjectHashMap
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TByteObjectProcedure
 */
import gnu.trove.map.hash.TByteObjectHashMap;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TByteObjectProcedure;
import java.util.LinkedList;

/*
 * Renamed from eLc
 */
public class elc_0 {
    private final long qFd;
    private final int qFe;
    private final long qFf;
    private final long qFg;
    private final LinkedList<eLd> qFh = new LinkedList();
    private long iJl;
    private final TByteObjectHashMap<ele_0> qFi = new TByteObjectHashMap();
    private final TIntObjectHashMap<ele_0> qFj = new TIntObjectHashMap();
    private elm_0 qFk;
    private eLh qFl;

    public elc_0(long l, int n, long l2, long l3) {
        this.qFd = l;
        this.qFe = n;
        this.qFf = l2;
        this.qFg = l3;
        this.qFk = elm_0.qFE;
    }

    public long LV() {
        return this.qFd;
    }

    public int rX() {
        return this.qFe;
    }

    public long bfl() {
        return this.qFf;
    }

    public long exO() {
        return this.qFg;
    }

    public long dzt() {
        return this.iJl;
    }

    public LinkedList<eLd> fzm() {
        return this.qFh;
    }

    public void lQ(long l) {
        this.iJl = l;
    }

    public eLd fzn() {
        return this.qFh.getFirst();
    }

    public void a(eLd eLd2) {
        if (this.qFh.size() >= 4) {
            this.qFh.pop();
        }
        this.qFh.addLast(eLd2);
    }

    public boolean eW(byte by) {
        return this.qFi.containsKey(by);
    }

    public ele_0 eX(byte by) {
        return (ele_0)this.qFi.get(by);
    }

    public void a(ele_0 ele_02) {
        this.qFi.put(ele_02.eDo(), (Object)ele_02);
    }

    public eLh fzo() {
        return this.qFl;
    }

    public void a(eLh eLh2) {
        this.qFl = eLh2;
    }

    public boolean QX(int n) {
        return this.qFj.containsKey(n);
    }

    public void b(ele_0 ele_02) {
        this.qFj.put(ele_02.dut(), (Object)ele_02);
    }

    public ele_0 Rd(int n) {
        return (ele_0)this.qFj.get(n);
    }

    public boolean fzp() {
        return this.qFg == -1L;
    }

    public elm_0 fzq() {
        return this.qFk;
    }

    public void a(elm_0 elm_02) {
        this.qFk = elm_02;
    }

    public void fzr() {
    }

    public byte[] fzs() {
        return elf_0.a(this);
    }

    public void b(TByteObjectProcedure tByteObjectProcedure) {
        this.qFi.forEachEntry(tByteObjectProcedure);
    }
}

