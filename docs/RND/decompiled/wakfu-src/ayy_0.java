/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 */
import gnu.trove.iterator.TIntObjectIterator;

/*
 * Renamed from aYy
 */
class ayy_0
implements aqg_1<alq_0> {
    ayy_0(ayx_0 ayx_02) {
    }

    public void b(alq_0 alq_02) {
        try {
            eKW eKW2 = ayx_0.a(alq_02);
            eKQ.qEb.m(eKW2);
            TIntObjectIterator<eKR> tIntObjectIterator = eKW2.fze();
            while (tIntObjectIterator.hasNext()) {
                tIntObjectIterator.advance();
                ((bEm)fgD.fXh()).Gt(((eKR)tIntObjectIterator.value()).fyZ().azv());
            }
        }
        catch (Exception exception) {
            ayx_0.hxF.error((Object)("[GD] Exception au chargement du m\u00e9tier " + alq_02.cms()), (Throwable)exception);
        }
    }

    @Override
    public /* synthetic */ void load(aqz_2 aqz_22) {
        this.b((alq_0)aqz_22);
    }
}

