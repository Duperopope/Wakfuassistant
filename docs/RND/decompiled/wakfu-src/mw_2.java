/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TLongObjectIterator;
import org.apache.log4j.Logger;

/*
 * Renamed from MW
 */
public class mw_2<C extends mx_2, CF extends mz_2<C>>
implements my_2 {
    private static final Logger aXH = Logger.getLogger(mw_2.class);
    private CF aXI;

    public CF aVw() {
        return this.aXI;
    }

    public void a(CF CF) {
        this.aXI = CF;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(mr_2 mr_22) {
        TLongObjectIterator<ms_2> tLongObjectIterator = mr_22.aVq();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            ms_2 ms_22 = (ms_2)tLongObjectIterator.value();
            Object c2 = this.aXI.b(ms_22);
            try {
                c2.aVx();
                int n = ms_22.aVs();
                for (int i = 0; i < n; ++i) {
                    mt_2 mt_22 = ms_22.nO(i);
                    na_2 na_22 = nb_2.aVA().nP(mt_22.aeV());
                    if (na_22 != null) {
                        na_22.a(mt_22, c2);
                        continue;
                    }
                    aXH.warn((Object)("Impossible de trouver un ParagraphWriter pour le type " + mt_22.aeV()));
                }
            }
            catch (Exception exception) {
                aXH.warn((Object)("Probl\u00e8me \u00e0 l'export de la page : " + ms_22.Sn()));
            }
            finally {
                try {
                    c2.aVy();
                }
                catch (Exception exception) {
                    aXH.warn((Object)("Probl\u00e8me \u00e0 la fermeture de la page : " + ms_22.Sn()));
                }
            }
        }
    }
}

