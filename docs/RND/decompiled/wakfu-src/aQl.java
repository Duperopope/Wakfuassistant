/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Collections;

public class aQl {
    private String eCd;
    private String eCe = null;
    private int bUj;
    private final ArrayList<String> eCf = new ArrayList();
    private static final ArrayList<String> eCg = new ArrayList();
    private static final aQl eCh = new aQl();
    private static final String eCi = "[";

    public static aQl cBL() {
        return eCh;
    }

    public void jL(String string) {
        this.eCd = string;
        this.eCe = null;
        this.cBM();
        this.cBN();
        this.bUj = 0;
    }

    private void cBM() {
        eCg.clear();
        bgg_0.dlO().m((TObjectProcedure<bgy>)((TObjectProcedure)bgy2 -> {
            String string = bgy2.getName();
            if (string.startsWith(eCi)) {
                return true;
            }
            eCg.add(string);
            return true;
        }));
        apl_0.eAC.cBh().stream().filter(aPJ2 -> aPJ2.getName() != null && !aPJ2.getName().isEmpty()).map(aPJ2 -> apl_0.T(aPJ2.getName(), aPJ2.getTag())).forEach(eCg::add);
        eyp_1 eyp_12 = aue_0.cVJ().cVK().dnQ().dKL();
        if (eyp_12 != null) {
            TLongObjectIterator tLongObjectIterator = eyp_12.fPG().iterator();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                Object object = ((exz_1)tLongObjectIterator.value()).getName();
                if (eCg.contains(object) || ((String)object).startsWith(eCi)) continue;
                eCg.add((String)object);
            }
        }
        for (Object object : apd_0.cAO().cAQ()) {
            String string;
            if (!((apz_0)object).cBt() || eCg.contains(string = ((apz_0)object).xO()) || string.startsWith(eCi)) continue;
            eCg.add(string);
        }
    }

    private void cBN() {
        this.eCf.clear();
        for (String string : eCg) {
            if (!string.toLowerCase().startsWith(this.eCd.toLowerCase()) || this.eCf.contains(string)) continue;
            this.eCf.add(string);
        }
        Collections.sort(this.eCf);
        if (!this.eCf.contains(this.eCd)) {
            this.eCf.add(this.eCd);
        }
    }

    public String cBO() {
        if (this.eCf.isEmpty()) {
            this.eCe = "";
        } else {
            this.eCe = this.eCf.get(this.bUj);
            this.bUj = (this.bUj + 1) % this.eCf.size();
        }
        return this.eCe;
    }

    public String cBP() {
        return this.eCd;
    }

    public void jM(String string) {
        this.eCd = string;
    }

    public boolean jN(String string) {
        return string != null && (string.equalsIgnoreCase(this.eCd.toLowerCase()) || string.equals(this.eCe));
    }
}

