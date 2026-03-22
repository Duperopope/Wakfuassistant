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
 * Renamed from bU
 */
public final class bu_1
extends GeneratedMessageV3.Builder<bu_1>
implements bv_2 {
    private long fG;
    private int eb = 0;

    public static final Descriptors.Descriptor kE() {
        return ae_1.ew;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.ex.ensureFieldAccessorsInitialized(bs_1.class, bu_1.class);
    }

    bu_1() {
        this.D();
    }

    bu_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (bs_1.aJ()) {
            // empty if block
        }
    }

    public bu_1 kF() {
        super.clear();
        this.fG = 0L;
        this.eb = 0;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ae_1.ew;
    }

    public bs_1 kD() {
        return bs_1.kC();
    }

    public bs_1 kG() {
        bs_1 bs_12 = this.kH();
        if (!bs_12.isInitialized()) {
            throw bu_1.newUninitializedMessageException((Message)bs_12);
        }
        return bs_12;
    }

    public bs_1 kH() {
        bs_1 bs_12 = new bs_1(this);
        bs_12.fG = this.fG;
        bs_12.eb = this.eb;
        this.onBuilt();
        return bs_12;
    }

    public bu_1 kI() {
        return (bu_1)super.clone();
    }

    public bu_1 am(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (bu_1)super.setField(fieldDescriptor, object);
    }

    public bu_1 G(Descriptors.FieldDescriptor fieldDescriptor) {
        return (bu_1)super.clearField(fieldDescriptor);
    }

    public bu_1 G(Descriptors.OneofDescriptor oneofDescriptor) {
        return (bu_1)super.clearOneof(oneofDescriptor);
    }

    public bu_1 G(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (bu_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public bu_1 an(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (bu_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public bu_1 G(Message message) {
        if (message instanceof bs_1) {
            return this.c((bs_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public bu_1 c(bs_1 bs_12) {
        if (bs_12 == bs_1.kC()) {
            return this;
        }
        if (bs_12.fD() != 0L) {
            this.v(bs_12.fD());
        }
        if (bs_12.eb != 0) {
            this.Q(bs_12.fl());
        }
        this.an(bs_1.b(bs_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public bu_1 aU(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        bs_1 bs_12 = null;
        try {
            bs_12 = (bs_1)bs_1.hv.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            bs_12 = (bs_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (bs_12 != null) {
                this.c(bs_12);
            }
        }
        return this;
    }

    @Override
    public long fD() {
        return this.fG;
    }

    public bu_1 v(long l) {
        this.fG = l;
        this.onChanged();
        return this;
    }

    public bu_1 kJ() {
        this.fG = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public int fl() {
        return this.eb;
    }

    public bu_1 Q(int n) {
        this.eb = n;
        this.onChanged();
        return this;
    }

    @Override
    public cq_2 ky() {
        cq_2 cq_22 = cq_2.af(this.eb);
        return cq_22 == null ? cq_2.iQ : cq_22;
    }

    public bu_1 a(cq_2 cq_22) {
        if (cq_22 == null) {
            throw new NullPointerException();
        }
        this.eb = cq_22.getNumber();
        this.onChanged();
        return this;
    }

    public bu_1 kK() {
        this.eb = 0;
        this.onChanged();
        return this;
    }

    public final bu_1 am(UnknownFieldSet unknownFieldSet) {
        return (bu_1)super.setUnknownFields(unknownFieldSet);
    }

    public final bu_1 an(UnknownFieldSet unknownFieldSet) {
        return (bu_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.an(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.am(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.an(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.G(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.G(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.G(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.am(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.kF();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.kI();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.an(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.aU(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.G(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.kF();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.G(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.kI();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.an(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.am(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.an(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.G(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.G(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.G(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.am(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.aU(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.kI();
    }

    public /* synthetic */ Message buildPartial() {
        return this.kH();
    }

    public /* synthetic */ Message build() {
        return this.kG();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.G(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.kF();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.aU(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.kI();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.kH();
    }

    public /* synthetic */ MessageLite build() {
        return this.kG();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.kF();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.kD();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.kD();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.aU(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.kI();
    }

    public /* synthetic */ Object clone() {
        return this.kI();
    }
}

