/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import org.apache.log4j.Logger;

/*
 * Renamed from ayg
 */
public class ayg_1
implements ayc_2 {
    protected static final Logger dsj = Logger.getLogger(ayg_1.class);
    JFrame bXt;
    final axy_1 dsk = new axy_1();

    public void aPg() {
        SwingUtilities.invokeLater(new ayh_1(this));
    }

    @Override
    public void a(aya_2 aya_22) {
        this.dsk.a(aya_22.bRP(), aya_22.aIs(), aya_22.bRM());
    }
}

