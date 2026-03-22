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
 * Renamed from dO
 */
public final class do_2
extends GeneratedMessageV3.Builder<do_2>
implements dp_2 {
    private int an;
    private int lh;
    private int lj;

    public static final Descriptors.Descriptor st() {
        return df_2.jP;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return df_2.jQ.ensureFieldAccessorsInitialized(dm_1.class, do_2.class);
    }

    do_2() {
        this.D();
    }

    do_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (dm_1.dM()) {
            // empty if block
        }
    }

    public do_2 su() {
        super.clear();
        this.lh = 0;
        this.an &= 0xFFFFFFFE;
        this.lj = 0;
        this.an &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return df_2.jP;
    }

    public dm_1 ss() {
        return dm_1.sr();
    }

    public dm_1 sv() {
        dm_1 dm_12 = this.sw();
        if (!dm_12.isInitialized()) {
            throw do_2.newUninitializedMessageException((Message)dm_12);
        }
        return dm_12;
    }

    public dm_1 sw() {
        dm_1 dm_12 = new dm_1(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            dm_12.lh = this.lh;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            dm_12.lj = this.lj;
            n2 |= 2;
        }
        dm_12.an = n2;
        this.onBuilt();
        return dm_12;
    }

    public do_2 sx() {
        return (do_2)super.clone();
    }

    public do_2 be(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (do_2)super.setField(fieldDescriptor, object);
    }

    public do_2 ac(Descriptors.FieldDescriptor fieldDescriptor) {
        return (do_2)super.clearField(fieldDescriptor);
    }

    public do_2 ac(Descriptors.OneofDescriptor oneofDescriptor) {
        return (do_2)super.clearOneof(oneofDescriptor);
    }

    public do_2 ac(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (do_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public do_2 bf(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (do_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public do_2 ac(Message message) {
        if (message instanceof dm_1) {
            return this.c((dm_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public do_2 c(dm_1 dm_12) {
        if (dm_12 == dm_1.sr()) {
            return this;
        }
        if (dm_12.sk()) {
            this.aN(dm_12.sl());
        }
        if (dm_12.sm()) {
            this.aO(dm_12.sn());
        }
        this.bf(dm_1.b(dm_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.sk()) {
            return false;
        }
        return this.sm();
    }

    public do_2 ci(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        dm_1 dm_12 = null;
        try {
            dm_12 = (dm_1)dm_1.ll.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            dm_12 = (dm_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (dm_12 != null) {
                this.c(dm_12);
            }
        }
        return this;
    }

    @Override
    public boolean sk() {
        return (this.an & 1) != 0;
    }

    @Override
    public int sl() {
        return this.lh;
    }

    public do_2 aN(int n) {
        this.an |= 1;
        this.lh = n;
        this.onChanged();
        return this;
    }

    public do_2 sy() {
        this.an &= 0xFFFFFFFE;
        this.lh = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean sm() {
        return (this.an & 2) != 0;
    }

    @Override
    public int sn() {
        return this.lj;
    }

    public do_2 aO(int n) {
        this.an |= 2;
        this.lj = n;
        this.onChanged();
        return this;
    }

    public do_2 sz() {
        this.an &= 0xFFFFFFFD;
        this.lj = 0;
        this.onChanged();
        return this;
    }

    public final do_2 be(UnknownFieldSet unknownFieldSet) {
        return (do_2)super.setUnknownFields(unknownFieldSet);
    }

    public final do_2 bf(UnknownFieldSet unknownFieldSet) {
        return (do_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bf(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.be(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bf(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.ac(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ac(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.ac(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.be(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.su();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.sx();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bf(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ci(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.ac(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.su();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ac(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.sx();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bf(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.be(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bf(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.ac(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ac(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.ac(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.be(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ci(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.sx();
    }

    public /* synthetic */ Message buildPartial() {
        return this.sw();
    }

    public /* synthetic */ Message build() {
        return this.sv();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.ac(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.su();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ci(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.sx();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.sw();
    }

    public /* synthetic */ MessageLite build() {
        return this.sv();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.su();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.ss();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.ss();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ci(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.sx();
    }

    public /* synthetic */ Object clone() {
        return this.sx();
    }
}

