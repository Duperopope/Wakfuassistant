/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessageLite$Builder
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.Internal$LongList
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.UnknownFieldSet;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from gO
 */
public final class go_1
extends GeneratedMessageV3.Builder<go_1>
implements gp_1 {
    private int an;
    private int sY;
    private int ta;
    private boolean tc;
    private boolean te;
    private boolean tg;
    private boolean ti;
    private Internal.LongList tk = gm_0.FJ();
    private int kW;

    public static final Descriptors.Descriptor FL() {
        return gl_0.sQ;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return gl_0.sR.ensureFieldAccessorsInitialized(gm_0.class, go_1.class);
    }

    go_1() {
        this.D();
    }

    go_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (gm_0.aJ()) {
            // empty if block
        }
    }

    public go_1 FM() {
        super.clear();
        this.sY = 0;
        this.an &= 0xFFFFFFFE;
        this.ta = 0;
        this.an &= 0xFFFFFFFD;
        this.tc = false;
        this.an &= 0xFFFFFFFB;
        this.te = false;
        this.an &= 0xFFFFFFF7;
        this.tg = false;
        this.an &= 0xFFFFFFEF;
        this.ti = false;
        this.an &= 0xFFFFFFDF;
        this.tk = gm_0.FI();
        this.an &= 0xFFFFFFBF;
        this.kW = 0;
        this.an &= 0xFFFFFF7F;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return gl_0.sQ;
    }

    public gm_0 FH() {
        return gm_0.FG();
    }

    public gm_0 FN() {
        gm_0 gm_02 = this.FO();
        if (!gm_02.isInitialized()) {
            throw go_1.newUninitializedMessageException((Message)gm_02);
        }
        return gm_02;
    }

    public gm_0 FO() {
        gm_0 gm_02 = new gm_0(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            gm_02.sY = this.sY;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            gm_02.ta = this.ta;
            n2 |= 2;
        }
        if ((n & 4) != 0) {
            gm_02.tc = this.tc;
            n2 |= 4;
        }
        if ((n & 8) != 0) {
            gm_02.te = this.te;
            n2 |= 8;
        }
        if ((n & 0x10) != 0) {
            gm_02.tg = this.tg;
            n2 |= 0x10;
        }
        if ((n & 0x20) != 0) {
            gm_02.ti = this.ti;
            n2 |= 0x20;
        }
        if ((this.an & 0x40) != 0) {
            this.tk.makeImmutable();
            this.an &= 0xFFFFFFBF;
        }
        gm_02.tk = this.tk;
        if ((n & 0x80) != 0) {
            gm_02.kW = this.kW;
            n2 |= 0x40;
        }
        gm_02.an = n2;
        this.onBuilt();
        return gm_02;
    }

    public go_1 FP() {
        return (go_1)super.clone();
    }

    public go_1 co(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (go_1)super.setField(fieldDescriptor, object);
    }

    public go_1 aH(Descriptors.FieldDescriptor fieldDescriptor) {
        return (go_1)super.clearField(fieldDescriptor);
    }

    public go_1 aH(Descriptors.OneofDescriptor oneofDescriptor) {
        return (go_1)super.clearOneof(oneofDescriptor);
    }

    public go_1 aH(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (go_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public go_1 cp(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (go_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public go_1 aH(Message message) {
        if (message instanceof gm_0) {
            return this.c((gm_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public go_1 c(gm_0 gm_02) {
        if (gm_02 == gm_0.FG()) {
            return this;
        }
        if (gm_02.Fp()) {
            this.df(gm_02.Fq());
        }
        if (gm_02.Fr()) {
            this.dg(gm_02.Fs());
        }
        if (gm_02.Ft()) {
            this.m(gm_02.Fu());
        }
        if (gm_02.Fv()) {
            this.n(gm_02.Fw());
        }
        if (gm_02.Fx()) {
            this.o(gm_02.Fy());
        }
        if (gm_02.Fz()) {
            this.p(gm_02.FA());
        }
        if (!gm_02.tk.isEmpty()) {
            if (this.tk.isEmpty()) {
                this.tk = gm_02.tk;
                this.an &= 0xFFFFFFBF;
            } else {
                this.FW();
                this.tk.addAll((Collection)gm_02.tk);
            }
            this.onChanged();
        }
        if (gm_02.rH()) {
            this.dh(gm_02.rI());
        }
        this.cp(gm_0.b(gm_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.Fp()) {
            return false;
        }
        if (!this.Fr()) {
            return false;
        }
        if (!this.Ft()) {
            return false;
        }
        if (!this.Fv()) {
            return false;
        }
        if (!this.Fx()) {
            return false;
        }
        if (!this.Fz()) {
            return false;
        }
        return this.rH();
    }

    public go_1 dX(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        gm_0 gm_02 = null;
        try {
            gm_02 = (gm_0)gm_0.tn.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            gm_02 = (gm_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (gm_02 != null) {
                this.c(gm_02);
            }
        }
        return this;
    }

    @Override
    public boolean Fp() {
        return (this.an & 1) != 0;
    }

    @Override
    public int Fq() {
        return this.sY;
    }

    public go_1 df(int n) {
        this.an |= 1;
        this.sY = n;
        this.onChanged();
        return this;
    }

    public go_1 FQ() {
        this.an &= 0xFFFFFFFE;
        this.sY = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Fr() {
        return (this.an & 2) != 0;
    }

    @Override
    public int Fs() {
        return this.ta;
    }

    public go_1 dg(int n) {
        this.an |= 2;
        this.ta = n;
        this.onChanged();
        return this;
    }

    public go_1 FR() {
        this.an &= 0xFFFFFFFD;
        this.ta = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Ft() {
        return (this.an & 4) != 0;
    }

    @Override
    public boolean Fu() {
        return this.tc;
    }

    public go_1 m(boolean bl) {
        this.an |= 4;
        this.tc = bl;
        this.onChanged();
        return this;
    }

    public go_1 FS() {
        this.an &= 0xFFFFFFFB;
        this.tc = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Fv() {
        return (this.an & 8) != 0;
    }

    @Override
    public boolean Fw() {
        return this.te;
    }

    public go_1 n(boolean bl) {
        this.an |= 8;
        this.te = bl;
        this.onChanged();
        return this;
    }

    public go_1 FT() {
        this.an &= 0xFFFFFFF7;
        this.te = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Fx() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public boolean Fy() {
        return this.tg;
    }

    public go_1 o(boolean bl) {
        this.an |= 0x10;
        this.tg = bl;
        this.onChanged();
        return this;
    }

    public go_1 FU() {
        this.an &= 0xFFFFFFEF;
        this.tg = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Fz() {
        return (this.an & 0x20) != 0;
    }

    @Override
    public boolean FA() {
        return this.ti;
    }

    public go_1 p(boolean bl) {
        this.an |= 0x20;
        this.ti = bl;
        this.onChanged();
        return this;
    }

    public go_1 FV() {
        this.an &= 0xFFFFFFDF;
        this.ti = false;
        this.onChanged();
        return this;
    }

    private void FW() {
        if ((this.an & 0x40) == 0) {
            this.tk = gm_0.a(this.tk);
            this.an |= 0x40;
        }
    }

    @Override
    public List<Long> FB() {
        return (this.an & 0x40) != 0 ? Collections.unmodifiableList(this.tk) : this.tk;
    }

    @Override
    public int FC() {
        return this.tk.size();
    }

    @Override
    public long de(int n) {
        return this.tk.getLong(n);
    }

    public go_1 a(int n, long l) {
        this.FW();
        this.tk.setLong(n, l);
        this.onChanged();
        return this;
    }

    public go_1 T(long l) {
        this.FW();
        this.tk.addLong(l);
        this.onChanged();
        return this;
    }

    public go_1 y(Iterable<? extends Long> iterable) {
        this.FW();
        AbstractMessageLite.Builder.addAll(iterable, (List)this.tk);
        this.onChanged();
        return this;
    }

    public go_1 FX() {
        this.tk = gm_0.FK();
        this.an &= 0xFFFFFFBF;
        this.onChanged();
        return this;
    }

    @Override
    public boolean rH() {
        return (this.an & 0x80) != 0;
    }

    @Override
    public int rI() {
        return this.kW;
    }

    public go_1 dh(int n) {
        this.an |= 0x80;
        this.kW = n;
        this.onChanged();
        return this;
    }

    public go_1 FY() {
        this.an &= 0xFFFFFF7F;
        this.kW = 0;
        this.onChanged();
        return this;
    }

    public final go_1 co(UnknownFieldSet unknownFieldSet) {
        return (go_1)super.setUnknownFields(unknownFieldSet);
    }

    public final go_1 cp(UnknownFieldSet unknownFieldSet) {
        return (go_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cp(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.co(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cp(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aH(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aH(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aH(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.co(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.FM();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.FP();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cp(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dX(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.aH(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.FM();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aH(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.FP();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cp(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.co(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cp(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aH(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aH(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aH(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.co(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dX(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.FP();
    }

    public /* synthetic */ Message buildPartial() {
        return this.FO();
    }

    public /* synthetic */ Message build() {
        return this.FN();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.aH(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.FM();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dX(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.FP();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.FO();
    }

    public /* synthetic */ MessageLite build() {
        return this.FN();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.FM();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.FH();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.FH();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dX(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.FP();
    }

    public /* synthetic */ Object clone() {
        return this.FP();
    }
}

