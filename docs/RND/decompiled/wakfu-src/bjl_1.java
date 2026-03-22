/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from bjl
 */
public class bjl_1 {
    private static final Logger inY = Logger.getLogger(bjl_1.class);
    private static final bjl_1 inZ = new bjl_1();
    private final TLongObjectHashMap<bji_1> ioa = new TLongObjectHashMap();

    private bjl_1() {
    }

    public bji_1 jO(long l) {
        return (bji_1)this.ioa.get(l);
    }

    public void b(bhx_0 bhx_02, List<sl_2> list) {
        long l = bhx_02.aXa();
        if (l == 0L) {
            return;
        }
        bji_1 bji_12 = (bji_1)this.ioa.get(l);
        if (bji_12 == null) {
            bji_12 = new bji_1(bhx_02.aXa());
            this.ioa.put(l, (Object)bji_12);
        }
        bji_12.a(bhx_02, list);
    }

    public void a(bhx_0 bhx_02, boolean bl) {
        bji_1 bji_12;
        long l = bhx_02.aXa();
        if (l != 0L && (bji_12 = (bji_1)this.ioa.get(l)) != null) {
            if (bl) {
                bji_12.c(bhx_02);
            } else {
                bji_12.d(bhx_02);
            }
        }
    }

    public void a(bji_1 bji_12) {
        this.ioa.remove(bji_12.Sn());
    }

    public static bjl_1 dri() {
        return inZ;
    }

    public void removeAll() {
        this.ioa.clear();
    }
}

