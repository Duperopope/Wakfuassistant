/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessageLite$Builder
 *  com.google.protobuf.ByteString
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
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.UnknownFieldSet;

public final class Az
extends GeneratedMessageV3.Builder<Az>
implements aa_0 {
    private int an;
    private long Dj;
    private Object aqJ = "";
    private Object aqL = "";
    private long wf;

    public static final Descriptors.Descriptor aDz() {
        return zS.apn;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return zS.apo.ensureFieldAccessorsInitialized(Ax.class, Az.class);
    }

    Az() {
        this.D();
    }

    Az(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (Ax.Y()) {
            // empty if block
        }
    }

    public Az aDA() {
        super.clear();
        this.Dj = 0L;
        this.an &= 0xFFFFFFFE;
        this.aqJ = "";
        this.an &= 0xFFFFFFFD;
        this.aqL = "";
        this.an &= 0xFFFFFFFB;
        this.wf = 0L;
        this.an &= 0xFFFFFFF7;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return zS.apn;
    }

    public Ax aDy() {
        return Ax.aDx();
    }

    public Ax aDB() {
        Ax ax = this.aDC();
        if (!ax.isInitialized()) {
            throw Az.newUninitializedMessageException((Message)ax);
        }
        return ax;
    }

    public Ax aDC() {
        Ax ax = new Ax(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            ax.Dj = this.Dj;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            n2 |= 2;
        }
        ax.aqJ = this.aqJ;
        if ((n & 4) != 0) {
            n2 |= 4;
        }
        ax.aqL = this.aqL;
        if ((n & 8) != 0) {
            ax.wf = this.wf;
            n2 |= 8;
        }
        ax.an = n2;
        this.onBuilt();
        return ax;
    }

    public Az aDD() {
        return (Az)super.clone();
    }

    public Az gw(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (Az)super.setField(fieldDescriptor, object);
    }

    public Az cL(Descriptors.FieldDescriptor fieldDescriptor) {
        return (Az)super.clearField(fieldDescriptor);
    }

    public Az cL(Descriptors.OneofDescriptor oneofDescriptor) {
        return (Az)super.clearOneof(oneofDescriptor);
    }

    public Az cL(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (Az)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public Az gx(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (Az)super.addRepeatedField(fieldDescriptor, object);
    }

    public Az cL(Message message) {
        if (message instanceof Ax) {
            return this.c((Ax)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public Az c(Ax ax) {
        if (ax == Ax.aDx()) {
            return this;
        }
        if (ax.Xh()) {
            this.ce(ax.Xi());
        }
        if (ax.aDp()) {
            this.an |= 2;
            this.aqJ = ax.aqJ;
            this.onChanged();
        }
        if (ax.azs()) {
            this.an |= 4;
            this.aqL = ax.aqL;
            this.onChanged();
        }
        if (ax.KT()) {
            this.cf(ax.KU());
        }
        this.gx(Ax.b(ax));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.Xh()) {
            return false;
        }
        return this.aDp();
    }

    public Az kj(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        Ax ax = null;
        try {
            ax = (Ax)Ax.aqO.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ax = (Ax)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ax != null) {
                this.c(ax);
            }
        }
        return this;
    }

    @Override
    public boolean Xh() {
        return (this.an & 1) != 0;
    }

    @Override
    public long Xi() {
        return this.Dj;
    }

    public Az ce(long l) {
        this.an |= 1;
        this.Dj = l;
        this.onChanged();
        return this;
    }

    public Az aDE() {
        this.an &= 0xFFFFFFFE;
        this.Dj = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean aDp() {
        return (this.an & 2) != 0;
    }

    @Override
    public String aDq() {
        Object object = this.aqJ;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.aqJ = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString aDr() {
        Object object = this.aqJ;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.aqJ = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public Az am(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.an |= 2;
        this.aqJ = string;
        this.onChanged();
        return this;
    }

    public Az aDF() {
        this.an &= 0xFFFFFFFD;
        this.aqJ = Ax.aDx().aDq();
        this.onChanged();
        return this;
    }

    public Az eo(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.an |= 2;
        this.aqJ = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean azs() {
        return (this.an & 4) != 0;
    }

    @Override
    public String aDs() {
        Object object = this.aqL;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.aqL = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString aDt() {
        Object object = this.aqL;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.aqL = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public Az an(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.an |= 4;
        this.aqL = string;
        this.onChanged();
        return this;
    }

    public Az aDG() {
        this.an &= 0xFFFFFFFB;
        this.aqL = Ax.aDx().aDs();
        this.onChanged();
        return this;
    }

    public Az ep(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.an |= 4;
        this.aqL = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean KT() {
        return (this.an & 8) != 0;
    }

    @Override
    public long KU() {
        return this.wf;
    }

    public Az cf(long l) {
        this.an |= 8;
        this.wf = l;
        this.onChanged();
        return this;
    }

    public Az aDH() {
        this.an &= 0xFFFFFFF7;
        this.wf = 0L;
        this.onChanged();
        return this;
    }

    public final Az gw(UnknownFieldSet unknownFieldSet) {
        return (Az)super.setUnknownFields(unknownFieldSet);
    }

    public final Az gx(UnknownFieldSet unknownFieldSet) {
        return (Az)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gx(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gw(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gx(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cL(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cL(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cL(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gw(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.aDA();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.aDD();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gx(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.kj(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.cL(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.aDA();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cL(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.aDD();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gx(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gw(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gx(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cL(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cL(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cL(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gw(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.kj(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.aDD();
    }

    public /* synthetic */ Message buildPartial() {
        return this.aDC();
    }

    public /* synthetic */ Message build() {
        return this.aDB();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.cL(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.aDA();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.kj(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.aDD();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.aDC();
    }

    public /* synthetic */ MessageLite build() {
        return this.aDB();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.aDA();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aDy();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aDy();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.kj(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.aDD();
    }

    public /* synthetic */ Object clone() {
        return this.aDD();
    }
}

