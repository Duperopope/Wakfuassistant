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
 * Renamed from dd
 */
public final class dd_1
extends GeneratedMessageV3.Builder<dd_1>
implements de_1 {
    private int an;
    private int dL;
    private int jq;

    public static final Descriptors.Descriptor oW() {
        return cw_1.jf;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return cw_1.jg.ensureFieldAccessorsInitialized(db_2.class, dd_1.class);
    }

    dd_1() {
        this.D();
    }

    dd_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (db_2.oV()) {
            // empty if block
        }
    }

    public dd_1 oX() {
        super.clear();
        this.dL = 0;
        this.an &= 0xFFFFFFFE;
        this.jq = 0;
        this.an &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return cw_1.jf;
    }

    public db_2 oU() {
        return db_2.oT();
    }

    public db_2 oY() {
        db_2 db_22 = this.oZ();
        if (!db_22.isInitialized()) {
            throw dd_1.newUninitializedMessageException((Message)db_22);
        }
        return db_22;
    }

    public db_2 oZ() {
        db_2 db_22 = new db_2(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            db_22.dL = this.dL;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            db_22.jq = this.jq;
            n2 |= 2;
        }
        db_22.an = n2;
        this.onBuilt();
        return db_22;
    }

    public dd_1 pa() {
        return (dd_1)super.clone();
    }

    public dd_1 aO(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (dd_1)super.setField(fieldDescriptor, object);
    }

    public dd_1 U(Descriptors.FieldDescriptor fieldDescriptor) {
        return (dd_1)super.clearField(fieldDescriptor);
    }

    public dd_1 U(Descriptors.OneofDescriptor oneofDescriptor) {
        return (dd_1)super.clearOneof(oneofDescriptor);
    }

    public dd_1 U(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (dd_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public dd_1 aP(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (dd_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public dd_1 U(Message message) {
        if (message instanceof db_2) {
            return this.d((db_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public dd_1 d(db_2 db_22) {
        if (db_22 == db_2.oT()) {
            return this;
        }
        if (db_22.oN()) {
            this.ao(db_22.d());
        }
        if (db_22.oO()) {
            this.ap(db_22.oP());
        }
        this.aP(db_2.c(db_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.oN()) {
            return false;
        }
        return this.oO();
    }

    public dd_1 bK(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        db_2 db_22 = null;
        try {
            db_22 = (db_2)db_2.js.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            db_22 = (db_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (db_22 != null) {
                this.d(db_22);
            }
        }
        return this;
    }

    @Override
    public boolean oN() {
        return (this.an & 1) != 0;
    }

    @Override
    public int d() {
        return this.dL;
    }

    public dd_1 ao(int n) {
        this.an |= 1;
        this.dL = n;
        this.onChanged();
        return this;
    }

    public dd_1 pb() {
        this.an &= 0xFFFFFFFE;
        this.dL = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean oO() {
        return (this.an & 2) != 0;
    }

    @Override
    public int oP() {
        return this.jq;
    }

    public dd_1 ap(int n) {
        this.an |= 2;
        this.jq = n;
        this.onChanged();
        return this;
    }

    public dd_1 pc() {
        this.an &= 0xFFFFFFFD;
        this.jq = 0;
        this.onChanged();
        return this;
    }

    public final dd_1 aO(UnknownFieldSet unknownFieldSet) {
        return (dd_1)super.setUnknownFields(unknownFieldSet);
    }

    public final dd_1 aP(UnknownFieldSet unknownFieldSet) {
        return (dd_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aP(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aO(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aP(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.U(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.U(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.U(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aO(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.oX();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.pa();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aP(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bK(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.U(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.oX();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.U(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.pa();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aP(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aO(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aP(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.U(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.U(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.U(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aO(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bK(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.pa();
    }

    public /* synthetic */ Message buildPartial() {
        return this.oZ();
    }

    public /* synthetic */ Message build() {
        return this.oY();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.U(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.oX();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bK(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.pa();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.oZ();
    }

    public /* synthetic */ MessageLite build() {
        return this.oY();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.oX();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.oU();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.oU();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bK(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.pa();
    }

    public /* synthetic */ Object clone() {
        return this.pa();
    }
}

