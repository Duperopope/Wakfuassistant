/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from aqm
 */
public final class aqm_2
implements aql_2 {
    private static final Logger cQA = Logger.getLogger(aqm_2.class);
    private static final aqm_2 cQB = new aqm_2();

    public static aqm_2 bGx() {
        return cQB;
    }

    @Override
    public void a(aps_1 aps_12, String string) {
        cQA.info((Object)("Changement de workspace, synchronis\u00e9 sur : " + string));
    }

    @Override
    public void a(aps_1 aps_12, apx_1 apx_12) {
        cQA.info((Object)("Enregistrement d'une entr\u00e9e : type " + apx_12.aFS() + ", id " + apx_12.bGh()));
    }

    @Override
    public void b(aps_1 aps_12, apx_1 apx_12) {
        cQA.info((Object)("Suppresion de la don\u00e9ne : type " + apx_12.aFS() + ", id " + apx_12.bGh()));
    }

    @Override
    public void c(aps_1 aps_12) {
        cQA.info((Object)"Arret d'un binary storage");
    }

    @Override
    public void c(aps_1 aps_12, apx_1 apx_12) {
        cQA.info((Object)("Restauration d'une entr\u00e9e : type " + apx_12.aFS() + ", id " + apx_12.bGh()));
    }
}

