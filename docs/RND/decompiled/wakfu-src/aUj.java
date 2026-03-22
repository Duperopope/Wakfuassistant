/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import com.ankamagames.wakfu.client.console.command.xulor.property.ListCommand;
import gnu.trove.procedure.TObjectProcedure;

public class aUj
implements TObjectProcedure<fsf_1> {
    final /* synthetic */ StringBuilder gxG;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public aUj(ListCommand listCommand, StringBuilder stringBuilder) {
        this.gxG = stringBuilder;
    }

    public boolean a(fsf_1 fsf_12) {
        this.gxG.append('\n').append(" - ").append(fsf_12.getName());
        if (fsf_12.getValue() instanceof aef_2) {
            this.gxG.append(" (F)");
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((fsf_1)object);
    }
}

