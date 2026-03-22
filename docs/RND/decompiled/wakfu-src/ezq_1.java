/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from eZQ
 */
public class ezq_1
implements ezy_1 {
    private static final Logger rNd = Logger.getLogger(ezq_1.class);
    private final ezu_1 rNe;

    public ezq_1(ezu_1 ezu_12) {
        this.rNe = ezu_12;
    }

    @Override
    public void mx(String string) {
        rNd.info((Object)("[Guild] le nom de la guilde " + this.rNe.Sn() + " a chang\u00e9 : " + this.rNe.getName() + "(pr\u00e9c\u00e9dent nom: " + string + ")"));
    }

    @Override
    public void dKu() {
        rNd.info((Object)("[Guild] le blazon de la guilde " + this.rNe.Sn() + " a chang\u00e9 : " + this.rNe.Yc()));
    }

    @Override
    public void dKv() {
        rNd.info((Object)("[Guild] la description de la guilde " + this.rNe.Sn() + " a chang\u00e9 : " + this.rNe.getDescription()));
    }

    @Override
    public void dKw() {
        rNd.info((Object)("[Guild] le message de la guilde " + this.rNe.Sn() + " a chang\u00e9 : " + this.rNe.getMessage()));
    }

    @Override
    public void b(fab fab2) {
        rNd.info((Object)("[Guild] Un rang de la guilde " + this.rNe.Sn() + " a \u00e9t\u00e9 ajout\u00e9 : " + String.valueOf(fab2)));
    }

    @Override
    public void c(fab fab2) {
        rNd.info((Object)("[Guild] Un rang de la guilde " + this.rNe.Sn() + " a \u00e9t\u00e9 d\u00e9plac\u00e9 : " + String.valueOf(fab2)));
    }

    @Override
    public void d(fab fab2) {
        rNd.info((Object)("[Guild] Un rang de la guilde " + this.rNe.Sn() + " a \u00e9t\u00e9 retir\u00e9 : " + String.valueOf(fab2)));
    }

    @Override
    public void b(ezz_1 ezz_12) {
        rNd.info((Object)("[Guild] Un membre de la guilde " + this.rNe.Sn() + " a \u00e9t\u00e9 ajout\u00e9 : " + String.valueOf(ezz_12)));
    }

    @Override
    public void c(ezz_1 ezz_12) {
        rNd.info((Object)("[Guild] Un membre de la guilde " + this.rNe.Sn() + " a \u00e9t\u00e9 retir\u00e9 : " + String.valueOf(ezz_12)));
    }

    @Override
    public void e(fab fab2) {
        rNd.info((Object)("[Guild] Le rang " + String.valueOf(fab2) + " de la guilde " + this.rNe.Sn() + " a \u00e9t\u00e9 modifi\u00e9"));
    }

    @Override
    public void a(ezz_1 ezz_12, long l) {
        fab fab2 = this.rNe.jR(l);
        fab fab3 = this.rNe.jR(ezz_12.Xm());
        if (fab3.bfE() == 0) {
            rNd.info((Object)("[Guild] Nouveau leader pour la guilde " + this.rNe.Sn() + " : " + String.valueOf(ezz_12) + " (ancien rang: " + String.valueOf(fab2) + ")"));
        }
        if (fab2.bfE() == 0) {
            rNd.info((Object)("[Guild] Ce membre n'est plus le leader de la guilde " + this.rNe.Sn() + " : " + String.valueOf(ezz_12) + " (nouveau rang: " + String.valueOf(fab3) + ")"));
        }
    }

    public String toString() {
        return "GuildModelLogger{m_guild=" + String.valueOf(this.rNe) + "}";
    }
}

