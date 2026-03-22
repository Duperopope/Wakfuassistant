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
 * Renamed from nM
 */
public final class nm_2
extends GeneratedMessageV3.Builder<nm_2>
implements nn_2 {
    private int an;
    private long nW;

    public static final Descriptors.Descriptor asH() {
        return nj_2.Pk;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return nj_2.Pl.ensureFieldAccessorsInitialized(nk_2.class, nm_2.class);
    }

    nm_2() {
        this.D();
    }

    nm_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (nk_2.fa()) {
            // empty if block
        }
    }

    public nm_2 asI() {
        super.clear();
        this.nW = 0L;
        this.an &= 0xFFFFFFFE;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return nj_2.Pk;
    }

    public nk_2 asG() {
        return nk_2.asF();
    }

    public nk_2 asJ() {
        nk_2 nk_22 = this.asK();
        if (!nk_22.isInitialized()) {
            throw nm_2.newUninitializedMessageException((Message)nk_22);
        }
        return nk_22;
    }

    public nk_2 asK() {
        nk_2 nk_22 = new nk_2(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            nk_22.nW = this.nW;
            n2 |= 1;
        }
        nk_22.an = n2;
        this.onBuilt();
        return nk_22;
    }

    public nm_2 asL() {
        return (nm_2)super.clone();
    }

    public nm_2 fs(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (nm_2)super.setField(fieldDescriptor, object);
    }

    public nm_2 cj(Descriptors.FieldDescriptor fieldDescriptor) {
        return (nm_2)super.clearField(fieldDescriptor);
    }

    public nm_2 cj(Descriptors.OneofDescriptor oneofDescriptor) {
        return (nm_2)super.clearOneof(oneofDescriptor);
    }

    public nm_2 cj(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (nm_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public nm_2 ft(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (nm_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public nm_2 cj(Message message) {
        if (message instanceof nk_2) {
            return this.c((nk_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public nm_2 c(nk_2 nk_22) {
        if (nk_22 == nk_2.asF()) {
            return this;
        }
        if (nk_22.xk()) {
            this.bN(nk_22.xl());
        }
        this.ft(nk_2.b(nk_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return this.xk();
    }

    public nm_2 iD(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        nk_2 nk_22 = null;
        try {
            nk_22 = (nk_2)nk_2.Pr.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            nk_22 = (nk_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (nk_22 != null) {
                this.c(nk_22);
            }
        }
        return this;
    }

    @Override
    public boolean xk() {
        return (this.an & 1) != 0;
    }

    @Override
    public long xl() {
        return this.nW;
    }

    public nm_2 bN(long l) {
        this.an |= 1;
        this.nW = l;
        this.onChanged();
        return this;
    }

    public nm_2 asM() {
        this.an &= 0xFFFFFFFE;
        this.nW = 0L;
        this.onChanged();
        return this;
    }

    public final nm_2 fs(UnknownFieldSet unknownFieldSet) {
        return (nm_2)super.setUnknownFields(unknownFieldSet);
    }

    public final nm_2 ft(UnknownFieldSet unknownFieldSet) {
        return (nm_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ft(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fs(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ft(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cj(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cj(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cj(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fs(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.asI();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.asL();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ft(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.iD(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.cj(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.asI();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cj(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.asL();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ft(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fs(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ft(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cj(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cj(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cj(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fs(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.iD(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.asL();
    }

    public /* synthetic */ Message buildPartial() {
        return this.asK();
    }

    public /* synthetic */ Message build() {
        return this.asJ();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.cj(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.asI();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.iD(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.asL();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.asK();
    }

    public /* synthetic */ MessageLite build() {
        return this.asJ();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.asI();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.asG();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.asG();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.iD(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.asL();
    }

    public /* synthetic */ Object clone() {
        return this.asL();
    }
}

