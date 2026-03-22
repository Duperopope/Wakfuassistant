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
 *  com.google.protobuf.Internal$IntList
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
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.UnknownFieldSet;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from zQ
 */
public final class zq_1
extends GeneratedMessageV3.Builder<zq_1>
implements zr_1 {
    private int an;
    private Internal.IntList apa = zo_2.amY();
    private Internal.IntList apc = zo_2.vM();

    public static final Descriptors.Descriptor aAH() {
        return zn_2.aoW;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return zn_2.aoX.ensureFieldAccessorsInitialized(zo_2.class, zq_1.class);
    }

    zq_1() {
        this.D();
    }

    zq_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (zo_2.aJ()) {
            // empty if block
        }
    }

    public zq_1 aAI() {
        super.clear();
        this.apa = zo_2.auN();
        this.an &= 0xFFFFFFFE;
        this.apc = zo_2.aAG();
        this.an &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return zn_2.aoW;
    }

    public zo_2 aAF() {
        return zo_2.aAE();
    }

    public zo_2 aAJ() {
        zo_2 zo_22 = this.aAK();
        if (!zo_22.isInitialized()) {
            throw zq_1.newUninitializedMessageException((Message)zo_22);
        }
        return zo_22;
    }

    public zo_2 aAK() {
        zo_2 zo_22 = new zo_2(this);
        int n = this.an;
        if ((this.an & 1) != 0) {
            this.apa.makeImmutable();
            this.an &= 0xFFFFFFFE;
        }
        zo_22.apa = this.apa;
        if ((this.an & 2) != 0) {
            this.apc.makeImmutable();
            this.an &= 0xFFFFFFFD;
        }
        zo_22.apc = this.apc;
        this.onBuilt();
        return zo_22;
    }

    public zq_1 aAL() {
        return (zq_1)super.clone();
    }

    public zq_1 gg(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (zq_1)super.setField(fieldDescriptor, object);
    }

    public zq_1 cD(Descriptors.FieldDescriptor fieldDescriptor) {
        return (zq_1)super.clearField(fieldDescriptor);
    }

    public zq_1 cD(Descriptors.OneofDescriptor oneofDescriptor) {
        return (zq_1)super.clearOneof(oneofDescriptor);
    }

    public zq_1 cD(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (zq_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public zq_1 gh(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (zq_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public zq_1 cD(Message message) {
        if (message instanceof zo_2) {
            return this.c((zo_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public zq_1 c(zo_2 zo_22) {
        if (zo_22 == zo_2.aAE()) {
            return this;
        }
        if (!zo_22.apa.isEmpty()) {
            if (this.apa.isEmpty()) {
                this.apa = zo_22.apa;
                this.an &= 0xFFFFFFFE;
            } else {
                this.aAM();
                this.apa.addAll((Collection)zo_22.apa);
            }
            this.onChanged();
        }
        if (!zo_22.apc.isEmpty()) {
            if (this.apc.isEmpty()) {
                this.apc = zo_22.apc;
                this.an &= 0xFFFFFFFD;
            } else {
                this.aAO();
                this.apc.addAll((Collection)zo_22.apc);
            }
            this.onChanged();
        }
        this.gh(zo_2.b(zo_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public zq_1 jL(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        zo_2 zo_22 = null;
        try {
            zo_22 = (zo_2)zo_2.ape.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            zo_22 = (zo_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (zo_22 != null) {
                this.c(zo_22);
            }
        }
        return this;
    }

    private void aAM() {
        if ((this.an & 1) == 0) {
            this.apa = zo_2.e(this.apa);
            this.an |= 1;
        }
    }

    @Override
    public List<Integer> aAx() {
        return (this.an & 1) != 0 ? Collections.unmodifiableList(this.apa) : this.apa;
    }

    @Override
    public int aAy() {
        return this.apa.size();
    }

    @Override
    public int lb(int n) {
        return this.apa.getInt(n);
    }

    public zq_1 l(int n, int n2) {
        this.aAM();
        this.apa.setInt(n, n2);
        this.onChanged();
        return this;
    }

    public zq_1 ld(int n) {
        this.aAM();
        this.apa.addInt(n);
        this.onChanged();
        return this;
    }

    public zq_1 ay(Iterable<? extends Integer> iterable) {
        this.aAM();
        AbstractMessageLite.Builder.addAll(iterable, (List)this.apa);
        this.onChanged();
        return this;
    }

    public zq_1 aAN() {
        this.apa = zo_2.Ac();
        this.an &= 0xFFFFFFFE;
        this.onChanged();
        return this;
    }

    private void aAO() {
        if ((this.an & 2) == 0) {
            this.apc = zo_2.a(this.apc);
            this.an |= 2;
        }
    }

    @Override
    public List<Integer> aAz() {
        return (this.an & 2) != 0 ? Collections.unmodifiableList(this.apc) : this.apc;
    }

    @Override
    public int aAA() {
        return this.apc.size();
    }

    @Override
    public int lc(int n) {
        return this.apc.getInt(n);
    }

    public zq_1 m(int n, int n2) {
        this.aAO();
        this.apc.setInt(n, n2);
        this.onChanged();
        return this;
    }

    public zq_1 le(int n) {
        this.aAO();
        this.apc.addInt(n);
        this.onChanged();
        return this;
    }

    public zq_1 az(Iterable<? extends Integer> iterable) {
        this.aAO();
        AbstractMessageLite.Builder.addAll(iterable, (List)this.apc);
        this.onChanged();
        return this;
    }

    public zq_1 aAP() {
        this.apc = zo_2.vN();
        this.an &= 0xFFFFFFFD;
        this.onChanged();
        return this;
    }

    public final zq_1 gg(UnknownFieldSet unknownFieldSet) {
        return (zq_1)super.setUnknownFields(unknownFieldSet);
    }

    public final zq_1 gh(UnknownFieldSet unknownFieldSet) {
        return (zq_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gh(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gg(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gh(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cD(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cD(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cD(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gg(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.aAI();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.aAL();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gh(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jL(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.cD(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.aAI();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cD(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.aAL();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gh(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gg(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gh(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cD(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cD(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cD(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gg(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jL(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.aAL();
    }

    public /* synthetic */ Message buildPartial() {
        return this.aAK();
    }

    public /* synthetic */ Message build() {
        return this.aAJ();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.cD(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.aAI();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jL(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.aAL();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.aAK();
    }

    public /* synthetic */ MessageLite build() {
        return this.aAJ();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.aAI();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aAF();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aAF();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jL(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.aAL();
    }

    public /* synthetic */ Object clone() {
        return this.aAL();
    }
}

