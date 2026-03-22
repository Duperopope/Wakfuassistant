/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.map.custom_hash.TObjectIntCustomHashMap
 *  gnu.trove.map.hash.TObjectIntHashMap
 */
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.map.custom_hash.TObjectIntCustomHashMap;
import gnu.trove.map.hash.TObjectIntHashMap;

/*
 * Renamed from BS
 */
class bs_0 {
    final short avX;
    final String avY;
    final int avZ;
    final int awa;
    final byte awb;
    short[][] awc;
    short[][] awd;
    TIntArrayList[] awe;
    final TObjectIntHashMap<TIntArrayList> awf = new TObjectIntHashMap();
    final TObjectIntCustomHashMap<short[]> awg = new TObjectIntCustomHashMap(br_0.avR);

    protected bs_0(Cq cq) {
        this.avX = cq.aIi();
        this.awb = cq.aIl();
        this.avY = cq.getName();
        this.avZ = cq.aIj();
        this.awa = cq.aIk();
    }
}

