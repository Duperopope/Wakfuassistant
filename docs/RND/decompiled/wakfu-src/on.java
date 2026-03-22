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

public final class on
extends GeneratedMessageV3.Builder<on>
implements os {
    private int an;
    private List<oo> QD = Collections.emptyList();
    private RepeatedFieldBuilderV3<oo, oq, or> QG;

    public static final Descriptors.Descriptor avf() {
        return ok.Qx;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ok.Qy.ensureFieldAccessorsInitialized(ol.class, on.class);
    }

    on() {
        this.D();
    }

    on(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (ol.bg()) {
            this.avo();
        }
    }

    public on avg() {
        super.clear();
        if (this.QG == null) {
            this.QD = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
        } else {
            this.QG.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ok.Qx;
    }

    public ol ave() {
        return ol.avd();
    }

    public ol avh() {
        ol ol2 = this.avi();
        if (!ol2.isInitialized()) {
            throw on.newUninitializedMessageException((Message)ol2);
        }
        return ol2;
    }

    public ol avi() {
        ol ol2 = new ol(this);
        int n = this.an;
        if (this.QG == null) {
            if ((this.an & 1) != 0) {
                this.QD = Collections.unmodifiableList(this.QD);
                this.an &= 0xFFFFFFFE;
            }
            ol2.QD = this.QD;
        } else {
            ol2.QD = this.QG.build();
        }
        this.onBuilt();
        return ol2;
    }

    public on avj() {
        return (on)super.clone();
    }

    public on fE(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (on)super.setField(fieldDescriptor, object);
    }

    public on cp(Descriptors.FieldDescriptor fieldDescriptor) {
        return (on)super.clearField(fieldDescriptor);
    }

    public on cp(Descriptors.OneofDescriptor oneofDescriptor) {
        return (on)super.clearOneof(oneofDescriptor);
    }

    public on cp(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (on)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public on fF(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (on)super.addRepeatedField(fieldDescriptor, object);
    }

    public on cp(Message message) {
        if (message instanceof ol) {
            return this.c((ol)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public on c(ol ol2) {
        if (ol2 == ol.avd()) {
            return this;
        }
        if (this.QG == null) {
            if (!ol2.QD.isEmpty()) {
                if (this.QD.isEmpty()) {
                    this.QD = ol2.QD;
                    this.an &= 0xFFFFFFFE;
                } else {
                    this.avk();
                    this.QD.addAll(ol2.QD);
                }
                this.onChanged();
            }
        } else if (!ol2.QD.isEmpty()) {
            if (this.QG.isEmpty()) {
                this.QG.dispose();
                this.QG = null;
                this.QD = ol2.QD;
                this.an &= 0xFFFFFFFE;
                this.QG = ol.pT() ? this.avo() : null;
            } else {
                this.QG.addAllMessages(ol2.QD);
            }
        }
        this.fF(ol.b(ol2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.auZ(); ++i) {
            if (this.jP(i).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public on iV(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ol ol2 = null;
        try {
            ol2 = (ol)ol.QF.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ol2 = (ol)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ol2 != null) {
                this.c(ol2);
            }
        }
        return this;
    }

    private void avk() {
        if ((this.an & 1) == 0) {
            this.QD = new ArrayList<oo>(this.QD);
            this.an |= 1;
        }
    }

    @Override
    public List<oo> auXX() {
        if (this.QG == null) {
            return Collections.unmodifiableList(this.QD);
        }
        return this.QG.getMessageList();
    }

    @Override
    public int auZ() {
        if (this.QG == null) {
            return this.QD.size();
        }
        return this.QG.getCount();
    }

    @Override
    public oo jP(int n) {
        if (this.QG == null) {
            return this.QD.get(n);
        }
        return (oo)this.QG.getMessage(n);
    }

    public on a(int n, oo oo2) {
        if (this.QG == null) {
            if (oo2 == null) {
                throw new NullPointerException();
            }
            this.avk();
            this.QD.set(n, oo2);
            this.onChanged();
        } else {
            this.QG.setMessage(n, (AbstractMessage)oo2);
        }
        return this;
    }

    public on a(int n, oq oq2) {
        if (this.QG == null) {
            this.avk();
            this.QD.set(n, oq2.avz());
            this.onChanged();
        } else {
            this.QG.setMessage(n, (AbstractMessage)oq2.avz());
        }
        return this;
    }

    public on a(oo oo2) {
        if (this.QG == null) {
            if (oo2 == null) {
                throw new NullPointerException();
            }
            this.avk();
            this.QD.add(oo2);
            this.onChanged();
        } else {
            this.QG.addMessage((AbstractMessage)oo2);
        }
        return this;
    }

    public on b(int n, oo oo2) {
        if (this.QG == null) {
            if (oo2 == null) {
                throw new NullPointerException();
            }
            this.avk();
            this.QD.add(n, oo2);
            this.onChanged();
        } else {
            this.QG.addMessage(n, (AbstractMessage)oo2);
        }
        return this;
    }

    public on a(oq oq2) {
        if (this.QG == null) {
            this.avk();
            this.QD.add(oq2.avz());
            this.onChanged();
        } else {
            this.QG.addMessage((AbstractMessage)oq2.avz());
        }
        return this;
    }

    public on b(int n, oq oq2) {
        if (this.QG == null) {
            this.avk();
            this.QD.add(n, oq2.avz());
            this.onChanged();
        } else {
            this.QG.addMessage(n, (AbstractMessage)oq2.avz());
        }
        return this;
    }

    public on ap(Iterable<? extends oo> iterable) {
        if (this.QG == null) {
            this.avk();
            AbstractMessageLite.Builder.addAll(iterable, this.QD);
            this.onChanged();
        } else {
            this.QG.addAllMessages(iterable);
        }
        return this;
    }

    public on avl() {
        if (this.QG == null) {
            this.QD = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.QG.clear();
        }
        return this;
    }

    public on jR(int n) {
        if (this.QG == null) {
            this.avk();
            this.QD.remove(n);
            this.onChanged();
        } else {
            this.QG.remove(n);
        }
        return this;
    }

    public oq jS(int n) {
        return (oq)this.avo().getBuilder(n);
    }

    @Override
    public or jQ(int n) {
        if (this.QG == null) {
            return this.QD.get(n);
        }
        return (or)this.QG.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends or> auY() {
        if (this.QG != null) {
            return this.QG.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.QD);
    }

    public oq avm() {
        return (oq)this.avo().addBuilder((AbstractMessage)oo.avv());
    }

    public oq jT(int n) {
        return (oq)this.avo().addBuilder(n, (AbstractMessage)oo.avv());
    }

    public List<oq> avn() {
        return this.avo().getBuilderList();
    }

    private RepeatedFieldBuilderV3<oo, oq, or> avo() {
        if (this.QG == null) {
            this.QG = new RepeatedFieldBuilderV3(this.QD, (this.an & 1) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.QD = null;
        }
        return this.QG;
    }

    public final on fE(UnknownFieldSet unknownFieldSet) {
        return (on)super.setUnknownFields(unknownFieldSet);
    }

    public final on fF(UnknownFieldSet unknownFieldSet) {
        return (on)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fF(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fE(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fF(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cp(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cp(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cp(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fE(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.avg();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.avj();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fF(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.iV(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.cp(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.avg();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cp(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.avj();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fF(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fE(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fF(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cp(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cp(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cp(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fE(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.iV(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.avj();
    }

    public /* synthetic */ Message buildPartial() {
        return this.avi();
    }

    public /* synthetic */ Message build() {
        return this.avh();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.cp(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.avg();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.iV(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.avj();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.avi();
    }

    public /* synthetic */ MessageLite build() {
        return this.avh();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.avg();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.ave();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.ave();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.iV(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.avj();
    }

    public /* synthetic */ Object clone() {
        return this.avj();
    }
}

