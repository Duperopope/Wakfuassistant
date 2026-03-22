/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessage$BuilderParent
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
 *  com.google.protobuf.RepeatedFieldBuilderV3
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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class zV
extends GeneratedMessageV3.Builder<zV>
implements Aa {
    private int an;
    private List<zW> apH = Collections.emptyList();
    private RepeatedFieldBuilderV3<zW, zY, zZ> apK;

    public static final Descriptors.Descriptor aAZ() {
        return zS.apf;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return zS.apg.ensureFieldAccessorsInitialized(zT.class, zV.class);
    }

    zV() {
        this.D();
    }

    zV(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (zT.fa()) {
            this.aBi();
        }
    }

    public zV aBa() {
        super.clear();
        if (this.apK == null) {
            this.apH = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
        } else {
            this.apK.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return zS.apf;
    }

    public zT aAY() {
        return zT.aAX();
    }

    public zT aBb() {
        zT zT2 = this.aBc();
        if (!zT2.isInitialized()) {
            throw zV.newUninitializedMessageException((Message)zT2);
        }
        return zT2;
    }

    public zT aBc() {
        zT zT2 = new zT(this);
        int n = this.an;
        if (this.apK == null) {
            if ((this.an & 1) != 0) {
                this.apH = Collections.unmodifiableList(this.apH);
                this.an &= 0xFFFFFFFE;
            }
            zT2.apH = this.apH;
        } else {
            zT2.apH = this.apK.build();
        }
        this.onBuilt();
        return zT2;
    }

    public zV aBd() {
        return (zV)super.clone();
    }

    public zV gi(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (zV)super.setField(fieldDescriptor, object);
    }

    public zV cE(Descriptors.FieldDescriptor fieldDescriptor) {
        return (zV)super.clearField(fieldDescriptor);
    }

    public zV cE(Descriptors.OneofDescriptor oneofDescriptor) {
        return (zV)super.clearOneof(oneofDescriptor);
    }

    public zV cE(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (zV)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public zV gj(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (zV)super.addRepeatedField(fieldDescriptor, object);
    }

    public zV cE(Message message) {
        if (message instanceof zT) {
            return this.c((zT)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public zV c(zT zT2) {
        if (zT2 == zT.aAX()) {
            return this;
        }
        if (this.apK == null) {
            if (!zT2.apH.isEmpty()) {
                if (this.apH.isEmpty()) {
                    this.apH = zT2.apH;
                    this.an &= 0xFFFFFFFE;
                } else {
                    this.aBe();
                    this.apH.addAll(zT2.apH);
                }
                this.onChanged();
            }
        } else if (!zT2.apH.isEmpty()) {
            if (this.apK.isEmpty()) {
                this.apK.dispose();
                this.apK = null;
                this.apH = zT2.apH;
                this.an &= 0xFFFFFFFE;
                this.apK = zT.oV() ? this.aBi() : null;
            } else {
                this.apK.addAllMessages(zT2.apH);
            }
        }
        this.gj(zT.b(zT2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.aAT(); ++i) {
            if (this.lf(i).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public zV jO(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        zT zT2 = null;
        try {
            zT2 = (zT)zT.apJ.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            zT2 = (zT)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (zT2 != null) {
                this.c(zT2);
            }
        }
        return this;
    }

    private void aBe() {
        if ((this.an & 1) == 0) {
            this.apH = new ArrayList<zW>(this.apH);
            this.an |= 1;
        }
    }

    @Override
    public List<zW> aAR() {
        if (this.apK == null) {
            return Collections.unmodifiableList(this.apH);
        }
        return this.apK.getMessageList();
    }

    @Override
    public int aAT() {
        if (this.apK == null) {
            return this.apH.size();
        }
        return this.apK.getCount();
    }

    @Override
    public zW lf(int n) {
        if (this.apK == null) {
            return this.apH.get(n);
        }
        return (zW)this.apK.getMessage(n);
    }

    public zV a(int n, zW zW2) {
        if (this.apK == null) {
            if (zW2 == null) {
                throw new NullPointerException();
            }
            this.aBe();
            this.apH.set(n, zW2);
            this.onChanged();
        } else {
            this.apK.setMessage(n, (AbstractMessage)zW2);
        }
        return this;
    }

    public zV a(int n, zY zY2) {
        if (this.apK == null) {
            this.aBe();
            this.apH.set(n, zY2.aBu());
            this.onChanged();
        } else {
            this.apK.setMessage(n, (AbstractMessage)zY2.aBu());
        }
        return this;
    }

    public zV a(zW zW2) {
        if (this.apK == null) {
            if (zW2 == null) {
                throw new NullPointerException();
            }
            this.aBe();
            this.apH.add(zW2);
            this.onChanged();
        } else {
            this.apK.addMessage((AbstractMessage)zW2);
        }
        return this;
    }

    public zV b(int n, zW zW2) {
        if (this.apK == null) {
            if (zW2 == null) {
                throw new NullPointerException();
            }
            this.aBe();
            this.apH.add(n, zW2);
            this.onChanged();
        } else {
            this.apK.addMessage(n, (AbstractMessage)zW2);
        }
        return this;
    }

    public zV a(zY zY2) {
        if (this.apK == null) {
            this.aBe();
            this.apH.add(zY2.aBu());
            this.onChanged();
        } else {
            this.apK.addMessage((AbstractMessage)zY2.aBu());
        }
        return this;
    }

    public zV b(int n, zY zY2) {
        if (this.apK == null) {
            this.aBe();
            this.apH.add(n, zY2.aBu());
            this.onChanged();
        } else {
            this.apK.addMessage(n, (AbstractMessage)zY2.aBu());
        }
        return this;
    }

    public zV aA(Iterable<? extends zW> iterable) {
        if (this.apK == null) {
            this.aBe();
            AbstractMessageLite.Builder.addAll(iterable, this.apH);
            this.onChanged();
        } else {
            this.apK.addAllMessages(iterable);
        }
        return this;
    }

    public zV aBf() {
        if (this.apK == null) {
            this.apH = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.apK.clear();
        }
        return this;
    }

    public zV lh(int n) {
        if (this.apK == null) {
            this.aBe();
            this.apH.remove(n);
            this.onChanged();
        } else {
            this.apK.remove(n);
        }
        return this;
    }

    public zY li(int n) {
        return (zY)this.aBi().getBuilder(n);
    }

    @Override
    public zZ lg(int n) {
        if (this.apK == null) {
            return this.apH.get(n);
        }
        return (zZ)this.apK.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends zZ> aAS() {
        if (this.apK != null) {
            return this.apK.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.apH);
    }

    public zY aBg() {
        return (zY)this.aBi().addBuilder((AbstractMessage)zW.aBq());
    }

    public zY lj(int n) {
        return (zY)this.aBi().addBuilder(n, (AbstractMessage)zW.aBq());
    }

    public List<zY> aBh() {
        return this.aBi().getBuilderList();
    }

    private RepeatedFieldBuilderV3<zW, zY, zZ> aBi() {
        if (this.apK == null) {
            this.apK = new RepeatedFieldBuilderV3(this.apH, (this.an & 1) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.apH = null;
        }
        return this.apK;
    }

    public final zV gi(UnknownFieldSet unknownFieldSet) {
        return (zV)super.setUnknownFields(unknownFieldSet);
    }

    public final zV gj(UnknownFieldSet unknownFieldSet) {
        return (zV)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gj(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gi(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gj(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cE(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cE(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cE(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gi(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.aBa();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.aBd();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gj(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jO(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.cE(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.aBa();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cE(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.aBd();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gj(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gi(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gj(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cE(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cE(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cE(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gi(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jO(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.aBd();
    }

    public /* synthetic */ Message buildPartial() {
        return this.aBc();
    }

    public /* synthetic */ Message build() {
        return this.aBb();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.cE(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.aBa();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jO(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.aBd();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.aBc();
    }

    public /* synthetic */ MessageLite build() {
        return this.aBb();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.aBa();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aAY();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aAY();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jO(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.aBd();
    }

    public /* synthetic */ Object clone() {
        return this.aBd();
    }
}

