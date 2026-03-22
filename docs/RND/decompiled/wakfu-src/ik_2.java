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
 * Renamed from iK
 */
public final class ik_2
extends GeneratedMessageV3.Builder<ik_2>
implements il_2 {
    private int an;
    private int xX;
    private int xZ;
    private int yb;

    public static final Descriptors.Descriptor Qg() {
        return ih_2.wH;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ih_2.wI.ensureFieldAccessorsInitialized(ii_2.class, ik_2.class);
    }

    ik_2() {
        this.D();
    }

    ik_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (ii_2.jh()) {
            // empty if block
        }
    }

    public ik_2 Qh() {
        super.clear();
        this.xX = 0;
        this.an &= 0xFFFFFFFE;
        this.xZ = 0;
        this.an &= 0xFFFFFFFD;
        this.yb = 0;
        this.an &= 0xFFFFFFFB;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ih_2.wH;
    }

    public ii_2 Qf() {
        return ii_2.Qe();
    }

    public ii_2 Qi() {
        ii_2 ii_22 = this.Qj();
        if (!ii_22.isInitialized()) {
            throw ik_2.newUninitializedMessageException((Message)ii_22);
        }
        return ii_22;
    }

    public ii_2 Qj() {
        ii_2 ii_22 = new ii_2(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            ii_22.xX = this.xX;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            ii_22.xZ = this.xZ;
            n2 |= 2;
        }
        if ((n & 4) != 0) {
            ii_22.yb = this.yb;
            n2 |= 4;
        }
        ii_22.an = n2;
        this.onBuilt();
        return ii_22;
    }

    public ik_2 Qk() {
        return (ik_2)super.clone();
    }

    public ik_2 dg(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ik_2)super.setField(fieldDescriptor, object);
    }

    public ik_2 bd(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ik_2)super.clearField(fieldDescriptor);
    }

    public ik_2 bd(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ik_2)super.clearOneof(oneofDescriptor);
    }

    public ik_2 bd(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ik_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ik_2 dh(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ik_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public ik_2 bd(Message message) {
        if (message instanceof ii_2) {
            return this.h((ii_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ik_2 h(ii_2 ii_22) {
        if (ii_22 == ii_2.Qe()) {
            return this;
        }
        if (ii_22.NK()) {
            this.eH(ii_22.getX());
        }
        if (ii_22.NL()) {
            this.eI(ii_22.getY());
        }
        if (ii_22.NM()) {
            this.eJ(ii_22.NN());
        }
        this.dh(ii_2.g(ii_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.NK()) {
            return false;
        }
        if (!this.NL()) {
            return false;
        }
        return this.NM();
    }

    public ik_2 fl(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ii_2 ii_22 = null;
        try {
            ii_22 = (ii_2)ii_2.zo.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ii_22 = (ii_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ii_22 != null) {
                this.h(ii_22);
            }
        }
        return this;
    }

    @Override
    public boolean NK() {
        return (this.an & 1) != 0;
    }

    @Override
    public int getX() {
        return this.xX;
    }

    public ik_2 eH(int n) {
        this.an |= 1;
        this.xX = n;
        this.onChanged();
        return this;
    }

    public ik_2 Ql() {
        this.an &= 0xFFFFFFFE;
        this.xX = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean NL() {
        return (this.an & 2) != 0;
    }

    @Override
    public int getY() {
        return this.xZ;
    }

    public ik_2 eI(int n) {
        this.an |= 2;
        this.xZ = n;
        this.onChanged();
        return this;
    }

    public ik_2 Qm() {
        this.an &= 0xFFFFFFFD;
        this.xZ = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean NM() {
        return (this.an & 4) != 0;
    }

    @Override
    public int NN() {
        return this.yb;
    }

    public ik_2 eJ(int n) {
        this.an |= 4;
        this.yb = n;
        this.onChanged();
        return this;
    }

    public ik_2 Qn() {
        this.an &= 0xFFFFFFFB;
        this.yb = 0;
        this.onChanged();
        return this;
    }

    public final ik_2 dg(UnknownFieldSet unknownFieldSet) {
        return (ik_2)super.setUnknownFields(unknownFieldSet);
    }

    public final ik_2 dh(UnknownFieldSet unknownFieldSet) {
        return (ik_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dh(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dg(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dh(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bd(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bd(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bd(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dg(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.Qh();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.Qk();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dh(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fl(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.bd(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.Qh();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bd(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.Qk();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dh(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dg(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dh(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bd(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bd(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bd(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dg(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fl(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.Qk();
    }

    public /* synthetic */ Message buildPartial() {
        return this.Qj();
    }

    public /* synthetic */ Message build() {
        return this.Qi();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.bd(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.Qh();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fl(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.Qk();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.Qj();
    }

    public /* synthetic */ MessageLite build() {
        return this.Qi();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.Qh();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.Qf();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.Qf();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fl(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.Qk();
    }

    public /* synthetic */ Object clone() {
        return this.Qk();
    }
}

