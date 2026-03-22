/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

final class eJV
implements eJT {
    private static final Logger qAU = Logger.getLogger(eJV.class);
    public static final eJV qAV = new eJV();

    private eJV() {
    }

    @Override
    public void a(eJS eJS2, long l) {
        qAU.info((Object)("Compagnon " + eJS2.Sn() + ", nouvelle valeur de l'xp " + eJS2.pf()));
    }

    @Override
    public void d(eJS eJS2) {
        qAU.info((Object)("Compagnon " + eJS2.Sn() + ", nouveau nom " + eJS2.getName()));
    }

    @Override
    public void e(eJS eJS2) {
        qAU.info((Object)("Compagnon " + eJS2.Sn() + ", nouvel id "));
    }

    @Override
    public void f(eJS eJS2) {
    }

    @Override
    public void g(eJS eJS2) {
    }

    @Override
    public void h(eJS eJS2) {
    }
}

