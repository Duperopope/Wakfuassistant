/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eBZ
 */
public final class ebz_0
extends eak_0 {
    private static final ArrayList<amz_1[]> pyr = new ArrayList();
    public static final String pys = "monster";
    private boolean pym;

    public ebz_0(ArrayList<amx_1> arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        this.pym = pys.equalsIgnoreCase(((anh_2)arrayList.get(0)).getValue());
    }

    @Override
    public Enum bDq() {
        return ehq_0.pLO;
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pyr;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public long d(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        short s;
        if (object4 == null) {
            throw new amf_2("Pas de contexte...");
        }
        etu_0<?> etu_02 = eAs.m(object, object4);
        if (etu_02 == null) {
            throw new amf_2("Impossible de r\u00e9cup\u00e9rer le combat");
        }
        byte by = this.pym ? (byte)1 : 0;
        Collection collection = etu_02.a(evb_0.fNn(), evb_0.fJ(by), evb_0.a(evb_0.l(exe_1.rFi)));
        int s2 = Short.MAX_VALUE;
        short s3 = 0;
        for (exP exP2 : collection) {
            s3 = GC.c(s3, exP2.cmL());
            s = GC.b(s, exP2.cmL());
        }
        return s3 - s;
    }

    static {
        pyr.add(amz_1.cJI);
        pyr.add(new amz_1[]{amz_1.cJx});
    }
}

