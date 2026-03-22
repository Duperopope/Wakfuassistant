/*
 * Decompiled with CFR 0.152.
 */
public class fcx<T extends exP> {
    protected final long rTJ;

    public fcx(long l) {
        this.rTJ = l;
    }

    public void bJ(T t) {
        if (((exP)t).Xi() != this.rTJ) {
            throw new fcw("Le h\u00e9ros qu'on essaye d'ajouter n'appartient pas au client : " + this.rTJ);
        }
        if (((exP)t).a(eyp_0.pmO) && !fcI.fSM()) {
            throw new fcw("[PARTY] Adding a hero but it should be disabled! Account id " + this.rTJ);
        }
        fcL.rUh.d(this.rTJ, (exP)t);
    }

    public void bK(T t) {
        if (((exP)t).Xi() != this.rTJ) {
            throw new fcw("Le h\u00e9ros qu'on essaye d'ajouter au groupe n'appartient pas au client : " + this.rTJ);
        }
        Object t2 = fcL.rUh.sw(((exP)t).Sn());
        if (t2 == null) {
            throw new fcw("Le h\u00e9ros qu'on veut grouper n'est pas charg\u00e9");
        }
        if (((exP)t).a(eyp_0.pmQ) && !fcI.fSN()) {
            throw new fcw("[PARTY] Adding a companion to the party but it should be disabled! Account id " + this.rTJ);
        }
        if (((exP)t).a(eyp_0.pmO) && !fcI.fSM()) {
            throw new fcw("[PARTY] Adding a hero to the party but it should be disabled! Account id " + this.rTJ);
        }
        fcL.rUh.au(this.rTJ, ((exP)t).Sn());
    }

    public void bL(T t) {
        if (((exP)t).Xi() != this.rTJ) {
            throw new fcw("Le h\u00e9ros qu'on essaye de retirer du groupe n'appartient pas au client : " + this.rTJ);
        }
        Object t2 = fcL.rUh.sw(((exP)t).Sn());
        if (t2 == null) {
            throw new fcw("Le h\u00e9ros qu'on veut d\u00e9grouper n'est pas charg\u00e9");
        }
        fcL.rUh.av(this.rTJ, ((exP)t).Sn());
    }

    public String toString() {
        return "HeroManagerController{m_ownerId=" + this.rTJ + "}";
    }
}

