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
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.UnknownFieldSet;

/*
 * Renamed from za
 */
public final class za_1
extends GeneratedMessageV3.Builder<za_1>
implements zb_1 {
    private int an;
    private int Gx;
    private int xX;
    private int xZ;
    private int yb;
    private int anc;
    private boolean ane;
    private long ang;
    private int ani;

    public static final Descriptors.Descriptor awQ() {
        return yp_2.amD;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return yp_2.amE.ensureFieldAccessorsInitialized(yy_2.class, za_1.class);
    }

    za_1() {
        this.D();
    }

    za_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (yy_2.oV()) {
            // empty if block
        }
    }

    public za_1 awR() {
        super.clear();
        this.Gx = 0;
        this.an &= 0xFFFFFFFE;
        this.xX = 0;
        this.an &= 0xFFFFFFFD;
        this.xZ = 0;
        this.an &= 0xFFFFFFFB;
        this.yb = 0;
        this.an &= 0xFFFFFFF7;
        this.anc = 0;
        this.an &= 0xFFFFFFEF;
        this.ane = false;
        this.an &= 0xFFFFFFDF;
        this.ang = 0L;
        this.an &= 0xFFFFFFBF;
        this.ani = 0;
        this.an &= 0xFFFFFF7F;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return yp_2.amD;
    }

    public yy_2 awP() {
        return yy_2.awO();
    }

    public yy_2 awS() {
        yy_2 yy_22 = this.awT();
        if (!yy_22.isInitialized()) {
            throw za_1.newUninitializedMessageException((Message)yy_22);
        }
        return yy_22;
    }

    public yy_2 awT() {
        yy_2 yy_22 = new yy_2(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            yy_22.Gx = this.Gx;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            yy_22.xX = this.xX;
            n2 |= 2;
        }
        if ((n & 4) != 0) {
            yy_22.xZ = this.xZ;
            n2 |= 4;
        }
        if ((n & 8) != 0) {
            yy_22.yb = this.yb;
            n2 |= 8;
        }
        if ((n & 0x10) != 0) {
            yy_22.anc = this.anc;
            n2 |= 0x10;
        }
        if ((n & 0x20) != 0) {
            yy_22.ane = this.ane;
            n2 |= 0x20;
        }
        if ((n & 0x40) != 0) {
            yy_22.ang = this.ang;
            n2 |= 0x40;
        }
        if ((n & 0x80) != 0) {
            yy_22.ani = this.ani;
            n2 |= 0x80;
        }
        yy_22.an = n2;
        this.onBuilt();
        return yy_22;
    }

    public za_1 awU() {
        return (za_1)super.clone();
    }

    public za_1 fO(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (za_1)super.setField(fieldDescriptor, object);
    }

    public za_1 cu(Descriptors.FieldDescriptor fieldDescriptor) {
        return (za_1)super.clearField(fieldDescriptor);
    }

    public za_1 cu(Descriptors.OneofDescriptor oneofDescriptor) {
        return (za_1)super.clearOneof(oneofDescriptor);
    }

    public za_1 cu(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (za_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public za_1 fP(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (za_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public za_1 cu(Message message) {
        if (message instanceof yy_2) {
            return this.c((yy_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public za_1 c(yy_2 yy_22) {
        if (yy_22 == yy_2.awO()) {
            return this;
        }
        if (yy_22.acr()) {
            this.ka(yy_22.acs());
        }
        if (yy_22.NK()) {
            this.kb(yy_22.getX());
        }
        if (yy_22.NL()) {
            this.kc(yy_22.getY());
        }
        if (yy_22.NM()) {
            this.kd(yy_22.NN());
        }
        if (yy_22.awD()) {
            this.ke(yy_22.awE());
        }
        if (yy_22.awF()) {
            this.ab(yy_22.awG());
        }
        if (yy_22.awH()) {
            this.bT(yy_22.awI());
        }
        if (yy_22.awJ()) {
            this.kf(yy_22.awK());
        }
        this.fP(yy_2.b(yy_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.acr()) {
            return false;
        }
        if (!this.NK()) {
            return false;
        }
        if (!this.NL()) {
            return false;
        }
        if (!this.NM()) {
            return false;
        }
        if (!this.awD()) {
            return false;
        }
        return this.awF();
    }

    public za_1 jk(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        yy_2 yy_22 = null;
        try {
            yy_22 = (yy_2)yy_2.ank.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            yy_22 = (yy_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (yy_22 != null) {
                this.c(yy_22);
            }
        }
        return this;
    }

    @Override
    public boolean acr() {
        return (this.an & 1) != 0;
    }

    @Override
    public int acs() {
        return this.Gx;
    }

    public za_1 ka(int n) {
        this.an |= 1;
        this.Gx = n;
        this.onChanged();
        return this;
    }

    public za_1 awV() {
        this.an &= 0xFFFFFFFE;
        this.Gx = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean NK() {
        return (this.an & 2) != 0;
    }

    @Override
    public int getX() {
        return this.xX;
    }

    public za_1 kb(int n) {
        this.an |= 2;
        this.xX = n;
        this.onChanged();
        return this;
    }

    public za_1 awW() {
        this.an &= 0xFFFFFFFD;
        this.xX = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean NL() {
        return (this.an & 4) != 0;
    }

    @Override
    public int getY() {
        return this.xZ;
    }

    public za_1 kc(int n) {
        this.an |= 4;
        this.xZ = n;
        this.onChanged();
        return this;
    }

    public za_1 awX() {
        this.an &= 0xFFFFFFFB;
        this.xZ = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean NM() {
        return (this.an & 8) != 0;
    }

    @Override
    public int NN() {
        return this.yb;
    }

    public za_1 kd(int n) {
        this.an |= 8;
        this.yb = n;
        this.onChanged();
        return this;
    }

    public za_1 awY() {
        this.an &= 0xFFFFFFF7;
        this.yb = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean awD() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public int awE() {
        return this.anc;
    }

    public za_1 ke(int n) {
        this.an |= 0x10;
        this.anc = n;
        this.onChanged();
        return this;
    }

    public za_1 awZ() {
        this.an &= 0xFFFFFFEF;
        this.anc = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean awF() {
        return (this.an & 0x20) != 0;
    }

    @Override
    public boolean awG() {
        return this.ane;
    }

    public za_1 ab(boolean bl) {
        this.an |= 0x20;
        this.ane = bl;
        this.onChanged();
        return this;
    }

    public za_1 axa() {
        this.an &= 0xFFFFFFDF;
        this.ane = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean awH() {
        return (this.an & 0x40) != 0;
    }

    @Override
    public long awI() {
        return this.ang;
    }

    public za_1 bT(long l) {
        this.an |= 0x40;
        this.ang = l;
        this.onChanged();
        return this;
    }

    public za_1 axb() {
        this.an &= 0xFFFFFFBF;
        this.ang = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean awJ() {
        return (this.an & 0x80) != 0;
    }

    @Override
    public int awK() {
        return this.ani;
    }

    public za_1 kf(int n) {
        this.an |= 0x80;
        this.ani = n;
        this.onChanged();
        return this;
    }

    public za_1 axc() {
        this.an &= 0xFFFFFF7F;
        this.ani = 0;
        this.onChanged();
        return this;
    }

    public final za_1 fO(UnknownFieldSet unknownFieldSet) {
        return (za_1)super.setUnknownFields(unknownFieldSet);
    }

    public final za_1 fP(UnknownFieldSet unknownFieldSet) {
        return (za_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fP(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fO(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fP(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cu(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cu(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cu(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fO(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.awR();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.awU();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fP(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jk(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.cu(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.awR();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cu(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.awU();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fP(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fO(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fP(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cu(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cu(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cu(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fO(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jk(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.awU();
    }

    public /* synthetic */ Message buildPartial() {
        return this.awT();
    }

    public /* synthetic */ Message build() {
        return this.awS();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.cu(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.awR();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jk(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.awU();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.awT();
    }

    public /* synthetic */ MessageLite build() {
        return this.awS();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.awR();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.awP();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.awP();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jk(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.awU();
    }

    public /* synthetic */ Object clone() {
        return this.awU();
    }
}

