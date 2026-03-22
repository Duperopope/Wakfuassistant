/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.THashMap
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.map.hash.THashMap;
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from aya
 */
class aya_2 {
    private final THashMap<String, axw_1> drW = new THashMap();
    private int drO = 0;
    private int drX = 0;
    private long drY = 0L;
    private float drZ;

    aya_2() {
    }

    public float bRM() {
        return this.drZ;
    }

    private void bRN() {
        long l = System.currentTimeMillis();
        long l2 = l - this.drY;
        if (l2 >= 2000L) {
            this.drZ = (float)this.drX / ((float)l2 / 1000.0f);
            this.drX = 0;
            this.drY = l;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void gO(String string) {
        if (string == null || string.isEmpty()) {
            return;
        }
        axw_1 axw_12 = (axw_1)this.drW.get((Object)string);
        if (axw_12 == null) {
            axw_12 = new axw_1(string);
            THashMap<String, axw_1> tHashMap = this.drW;
            synchronized (tHashMap) {
                this.drW.put((Object)string, (Object)axw_12);
            }
        }
        axw_12.bRJ();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void bRO() {
        THashMap<String, axw_1> tHashMap = this.drW;
        synchronized (tHashMap) {
            if (!this.drW.isEmpty()) {
                this.drW.forEachValue((TObjectProcedure)new ayb_2(this));
            }
        }
        this.drO = 0;
    }

    public void bMy() {
        this.bRN();
        ++this.drX;
        ++this.drO;
    }

    public THashMap<String, axw_1> bRP() {
        return this.drW;
    }

    public int aIs() {
        return this.drO;
    }
}

