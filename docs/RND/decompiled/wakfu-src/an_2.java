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
 *  com.google.protobuf.SingleFieldBuilderV3
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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;

/*
 * Renamed from an
 */
public final class an_2
extends GeneratedMessageV3.Builder<an_2>
implements ad_2 {
    private int du = 0;
    private Object V;
    private SingleFieldBuilderV3<at_1, av_1, aw_2> dA;
    private SingleFieldBuilderV3<ax_1, az_1, ac_1> dB;
    private SingleFieldBuilderV3<ap_2, ar_2, as_2> dC;

    public static final Descriptors.Descriptor em() {
        return ak_1.dl;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ak_1.dm.ensureFieldAccessorsInitialized(al_1.class, an_2.class);
    }

    an_2() {
        this.D();
    }

    an_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (al_1.el()) {
            // empty if block
        }
    }

    public an_2 en() {
        super.clear();
        this.du = 0;
        this.V = null;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ak_1.dl;
    }

    public al_1 ek() {
        return al_1.ej();
    }

    public al_1 eo() {
        al_1 al_12 = this.ep();
        if (!al_12.isInitialized()) {
            throw an_2.newUninitializedMessageException((Message)al_12);
        }
        return al_12;
    }

    public al_1 ep() {
        al_1 al_12 = new al_1(this);
        if (this.du == 1) {
            al_12.V = this.dA == null ? this.V : this.dA.build();
        }
        if (this.du == 2) {
            al_12.V = this.dB == null ? this.V : this.dB.build();
        }
        if (this.du == 3) {
            al_12.V = this.dC == null ? this.V : this.dC.build();
        }
        al_12.du = this.du;
        this.onBuilt();
        return al_12;
    }

    public an_2 eq() {
        return (an_2)super.clone();
    }

    public an_2 y(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (an_2)super.setField(fieldDescriptor, object);
    }

    public an_2 m(Descriptors.FieldDescriptor fieldDescriptor) {
        return (an_2)super.clearField(fieldDescriptor);
    }

    public an_2 m(Descriptors.OneofDescriptor oneofDescriptor) {
        return (an_2)super.clearOneof(oneofDescriptor);
    }

    public an_2 m(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (an_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public an_2 z(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (an_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public an_2 m(Message message) {
        if (message instanceof al_1) {
            return this.c((al_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public an_2 c(al_1 al_12) {
        if (al_12 == al_1.ej()) {
            return this;
        }
        switch (al_12.dW().ordinal()) {
            case 0: {
                this.b(al_12.dY());
                break;
            }
            case 1: {
                this.b(al_12.eb());
                break;
            }
            case 2: {
                this.b(al_12.ee());
                break;
            }
        }
        this.z(al_1.b(al_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public an_2 M(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        al_1 al_12 = null;
        try {
            al_12 = (al_1)al_1.dz.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            al_12 = (al_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (al_12 != null) {
                this.c(al_12);
            }
        }
        return this;
    }

    @Override
    public ao_1 dW() {
        return ao_1.v(this.du);
    }

    public an_2 er() {
        this.du = 0;
        this.V = null;
        this.onChanged();
        return this;
    }

    @Override
    public boolean dX() {
        return this.du == 1;
    }

    @Override
    public at_1 dY() {
        if (this.dA == null) {
            if (this.du == 1) {
                return (at_1)this.V;
            }
            return at_1.eY();
        }
        if (this.du == 1) {
            return (at_1)this.dA.getMessage();
        }
        return at_1.eY();
    }

    public an_2 a(at_1 at_12) {
        if (this.dA == null) {
            if (at_12 == null) {
                throw new NullPointerException();
            }
            this.V = at_12;
            this.onChanged();
        } else {
            this.dA.setMessage((AbstractMessage)at_12);
        }
        this.du = 1;
        return this;
    }

    public an_2 a(av_1 av_12) {
        if (this.dA == null) {
            this.V = av_12.fd();
            this.onChanged();
        } else {
            this.dA.setMessage((AbstractMessage)av_12.fd());
        }
        this.du = 1;
        return this;
    }

    public an_2 b(at_1 at_12) {
        if (this.dA == null) {
            this.V = this.du == 1 && this.V != at_1.eY() ? at_1.c((at_1)this.V).e(at_12).fe() : at_12;
            this.onChanged();
        } else if (this.du == 1) {
            this.dA.mergeFrom((AbstractMessage)at_12);
        } else {
            this.dA.setMessage((AbstractMessage)at_12);
        }
        this.du = 1;
        return this;
    }

    public an_2 es() {
        if (this.dA == null) {
            if (this.du == 1) {
                this.du = 0;
                this.V = null;
                this.onChanged();
            }
        } else {
            if (this.du == 1) {
                this.du = 0;
                this.V = null;
            }
            this.dA.clear();
        }
        return this;
    }

    public av_1 et() {
        return (av_1)this.eu().getBuilder();
    }

    @Override
    public aw_2 dZ() {
        if (this.du == 1 && this.dA != null) {
            return (aw_2)this.dA.getMessageOrBuilder();
        }
        if (this.du == 1) {
            return (at_1)this.V;
        }
        return at_1.eY();
    }

    private SingleFieldBuilderV3<at_1, av_1, aw_2> eu() {
        if (this.dA == null) {
            if (this.du != 1) {
                this.V = at_1.eY();
            }
            this.dA = new SingleFieldBuilderV3((AbstractMessage)((at_1)this.V), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.V = null;
        }
        this.du = 1;
        this.onChanged();
        return this.dA;
    }

    @Override
    public boolean ea() {
        return this.du == 2;
    }

    @Override
    public ax_1 eb() {
        if (this.dB == null) {
            if (this.du == 2) {
                return (ax_1)this.V;
            }
            return ax_1.fq();
        }
        if (this.du == 2) {
            return (ax_1)this.dB.getMessage();
        }
        return ax_1.fq();
    }

    public an_2 a(ax_1 ax_12) {
        if (this.dB == null) {
            if (ax_12 == null) {
                throw new NullPointerException();
            }
            this.V = ax_12;
            this.onChanged();
        } else {
            this.dB.setMessage((AbstractMessage)ax_12);
        }
        this.du = 2;
        return this;
    }

    public an_2 a(az_1 az_12) {
        if (this.dB == null) {
            this.V = az_12.fu();
            this.onChanged();
        } else {
            this.dB.setMessage((AbstractMessage)az_12.fu());
        }
        this.du = 2;
        return this;
    }

    public an_2 b(ax_1 ax_12) {
        if (this.dB == null) {
            this.V = this.du == 2 && this.V != ax_1.fq() ? ax_1.c((ax_1)this.V).e(ax_12).fv() : ax_12;
            this.onChanged();
        } else if (this.du == 2) {
            this.dB.mergeFrom((AbstractMessage)ax_12);
        } else {
            this.dB.setMessage((AbstractMessage)ax_12);
        }
        this.du = 2;
        return this;
    }

    public an_2 ev() {
        if (this.dB == null) {
            if (this.du == 2) {
                this.du = 0;
                this.V = null;
                this.onChanged();
            }
        } else {
            if (this.du == 2) {
                this.du = 0;
                this.V = null;
            }
            this.dB.clear();
        }
        return this;
    }

    public az_1 ew() {
        return (az_1)this.ex().getBuilder();
    }

    @Override
    public ac_1 ec() {
        if (this.du == 2 && this.dB != null) {
            return (ac_1)this.dB.getMessageOrBuilder();
        }
        if (this.du == 2) {
            return (ax_1)this.V;
        }
        return ax_1.fq();
    }

    private SingleFieldBuilderV3<ax_1, az_1, ac_1> ex() {
        if (this.dB == null) {
            if (this.du != 2) {
                this.V = ax_1.fq();
            }
            this.dB = new SingleFieldBuilderV3((AbstractMessage)((ax_1)this.V), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.V = null;
        }
        this.du = 2;
        this.onChanged();
        return this.dB;
    }

    @Override
    public boolean ed() {
        return this.du == 3;
    }

    @Override
    public ap_2 ee() {
        if (this.dC == null) {
            if (this.du == 3) {
                return (ap_2)this.V;
            }
            return ap_2.eH();
        }
        if (this.du == 3) {
            return (ap_2)this.dC.getMessage();
        }
        return ap_2.eH();
    }

    public an_2 a(ap_2 ap_22) {
        if (this.dC == null) {
            if (ap_22 == null) {
                throw new NullPointerException();
            }
            this.V = ap_22;
            this.onChanged();
        } else {
            this.dC.setMessage((AbstractMessage)ap_22);
        }
        this.du = 3;
        return this;
    }

    public an_2 a(ar_2 ar_22) {
        if (this.dC == null) {
            this.V = ar_22.eL();
            this.onChanged();
        } else {
            this.dC.setMessage((AbstractMessage)ar_22.eL());
        }
        this.du = 3;
        return this;
    }

    public an_2 b(ap_2 ap_22) {
        if (this.dC == null) {
            this.V = this.du == 3 && this.V != ap_2.eH() ? ap_2.c((ap_2)this.V).e(ap_22).eM() : ap_22;
            this.onChanged();
        } else if (this.du == 3) {
            this.dC.mergeFrom((AbstractMessage)ap_22);
        } else {
            this.dC.setMessage((AbstractMessage)ap_22);
        }
        this.du = 3;
        return this;
    }

    public an_2 ey() {
        if (this.dC == null) {
            if (this.du == 3) {
                this.du = 0;
                this.V = null;
                this.onChanged();
            }
        } else {
            if (this.du == 3) {
                this.du = 0;
                this.V = null;
            }
            this.dC.clear();
        }
        return this;
    }

    public ar_2 ez() {
        return (ar_2)this.eA().getBuilder();
    }

    @Override
    public as_2 ef() {
        if (this.du == 3 && this.dC != null) {
            return (as_2)this.dC.getMessageOrBuilder();
        }
        if (this.du == 3) {
            return (ap_2)this.V;
        }
        return ap_2.eH();
    }

    private SingleFieldBuilderV3<ap_2, ar_2, as_2> eA() {
        if (this.dC == null) {
            if (this.du != 3) {
                this.V = ap_2.eH();
            }
            this.dC = new SingleFieldBuilderV3((AbstractMessage)((ap_2)this.V), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.V = null;
        }
        this.du = 3;
        this.onChanged();
        return this.dC;
    }

    public final an_2 y(UnknownFieldSet unknownFieldSet) {
        return (an_2)super.setUnknownFields(unknownFieldSet);
    }

    public final an_2 z(UnknownFieldSet unknownFieldSet) {
        return (an_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.z(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.y(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.z(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.m(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.m(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.m(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.y(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.en();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.eq();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.z(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.M(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.m(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.en();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.m(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.eq();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.z(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.y(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.z(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.m(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.m(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.m(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.y(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.M(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.eq();
    }

    public /* synthetic */ Message buildPartial() {
        return this.ep();
    }

    public /* synthetic */ Message build() {
        return this.eo();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.m(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.en();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.M(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.eq();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.ep();
    }

    public /* synthetic */ MessageLite build() {
        return this.eo();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.en();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.ek();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.ek();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.M(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.eq();
    }

    public /* synthetic */ Object clone() {
        return this.eq();
    }
}

