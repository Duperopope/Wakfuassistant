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
 * Renamed from eBW
 */
public final class ebw_0
extends eak_0 {
    private static final ArrayList<amz_1[]> pyj = new ArrayList();
    public static final String pyk = "monster";
    private String pyl = null;
    private boolean pym;

    public ebw_0(ArrayList<amx_1> arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        this.pyl = ((anh_2)arrayList.get(0)).getValue();
        this.pym = pyk.equalsIgnoreCase(((anh_2)arrayList.get(1)).getValue());
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pyj;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public long d(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        if (object4 == null) {
            throw new amf_2("Pas de contexte...");
        }
        etu_0<?> etu_02 = eAs.m(object, object4);
        if (etu_02 == null) {
            throw new amf_2("Impossible de r\u00e9cup\u00e9rer le combat");
        }
        exx_2 exx_22 = ebi_0.rS(this.pyl);
        byte by = this.pym ? (byte)1 : 0;
        Collection collection = etu_02.a(evb_0.fNn(), evb_0.fJ(by), evb_0.a(evb_0.l(exe_1.rFi)));
        int n = 0;
        for (exP exP2 : collection) {
            if (!exP2.a(exx_22)) continue;
            n = GC.a(n, exP2.c(exx_22), new int[0]);
        }
        return n;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pMc;
    }

    static {
        pyj.add(eAC.pwr);
        pyj.add(new amz_1[]{amz_1.cJx, amz_1.cJx});
    }
}

