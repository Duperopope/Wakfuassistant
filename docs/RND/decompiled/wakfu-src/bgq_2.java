/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.apache.log4j.Logger;

/*
 * Renamed from bGQ
 */
public class bgq_2 {
    private static final Logger jWA = Logger.getLogger(bgq_2.class);

    public static List<bgs_2> a(bgr_2 bgr_22) {
        short s;
        ArrayList<bgs_2> arrayList = new ArrayList<bgs_2>();
        short s2 = bgr_22.bfe();
        for (int i = bgr_22.oP(); i > 0; i -= s) {
            s = (short)Math.min(i, s2);
            bgs_2 bgs_22 = new bgs_2(bgr_22.dOg(), s, bgr_22.bfb());
            arrayList.add(bgs_22);
        }
        return arrayList;
    }

    public static Optional<bgr_2> e(oo oo2) {
        Object r = fgD.fXh().Vd(oo2.avr());
        if (r == null) {
            return Optional.empty();
        }
        bgr_2 bgr_22 = new bgr_2((fhc_0)r);
        bgr_22.Fq(oo2.oP());
        bgr_22.bl(oo2.wa());
        return Optional.of(bgr_22);
    }
}

