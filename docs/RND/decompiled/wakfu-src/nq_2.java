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
 * Renamed from nQ
 */
public final class nq_2
extends GeneratedMessageV3.Builder<nq_2>
implements nr_2 {
    private int an;
    private long nW;

    public static final Descriptors.Descriptor asT() {
        return nj_2.Pm;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return nj_2.Pn.ensureFieldAccessorsInitialized(no_2.class, nq_2.class);
    }

    nq_2() {
        this.D();
    }

    nq_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (no_2.bg()) {
            // empty if block
        }
    }

    public nq_2 asU() {
        super.clear();
        this.nW = 0L;
        this.an &= 0xFFFFFFFE;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return nj_2.Pm;
    }

    public no_2 asS() {
        return no_2.asR();
    }

    public no_2 asV() {
        no_2 no_22 = this.asW();
        if (!no_22.isInitialized()) {
            throw nq_2.newUninitializedMessageException((Message)no_22);
        }
        return no_22;
    }

    public no_2 asW() {
        no_2 no_22 = new no_2(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            no_22.nW = this.nW;
            n2 |= 1;
        }
        no_22.an = n2;
        this.onBuilt();
        return no_22;
    }

    public nq_2 asX() {
        return (nq_2)super.clone();
    }

    public nq_2 fu(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (nq_2)super.setField(fieldDescriptor, object);
    }

    public nq_2 ck(Descriptors.FieldDescriptor fieldDescriptor) {
        return (nq_2)super.clearField(fieldDescriptor);
    }

    public nq_2 ck(Descriptors.OneofDescriptor oneofDescriptor) {
        return (nq_2)super.clearOneof(oneofDescriptor);
    }

    public nq_2 ck(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (nq_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public nq_2 fv(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (nq_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public nq_2 ck(Message message) {
        if (message instanceof no_2) {
            return this.c((no_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public nq_2 c(no_2 no_22) {
        if (no_22 == no_2.asR()) {
            return this;
        }
        if (no_22.xk()) {
            this.bO(no_22.xl());
        }
        this.fv(no_2.b(no_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return this.xk();
    }

    public nq_2 iG(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        no_2 no_22 = null;
        try {
            no_22 = (no_2)no_2.Pv.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            no_22 = (no_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (no_22 != null) {
                this.c(no_22);
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

    public nq_2 bO(long l) {
        this.an |= 1;
        this.nW = l;
        this.onChanged();
        return this;
    }

    public nq_2 asY() {
        this.an &= 0xFFFFFFFE;
        this.nW = 0L;
        this.onChanged();
        return this;
    }

    public final nq_2 fu(UnknownFieldSet unknownFieldSet) {
        return (nq_2)super.setUnknownFields(unknownFieldSet);
    }

    public final nq_2 fv(UnknownFieldSet unknownFieldSet) {
        return (nq_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fv(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fu(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fv(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.ck(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ck(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.ck(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fu(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.asU();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.asX();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fv(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.iG(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.ck(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.asU();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ck(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.asX();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fv(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fu(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fv(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.ck(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ck(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.ck(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fu(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.iG(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.asX();
    }

    public /* synthetic */ Message buildPartial() {
        return this.asW();
    }

    public /* synthetic */ Message build() {
        return this.asV();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.ck(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.asU();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.iG(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.asX();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.asW();
    }

    public /* synthetic */ MessageLite build() {
        return this.asV();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.asU();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.asS();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.asS();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.iG(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.asX();
    }

    public /* synthetic */ Object clone() {
        return this.asX();
    }
}

