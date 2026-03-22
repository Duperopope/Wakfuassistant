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
 * Renamed from eC
 */
public final class ec_2
extends GeneratedMessageV3.Builder<ec_2>
implements ed_2 {
    private int an;
    private int ni;
    private boolean nk;

    public static final Descriptors.Descriptor wg() {
        return ej_2.mF;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ej_2.mG.ensureFieldAccessorsInitialized(ea_2.class, ec_2.class);
    }

    ec_2() {
        this.D();
    }

    ec_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (ea_2.gG()) {
            // empty if block
        }
    }

    public ec_2 wh() {
        super.clear();
        this.ni = 0;
        this.an &= 0xFFFFFFFE;
        this.nk = false;
        this.an &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ej_2.mF;
    }

    public ea_2 wf() {
        return ea_2.we();
    }

    public ea_2 wi() {
        ea_2 ea_22 = this.wj();
        if (!ea_22.isInitialized()) {
            throw ec_2.newUninitializedMessageException((Message)ea_22);
        }
        return ea_22;
    }

    public ea_2 wj() {
        ea_2 ea_22 = new ea_2(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            ea_22.ni = this.ni;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            ea_22.nk = this.nk;
            n2 |= 2;
        }
        ea_22.an = n2;
        this.onBuilt();
        return ea_22;
    }

    public ec_2 wk() {
        return (ec_2)super.clone();
    }

    public ec_2 bw(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ec_2)super.setField(fieldDescriptor, object);
    }

    public ec_2 al(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ec_2)super.clearField(fieldDescriptor);
    }

    public ec_2 al(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ec_2)super.clearOneof(oneofDescriptor);
    }

    public ec_2 al(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ec_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ec_2 bx(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ec_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public ec_2 al(Message message) {
        if (message instanceof ea_2) {
            return this.c((ea_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ec_2 c(ea_2 ea_22) {
        if (ea_22 == ea_2.we()) {
            return this;
        }
        if (ea_22.vX()) {
            this.bu(ea_22.vY());
        }
        if (ea_22.vZ()) {
            this.e(ea_22.wa());
        }
        this.bx(ea_2.b(ea_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.vX()) {
            return false;
        }
        return this.vZ();
    }

    public ec_2 cJ(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ea_2 ea_22 = null;
        try {
            ea_22 = (ea_2)ea_2.nm.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ea_22 = (ea_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ea_22 != null) {
                this.c(ea_22);
            }
        }
        return this;
    }

    @Override
    public boolean vX() {
        return (this.an & 1) != 0;
    }

    @Override
    public int vY() {
        return this.ni;
    }

    public ec_2 bu(int n) {
        this.an |= 1;
        this.ni = n;
        this.onChanged();
        return this;
    }

    public ec_2 wl() {
        this.an &= 0xFFFFFFFE;
        this.ni = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean vZ() {
        return (this.an & 2) != 0;
    }

    @Override
    public boolean wa() {
        return this.nk;
    }

    public ec_2 e(boolean bl) {
        this.an |= 2;
        this.nk = bl;
        this.onChanged();
        return this;
    }

    public ec_2 wm() {
        this.an &= 0xFFFFFFFD;
        this.nk = false;
        this.onChanged();
        return this;
    }

    public final ec_2 bw(UnknownFieldSet unknownFieldSet) {
        return (ec_2)super.setUnknownFields(unknownFieldSet);
    }

    public final ec_2 bx(UnknownFieldSet unknownFieldSet) {
        return (ec_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bx(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bw(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bx(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.al(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.al(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.al(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bw(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.wh();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.wk();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bx(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cJ(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.al(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.wh();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.al(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.wk();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bx(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bw(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bx(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.al(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.al(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.al(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bw(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cJ(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.wk();
    }

    public /* synthetic */ Message buildPartial() {
        return this.wj();
    }

    public /* synthetic */ Message build() {
        return this.wi();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.al(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.wh();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cJ(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.wk();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.wj();
    }

    public /* synthetic */ MessageLite build() {
        return this.wi();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.wh();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.wf();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.wf();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cJ(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.wk();
    }

    public /* synthetic */ Object clone() {
        return this.wk();
    }
}

