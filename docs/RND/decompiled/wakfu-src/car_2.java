/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TShortObjectHashMap
 *  gnu.trove.procedure.TByteObjectProcedure
 */
import gnu.trove.map.hash.TShortObjectHashMap;
import gnu.trove.procedure.TByteObjectProcedure;

/*
 * Renamed from car
 */
class car_2
implements TByteObjectProcedure<byte[]> {
    private final int lGl;
    private final TShortObjectHashMap<short[]> lGm;
    private final caq_2 lGn;
    static final /* synthetic */ boolean lGo;

    car_2(int n, TShortObjectHashMap<short[]> tShortObjectHashMap, int n2) {
        this.lGl = n;
        this.lGm = tShortObjectHashMap;
        this.lGn = new caq_2(n2);
    }

    public caq_2 erj() {
        return this.lGn;
    }

    public boolean b(byte by, byte[] byArray) {
        if (by == 0) {
            return true;
        }
        short s = this.cw(by);
        short[] sArray = new short[byArray.length];
        for (int i = 0; i < byArray.length; ++i) {
            sArray[i] = this.cw(byArray[i]);
        }
        if (!lGo && this.lGm.contains(s)) {
            throw new AssertionError();
        }
        this.lGm.put(s, (Object)sArray);
        this.lGn.a(s, sArray);
        return true;
    }

    private short cw(short s) {
        if (s == 0) {
            return 0;
        }
        return s > 0 ? (short)(s + this.lGl) : (short)(s - this.lGl);
    }

    public /* synthetic */ boolean execute(byte by, Object object) {
        return this.b(by, (byte[])object);
    }

    static {
        lGo = !cao_1.class.desiredAssertionStatus();
    }
}

