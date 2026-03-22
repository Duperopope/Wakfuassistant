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
 * Renamed from zj
 */
public final class zj_2
extends GeneratedMessageV3.Builder<zj_2>
implements zo_1 {
    private int an;
    private long wX;
    private int anA;
    private int mj;

    public static final Descriptors.Descriptor axG() {
        return zg_2.anv;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return zg_2.anw.ensureFieldAccessorsInitialized(zh_2.class, zj_2.class);
    }

    zj_2() {
        this.D();
    }

    zj_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (zh_2.oV()) {
            // empty if block
        }
    }

    public zj_2 axH() {
        super.clear();
        this.wX = 0L;
        this.an &= 0xFFFFFFFE;
        this.anA = 0;
        this.an &= 0xFFFFFFFD;
        this.mj = 0;
        this.an &= 0xFFFFFFFB;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return zg_2.anv;
    }

    public zh_2 axF() {
        return zh_2.axE();
    }

    public zh_2 axI() {
        zh_2 zh_22 = this.axJ();
        if (!zh_22.isInitialized()) {
            throw zj_2.newUninitializedMessageException((Message)zh_22);
        }
        return zh_22;
    }

    public zh_2 axJ() {
        zh_2 zh_22 = new zh_2(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            zh_22.wX = this.wX;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            zh_22.anA = this.anA;
            n2 |= 2;
        }
        if ((n & 4) != 0) {
            zh_22.mj = this.mj;
            n2 |= 4;
        }
        zh_22.an = n2;
        this.onBuilt();
        return zh_22;
    }

    public zj_2 axK() {
        return (zj_2)super.clone();
    }

    public zj_2 fS(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (zj_2)super.setField(fieldDescriptor, object);
    }

    public zj_2 cw(Descriptors.FieldDescriptor fieldDescriptor) {
        return (zj_2)super.clearField(fieldDescriptor);
    }

    public zj_2 cw(Descriptors.OneofDescriptor oneofDescriptor) {
        return (zj_2)super.clearOneof(oneofDescriptor);
    }

    public zj_2 cw(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (zj_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public zj_2 fT(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (zj_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public zj_2 cw(Message message) {
        if (message instanceof zh_2) {
            return this.c((zh_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public zj_2 c(zh_2 zh_22) {
        if (zh_22 == zh_2.axE()) {
            return this;
        }
        if (zh_22.LU()) {
            this.bU(zh_22.LV());
        }
        if (zh_22.axz()) {
            this.kn(zh_22.axA());
        }
        if (zh_22.tK()) {
            this.ko(zh_22.tL());
        }
        this.fT(zh_2.b(zh_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.LU()) {
            return false;
        }
        if (!this.axz()) {
            return false;
        }
        return this.tK();
    }

    public zj_2 jq(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        zh_2 zh_22 = null;
        try {
            zh_22 = (zh_2)zh_2.anD.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            zh_22 = (zh_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (zh_22 != null) {
                this.c(zh_22);
            }
        }
        return this;
    }

    @Override
    public boolean LU() {
        return (this.an & 1) != 0;
    }

    @Override
    public long LV() {
        return this.wX;
    }

    public zj_2 bU(long l) {
        this.an |= 1;
        this.wX = l;
        this.onChanged();
        return this;
    }

    public zj_2 axL() {
        this.an &= 0xFFFFFFFE;
        this.wX = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean axz() {
        return (this.an & 2) != 0;
    }

    @Override
    public int axA() {
        return this.anA;
    }

    public zj_2 kn(int n) {
        this.an |= 2;
        this.anA = n;
        this.onChanged();
        return this;
    }

    public zj_2 axM() {
        this.an &= 0xFFFFFFFD;
        this.anA = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean tK() {
        return (this.an & 4) != 0;
    }

    @Override
    public int tL() {
        return this.mj;
    }

    public zj_2 ko(int n) {
        this.an |= 4;
        this.mj = n;
        this.onChanged();
        return this;
    }

    public zj_2 axN() {
        this.an &= 0xFFFFFFFB;
        this.mj = 0;
        this.onChanged();
        return this;
    }

    public final zj_2 fS(UnknownFieldSet unknownFieldSet) {
        return (zj_2)super.setUnknownFields(unknownFieldSet);
    }

    public final zj_2 fT(UnknownFieldSet unknownFieldSet) {
        return (zj_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fT(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fS(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fT(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cw(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cw(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cw(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fS(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.axH();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.axK();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fT(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jq(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.cw(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.axH();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cw(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.axK();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fT(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fS(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fT(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cw(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cw(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cw(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fS(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jq(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.axK();
    }

    public /* synthetic */ Message buildPartial() {
        return this.axJ();
    }

    public /* synthetic */ Message build() {
        return this.axI();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.cw(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.axH();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jq(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.axK();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.axJ();
    }

    public /* synthetic */ MessageLite build() {
        return this.axI();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.axH();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.axF();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.axF();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jq(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.axK();
    }

    public /* synthetic */ Object clone() {
        return this.axK();
    }
}

