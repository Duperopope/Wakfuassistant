/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.wakfu.client.console.command.commonIn.EncyclopediaUICommand;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.util.Optional;

/*
 * Renamed from bpo
 */
public class bpo_1
implements aba_1 {
    public static final bpo_1 iUY = new bpo_1();

    private bpo_1() {
    }

    @Override
    public boolean a(MouseEvent mouseEvent) {
        if (mouseEvent.getButton() != 1) {
            return false;
        }
        if (EncyclopediaUICommand.cTI()) {
            return false;
        }
        Optional<bgv_2> optional = EncyclopediaUICommand.cTK();
        if (optional.isEmpty()) {
            return false;
        }
        bgv_2 bgv_22 = optional.get();
        cuj_2.eRB().a(bgv_22);
        return true;
    }

    @Override
    public boolean b(MouseEvent mouseEvent) {
        return false;
    }

    @Override
    public boolean c(MouseEvent mouseEvent) {
        return false;
    }

    @Override
    public boolean d(MouseEvent mouseEvent) {
        return false;
    }

    @Override
    public boolean e(MouseEvent mouseEvent) {
        return false;
    }

    @Override
    public boolean f(MouseEvent mouseEvent) {
        return false;
    }

    @Override
    public boolean g(MouseEvent mouseEvent) {
        return false;
    }

    @Override
    public boolean a(MouseWheelEvent mouseWheelEvent) {
        return false;
    }
}

