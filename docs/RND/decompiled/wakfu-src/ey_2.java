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
 * Renamed from ey
 */
public final class ey_2
extends GeneratedMessageV3.Builder<ey_2>
implements ez_2 {
    private int an;
    private int nb;
    private Internal.IntList nd = ew_2.vM();

    public static final Descriptors.Descriptor vO() {
        return ej_2.mD;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ej_2.mE.ensureFieldAccessorsInitialized(ew_2.class, ey_2.class);
    }

    ey_2() {
        this.D();
    }

    ey_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (ew_2.bg()) {
            // empty if block
        }
    }

    public ey_2 vP() {
        super.clear();
        this.nb = 0;
        this.an &= 0xFFFFFFFE;
        this.nd = ew_2.vL();
        this.an &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ej_2.mD;
    }

    public ew_2 vK() {
        return ew_2.vJ();
    }

    public ew_2 vQ() {
        ew_2 ew_22 = this.vR();
        if (!ew_22.isInitialized()) {
            throw ey_2.newUninitializedMessageException((Message)ew_22);
        }
        return ew_22;
    }

    public ew_2 vR() {
        ew_2 ew_22 = new ew_2(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            ew_22.nb = this.nb;
            n2 |= 1;
        }
        if ((this.an & 2) != 0) {
            this.nd.makeImmutable();
            this.an &= 0xFFFFFFFD;
        }
        ew_22.nd = this.nd;
        ew_22.an = n2;
        this.onBuilt();
        return ew_22;
    }

    public ey_2 vS() {
        return (ey_2)super.clone();
    }

    public ey_2 bu(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ey_2)super.setField(fieldDescriptor, object);
    }

    public ey_2 ak(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ey_2)super.clearField(fieldDescriptor);
    }

    public ey_2 ak(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ey_2)super.clearOneof(oneofDescriptor);
    }

    public ey_2 ak(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ey_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ey_2 bv(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ey_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public ey_2 ak(Message message) {
        if (message instanceof ew_2) {
            return this.c((ew_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ey_2 c(ew_2 ew_22) {
        if (ew_22 == ew_2.vJ()) {
            return this;
        }
        if (ew_22.vC()) {
            this.bs(ew_22.vD());
        }
        if (!ew_22.nd.isEmpty()) {
            if (this.nd.isEmpty()) {
                this.nd = ew_22.nd;
                this.an &= 0xFFFFFFFD;
            } else {
                this.vU();
                this.nd.addAll((Collection)ew_22.nd);
            }
            this.onChanged();
        }
        this.bv(ew_2.b(ew_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return this.vC();
    }

    public ey_2 cG(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ew_2 ew_22 = null;
        try {
            ew_22 = (ew_2)ew_2.nf.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ew_22 = (ew_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ew_22 != null) {
                this.c(ew_22);
            }
        }
        return this;
    }

    @Override
    public boolean vC() {
        return (this.an & 1) != 0;
    }

    @Override
    public int vD() {
        return this.nb;
    }

    public ey_2 bs(int n) {
        this.an |= 1;
        this.nb = n;
        this.onChanged();
        return this;
    }

    public ey_2 vT() {
        this.an &= 0xFFFFFFFE;
        this.nb = 0;
        this.onChanged();
        return this;
    }

    private void vU() {
        if ((this.an & 2) == 0) {
            this.nd = ew_2.a(this.nd);
            this.an |= 2;
        }
    }

    @Override
    public List<Integer> vE() {
        return (this.an & 2) != 0 ? Collections.unmodifiableList(this.nd) : this.nd;
    }

    @Override
    public int vF() {
        return this.nd.size();
    }

    @Override
    public int br(int n) {
        return this.nd.getInt(n);
    }

    public ey_2 c(int n, int n2) {
        this.vU();
        this.nd.setInt(n, n2);
        this.onChanged();
        return this;
    }

    public ey_2 bt(int n) {
        this.vU();
        this.nd.addInt(n);
        this.onChanged();
        return this;
    }

    public ey_2 k(Iterable<? extends Integer> iterable) {
        this.vU();
        AbstractMessageLite.Builder.addAll(iterable, (List)this.nd);
        this.onChanged();
        return this;
    }

    public ey_2 vV() {
        this.nd = ew_2.vN();
        this.an &= 0xFFFFFFFD;
        this.onChanged();
        return this;
    }

    public final ey_2 bu(UnknownFieldSet unknownFieldSet) {
        return (ey_2)super.setUnknownFields(unknownFieldSet);
    }

    public final ey_2 bv(UnknownFieldSet unknownFieldSet) {
        return (ey_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bv(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bu(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bv(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.ak(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ak(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.ak(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bu(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.vP();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.vS();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bv(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cG(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.ak(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.vP();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ak(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.vS();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bv(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bu(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bv(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.ak(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ak(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.ak(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bu(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cG(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.vS();
    }

    public /* synthetic */ Message buildPartial() {
        return this.vR();
    }

    public /* synthetic */ Message build() {
        return this.vQ();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.ak(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.vP();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cG(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.vS();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.vR();
    }

    public /* synthetic */ MessageLite build() {
        return this.vQ();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.vP();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.vK();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.vK();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cG(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.vS();
    }

    public /* synthetic */ Object clone() {
        return this.vS();
    }
}

